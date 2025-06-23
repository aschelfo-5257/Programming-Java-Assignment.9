class BigIntegerfortheRational extends Rational {
  int num,denum;
  Rational(){}
  Rational (int x, int y) {
    num = x;
    num = y;
  }
  // A rational number is presented by a numerator and denominator, typically stored as long or BigInteger to handle large values without overflow.
  // Set rational by adding a new integer
  Rational add(Rational ob) {
    Rational temp=new Rational();
    temp.num = ((num* ob.denum) + (denum*ob.num));
    temp.denum=denum* ob.denum;
    return temp;
  }
  // Set rational by subtracting a new integer
  Rational sub(Rational ob) {
    Rational temp=new Rational();
    temp.num=((num* ob.denum) - (denum*ob.num));
    temp.denum=denum* ob.denum;
    return temp;
  }
  // Set rational by multiplying a new integer
  Rational mul(Rational ob) {
    Rational temp=new Rational();
    temp.num=num*ob.num;
    temp.denum=denum* ob.denum;
    return temp;
  }
  // Set rational by dividing a new integer
  Rational div(Rational ob) {
    Rational temp=new Rational();
    temp.num=num*ob.num;
    temp.denum=denum* ob.denum;
    return temp;
  }
  // Check if it's an equal solution to the new rational number and if it's equal or not equal.
  void checkEqual (Rational ob) {
    int temp = (num*ob.denum-ob.num*denum);
    if (temp == 0) {
      System.out.println("rational number are equal");
    } else {
      System.out.println("rational number are not equal");
    }
    void show() { 
      System.out.println(num + "/"denum); 
    }
  }
  public class RationalDemo {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter first rational:"); // Enter the first rational by calculating the integer numbers.
      int p=sc.nextInt();
      int q=sc.nextInt();
      Rational r1=new Rational(p,q);
      System.out.println("enter second rational:"); // Enter the second rational by calculating the integer numbers.
      int r=sc.nextInt();
      int s=sc.nextInt();
      Rational r2=new Rational(r,s);
      System.out.println("addition = ");
      Rational r3=r1.add(r2);
      r3.show();
      System.out.println("subtraction = ");
      Rational r4=r1.sub(r2);
      r4.show();
      System.out.println("multiplication = ");
      Rational r5=r1.mul(r2);
      r5.show();
      System.out.println("division = ");
      Rational r6=r1.div(r2);
      r6.show();
      r1.checkEqual(r2);
      // Methods are provided for common arithmetic operations (add, subtract, multiply, divide), ensuring correct handling of signs and simplification.
    }
  }
