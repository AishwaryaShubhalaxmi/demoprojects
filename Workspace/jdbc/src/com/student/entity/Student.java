package com.student.entity;

public class Student {

	private int student_id;
	private String name;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((stream == null) ? 0 : stream.hashCode());
		result = prime * result + student_id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (stream == null) {
			if (other.stream != null)
				return false;
		} else if (!stream.equals(other.stream))
			return false;
		if (student_id != other.student_id)
			return false;
		return true;
	}
	public Student(int student_id, String name, String stream) {
		super();
		this.student_id = student_id;
		this.name = name;
		this.stream = stream;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	private String stream;

public Student(int student_id, String name) {
	this.name=name;
	this.student_id=student_id;
}
}
