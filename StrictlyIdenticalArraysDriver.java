package Chapter7;

public class StrictlyIdenticalArraysDriver {

    public static void main(String[] args) {

        StrictlyIdenticalArrays strictlyIdentical = new StrictlyIdenticalArrays();

        System.out.println(strictlyIdentical.compareArray(strictlyIdentical.initializeFirstArrayWith(strictlyIdentical.collectInput()),
                strictlyIdentical.initializeSecondArrayWith(strictlyIdentical.collectInput())));
    }
}
