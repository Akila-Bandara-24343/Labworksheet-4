import java.util.ArrayList;

public class Department {
    private String name;
    Lecturer departmentHead;
    ArrayList<Course> coursesOffering;
    ArrayList<Lecturer> lecturersBelongsTo;

    public Department(String name, Lecturer departmentHead, ArrayList<Course> coursesOffering, ArrayList<Lecturer> lecturersBelongsTo) {
        this.name = name;
        this.departmentHead = departmentHead;
        this.coursesOffering = coursesOffering;
        this.lecturersBelongsTo = lecturersBelongsTo;
    }
    public void displayInfo() {
        System.out.println("\nDepartment Name: " + name);
        displayDepartmentHeadInfo();
        if (coursesOffering != null) {
            System.out.println("Courses Offered:");
            for (Course course : coursesOffering) {
                System.out.println("- " + course.getName());
            }
        }else {
            System.out.println("There are no courses offering in this moment");
        }
        if (lecturersBelongsTo != null) {
            System.out.println("Lecturers in the Department:");
            for (Lecturer lecturer : lecturersBelongsTo) {
                System.out.println("- " + lecturer.getName());
            }
        }else{
            System.out.println("There are no lectures in this department");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void appointDepartmentHead(Lecturer lecturer){
        departmentHead = lecturer;
        }
    public void displayDepartmentHeadInfo(){
        if (departmentHead != null) {
            System.out.println("Department Head: " + departmentHead.getName());
        } else {
            System.out.println("No department head appointed.");
        }
    }
    public void offerCourse(Course course){
        if (!(coursesOffering.contains(course))) {
            coursesOffering.add(course);
            System.out.println("Course " + course.getName() + " added to the department's offerings.");
        } else {
            System.out.println("Course " + course.getName() + " is already offered.");
        }
    }
    public void withdrawCourse(Course course){
        if (coursesOffering.contains(course)) {
            coursesOffering.remove(course);
            System.out.println("Course " + course.getName() + " removed from the department's offerings.");
        } else {
            System.out.println("Course " + course.getName() + " is not currently offered.");
        }
    }
    public void addLecturer(Lecturer lecturer){
        if (!lecturersBelongsTo.contains(lecturer)) {
            lecturersBelongsTo.add(lecturer);
            System.out.println("Lecturer " + lecturer.getName() + " added to the department.");
        } else {
            System.out.println("Lecturer " + lecturer.getName() + " is already in the department.");
        }
    }
    public void removeLecturer(Lecturer lecturer){
        if (lecturersBelongsTo.contains(lecturer)) {
            lecturersBelongsTo.remove(lecturer);
            System.out.println("Lecturer " + lecturer.getName() + " removed from the department.");
        } else {
            System.out.println("Lecturer " + lecturer.getName() + " is not in the department.");
        }
    }


}
