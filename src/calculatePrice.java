public class calculatePrice {
    public static double calculateMeal(double listedMealPrice,
                                     double tipRate,
                                     double taxRate){
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        System.out.println("Your total meal price is " + result);
        return result;
    }
    public static void main(String[] args){
        double listedMealPrice,tipRate,taxRate;
        double groupTotal = calculateMeal(listedMealPrice= 1000, tipRate= .2,taxRate= .07);
        System.out.println(groupTotal);
    }
}
