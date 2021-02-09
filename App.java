import java.util.Scanner;
public class App{
    public static void main(String [] args){
      Scanner keyboardInput = new Scanner(System.in);

      System.out.println("Enter a no.: ");
      double num1 = keyboardInput.nextDouble();
      System.out.println("Enter an Operator.: ");
      char op = keyboardInput.next().charAt(0);
      System.out.println("Enter a no.: ");
      double num2 = keyboardInput.nextDouble();

      if (op == '+' ){
        System.out.println(num1 + num2);
      }
      else if (op == '-' ){
        System.out.println(num1 + num2);
      }
      else if (op == '/' ){
        System.out.println(num1 / num2);
      }
      else if (op == '*' ){
        System.out.println(num1 * num2);
      }  
      else {
        System.out.println("Invalid Operator");
      }  
       
    }
}

