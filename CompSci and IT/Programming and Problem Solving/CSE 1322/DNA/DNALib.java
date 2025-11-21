import java.util.Scanner;

class DNALib {
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);

        System.out.println("[DNA Reverser and Translator]");

        System.out.print("Enter a sequence: ");
            String sequence = scan.nextLine();
        
        if (validator(sequence) == false)  { System.out.println("Your DNA sequence is not valid.");}
        if (validator(sequence) == true)  {
            sequence = reverser(sequence);
            System.out.println(translator(sequence));
        }
    }


    //method 1
    public static boolean validator (String valid)    {
        valid = valid.toUpperCase();
        if (valid.isEmpty()){ return false;}
        if (valid.length()%3 != 0){ return false;}
            char first = valid.charAt(0);
        if (first != 'A' && first != 'C' && first != 'G' && first != 'T'){ return false;}
        if (valid.length() == 1){ return true;}  //once/when the length of the [sub]string reaches 1, then if the final char is an accepted letter, the method returns true
        return valid.length() == 1 || validator(valid.substring(1)); //the method is called--with the String being reduced by 1 char each time--until the length of the Strinhg is 1
    }
    
    //method 2
    public static String reverser(String reverse)    {
        if (reverse.length()<1){ return "Invalid";}
        return reverse.charAt(reverse.length()-1) + reverser(reverse.substring(0, reverse.length()-1));
    }

    //method 3
    public static String inverser(String inverse)    {
        return inverse;
    }

    //method 4
    public static String translator(String translation){
        for (int i=0; i<translation.length()/3; i++){
            String t = translation.substring(0,3);
            switch(t){
                case "CGA":
                    return "R";
                case "GCC":
                    return "A";
                case "TGC":
                    return "C";
                case "TGT":
                    return "C";
                case "GAC":
                    return "D";
                case "GAT":
                    return "D";
                case "GAA":
                    return "E";
                case "GAG":
                    return "E";
                case "TTC":
                    return "F";
                case "TTT":
                    return "F";
                case "GGA":
                    return "G";
                case "GGC":
                    return "G";
                case "GGG":
                    return "G";
                case "GGT":
                    return "G";
                case "CAC":
                    return "H";
                case "CAT":
                    return "H";
                case "ATA":
                    return "I";
                case "ATC":
                    return "I";
                case "ATT":
                    return "T";
                case "AAA":
                    return "K";
                case "AAG":
                    return "K";
                case "CTA":
                    return "L";
                case "CTC":
                    return "L";
                case "CTG":
                    return "L";
                case "CTT":
                    return "L";
                case "TTA":
                    return "-";
                case "TTG":
                    return "L";
                case "ATG":
                    return "M";
                case "AAT":
                    return "N";
                case "AAC":
                    return "N";
                case "CCA":
                    return "P";
                case "CCC":
                    return "P";
                case "CCG":
                    return "P";
                case "CCT":
                    return "P";
                case "CAA":
                    return "Q";
                case "CAG":
                    return "Q";
                case "AGA":
                    return "R";
                case "AGG":
                    return "R";
                case "CGC":
                    return "R";
                case "CGG":
                    return "R";
                case "CGT":
                    return "R";
                case "AGC":
                    return "S";
                case "AGT":
                    return "S";
                case "TCA":
                    return "S";
                case "TCC":
                    return "S";
                case "TCG":
                    return "S";
                case "TCT":
                    return "S";
                case "ACA":
                    return "T";
                case "ACC": 
                    return "T";
                case "ACG": 
                    return "T";
                case "ACT": 
                    return "T";  
                case "GTA": 
                    return "V";
                case "GTC": 
                    return "V";
                case "GTG": 
                case "GTT": 
                    return "V";  
                case "TGG": 
                    return "W";  
                case "TAC":
                    return "Y";
                case "TAT": 
                    return "Y";  
                case "TAA":
                    return "-";
                case "TAG":
                    return "-";
                case "TGA": 
                    return "-"; 
            }
        }
        return " ";
    }
}