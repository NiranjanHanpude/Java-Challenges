 class StudentToString {
    String Name;
    int age;
    String rollNumber;
    String house;

     public StudentToString(String name, int age, String rollNumber, String house) {
         this.Name = name;
         this.age = age;
         this.rollNumber = rollNumber;
         this.house = house;
     }


     public String toString(){
         return "Student Details:{Name:"+ Name +
                 ", age:" + age + "," +
                 " roll number:" + rollNumber + "," +
                 "house:" + house +"}";
     }

     public static void main(String[] args) {
         StudentToString stu = new StudentToString("Niranjan",23,"001","ShivajiNager");
         System.out.println(stu);
     }
 }
