import java.util.ArrayList;

public class Lecturer extends Person {
    private String position;
    Department department;
    ArrayList<Course> coursesTeaching = new ArrayList<Course>();

    public Lecturer(String name, String position) {
        super(name);
        this.position = position;
    }

    @Override
    public void displayInfo() {
        System.out.println("Lecturer Name: " + getName());
        System.out.println("Position: " + position);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    public void displayDepartmentInfo(){
        System.out.println("Name : "+getName());
    }
    public void addCourse(Course course){
        coursesTeaching.add(course);
    }
    public void removeCourse(Course course){
        coursesTeaching.remove(course);
    }
    public void listCoursesTeaching(){
        for(Course course:coursesTeaching){
            course.displayInfo();
        }
    }

}
