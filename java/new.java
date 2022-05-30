public FinancialCalc {
		 double computeFinalValue(double principle, double interestRate, int numOfYears)
{
    double finalValue = 0.0;
    finalValue = principle * Math.pow((1 + interestRate), numOfYears);
    return finalValue;
}

    public static void main(String[] args){

        FinancialCalc obj = new FinancialCalc();
        System.out.println("Hence the finalValue is" + obj.computeFinalValue(50.0, 0.3, 4));

    }
}