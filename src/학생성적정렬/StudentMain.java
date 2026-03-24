package 학생성적정렬;
// 학생 객체 기준으로 성적을 정렬하되, 성적이 같으면 이름 순으로 정렬
// 성적은 국어, 영어, 수학 성적을 입력 받아 총점을 구하고 성적은 총점 기준으로 정렬
// 필드는 이름, 국어, 영어, 수학
// 출력은 이름, 총점

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("장원영", 80, 90,100));
        list.add(new Student("안유진", 70, 88,70));
        list.add(new Student("이서", 50, 90,88));
        list.add(new Student("가을", 40, 90,77));
        list.add(new Student("레이", 30, 90,66));

        Collections.sort(list);
        for (Student student : list) {
            System.out.println(student.name + " " + student.getTotal());
        }

    }
}

class Student implements Comparable<Student> {
    String name;
    int kor, eng, math;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getTotal() {
        return kor + eng + math;
    }


    @Override
    public int compareTo(Student o) {
        // 1. 총점 내림차순
        if (this.getTotal() != o.getTotal()) {
            return o.getTotal() - this.getTotal();  // 양수값이 나오면 정렬 조건, 큰 값이 앞으로 와야 함
        }

        // 2. 이름 오름차순
        return this.name.compareTo(o.name);  // ASCII 기준으로 오름 차순 정렬
    }
}