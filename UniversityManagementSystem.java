public class UniversityManagementSystem {
    public static void main(String[] args) {
        Degree degree = new Degree("Batchelor of engineering technology",100,null);
        Department department = new Department("Department of applied computing",null,null,null);
        Course course = new Course("Mathematics for Technology - 1",100,null,null);
        Lecturer lecturer = new Lecturer("Dr.Laalitha Liyanage","Department Head - Department of applied computing");
        Student student = new Student("Akila Bandara","ET/2021/001","2",null,null);


        degree.displayInfo();
        department.displayInfo();
        course.displayInfo();
        lecturer.displayInfo();
        student.displayInfo();

    }
}
