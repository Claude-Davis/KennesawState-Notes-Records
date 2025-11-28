

/* # FUNCTION STACK (aka CALL STACK)
        - A data structure used to manage function calls. Trackswhich method is currently running and what happens when it is completed.

    ## Visualization / The Order of the Stack
        1. Each newly called method is stacked on top of the previously called method.
        2. As the method finishes, it is removed from the stack until the stack becomes empty.

    ## LIFO (Last In, First Out)
        - LIFO describes the order at which information travels
*/


public class Quiz5_FunctionStack{
    static void Method2(){                               // method 2
        System.out.println("Method 2 was called");
    }

    static void Method1(){
         Method2(); //This method is pushed onto the "stack" (bcs it has been called)
        System.out.println("Method 1 was called");               //method 1
    }

    ///

    public static void main (String[] args){
        // Function Stack Example 1
                Method1();  //This method is pushed onto the "stack" (bcs it has been called)
                Method2();  //Now this method is added to the stack

                System.out.println(" ");
                //as each method finishes running, it is removed from the stack

        // Function Stack Example 2
            System.out.println("Main starts");
            functionA();
            System.out.println("Main ends");
    }

    ///

    static void functionA() {
        System.out.println("Function A starts");
        functionB();
        System.out.println("Function A ends");
    }

    static void functionB() {
        System.out.println("Function B starts");
        functionC();
        System.out.println("Function B ends");
    }

    static void functionC() {
        System.out.println("Function C starts");
        System.out.println("Function C ends");
    }
}
