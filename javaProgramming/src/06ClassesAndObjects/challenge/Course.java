package challenge;

public class Course {
    String courseName;
    String enrolledStudent;
    static int maxCapacity = 60;

    Course(String courseName, String enrolledStudnet) {
        this.courseName = courseName;
        this.enrolledStudent = enrolledStudnet;
    }

    public void enrollStudnet(String studentName) {
        if (studentName == enrolledStudent) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public void unenrollStudnet(String studentName) {
        if (studentName != enrolledStudent) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void setMaxCapacity(int capacity) {
        maxCapacity = capacity;
    }

}
//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//Very bad code//