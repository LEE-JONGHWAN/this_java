package sec05.exam01_runnable.prac;

class TeaPrepare {
	
}

public class PrepareTea {

	public static void main(String[] args) {
//		Runnable teaPrep = new Runnable() {
//			@Override
//			public void run() {
//				for(int i = 0; i < 3; i ++) {
//					try {
//						Thread.sleep(300);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				System.out.println(".");
//				}
//			}
//		};
		
		
		Runnable teaPrep = () -> {
				for(int i = 0; i < 3; i ++) {
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(".");
				}
		};
		Thread teaCook = new Thread(teaPrep);
		teaCook.start();
	}
}