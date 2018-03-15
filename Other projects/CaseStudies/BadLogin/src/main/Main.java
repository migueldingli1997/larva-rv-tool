package main;

public class Main implements Runnable{

	public void badlogin()
	{
		System.out.println("Bad Login at: " + System.currentTimeMillis());
	}

	public void run()
	{
		try{
			int cnt = 0;
			while (true)
			{
				cnt++;
				Thread.sleep(100);
				badlogin();
				if (cnt%3==0)
					Thread.sleep(1000);
			}
		}catch(Exception ex)
		{ex.printStackTrace();}
	}
	
	
	public void initialize()
	{}
	
	public static void main(String [] args)
	{
		Main m = new Main();
		m.initialize();
		new Thread(m).start();
	}
}
