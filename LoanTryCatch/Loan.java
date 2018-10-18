public class Loan {
  private double annualInterestRate;
  private int numberOfYears;
  private double loanAmount;
  private java.util.Date loanDate;

  /*default constructor*/
  public Loan() {
    this(2.5, 1, 1000);
  }
  /*constructor with speciafied parameters*/
  public Loan(double annualInterestRate, int numberOfYears, double loanAmount){
    this.annualInterestRate = annualInterestRate;
    this.numberOfYears = numberOfYears;
    this.loanAmount = loanAmount;
    loanDate = new java.util.Date();
  }
  /*Setter methods*/
  public void setAnnualInterestRate(double annualInterestRate){
    this.annualInterestRate = annualInterestRate;
  }
  public void setNumberOfYears(int numberOfYears){
    this.numberOfYears = numberOfYears;
  }
  public void setLoanAmount(double loanAmount){
    this.loanAmount = loanAmount;
  }
  /*getter methods*/
  public double getAnnualInterestRate(){
    return annualInterestRate;
  }
  public int getNumberOfYears(){
    return numberOfYears;
  }
  public double getLoanAmount(){
    return loanAmount;
  }
  /*date*/
  public java.util.Date getLoanDate(){
    return loanDate;
  }
  /*calculation methods*/
  public double getMonthlyPayment(){
    double monthlyInterestRate = annualInterestRate / 12;
    double monthlyPayment = loanAmount * monthlyInterestRate /
      (1 - 1/ (Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
    return monthlyPayment;
  }
  public double getTotalPayment(){
    double totalPayment = getMonthlyPayment() * numberOfYears * 12;
    return totalPayment;
  }
}
