public class salary {
    public static double salary(double hoursPerWeek, double amountPerHour){
        if(hoursPerWeek < 0 || amountPerHour < 0){
            return  -1;
        }
        double weeklyPayCheck = hoursPerWeek* amountPerHour;
        return weeklyPayCheck * 52;
    }
    public static void main(String[] args){
        double hoursPerWeek,amountPerHour;
        double TotalSalary = salary( hoursPerWeek = 40, amountPerHour = 45);
       System.out.println(TotalSalary);
    }
}
