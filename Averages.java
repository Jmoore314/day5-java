// This program calculates the average of the array of values
public class Averages {

  public static void main(String[] args){
    int[] values = { 1, 12, 434, 32, 0, 6, 7, 23, 45, 234};
    int sum = 0, average;

    System.out.print("The values of the array are: ");
    for (int x : values) {
      sum += x;
      System.out.print(x + " ");
    }

    System.out.println();

    average = sum / values.length;
    System.out.println("The average of these values is: " + average);
  }  
}