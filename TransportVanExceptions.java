//Rohit Singh
//Sept. 10th 2020
//Calculates vans needed based on number of students
package com.company;
import java.util.Scanner;
public class TransportVanExceptions {
    public static void main(String[] args) {
        Scanner askStudents = new Scanner(System.in);
        System.out.println("How many students are travelling (8 students per van)?");
       int students = askStudents.nextInt();
        while (students <= 0) {
            System.out.println(students + " is not a valid input provide a valid input ");
            students = askStudents.nextInt();
        }
            if ((students  > 0)) {
                int vans = (students / 8);
                int remainingStudents = (students % 8); //Finds out students remaining
                if ((remainingStudents) != 0) { //Adds a van if there are remaining students
                    vans++;
                    int parents = (8 - remainingStudents);
                    System.out.println(vans + " vans are needed to transport " + students + " students"); //Prints out vans needed
                    System.out.println("Places available for parents: " + parents);
                    int costVans = (1500 * vans); //Finds cost of vans
                    System.out.println("The cost for the vans will be " + costVans + " dollars");
                } else if ((remainingStudents == 0)) {
                    int parents = 0;
                    System.out.println(vans + " vans are needed to transport " + students + "students"); //Prints out vans needed
                    System.out.println("Places available for parents: " + parents);
                    int costVans = (1500 * vans); //Finds cost of vans
                    System.out.println("The cost for the vans will be " + costVans + " dollars");

                }

            }
            }
        }






