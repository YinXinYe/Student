import java.util.Scanner;
public class Main {
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        Scanner activityScanner = new Scanner(System.in);  
    
        System.out.println("Enter the number of students you want to add:");  
        int numStudents = scanner.nextInt();  
        scanner.nextLine();
    
        Student[] students = new Student[numStudents];  
    
        for (int i = 0; i < numStudents; i++) {  
            System.out.println("Enter student ID:");  
            String studentID = scanner.nextLine();  
    
            System.out.println("Enter student name:");  
            String studentName = scanner.nextLine();  
    
            System.out.println("Enter the number of extra activities:");  
            int numExtraActivities = scanner.nextInt();  
            scanner.nextLine();
    
            students[i] = new Student(studentID, studentName, numExtraActivities);  
    
            for (int j = 0; j < numExtraActivities; j++) {  
                System.out.println("Enter extra activity " + (j + 1) + ":");  
                String activity = activityScanner.nextLine();  
                students[i].addExtraActivity(activity);  
            }  
        }  
     
        for (Student student : students) { 
            System.out.println(student);  
        }  
    
        scanner.close();  
        activityScanner.close();  
    }  
}

