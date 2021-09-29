import java.util.Scanner;
class Temperature {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("How many days temperature?");
    int days = sc.nextInt();
    int[] temp = new int[days];
    int sum = 0;
    for(int i=0;i<days;i++) {
      System.out.println("Day" + (i+1) + "'s high temperature: ");
      temp[i] = sc.nextInt();
      sum += temp[i];
    }
    float avg = sum/days;
    int count = 0;
    for(int i=0; i<days; i++) {
      if(temp[i] > avg) count++;
    }
    System.out.println("Average = " + avg);
    System.out.println(count + " days above average");
  }
}