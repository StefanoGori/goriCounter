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
public class Estpsit {

    /**
     * @param args the command line arguments
     */
    public static boolean run=true;
    public static void main(String[] args) {
        // TODO code application logic 
        Count c1= new Count();
        Thread t1=new Thread(c1,"Cavallo1");
        t1.setPriority(1);
        
        Count c2=new Count();
        Thread t2=new Thread(c2,"Cavallo2");
        t2.setPriority(5);
        Count c3=new Count();
        Thread t3=new Thread(c3,"Cavallo3");
        t3.setPriority(10);
        
        
        t1.start();
        t2.start();
        t3.start();
        
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        run=false;
    }
    
}
