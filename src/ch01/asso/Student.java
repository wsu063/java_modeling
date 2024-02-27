package ch01.asso;
public class Student {

    private String name; //학생 이름
    //Student는 Course를 알고 있다.(의존하고 있다)
    private ArrayList<Course> courses;

    //생성자
    public Student(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    //수강신청
    public void registerCourse(Course courses) {
        courses.add(courses);
    }
    //수강취소
    public void dropCourse(Course courses) {
        courses.remove(courses);
    }
}
