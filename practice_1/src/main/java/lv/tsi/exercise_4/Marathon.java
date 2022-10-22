package lv.tsi.exercise_4;

class Marathon {

    public static void main(String[] args) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie",
            "Phil", "Matt", "Alex", "Emma",
            "John", "James", "Jane", "Emily",
            "Daniel", "Neda", "Aaron", "Kate"
        };

        int[] times = {
            341, 273, 278, 329,
            445, 402, 388, 275,
            243, 334, 412, 393,
            299, 343, 317, 265
        };

        printResults(names, times);
    }

    public static void printResults(String[] names, int[] times) {
        System.out.printf("%1$-8s | %2$-8s%n", "Name", "Result");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%1$-8s | %2$-8s%n", names[i], times[i]);
        }
    }
}
