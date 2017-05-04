package com.java.prog;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private int id;
	private String name;
	private long phone;
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void display(List<Student> allstudents) {
		for (Student s : allstudents) {
			System.out.println("Student Details ---> ID : " + s.getId()
					+ "\t NAME : " + s.getName() + "\t PHONE : " + s.getPhone()
					+ "\t ADDRESS : " + s.getAddress());
		}
	}

	public List<Student> addingData() {
		List<Student> allstudents = new ArrayList<Student>();

		Student s1 = new Student();
		s1.setId(1);
		s1.setName("name1");
		s1.setPhone(11111);
		s1.setAddress("address1");

		Student s2 = new Student();
		s2.setId(2);
		s2.setName("name2");
		s2.setPhone(22222);
		s2.setAddress("address2");

		Student s3 = new Student();
		s3.setId(3);
		s3.setName("name3");
		s3.setPhone(33333);
		s3.setAddress("address3");

		allstudents.add(s1);
		allstudents.add(s2);
		allstudents.add(s3);

		return allstudents;
	}

	public static void main(String[] args) {
		Student s = new Student();
		List<Student> allstudents = s.addingData();
		s.display(allstudents);
	}
}
