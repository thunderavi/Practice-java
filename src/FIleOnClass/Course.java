package FIleOnClass;

class Course {
    String courseName;
    String enrolledStudent;
    int enrollment;

    static int maxCapacity = 100;
    String[] enrolledStudents ;

    Course(String courseName){
        this.courseName=courseName;
        this.enrollment= 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity=maxCapacity;
    }

    void enrollStudent(String studentName){
        enrolledStudents[enrollment] = studentName;
        enrollment++;
    }

    void unenrollStudent(String studentName){
        System.out.println("Student removed");
        enrollment--;
    }

    public static void main(String[] args) {
        Course mycource = new Course("book12");
        Course mycource2 = new Course("book22");
       mycource.enrollStudent("Avi");
        for (int i = 0; i < mycource.enrollment; i++) {
            System.out.println(mycource.enrolledStudents[i]);
        }



    }


}
