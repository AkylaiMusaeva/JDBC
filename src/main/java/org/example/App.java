package org.example;

import org.example.config.Config;
import org.example.model.Student;
import org.example.service.StudentService;
import org.example.service.service.StudentServiceImpl;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner=new Scanner(System.in);
        int num;
        StudentService studentService=new StudentServiceImpl();
        while(true) {
            switch (num = scanner.nextInt()) {
                case 1 -> studentService.createTableStudent();
                case 2 -> studentService.saveStudent(new Student("Abubakir", "Kubanychbekov", 25));
                case 3 -> studentService.getAllStudents().forEach(System.out::println);
                case 4 -> studentService.updateStudent(2L, new Student("Aizadeee", "Abdrazakova", 20));
                case 5 -> studentService.cleanTable();
                case 6 -> studentService.dropTable();
                
            }
        }
    }
}
