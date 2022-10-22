package lv.tsi.exercise_4;

class Marathon {

    public static void main(String[] args) {
        var names = new String[] {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma",
            "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"
        };

        var times = new int[] {
            341, 273, 278, 329, 445, 402, 388, 275,
            243, 334, 412, 393, 299, 343, 317, 265
        };

        printResults(names, times);
    }

    public static void printResults(String[] names, int[] times) {
        // The width of each column here is arbitrary, but it fits nicely for the provided dataset.
        // A better solution would be to dynamically calculate the longest string in each column
        // and inject the length into the format string, but I'm lazy. :^)
        System.out.printf("%1$-8s | %2$-8s%n", "Name", "Result");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%1$-8s | %2$-8s%n", names[i], times[i]);
        }
    }
}
