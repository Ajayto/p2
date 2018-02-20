package MultiThradming;

public class DemoThread {

	public static void main(String[] args) {
		MyThread t=new MyThread();
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}
		// TODO Auto-generated method stub

	}

}
