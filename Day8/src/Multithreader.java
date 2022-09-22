
public class Multithreader extends Thread {
	int threadNo;
	public Multithreader(int threadNo) {
		// TODO Auto-generated constructor stub
		this.threadNo = threadNo;
	}
	
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(i + " No " + this.threadNo);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
