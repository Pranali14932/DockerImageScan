
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
 t1.setDaemon(true); 
for(int i=0;;i++)
  t1.start(); 
 
  
  System.out.println("Main thread ending"); 
 }
}
// public class Hello {  
	
// 	 public static void main(String[] args){  
// 	int x;
// 	for(int i=0;;i++) {
// 		x=i;
// 		System.out.println(x+x);
// 	}
	 
// 	 }  
// 	}  
