package concept;

public class Student {
    String name;
    int age;
    int rollno;
//    constructors 
    public Student(String name, int age, int rollno) {
    	this.name = name;
//    	current object/parameter name = name property of object
    	this.age = age;
    	this.rollno = rollno;
    }
    public void setName(String name) {
    	this.name = name;
    }
    public void setAge(int age) {
    	this.age = age;
    }
    public void setRollno(int rollno) {
    	this.rollno = rollno;
    }
//    get method is used to read the current objects name
    public String getName() {
    	return name;
    }
    public int getAge() {
    	return age;
    }
    public int getRollno() {
    	return rollno;
    }
    
    public String toString() {
    	return("Student name:" +getName() +"\t age:" +this.getAge() + "\t rollno:" + this.getRollno());
    }
    public static void main(String[] args) {
    	Student s = new Student("SK", 21, 17);
    	System.out.println(s.toString());
    }
    
    
}
