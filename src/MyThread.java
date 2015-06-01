
public class MyThread implements Runnable {
	
	private int end;
	
	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyThread(String name,int end) {
		this.name = name;
		this.end = end;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < end; i++) {
			System.out.println(name + ": " + i);
		}
	}
} 