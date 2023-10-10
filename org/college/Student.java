package org.college;

public class Student extends Department {

	public void studentName() {
		System.out.println("student name");
	}
	public void studentDept() {
		System.out.println("student department");
	}
	public void studentId() {
		System.out.println("student Id");
	}
	public static void main(String[] args) {
		Student obj = new Student();
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
		obj.depName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
	}
}
