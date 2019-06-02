
class Calc {

    add(int num1, int num2) { // 10, 5
            int sum = num1 + num2;

            System.out.println(sum);
    }

    substract(int n1, int n2) {
        System.out.println(n1-n2);
    }

   public void static main(String[] args) {
        Calc calculator = new Calc();
        calculator.add(10, 5);
        calculator.multiply();
        calculator.substract();
    }

    multiply() {

    }
}
