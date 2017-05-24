//A class that displays the binary representation of a value

class ShowBits {
  int numbits;

  ShowBits(int n) {
    numbits = n;
  }

  void show(long val) {
    long mask = 1;

    // left shift a 1 into the proper position
    mask <<= numbits - 1;

    int spacer = 0;

    for (; mask != 0; mask >>>= 1) {
      if ((val & mask) != 0) {
        System.out.print("1");
      } else {
        System.out.print("0");
      }
      spacer++;

      if ((spacer % 8) == 0) {
        System.out.print(" ");
        spacer = 0;
      }
    }
    System.out.println();
  }
}

class ShowBitsDemo {

  public static void main(String[] args){
    ShowBits b = new ShowBits(8);
    ShowBits i = new ShowBits(32);
    ShowBits li = new ShowBits(64);

    System.out.println("123 in binary: ");
    b.show(123);

    System.out.println();

    System.out.println("8 in binary: ");
    b.show(8);

    System.out.println();

    System.out.println("64 in binary: ");
    b.show(64);

    System.out.println();

    System.out.println("-6 in binary: ");
    b.show(-6);

    System.out.println();

    System.out.println("87987 in binary: ");
    i.show(87987);

    System.out.println();

    System.out.println("237658768 in binary: ");
    li.show(237658768);

    //low order bits of any integer
    System.out.println();

    System.out.println("low order of 87987 in binary: ");
    b.show(87987);
  }  
}