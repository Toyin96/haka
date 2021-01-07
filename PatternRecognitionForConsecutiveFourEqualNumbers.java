package Chapter7;

public class PatternRecognitionForConsecutiveFourEqualNumbers extends StrictlyIdenticalArrays{

    public static void main(String[] args) {

        int[] array = {3,4,5,5,3,5,5,4,5};
        isConsecutiveFour(array);
    }


    public static boolean isConsecutiveFour(int[] array) {
        int frequency = 0;

        for (int i = 1; i < array.length; i++){
            if (array[i - 1] == array[i]){
                ++frequency;

                if (array[i - 1] != array[i]) {
                    System.out.println("The list has no consecutive fours");
                    return false;
                }else {
                    if (array[i] == array[i + 1]) {
                        ++frequency;
                    }
                }
            }
            if (frequency == 3) {
                System.out.println("The list has consecutive fours");
                return true;
            }
        }
        System.out.println("The list has no consecutive fours");
        return false;
    }
}
