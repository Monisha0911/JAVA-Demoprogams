package day7;

import java.lang.Comparable;


@SuppressWarnings({ "unused", "rawtypes" })
public class Score implements Comparable
{
private String studentname;
private int marks;

public Score(String studentname, int marks) 
{
	super();
	this.studentname = studentname;
	this.marks = marks;
}

public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Score [studentname=" + studentname + ", marks=" + marks + "]";
}

@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return 0;
}


}
