/*Problem-3: With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples]
 
  Output: (examples)
    1) input a = 1, then output : 1
    2) input a = 2, then output : 1
    3) input a = 3, then output : 1, 3, 5
    4) input a = 4, then output : 1, 3, 5
    5) input a = 5, then output : 1, 3, 5, 7, 9
    6) input a = 6, then output : 1, 3, 5, 7, 9
    .
    .
    7) input a = x, then output : 1, 3, 5, 7, .......*/

import java.util.Scanner;

class Problem {
    static void integerGenerator(int n){
        int i=1;
        if(n%2==0){
            n=n-1;
        }
            while(n>0){
            if(i%2==1){
                if(n==1){
                    System.out.print(i);
                    n--;
                }
                else{
                    System.out.print(i+",");
                    n--;
                }
            }
            i++;
        

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit upto which you want to generate integer:- ");
        int n = sc.nextInt();
        integerGenerator(n);
    }
}
