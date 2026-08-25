class Course {
    static  int maxcapacity = 100;
    String courseName;
    int enrollment;

    String[] getEnrolledStudent;

    Course(String courseName){
        this.courseName = courseName;
        this . enrollment =0;
        this.enrolledStudent = new String[maxcapacity];
    }

    String[] enrolledStudent = new String[maxcapacity];

 static void SetMaxCapacity(int maxcapacity){
     Course.maxcapacity = maxcapacity;

 }
 void enrollStudent(String StudentName){
     enrolledStudent[enrollment] = StudentName;
     enrollment++;

 }
 void unenrollStudent(String Studentname){
     System.out.println("studebt removed");
     enrollment--;
 }

    public static void main(String[] args) {

    }


}
