public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double harmonicMean = calculateHarmonicMean(numbers);
        System.out.println("Harmonic Mean of the array : " + harmonicMean);
    }

    public static double calculateHarmonicMean(int[] numbers) {
        double sum = 0;
        for (int num : numbers) {
            sum += 1.0 / num;
        }
        return numbers.length / sum;
    }
}