/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;
public class Factorial {

    
    public static void main(String[] args) {
        int n,reverse=0;
        System.out.println("enter the number whose number is to be reversed:");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        while(n!=0)
        {
            reverse=reverse*10;
            reverse=reverse+ (n%10);
            n=n/10;
        }
        System.out.println("reverse is : "+reverse);
    }
    
}
