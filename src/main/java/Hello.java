
// public class Hello {
  
//   public static String GREETING = "Hello world!";
  
//   public static void main(String []args) {
    
//   }  
// }


// public class Hello implements Runnable
// {
// public void run()
// {  
//   System.out.println(Thread.currentThread() + " is a daemon thread");  
// }  
// public static void main(String[] args) 
// {
// Hello obj = new Hello();
// Thread t1 = new Thread(obj, "Thread 1");
//  t1.setDaemon(true); 
// for(int i=0;;i++)
//   t1.start(); 
 
  
//  }
// }
// public class Hello {  
	
// 	 public static void main(String[] args){  
// 	int x;
// 	for(int i=0;;i++) {
// 		x=i;
// 		System.out.println(x+x);
// 	}
	 
// 	 }  
// 	}  


public class Hello {
	public int add(int a,int b){
		return a+b;
		}
		 
		public int subtract(int a,int b){
		return a-b;
		}
		
	public static void main(String []args)
	{
		Hello m=new Hello();
		for(int i=0;;i++) {
			System.out.println(m.add(i, i));
			System.out.println(m.subtract(i,i-1));
		}
	}
}
