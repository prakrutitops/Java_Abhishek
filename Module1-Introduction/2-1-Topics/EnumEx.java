package com.a21;

 enum student 
{
	John(10),Bella(20),Sam(30),Viraaj(40);
	private int age;
	
	
	
	 public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	student(int age) 
	{
		this.age= age;
	}
}
 public class EnumEx
 {
	 public static void main(String[] args) 
	 {
		 System.out.println("Age of Viraaj Sis " +student.Viraaj.getAge()+ " years");
	 }
 }
