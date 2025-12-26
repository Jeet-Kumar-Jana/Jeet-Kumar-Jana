

import java.util.Scanner;

/*Problem-1: Create a small calculator which performs operations such as 
Addition, Subtraction, Multiplication and Division using class.
  Calculator inputs :> ‘a’, ‘b’ and ‘type of operation’
  Datatype :> ‘a’ = double, ‘b’ = double, ‘type of operation’ = string*/


class Problem_1 {
    static void addition(double a, double b){
        System.out.println(a+b);
    }
    static void subtraction(double a, double b){
        System.out.println(a-b);
    }
    static void multiplication(double a, double b){
        System.out.println(a*b);
    }
    static void division(double a, double b){
        if(b==0)
            System.out.println("It will return infinity, so again try with a valid digit");
        else
            System.out.println(a/b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a:- ");
        double a = sc.nextDouble();
        System.out.println("Enter value of b:- ");
        double b = sc.nextDouble();
        System.out.print("Enter what type of operation you want to do, press key accordingly\nfor addition--> 'add'\nfor subtraction--> 'sub'\nfor multiplication--> 'mul'\nfor division--> 'div'\n:-");
        sc.nextLine();
        String typeOfOperation = sc.nextLine();
        typeOfOperation = typeOfOperation.toLowerCase();

        if(typeOfOperation.equals("add")){
            addition(a, b);
        }
        else if(typeOfOperation.equals("sub")){
            subtraction(a, b);
        }
        else if(typeOfOperation.equals("mul")){
            multiplication(a, b);
        }
        else if(typeOfOperation.equals("div")){
            division(a, b);
        }
        else{
            System.out.println("You have entered wrong operation type, check and properly enter");
        }


    }
}
