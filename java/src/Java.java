class Student{
    String name;
    int age;
    public void getInfo(){
        System.out.println(this.name);
        System.out.println(age);
    }
}
public class Java{
     public static void main(String args[]){
         Student s1 = new Student();
         Student s2 = new Student();
         s1.name ="Joel";
         s1.age = 19;
         s1.getInfo();
         s2.name ="Isha";
         s2.age = 21;
         s2.getInfo();
     }
}
