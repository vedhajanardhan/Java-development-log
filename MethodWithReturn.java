public class MethodWithReturn {

    int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        MethodWithReturn obj = new MethodWithReturn();
        int result = obj.multiply(4, 3);
        System.out.println("Multiply: " + result);
    }
}
