package org.student;

public class Students {

	public void studentInfo(int a) {
		System.out.println(a);
	}
	public void studentInfo(int a, String name) {
		System.out.println(a+name);
			}
	public void studentInfo(String n,long a) {
		System.out.println(n+a);
	}
public static void main(String[] args) {
	Students obj = new Students();
	obj.studentInfo(001);
	obj.studentInfo(001," sri");
	obj.studentInfo("sri@gmail.com", 7456355788l);
}
}
