public class Course {
    private String name;
    private String enrollType;
    private int numberOfStudentsEnrolled;
    Lecturer lecturerInCharge;
    Degree degreeBelongsTo;

    public Course(String name, int numberOfStudentsEnrolled, Lecturer lecturerInCharge, Degree degreeBelongsTo) {
        this.name = name;
        this.enrollType = enrollType;
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
        this.lecturerInCharge = lecturerInCharge;
        this.degreeBelongsTo = degreeBelongsTo;
    }

    public void displayInfo(){
        System.out.println("\nCourse Name: " + name);
        System.out.println("Enrollment Type: " + enrollType);
        System.out.println("Number of Students Enrolled: " + numberOfStudentsEnrolled);
        if (lecturerInCharge != null) {
            System.out.println("Lecturer in Charge: " + lecturerInCharge.getName());
        } else {
            System.out.println("No lecturer assigned.");
        }
        if (degreeBelongsTo != null) {
            System.out.println("Degree Belongs To: " + degreeBelongsTo.getName());
        } else {
            System.out.println("No degree associated.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnrollType() {
        return enrollType;
    }

    public void setEnrollType(String enrollType) {
        this.enrollType = enrollType;
    }

    public int getNumberOfStudentsEnrolled() {
        return numberOfStudentsEnrolled;
    }

    public void setNumberOfStudentsEnrolled(int numberOfStudentsEnrolled) {
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }

    public void addLecturerInCharge(Lecturer lecturer){
        lecturerInCharge=lecturer;
    }
    public void removeLecturerInCharge(){
        if (this.lecturerInCharge != null) {
            System.out.println("Lecturer " + lecturerInCharge.getName() + " removed from lecturer in charge.");
            this.lecturerInCharge = null;
        } else {
            System.out.println("No lecturer in charge to remove.");
        }
    }
    public void addDegreeBelongsTo(Degree degree){
        degreeBelongsTo =degree;
    }
    public void removeDegreeBelongsTo(){
        if (this.degreeBelongsTo != null) {
            System.out.println("Degree " + degreeBelongsTo.getName() + " removed from the course.");
            this.degreeBelongsTo = null;
        } else {
            System.out.println("No degree associated to remove.");

        }
    }





}
