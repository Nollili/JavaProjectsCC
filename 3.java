
package ages;

import java.util.Scanner;


public class Ages {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        
        if(age>=18){
            System.out.println("You are an adult!");
        }else if(age == 18){
            System.out.println("You are adult from now!");
        }else{
            System.out.println("You are not an adult.");
        }
    }
    
}
