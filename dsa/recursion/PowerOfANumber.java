class PowerOfANumber{
  public static void main(String args[]) {
    PowerOfANumber powerInstance = new PowerOfANumber();
    int result = powerInstance.power(2,-3);
    System.out.println(result);
  }
  public int power(int base, int exp) {
    if(exp<0) return -1;
    if(exp == 0) return 1;
    return base*power(base, exp-1);
  }
}