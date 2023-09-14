package day1.assignment1;

public class Mobile {
	public void sendMessage() {
		System.out.println("Send Message");
	}
	public void shareDocument() {
		System.out.println("Share Document");
	}
	public void makeCall() {
		System.out.println("Make Call");
	}
	public static void main(String[] args) {
		Mobile nokia = new Mobile();
		nokia.sendMessage();
		nokia.shareDocument();
		nokia.makeCall();
}
}
