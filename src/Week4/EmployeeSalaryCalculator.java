package Week4;

public class EmployeeSalaryCalculator {
    static int hourlyBonusRate = 2000;
    static int standardMonthlyHours = 200;
    static int baseMonthlySalary = 50000;
    static double hourlyDeductionRate = 217.39;

    public static double calculateBonus(int actualHours) {
        double bonus = 0;
        if (actualHours > standardMonthlyHours) {
            int extraHours = actualHours - standardMonthlyHours;
            bonus = extraHours * hourlyBonusRate;
        }
        return bonus;
    }

    public static double calculateSalary(int monthlySalary, int actualHours) {
        double finalSalary = 0;

        if (actualHours < standardMonthlyHours) {
            int missingHours = standardMonthlyHours - actualHours;
            double deduction = missingHours * hourlyDeductionRate;
            finalSalary = monthlySalary - deduction;
        } else {
            finalSalary = monthlySalary + calculateBonus(actualHours);
        }

        return finalSalary;
    }

    public static void main(String[] args) {
        System.out.println("Salary for 200 hours: " + calculateSalary(baseMonthlySalary, 200));
        System.out.println("Salary for 220 hours: " + calculateSalary(baseMonthlySalary, 220));
        System.out.println("Salary for 180 hours: " + calculateSalary(baseMonthlySalary, 180));
    }
}