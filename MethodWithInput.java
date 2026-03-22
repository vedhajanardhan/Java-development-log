public class MethodWithInput {

    void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        MethodWithInput obj = new MethodWithInput();
        obj.printSum(5, 10);
    }
}
