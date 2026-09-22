package Week4;

public class EmployeeSalaryCalculator {
    static  int hourlyBonusRate=2000;
    static int oneMonthWorkingHour=200;
    static int oneMonthSalary=50000;

    public static double calculateBonus() {
        double bonus=0;
        if(oneMonthWorkingHour>230){
            int extrahrs=oneMonthWorkingHour-230;
            bonus=2000*extrahrs;
        }
        return bonus;
    }

    public static double calculateSalary(int monthlySalary,int oneMonthWorkingHour) {
        double finalSal=0;
        double cutoffHrsCut=0;
        if (oneMonthWorkingHour<230){
            double remhrs=230-oneMonthWorkingHour;
            cutoffHrsCut=remhrs*217.39;
            finalSal=monthlySalary-cutoffHrsCut;
        }else {
            finalSal=monthlySalary+calculateBonus();
        }

        return finalSal;


    }

    public static void main(String[] args) {
        System.out.println("Final Monthly Salary is: "+calculateSalary(oneMonthSalary,oneMonthWorkingHour));

    }
}