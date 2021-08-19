package sec06.exam02_queue;

import java.util.LinkedList;
import java.util.Queue;
enum CommandsType {
	sendMail, sendSMS, sendKakaotalk;
}
public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message(CommandsType.sendMail, "홍길동"));
		messageQueue.offer(new Message(CommandsType.sendSMS, "신용권"));
		messageQueue.offer(new Message(CommandsType.sendKakaotalk, "홍두께"));
		
		messageQueue.stream().map(message -> {
			String longMessage = "";
			switch(message.command) {
				case sendMail:
					longMessage =message.to + "님에게 메일을 보냅니다.";
					break;
				case sendSMS:
					longMessage =message.to + "님에게 SMS를 보냅니다.";
					break;
				case sendKakaotalk: 
					longMessage =message.to + "님에게 카카오톡를 보냅니다.";
					break;
				default:
			}
			return longMessage;
		}).forEach(System.out::println);
		int size = messageQueue.size();
		return;
	}
}
