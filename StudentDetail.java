// Aim of the program : Write a program in java to input and display 
// the details of n number of students having roll, name and cgpa as data members. 
// Also display the name of the student having lowest cgpa.

// Enter number of student:
// 4
// Enter 1 name:
// Bijay
// Enter roll:
// 543
// Enter CGPA:
// 7.6
// Enter 2 name:
// jatin
// Enter roll: 
// 505
// Enter CGPA: 
// 7.8
// Enter 3 name: 
// Ajay
// Enter roll: 
// 55
// Enter CGPA: 
// 9
// Enter 4 name: 
// Amar
// Enter roll: 
// 23
// Enter CGPA: 
// 9
// The Student details is: 
// name: Bijay roll: 543 CGPA: 7.6
// name: jatin roll: 505 CGPA: 7.8
// name: Ajay roll: 55 CGPA: 9.0
// name: Amar roll: 23 CGPA: 9.0
// The Lowest CGPA of student is: Bijay

import java.util.Scanner;
class Student {
    String name;
    int roll;
    double cgpa;
}

class StudentDetail {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of student: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student st[] = new Student[n];
        int lowcgpa = 0;

        for(int i=0; i<n; i++){
            st[i] = new Student();

            System.out.println("Enter name: ");
            st[i].name = sc.nextLine();

            System.out.println("Enter roll: ");
            st[i].roll = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter CGPA: ");
            st[i].cgpa = sc.nextDouble();
            sc.nextLine();

            if(st[i].cgpa < st[lowcgpa].cgpa) {
                lowcgpa = i;
            }
        }
        System.out.println("The Student details is: ");
        for(int i=0; i<n; i++){
            System.out.println("name: "+st[i].name + " roll: "+st[i].roll + " CGPA: "+st[i].cgpa);
        }
        System.out.println("The Lowest CGPA of student is: "+ st[lowcgpa].name);
    }
}