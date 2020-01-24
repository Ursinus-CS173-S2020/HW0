package hw0;

public class GoodCode {
    /**
     * @param seed A starting number for the number generator
     * @return A pseudorandom number
     */
    public static int generateNumber(int seed) {
        int result = 0; // Stores the final generated number
        int i = 0;
        while (i < seed) {
            if (i % 2 == 1) {
                result += i;
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        int result = generateNumber(173);
        System.out.println("The magic number is: " + result);
    }
}