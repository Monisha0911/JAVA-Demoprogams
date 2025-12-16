package day5;
public class StudentTest 
{
    public static void main(String[] args) {

        try {
            Student[] students = {
                new Student(1, "A", 80),
                new Student(2, "B", 75)
            };

            int searchId = 2;
            boolean found = true;

            for (Student s : students) {
                if (s.id == searchId) {
                    System.out.println(s.id + " " + s.name + " " + s.marks);
                    found = true;
                }
            }

            if (!found)
                throw new StudentNotFoundException();

        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

