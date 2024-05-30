package ch02;

public class Student {

    private final int studentNumber;
    private final String studentName;

    public Student(int studentNumber, String studentName) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
    }

    public String toString() {
        return studentName + "," + studentNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student student) {
            return this.studentNumber == student.studentNumber;
        }
        return false;
    }

    // 그러나 클래스에 담긴 데어터는 물리적인 주소는 다르지만, 논리적으로 동일한 데이터이기 때문에
    // return 값을 studentNumber를 넣어주었다.
    @Override
    public int hashCode() {
        return studentNumber;
    }
}
