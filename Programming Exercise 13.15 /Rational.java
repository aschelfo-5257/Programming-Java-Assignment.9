class BigIntegerfortheRational extends Rational {
  int num,denum;
  Rational(){}
  Rational (int x, int y) {
    num = x;
    num = y;
  }
  Rational add(Rational ob) {
    Rational temp=new Rational();
    temp.num = ((num* ob.denum) + (denum*ob.num));
    temp.denum=denum* ob.denum;
    return temp;
  }
  Rational sub(Rational ob) {
    Rational temp=new Rational();
    temp.num=((num* ob.denum) - (denum*ob.num));
    temp.denum=denum* ob.denum;
    return temp;
  }
  Rational mul(Rational ob) {
    Rational temp=new Rational();
    temp.num=num*ob.num;
    temp.denum=denum* ob.denum;
    return temp;
  }
  Rational div(Rational ob) {
    Rational temp=new Rational();
    temp.num=num*ob.num;
    temp.denum=denum* ob.denum;
    return temp;
  }
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
      System.out.println("enter first rational:");
      int p=sc.nextInt();
      int q=sc.nextInt();
      Rational r1=new Rational(p,q);
      System.out.println("enter second rational:");
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
    }
  }
