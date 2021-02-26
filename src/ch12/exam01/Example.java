package ch12.exam01;

public class Example {

	public static void main(String[] args) {
		
		System.out.println("메인 스레드 시작");
		
		//네트워크 작업을 하는 스레드 생성과 실행
		Thread thread1 = new Thread(new NetworkTask());
		thread1.start(); //스레드 실행 - run 메소드 실행
		
		//뮤직 작업을 하는 스레드 생성과 실행
		Thread thread2 = new Thread(new MusicTask());
		thread2.start(); //스레드 실행
		
		//채팅 작업을 하는 스레드 생성과 실행 - 익명 구현 객체 사용
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					System.out.println("채팅 작업을 합니다.");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
				}
			}
		}); //Runnable이라는 인터페이스를 구현한 클래스를 만들어 사용한 객체 선언(인터페이스를 가지고 객체 선언x)
		thread3.start();
		
		while(true) {
			System.out.println("메인 작업을 합니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			
		}
	}

}
