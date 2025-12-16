package day7;
import java.util.ArrayList;

public class StudentMain 
{
@SuppressWarnings("unused")
public static void main(String[] args)
{
	ArrayList<Student> students=new ArrayList<Student>();
	Student student1=new Student(1,"monisha","BCA");
	Student student2=new Student(2,"monish","BBA");
	Student student3=new Student(3,"moni","BCA");
	Student student4=new Student(4,"nisha","BCom");
	Student student5=new Student(5,"isha","BCom");
	students.add(student1);
	students.add(student2);
	students.add(student3);
	students.add(student4);
	students.add(student5);
	
	for(Student student :students)
	{
		System.out.println(student);
	}
	students.add(5, new Student(6,"mamatha","BCA"));
	students.add(6, new Student(7,"mama","BCom"));
	students.add(7, new Student(8,"matha","BBA"));
	students.add(8, new Student(9,"amrutha","BCA"));
	students.add(9, new Student(10,"Kantha","BCom"));
	System.out.println("After add the students");
	for(Student student : students)
	{
		System.out.println(student);
	}
	int searchId=11;
	boolean found=false;
	
	System.out.println("Searching the Student is Present in the registration: "+searchId);
	for(Student student:students)
	{
		if(student.getId() == searchId)
		{
			System.out.println("Student is Present"+student);
			found = true;
			break;
		}
		
	}
	if(!found)
	{
		System.out.println("Student has not been registred");
	}
}
}
