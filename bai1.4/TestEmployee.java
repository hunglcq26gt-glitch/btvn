public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Nguyen Van A", 25000);
        System.out.println("ID: " + e1.getID());
        System.out.println("Name: " + e1.getName());
        System.out.println("Salary: " + e1.getSalary());

        e1.raiseSalary(10);
        System.out.println("Salary sau khi tang: " + e1.getSalary());
    }
}