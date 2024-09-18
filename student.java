

public class Student
{
    String name;
    int rollno;
    int age;
    
public void info(){
		System.out.println(this.name);
		System.out.println(this.rollno);
		System.out.println(this.age);
	}
	
}

class Stu{
	public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "Saket mishra";
    s1.rollno = 60;
    s1.age = 19;
    
    s1.info();
}
}
    

