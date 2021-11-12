
// public class Hello {
  
//   public static String GREETING = "Hello world!";
  
//   public static void main(String []args) {
    
//   }  
// }


public class Hello implements Runnable
{
public void run()
{  
  System.out.println(Thread.currentThread() + " is a daemon thread");  
}  
public static void main(String[] args) 
{
Hello obj = new Hello();
Thread t1 = new Thread(obj, "Thread 1");

  t1.start(); 
  t1.setDaemon(true); 
  
  System.out.println("Main thread ending"); 
 }
}
