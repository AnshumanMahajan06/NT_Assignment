package Advance_topic;

class MyThread extends Thread{
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println("I am i MyThread");
            Thread.sleep(1000);}
        }catch(InterruptedException e){
                e.printStackTrace();
        }
        
    }
}
public class MultiThreading {
    public static void main(String[] args) {
        MyThread t2=new MyThread();
        t2.start();

        
        //Main Thread
            try{
                for(int i=0;i<10;i++){
            System.out.println("I am in main Thread");
                    Thread.sleep(2000);
        }
            }catch(InterruptedException e){
                    e.printStackTrace();
            }
            
        }
    }

