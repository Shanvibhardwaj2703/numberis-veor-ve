/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basicprogram;

/**
 *
 * @author shanv
 */
import java.util.*;
public class BasicProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int a=0,b=1,n=5,c;
        
        
       // for(int i=1; i<=n;i++){
          
           // System.out.print(a+" ");
           // c=a+b;
           // a=b;
           // b=c;
           System.out.print("entre the number:");
           Scanner sc=new Scanner(System.in);
           int a=sc.nextInt();
           if(a>1){
               System.out.println("number is positive");
        }else{
               System.out.println("number is negative");
           }
    }
    
}
