import java.util.ArrayList;
import java.util.Scanner;

class Students{
    int studentId;
    String name;
    float marks;
    Students(){}
    public Students(int studentId, String name, float marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getMarks() {
        return marks;
    }
    public void setMarks(float marks) {
        this.marks = marks;
    }
    
}

public class StudentManagement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Students> students = new ArrayList<>();
        System.out.print("PRESS\n1:ADD\n2:VIEW\n3:UPDATE\n4:DELETE\n5:EXIT\n");
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        while (choice != 5) {
            switch(choice){
                case 1: System.out.println("Enter the Student ID:");
                        int id = sc.nextInt();
                        System.out.println("Enter the Student Name:");
                        String name = sc.nextLine   ();
                        System.out.println("Enter the Student Marks:");
                        float marks = sc.nextFloat();
                        Students obj = new Students(id,name,marks);
                        students.add(obj);
                        break;
                case 2:System.out.println("Student Details:");
                        for(Students s :students){
                            System.out.println("ID: "+s.getStudentId()+" Name: "+s.getName()+" Marks: "+s.getMarks());
                        }
                        break;
                case 3: System.out.println("Enter the Student Id to update:");
                        int updateId = sc.nextInt();
                        for(int i=0; i<students.size(); i++){
                            if(students.get(i).getStudentId() == updateId){
                                System.out.println("Enter the new Name:");
                                String newName = sc.nextLine();
                                System.out.println("Enter the new Marks:");
                                float newMarks = sc.nextFloat();
                                students.get(i).setName(newName);
                                students.get(i).setMarks(newMarks);
                                System.out.println("Student details updated.");
                                break;
                            }
                        }
                        break;
                case 4: System.out.println("Enter the Student Id to delete:");
                        int deleteId = sc.nextInt();
                        for(int i=0; i<students.size(); i++){
                            if(students.get(i).getStudentId() == deleteId){
                                students.remove(i);
                                System.out.println("Student details deleted.");
                                break;
                            }
                        }
                        break;
                default: System.out.println("Invalid choice. Please try again.");
            }
             System.out.println("Enter your choice:");
             choice = sc.nextInt();
            
        }
        sc.close();

    }
}