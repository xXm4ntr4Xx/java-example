
public class Main {
  public static void main(String[] args) {

    //variable
    String myName = "Pietro";
    Integer age = 33;
    System.out.println(myName);
    System.out.println(age);
    //

    System.out.println("---------");

    //variable sum
    int num1 = 10;
    int num2 = 20;
    int sum = num1+num2;
    System.out.println("The sum of the two variable is: " + sum);
    System.out.println("---------");
    // 

    //convert double to int
    double num3 = 15.5;
    int num3ToInt = (int) num3;
    System.out.println(num3ToInt);
    System.out.println("---------");


    // array of string

    String[] names = {"tom","Sam","Lucas"};//the size is immutable like tuple in typescript

    System.out.println("This is an array of string: " + names);//return the place in memory of the string
    for(String i: names){
      System.out.println(i);
    }
    System.out.println("---------");

    //call method from other files
    hello();
    System.out.println("---------");

  }

  private static void hello() {
    System.out.println("This is a private method called inside the main class");
  }
  
}



// single comment
/*multi line comment*/
    