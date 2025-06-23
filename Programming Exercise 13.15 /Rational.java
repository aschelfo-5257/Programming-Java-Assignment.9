import java.math.BigInteger;
import java.util.Scanner;

// Set the private class rational numerator and denominator input for fractions.
public class Rational {
    private BigInteger numerator;
    private BigInteger denominator;

  public Rational() {
      this(BigInteger.ZERO, BigInteger.ONE); // You would need to add BigInteger for zeros and ones.
  }
  public Rational(BigInteger numerator, BigInteger denominator) {
    if (denominator.equals(BigInteger.ZERO)) {
      throw new IllegalArgumentException("Denominator cannot be zero."); // Cannot have zeroes illegally 
    }
    // Reduce the fractions
    BigInteger gcd = numerator.gcd(denominator);
    this.numerator = numerator.divide(gcd);
    this.denominator = denominator.divide(gcd);
    // Ensure it is a positive denominator to prevent overflow errors.
    if (this.denominator.compareTo(BigInteger.ZERO) < 0) {
      this.numerator = this.numerator.negate();
      this.denominator = this.denominator.negate();
    // Ensure it is both the numerator and denominator that negate the integers
    }
  }
  // Set the arithmetic operations from the numerator and denominator, simplified by an integer.
  public Rational add(Rational other) {
    BigInteger num = this.numerator.multiply(other.denominator).add
      (this.denominator.multiply(other.numerator));
    BigInteger den = this.denominator.multiply(other.denominator);
    return new Rational(num, den);
    // Returns a new Rational that is the sum of this rational and another: [(a/b) + (c/d) = (ad + bc) / bd]
  }
  public Rational subtract(Rational other) {
    BigInteger num = this.numerator.multiply(other.denominator).subtract
      (this.denominator.multiply(other.numerator));
    BigInteger den = this.denominator.multiply(other.denominator);
    return new Rational(num, den);
    // Returns a new Rational that is the difference: [(a/b) - (c/d) = (ad - bc) / bd]
  }
  // Set the multiply operation to store the return by the numerator and denominator inputs.
   public Rational multiply(Rational other) {
    BigInteger num = this.numerator.multiply(other.numerator);
    BigInteger den = this.denominator.multiply(other.denominator);
    return new Rational(num, den);
    // Returns a new Rational that is the product: [(a/b) * (c/d) = (ac) / (bd)]
  }
  // Set the division operation by storing the BigInteger before throwing a handle error.
  public Rational divide(Rational other) {
    if (other.numerator.equals(BigInteger.ZERO)) {
      throw new ArithmeticException("Cannot divide by zero.");
      // Implementations should handle cases like division by zero by throwing appropriate exceptions.
      // Returns a new Rational that is the quotient: [(a/b) / (c/d) = (ad) / (bc)]
    }
    BigInteger num = this.numerator.multiply(other.denominator);
    BigInteger den = this.denominator.multiply(other.numerator);
    return new Rational(num, den);
  }
  
  public boolean equals(Rational other) {
    return this.numerator.equals(other.numerator) &&
           this.denominator.equals(other.denominator);
    // Checks if two rationals are equal by cross-multiplying and comparing: If ((a/b) == (c/d)), then (ad == cb).
  }
  public void print() {
    System.out.println(numerator + "/" + denominator);
  }
    
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Ensure to set scanner system 

    System.out.println("Enter first rational (numerator and denominator):");
    BigInteger num1 = sc.nextBigInteger();
    BigInteger den1 = sc.nextBigInteger();
    Rational r1 = new Rational(num1, den1);
    
    System.out.println("Enter second rational (numerator and denominator):");
    BigInteger num2 = sc.nextBigInteger();
    BigInteger den2 = sc.nextBigInteger();
    Rational r2 = new Rational(num2, den2);

    // Use the code form: System.out.println("Operation = "); r1.operator(r2).print();
    System.out.println("Addition = ");
    r1.add(r2).print();
    System.out.println("Subtraction = ");
    r1.subtract(r2).print();
    System.out.println("Multiplication = ");
    r1.multiply(r2).print();
    System.out.println("Division = ");
    r1.divide(r2).print();

    if (r1.equals(r2)) {
      System.out.println("The rational numbers are equal.");
    } else {
      System.out.println("The rational numbers are not equal.");
    }
  }
// Note: The code is meant to demonstrate creating and working with rational numbers (fractions), allowing the user to add, subtract, multiply, divide, and compare two fractions. The implementation class suggests using the BigInteger for large numbers.
}
    
