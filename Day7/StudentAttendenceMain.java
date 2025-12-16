package day7;

import java.util.LinkedHashSet;
public class StudentAttendenceMain 
{
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		LinkedHashSet<StudentAttendence> students= new LinkedHashSet<StudentAttendence>();
		students.add(new StudentAttendence(123,"Monisha"));
		students.add(new StudentAttendence(456,"Monish"));
		students.add(new StudentAttendence(235,"Nisha"));
		students.add(new StudentAttendence(567,"Isha"));
		students.add(new StudentAttendence(231,"Monish"));
		
			System.out.println(students);
		}
	}
