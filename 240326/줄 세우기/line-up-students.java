import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for(int i = 0; i < n; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            students[i] = new Student(h, w, i+1);
        }
        
        Arrays.sort(students);
        for(int i = n-1; i >= 0; i--)
            System.out.printf("%d %d %d\n", students[i].height, students[i].weight, students[i].num);
    }

}

class Student implements Comparable<Student> {
    int height, weight, num;

    public Student(int height, int weight, int num){
        this.height = height;
        this.weight = weight;
        this.num = num;
    }

    @Override
    public int compareTo(Student student){
        if(this.height == student.height){
            if(this.weight == student.weight)
                return this.num - student.num;
            return this.weight - student.weight;
        }
        return this.height - student.height;
    }
}