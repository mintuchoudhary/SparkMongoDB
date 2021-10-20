class B {
      Number run() {
          System.out.println("num0");
          return 1;
      }
}
public class Test extends B{
    final int num = 10;
      Integer run () {
          System.out.println("num1");
          return 2;
      }


    public static void main(String[] args) {
        Test test = new Test();
        test.run();
    }
}
