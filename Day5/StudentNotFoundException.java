package day5;

@SuppressWarnings("serial")
class StudentNotFoundException extends Exception {
    StudentNotFoundException() {
        super("Student not found");
    }
}