import java.util.Objects;

public class student {
    ///implements Comparable<student> this is removed as we r using comparator
    private int stuId;
    private String stuName;
    private int stuAge;
    private char grade;

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public student(int stuId, String stuName, int stuAge, char grade) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.grade = grade;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return stuId == student.stuId && stuAge == student.stuAge && grade == student.grade && Objects.equals(stuName, student.stuName);
    }

    @Override
    public int hashCode() {
        //return Objects.hash(stuId, stuName, stuAge, grade);
        return this.stuId;
    }

    /*@Override
    public int compareTo(student o) {
       // return this.getStuName().compareTo(o.getStuName()); sorting based on names
        return this.getStuId() - o.getStuId();//sorting based on id
    }*/
}
