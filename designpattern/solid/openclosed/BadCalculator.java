package designpattern.solid.openclosed;

public class BadCalculator {


    /**
     * this is bad design where we are taking type for each type and we are having cases
     * now if we want to introduce division, we have to modify calculator
     */
    public static int calculateNumber(int number1, int number2, String type) {
        int result = 0;
        switch (type) {
            case "sum":
                result = number1 + number2;
                return result;
            case "sub":
                result = number1 - number2;
                return result;
        }
        return result;
    }

}
