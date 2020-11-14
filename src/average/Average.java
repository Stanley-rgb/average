/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package average;

/**
 *
 * @author stanley
 */
import java.util.*;
public class Average {
 public static void main(String[] args) {
 int total=0;
 int grade;
 int average;
int counter=0;
Scanner input=new Scanner(System.in);
    while(counter<10){
        System.out.println("Enter grade: ");
        grade=input.nextInt(); 
        total=total+grade;
        counter++;

}
   average=total/10;
   System.out.println("The average is; "+" "+average);
        
    }
    
}
