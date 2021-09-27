public class Ques6 {
    public static void main(String[] args) {
        try {
            int a[] = new int[7];
            a[10] = 30 / 0;
            System.out.println("This is first paragraph");
        } catch (ArithmeticException e) {
            System.out.println("Warning: ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Warning: ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("Warning: Some Other exception");
        }
        finally {
            System.out.println("This is finally block");
        }
        System.out.println(" try-catch-finally");
    }
}
