package ChallengeInheitance;

public class ArrayOperations {
    private int[] numbers;

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
    }

    public class statictis {
        double mean(){
            long sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            return sum /numbers.length;
        }
        double median(){
            return 0;
        }
    }
}
