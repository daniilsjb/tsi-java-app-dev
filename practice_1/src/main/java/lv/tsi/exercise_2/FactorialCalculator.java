package lv.tsi.exercise_2;

class FactorialCalculator {

    public static void main(String[] args) {
        System.out.println("(Loop) 20! = " + loopingFactorial(20L));
        System.out.println("(Rec.) 20! = " + recursiveFactorial(20L));
    }

    public static long loopingFactorial(long n) {
        long result = 1L;
        while (n > 0) {
            result *= n--;
        }
        return result;
    }

    public static long recursiveFactorial(long n) {
        return (n == 0L) ? 1L : n * recursiveFactorial(n - 1);
    }
}
