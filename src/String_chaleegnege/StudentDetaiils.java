package String_chaleegnege;

 class StudentDetaiils {
        String name;
        int age ;
        String rollNumber;
        String  house;

     public StudentDetaiils(String name, int age, String rollNumber, String house) {
         this.name = name;
         this.age = age;
         this.rollNumber = rollNumber;
         this.house = house;
     }

     @Override
     public String toString() {
         return "StudentDetaiils{" +
                 "name='" + name + '\'' +
                 ", age=" + age +
                 ", rollNumber='" + rollNumber + '\'' +
                 ", house='" + house + '\'' +
                 '}';
     }

     public static void main(String[] args) {
        StudentDetaiils stu = new StudentDetaiils("Avi",24,"001","Mahuda");
         System.out.println(stu);
    }
}
