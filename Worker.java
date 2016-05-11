/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author Salmon
 */
public class Worker extends Thread {
    
    //variables, f set to public
    int n;
    public int f = 1;
    
    public Worker(int k) {
        n = k;
    }
    
    //the first function that runs in Thread
    //overwriting the run function with code below
    public void run(){ 
        //YOUR CODE
        //is what is going to run when you first start your program
        
        //counts the factorial
        for(int i =1; i <= n; i++)
            f = f * i;
        //outputs the answer
        //System.out.println("Factorial of n  " + n + " = " + f );
    }
    
    
}
