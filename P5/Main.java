class ComplexNumber {
    int real;
   int imaginary;

    ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

   ComplexNumber add(ComplexNumber c) {
        int newReal = this.real + c.real;
        int newImaginary = this.imaginary + c.imaginary;

        return new ComplexNumber(newReal, newImaginary);
    }

   void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

 class Complex {
    public static void main(String[] args) {
      ComplexNumber c1 = new ComplexNumber(5, 3);
      ComplexNumber c2 = new ComplexNumber(2, 4);
      ComplexNumber result = c1.add(c2);

        System.out.println("First Complex Number:");
        c1.display();

        System.out.println("Second Complex Number:");
        c2.display();

        System.out.println("Addition Result:");
        result.display();
    }
}

