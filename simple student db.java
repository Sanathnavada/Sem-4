import java.util.Scanner;
class Student
{
    String USN;
    String Name;
    String Branch;
    String Phone;
    public Student(String usn,String name,String branch,String phone)
    {
        USN = usn;
        Name = name;
        Branch = branch;
        Phone = phone;
    }
}
public class Main
{
    public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter total number of students:-");
            int n = in.nextInt();
            Student[] st=new Student[n];
            String usn, name, branch, phone;
            for(int i=0;i<n;i++)
            {
            System.out.println("\nEnter details of student "+(i+1));
            System.out.print("USN: ");
            usn=in.next();
            System.out.print("Name: ");
            name=in.next();
            System.out.print("Branch: ");
            branch=in.next();
            System.out.print("Phone number: ");
            phone=in.next();
            st[i] = new Student(usn,name,branch,phone);
            }
            System.out.println("Student Details");
            System.out.println("USN\t\tName\tBranch\tPhone");
            for(int i=0;i<n;i++)
                {
                System.out.println(st[i].USN + "\t" + st[i].Name + "\t" +
                st[i].Branch + "\t" + st[i].Phone);
                }
        }
}
