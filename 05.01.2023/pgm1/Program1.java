

class College implements Runnable{
	int noOfSeat=50;
	int seatOccupied=48;
	int balSeats;
	College(int balSeat){
		this.balSeats=balSeats;
	}
	public void run(){
		String name=Thread.currentThread().getName();
		synchronized(this){
		if(seatOccupied<noOfSeat)
		{
			System.out.println("congrats "+name+", you got seat");
			seatOccupied++;
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){
				
		}}
			else{
				System.out.println("Sorry "+name+", admission not available");
			}
	}}
}

class UseThread{
	public static void main(String... args)
	{
		
		College clg=new College(1);
		Thread t1=new Thread(clg);
		Thread t2=new Thread(clg);
		Thread t3=new Thread(clg);
		t1.setName("Santhosh");
		t2.setName("Kannan");
		t3.setName("Raghu");
		t1.start();
		t2.start();
		t3.start();
	}
}
	
		

