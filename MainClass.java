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
public class MainClass {
   
    public static void main(String args[]) {
        
        int c = Runtime.getRuntime().availableProcessors();
        
        //create thread and instantiate
        Worker w1 = new Worker(6);
        Worker w2 = new Worker(5);
        //they are basically threads, but no functions yet ^^^
        //for now 3 threads, main method, w1 and w2

        w1.start(); //the worker thread will start, the run method will be started
        w2.start(); //the worker thread will start, the run method will be started

        try { //to overcome the dirty read
            w1.join(); //they will wait for the workers to be finished only the bottom code will be executed 
            //(main thread will be executed)
            w2.join(); //they will wait for the workers to be finished only the bottom code will be executed 
            //(main thread will be executed before main class)
            //so the order and the answer will be completed.
        } catch (Exception ex){}
        
        //outputs the answer of the worker(run) factorial
        //System.out.println may not be the correct answer, because the main and the worker
        // class is not related, so the if the run method is slower than the system.out.println
        // method, then the w1.f will be = 1 (Wrong answer)
        System.out.println("Worker 1 = " + w1.f);
        System.out.println("Worker 2 = " + w2.f);        
        
        //outputs the number of cores in your pgoram
        System.out.println("Number of cores = " +c );
        //^^ this will run first, the 2 threads that started wont affect the main class
    }
    
}
