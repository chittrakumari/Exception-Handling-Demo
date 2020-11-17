/*
A program to demonstrate custom exceptions. Create a com.myname.student.Student class with three
private fields name, rollNo, & CPI. Create Getter and Setter for all the fields, override the public
String toString() method of Object class, to represent Student objects as String. Create a
com.myname.main.StudentMain class which is the implementation class contains main method and
a search() method. main method will create a list of students i.e array and initialize each
objects by taking input from user using java.util.Scanner class. This method will also call
search method and print the result. search() method will accept two arguments first is Student[] list
and int rollNo. This method will return Student object if rollNo matches with any of the Student
object or else it will throw an user defined exception InvalidStudentException.
com.myname.exception.InvalidStudentException is a class which extends java.lang.Exception class
and have one parameterized constructor which accept an argument String message.
 */



package program3.com.myname.main;
import program3.com.myname.student.Student;
import program3.com.myname.exception.InvalidStudentException;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
public class StudentMain {
    public static void main(String[] args){
        Student[] arr=new Student[1];
        Scanner obj=new Scanner(System.in);
        for (int i=0;i<1;i++){
            Student s=new Student();
            System.out.println("enter name");
            String n=obj.nextLine();
            s.setName(n);
            System.out.println("enter roll number");
            int r=obj.nextInt();
            s.setRollNo(r);
            System.out.println("enter cpi");
            int c=obj.nextInt();
            s.setCPI(c);

            arr[i]=s;
        }
        Scanner ob=new Scanner(System.in);
        int rollno=ob.nextInt();
        try{
            search(arr,rollno);
        }
       catch(InvalidStudentException e)
        {
        System.out.println(e.getMessage());
        }
    }
    public static void search(Student[] arr,int rollno) throws InvalidStudentException{


        int f=0;
        for(int i=0;i<arr.length;i++){
            if(rollno==arr[i].getRollNo()){
                System.out.println(Arrays.toString(arr));
            }
            else
            {
                throw new InvalidStudentException("InvalidStudentException");
            }
        }
    }
}
