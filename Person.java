package kh.oop;

public class Person {
	public String pNo;
	public String name;
	public char gender;
	public String address;
	public String phone;
	public int age;
	
	public boolean setAge(int inputAge) {
		if(inputAge>0 && inputAge<=150) {
			age = inputAge;
			return true;
		}
		return false;
	
		
	}
}
