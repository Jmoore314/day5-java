// This program calculates the average of the array of values
public class Averages {

  public static void main(String[] args){
    double[] values = { 1, 12, 434, 32, 0, 6, 7, 23, 45, 234};
    int sum = 0;
    double average;

    System.out.print("The values of the array are: ");
    for (double x : values) {
      sum += x;
      System.out.print(x + " ");
    }

    System.out.println();
    System.out.println("The sum of this array is: " + sum);
    System.out.println();

    average = (double) sum / values.length;
    System.out.println("The average of these values is: " + average);
  }  
}