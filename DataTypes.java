public class DataTypes {
    public static void main(String[] args) {
        int n = 1234567890;
        long nL= 123456789011L;

        double nD= 123.456;
        float nF = 123.456F;

        var salary = 1500; //int
        //pension 3%
        var pension = salary * 0.03; //double
        var totalSalary= salary - pension;

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Diglas Temoche";
        System.out.println("EMPLOYEE: " + employeeName + " SALARY: " + totalSalary);
    }
}
