public class student
{
    String name;
    String rollno;
   
   public student(String n,String r)
   {
    name=n;
    rollno=r;
   }
   public void display()
   {
    System.out.println("Student Name:"+name);
    System.out.println("Roll number:"+rollno);
   }

}