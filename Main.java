import java.util.*;
class Student {
    String Name;
    int ID;
    static String College = "Prince Engineering College";
    String Department;
    int Age;
    Student() {
    }
    Student(String Name, int ID, String Department, int Age) {
        this.Name = Name;
        this.ID = ID;
        this.College="Prince Engineering college";
        this.Department = Department;
        this.Age = Age;
    }
    void displayStudent() {
        System.out.println("Name       : " + Name);
        System.out.println("ID         : " + ID);
        System.out.println("College    : " + College);
        System.out.println("Department : " + Department);
        System.out.println("Age        : " + Age);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Students: ");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (i + 1));
            System.out.print("Name: ");
            String Name = sc.nextLine();
            System.out.print("ID: ");
            int ID = sc.nextInt();
            sc.nextLine();
            System.out.print("Department: ");
            String Department = sc.nextLine();
            System.out.print("Age: ");
            int Age = sc.nextInt();
            sc.nextLine();
            students[i] = new Student(Name, ID, Department, Age);
        }
        System.out.println("STUDENT INFORMATION");
        for (int i = 0; i < n; i++) {
            students[i].displayStudent();
        }
        sc.close();
    }
}
