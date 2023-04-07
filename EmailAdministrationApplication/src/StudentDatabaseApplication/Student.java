package StudentDatabaseApplication;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentID;
    private String courses;
    private int tuitionBalance;
    private int costOfCourse = 600;

    //Constructor: prompt user to enter student's name and year
    public Student(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = scanner.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = scanner.nextInt();
        System.out.println(firstName + " " + lastName + " " + gradeYear);
    }
    //Generate an ID

    //Enroll in courses

    //View balance

    //Pay tuition

    //Show status



}
