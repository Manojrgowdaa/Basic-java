class Employs {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employs(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        // Create two employee objects
        Employs employee1 = new Employs(1, "NithanNisarga", 50000);
        Employs employee2 = new Employs(2, "Manoj", 60000);

        // Display the details of each employee
        System.out.println("Details of Employee 1:");
        employee1.displayDetails();
        System.out.println("\nDetails of Employee 2:");
        employee2.displayDetails();
    }
}
