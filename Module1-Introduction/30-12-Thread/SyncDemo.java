package com.a3012;

class Sender
{
	public void send(String msg)
	{
		System.out.println("Sending "+msg);
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		System.out.println(msg+" Sent ");
	}
	
}

class ThreadSend extends Thread
{
	Sender sender;
	String msg;
	
	public ThreadSend(Sender sender,String msg) 
	{
		// TODO Auto-generated constructor stub
		
		this.sender=sender;
		this.msg=msg;
	}
	
	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		super.run();
		
		
		synchronized (sender) 
		{
			sender.send(msg);
		}
		
		
		
	}
}


public class SyncDemo 
{
	public static void main(String[] args) 
	{
		Sender sender = new Sender();
		
		ThreadSend t1 = new ThreadSend(sender,"Hi");
		ThreadSend t2 = new ThreadSend(sender, "Byee");
		
		t1.start();
		t2.start();
	}
}
