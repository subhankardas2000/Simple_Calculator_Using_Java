//Simple Calculator using Java : 
import java.util.Scanner;
public class Simple_Calculator {

    public static void main(String[] args) {
        //create an object of scanner
        Scanner input=new Scanner(System.in);
        
        //Declaring variables
        char Operator;
        Double Number1,Number2,Result;

        //asking the user to input the operator
        System.out.println("Enter the operator (+,-,*,/) : ");
        Operator=input.next().charAt(0);

        //asking the user to input the numbers
        System.out.println("Enter the first number : ");
        Number1=input.nextDouble();

        System.out.println("Enter the second number : ");
        Number2=input.nextDouble();

        switch (Operator) {
            //Performing Addition
            case '+':{
                Result=Number1+Number2;
                System.out.println("Addition of "+Number1+" and "+Number2+" is : "+Result);
            }
            break;
            //Performing Subtraction
            case '-':{
                Result=Number1-Number2;
                System.out.println("Substraction of "+Number1+" and "+Number2+" is : "+Result);
            }
            break;
            //Performing Multiplication
            case '*':{
                Result=Number1*Number2;
                System.out.println("Multiplication of "+Number1+" and "+Number2+" is : "+Result);
            }
            break;
            //Performing Division
            case '/':{
                Result=Number1/Number2;
                System.out.println("Division of "+Number1+" and "+Number2+" is : "+Result);
            }
            break;
            //default command
            default :{
                System.out.println("Unsupported/Invalid input");
            }
        }
        
        input.close();
    }
}