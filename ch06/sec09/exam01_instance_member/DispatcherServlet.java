package sec09.exam01_instance_member;


public class DispatcherServlet {
	private static DispatcherServlet dispatcher = null;
	
	public int counter = 0;
	
	private DispatcherServlet() {
		counter++;
	}
	
	public static DispatcherServlet getInstance() {
		if (dispatcher == null) {
			dispatcher = new DispatcherServlet();
		}
		return dispatcher;
	}
	
	public static void main(String[] args) {
		DispatcherServlet dispatcher = DispatcherServlet.getInstance();
		DispatcherServlet dispatcher2 = DispatcherServlet.getInstance();
		
		System.out.println(dispatcher == dispatcher2);
		dispatcher.counter++;
		var worker1 = new Thread(new Worker());
		worker1.start();
		var worker2 = new Thread(new Worker());
		worker2.start();
	}
}

class Worker implements Runnable {
	@Override
	public void run() {
		DispatcherServlet disp = DispatcherServlet.getInstance();
		for (int i = 0; i < 3; i++)
			System.out.println(disp.counter++);
	}
	
}
