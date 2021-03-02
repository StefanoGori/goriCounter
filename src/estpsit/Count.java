/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estpsit;

/**
 *
 * @author informatica
 */
public class Count implements Runnable{
    private int n=0;
    @Override
    public void run(){
        while(Estpsit.run){
           this.n++;
           System.out.println("Thread "+Thread.currentThread().getName()+" ha contato fino a: "+n);
        }
    }
}
