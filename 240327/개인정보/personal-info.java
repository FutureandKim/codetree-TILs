import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];
        for(int i = 0; i < 5; i++){
            String n = sc.next();
            int h = sc.nextInt();
            double w = sc.nextDouble();
            students[i] = new Student(n, h, w);
        }

        System.out.println("name");
        Arrays.sort(students, new Comparator<Student>(){
            @Override
            public int compare(Student s1, Student s2){
                return s1.name.compareTo(s2.name);
            }
        });
        for(int i = 0; i < 5; i++)
            System.out.printf("%s %d %.1f\n", students[i].name, students[i].height, students[i].weight);

        Arrays.sort(students);
        System.out.println("\nheight");
        for(int i = 0; i < 5; i++)
            System.out.printf("%s %d %.1f\n", students[i].name, students[i].height, students[i].weight);
    }
}

class Student implements Comparable<Student> {
    String name;
    int height;
    double weight;

    public Student(String name, int height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    @Override
    public int compareTo(Student student){
        return student.height - this.height;
    }
}