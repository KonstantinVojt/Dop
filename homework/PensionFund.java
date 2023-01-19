package homework;

public class PensionFund {

    Enum ThreeType;
    private static final double COEFFICIENT = 0.02;
    private String fundName;
    private ThreeType fundState;
    private int creationOfAFund;


    public PensionFund(String fundName, ThreeType fundState, int creationOfAFund) {
        this.fundName = fundName;
        this.fundState = fundState;
        this.creationOfAFund = creationOfAFund;
    }

    public double pensionCalculation(int yearWork, int minMoney, int maxMoney) {
        AverageValue averageValue = new AverageValue();
        double answer;
        switch (fundState) {
            case State:
                answer = averageValue.averageState(maxMoney, minMoney) * COEFFICIENT * yearWork;
            break;

            case NotState:
                answer = averageValue.averageState(maxMoney, minMoney, 1500) * COEFFICIENT * yearWork;
            break;

            case Scammers:
                answer = 0;
                break;

            default:
                answer = 0;
        }

//        if (fundState == true) {
//            AverageValue averageValue = new AverageValue();
//            result = averageValue.fundStateTrue(maxMoney, minMoney) * COEFFICIENT * yearWork;
//        }
//        if (fundState == false) {
//            AverageValue averageValue = new AverageValue();
//            result = averageValue.fundStateFalse(maxMoney, minMoney, 1500) * COEFFICIENT * yearWork;
//        }
//        return result;

        return answer;
    }



}




