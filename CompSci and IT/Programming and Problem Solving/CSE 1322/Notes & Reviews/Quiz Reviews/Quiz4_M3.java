//code from Quiz 4
    //Module 3: Abstract Classes & Interfaces


/* interface IAbacus {
    public void do_stuff1();
  }
  
  abstract class calculator {
    public abstract void do_stuff2();
    public int do_stuff3() {
      return 4;
    }
  }
  
   
  class addingMachine extends calculator implements IAbacus {
    public void do_stuff1() {
      int a=5;
    }

  
    @Override
    public void do_stuff2() {
      int b=6;
    }
  }
  

  class Quiz4_M3 {
    public static void main(String[] args) {
      addingMachine myMachine = new addingMachine();
      System.out.println(myMachine.do_stuff3());
    }
  
  } */


  ///////

  /* import java.util.ArrayList;
 
  class Media {
    public void play() {
      System.out.println("Media Playing");
    }
  }
  class Movie extends Media {
    @Override
    public void play() {
      System.out.println("Movie Playing");
    }
  }
  class TVShow extends Media {
    @Override
    public void play() {
      System.out.println("TVShow Playing");
    }
  }
  
  class Quiz4_M3 {
    public static void main(String[] args) {
      ArrayList<Media> myMedia = new ArrayList<Media>();
      myMedia.add(new Media());
      myMedia.add(new Movie());
      myMedia.add(new TVShow());
      for(int i=0;i<3;i++) {
        myMedia.get(i).play();
      }
    }
  } */


////////


//Q. Does this program compile?
/* interface IAbacus {
    public void do_stuff1();
  }
  
  abstract class Brain {
    public abstract void do_stuff2();
  } 

  class Calculator extends Brain implements IAbacus {
    @Override
    public void do_stuff1() {
      int a=10;
    }
  
    @Override
    public void do_stuff2() {
      int b=15;
    }
  }
  
  class Quiz4_M3 {
    public static void main(String[] args) {
      Calculator myCalculator = new Calculator();
    }
  
  } */


/////////


/* abstract class Animal {
    public int do_stuff1() {
      return 3;
    }
  
    public abstract int do_stuff2();
  
  }
    
  class Horse extends Animal {
    @Override
    public int do_stuff1() {
      return 4;
    }
  
    @Override
    public int do_stuff2() {
      return 7;
    }
  }
  
  class Quiz4_M3 {
    public static void main(String[] args) {
      Horse myHorse = new Horse();
      int ret1 = myHorse.do_stuff1();
  
  int ret2 = myHorse.do_stuff2();
  
  System.out.println(ret1 + ", "+ret2);
    }
  } */


////////

//Q. What is the output of the following code
class Parent{
    public int stuff() {
      return 1;
    }
  }
  class ChildOne extends Parent {
    @Override
    public int stuff() {
      return 2;
    }
  }
  class ChildTwo extends Parent {
    @Override
    public int stuff() {
      return 3;
    }
  }
  class Quiz4_M3 {
    public static void Main (String[] args) {
      Parent var1=new Parent();
      ChildOne var2=new ChildOne();
      ChildTwo var3=new ChildTwo();
      Parent var4=new ChildOne();
      Parent var5=new ChildTwo();
      int sum=var1.stuff() + var2.stuff() + var3.stuff() + var4.stuff() + var5.stuff();
      System.out.println ("Sum is "+sum);
    }
  }