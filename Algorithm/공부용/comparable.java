package 공부용;

public class comparable {
    public static void main(String[] args) {
        Student a = new Student(17, 2);
        Student b = new Student(20, 1);

        int test = a.compareTo(b); // a와 b 객체를 비교

        System.out.println(test);

    }
}

class Student implements Comparable<Student> {
    int age, classNumber;

    Student(int age, int classNumber){
        this.age = age; this.classNumber = classNumber;
    }

    public int compareTo(Student o) { // compareTo의 경우 자기 자신이 기준이 된다.
        /*if(this.age > o.age){
            return 1; // return값은 양수이기만 하면 된다.
        } else if(this.age == o.age){
            return 0;
        } else{
            return -1; // 마찬가지로 음수이기만 하면 된다.
        }*/
        return this.age - o.age; // 심플하게 return 값을 정의할 수 있다.
        // compareTo의 return 값은 양수 / 음수 / 0에 따라 결정
    }
}
