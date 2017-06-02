//this will demonstrate bubble sort with strings
public class StrBubble {

  public static void main(String[] args){
    String strs[] = {
                      "this", "is", "what", "a", "bubble", "sort", "does", "with", "strings" 
                    };
    int a, b;
    String t;
    int size;

    size = strs.length;

    System.out.print("Original array is:");
    for (String x : strs) {
      System.out.print(" " + x);
    }
    System.out.println();

    for (a=1; a < size; a++) {
      for (b = size-1; b >= a; b--) {
        if (strs[b - 1].compareTo(strs[b]) > 0) {
          t = strs[b-1];
          strs[b-1] = strs[b];
          strs[b] = t;
        }
      }
    }

    System.out.print("Sorted array is:");
    for (String x : strs) {
      System.out.print(" " + x);
    }
    System.out.println();
  }  
}