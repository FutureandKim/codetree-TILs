import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] s = new Student[n];
        
        for(int i = 0; i < n; i++){
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            s[i] = new Student(name, height, weight);
        }

        Arrays.sort(s);
        for(int i = 0; i < n; i++){
            System.out.println(s[i].name + " " + s[i].height + " " + s[i].weight);
        }
    }
}

class Student implements Comparable<Student> {
    String name;
    int height, weight;

    public Student(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student student) { // 키 기준 오름차순 정렬
        return this.height - student.height;
    }
};