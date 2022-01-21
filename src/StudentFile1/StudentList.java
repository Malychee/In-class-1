/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentFile1;

/**
 *
 * @author malac
 */
public class StudentList {
    public static void main (String[] args) {
        
        
        Student[] studentList = new Student[4]; 
        
        studentList[0] = new Student("s1", "Malchi Whitt");
        studentList[1] = new Student("s2", "Poop");
        studentList[2] = new Student("s3", "Siggy");
        
        for (int i = 0; i<studentList.length; i++)
            System.out.print(studentList[i].getStudentName());
        
        
        
    }


}