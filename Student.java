import java.util.ArrayList;

public class Student extends Person{
    public Student(String name) {
        super(name);
    }
    private String studentID;
    private String year;
    Degree degree;
    ArrayList<Course> coursesEnrolled = new ArrayList<Course>();

    public Student(String name, String studentID, String year, Degree degree, ArrayList<Course> coursesEnrolled) {
        super(name);
        this.studentID = studentID;
        this.year = year;
        this.degree = degree;
        this.coursesEnrolled = coursesEnrolled;
    }
    @Override
    public void displayInfo() {
        System.out.println("Student Name: " + getName());
        System.out.println("Student ID: " + studentID);
        System.out.println("Year: " + year);
        displayDegreeInfo();
        listCoursesEnrolled();
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void registerDegree(Degree degree){
        this.degree = degree;
    }
    public void displayDegreeInfo(){
        if (degree != null) {
            System.out.println("Degree Information:");
            degree.displayInfo();
        } else {
            System.out.println("No degree registered.");
        }
    }
    public void enrollCourse(Course course){
        if (!coursesEnrolled.contains(course)) {
            coursesEnrolled.add(course);
            System.out.println("Enrolled in course: " + course.getName()); // Assuming Course has getCourseName() method
        } else {
            System.out.println("Already enrolled in course: " + course.getName());
        }
    }
    public void unenrollCourse(Course course){
        if (coursesEnrolled.contains(course)) {
            coursesEnrolled.remove(course);
            System.out.println("Unenrolled from course: " + course.getName());
        } else {
            System.out.println("Not enrolled in course: " + course.getName());
        }
    }
    public void listCoursesEnrolled(){
        System.out.println("Courses Enrolled:");
        if (coursesEnrolled.isEmpty()) {
            System.out.println("No courses enrolled.");
        } else {
            for (Course course : coursesEnrolled) {
                System.out.println(course.getName());
            }
        }
    }





}
