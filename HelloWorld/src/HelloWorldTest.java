
public class HelloWorldTest {

  public static void main(String[] args) {

    printWelcomeMessage();

    int index = getNumber2();
    System.out.println("value of index: " + index);

    sayHelloTo("Mr. John");
  }

  private static void printWelcomeMessage() {
    System.out.println("Hello world!");
  }

  private static void sayHelloTo(String personName) {
    System.out.println("Hello " + personName);
  }

  public static int getNumber2() {
    return 2;
  }

}

// output

// Hello world!
// value of index: 2
// Hello Mr. John