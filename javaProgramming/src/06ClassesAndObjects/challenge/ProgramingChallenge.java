package challenge;
/**
 * 
 * ProgramingChallenge
 * 
 * 1. Create a Book class for a library system. 
 * -> Instance variables: title, author, isbn.
 * -> Static variable: totalBooks, a counter for the total number of book instances.
 * -> Instance methods: borrowBook(),returnBook().
 * -> Static method: getTotalBooks(), to get the total number of books in the library.
 * 
 * 
 * 2. Design a Course class.
 * -> Instance variables: courseName, enrolledStudents.
 * -> Static variable: maxCapacity, the maximum numbr of students for any course.
 * -> Instance methods: enrollStudnet(String studentName), unenrollStudnet(String studentName).
 * -> Static method: setMaxCapacity(int capacity), to set the maximum capacity for courses.
 */
public  class ProgramingChallenge {
    public static void main(String[] args) {
  
        
        int totalBooks =  Book.getTotalBooks();
        System.out.println(totalBooks);

        Course obj = new Course("abc", "yogesh");
        
        obj.enrollStudnet("yogesh");

        obj.unenrollStudnet("yogesh");
        
        Course.setMaxCapacity(77);
        System.out.println(Course.maxCapacity);
    }
    
}