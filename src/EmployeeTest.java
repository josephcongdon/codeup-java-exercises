public class EmployeeTest {
    public static void main(String[] args) {
        Employee one =  new Employee();
        one.name = "one";
        Employee two = new Employee();
        two.name = "two";
        Employee three = new Employee();
        three.name = "three";
        one.displayEmployeeInfo();
        one.randomQuote();
        two.displayEmployeeInfo();
        two.randomQuote();
        three.displayEmployeeInfo();
        three.randomQuote();
        System.out.println(Employee.company);
    }

}
