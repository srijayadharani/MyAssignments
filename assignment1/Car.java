package day1.assignment1;


public class Car {

		public void applyGear() {
			System.out.println("Apply Gear");
		}
		public void switchOnAc() {
			System.out.println("Switch on Ac");
		}
		public void applyAcclerate() {
			System.out.println("Apply Acclerate");
		}
		public static void main(String[] args) {
			Car mahindra = new Car();
			mahindra.applyGear();
			mahindra.switchOnAc();
			mahindra.applyAcclerate();
}
}