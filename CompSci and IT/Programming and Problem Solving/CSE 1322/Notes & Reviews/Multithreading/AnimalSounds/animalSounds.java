public class animalSounds extends Thread{
    public String animalName;
    public String noise;
    
    public animalSounds(String animalName){
        this.animalName = animalName.toLowerCase();
        this.noise = animalName + " noises";
    }
    
    @Override
    public void run(){
        try{
            Thread.sleep(2000); //pauses the program for 2000 milliseconds
            System.out.println("\t 2s pause... ");

            if (animalName.equals("dog")){
                noise = "bark! arf!";
                System.out.println(noise); }
            if (animalName.equals("cat")){
                noise = "meow! prrr!";
                System.out.println(noise); }
            if (animalName.equals("fox")){
                noise = "What does the fox say?";
                System.out.println(noise);}
            else{
                System.out.println(noise);
            }
        } catch (InterruptedException e){
            System.out.println("Error");
        }
    }
}
