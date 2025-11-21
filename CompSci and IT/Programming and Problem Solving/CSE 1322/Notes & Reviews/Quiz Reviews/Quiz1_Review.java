public class Quiz1_Review {
  public static void main(String[] args) {
    // for loop, char types
          char letters[] = new char[5]; // creates an array
          letters[0] = 'a';
          letters[1] = 'b';
          letters[2] = 'c';
          letters[3] = 'd';
          letters[4] = 'e';
    
          String x = ""; //the variable x is assigned the type string, but it has yet to be given a value
          for(int i = 4; i >= 2; i--) {  // the initial value of i is 4. for as long as i is greater than or equal to 2, the value of i will be reduced by 1 after each completion of the following code
            x += letters[i];  // 
            // the index is being updated with each loop
          }
    
          System.out.println(x); // will print the final value of the variable x
          /* OUTPUT: edc
              the first value of i is 4
                x is assigned the 4th index, which is 'e'
              the next value of i is 3
                x is assigned the 3rd index, 'd'
              the next value of i is 2
                x is assined the 2nd index, 'c'
              the for loop ends because, if it continues, the condition (i >= 2) will no longer be true
          */

    //for loop, integer type
          int y = 10;  // the variable y is assigned type intger and assigned the value of 10
          for (int i = 0; i < 3; i++) {   // the initial value of i is 0. for as long as i is less than 3, it will increase by 1
            y += 5;  //the loop is done after 3 cycles, the value of y has increased by 5 each loop
          }
    
          System.out.println(y);
          /*OUTPUT: 25
              for the first loop, while i=0, y increases by 5 so its value becomes 15
              for the second loop, i=1, 5 is added to y's current value of 15; the new value of y is 20
              for the third and final loop, i=2. the new value of y is 25 due to another addition of 5
    
              the loop stops after 2 because, if it were to continue, the condition (i<3) would no longer be true/met
          */

    
  }
}
