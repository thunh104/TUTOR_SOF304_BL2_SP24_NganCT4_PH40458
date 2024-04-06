package xuong.ktnc.ktncfinal.maths;

public class Calculator {

    public Float average(Float mathsPoint, Float versePoint, Float englishPoint){

        checkNumberInZeroToTen(mathsPoint, versePoint, englishPoint);

        return (mathsPoint * 2 + versePoint * 2 + englishPoint) / 5;
    }

    public Integer calculateTheSumIncreasingFrom1ToN(Integer number){

        checkNumberPositiveIntegers(number);

        int result = 0;

        for (int i = 2; i < number; i+=2) {
            if (i != 6){
                result += i;
            }
        }

        return result;

    }

    public void checkNumberInZeroToTen(Float... points){

        if(points == null || points.length == 0){
            throw new NullPointerException("Point does not be null");
        }

        for (Float point : points){
            if (point == null){
                throw new NullPointerException("Point does not be null");
            }
            if(point < 0 || point > 10){
                throw new ArithmeticException("Point must be in 0 - 10");
            }
        }
    }

    public void checkNumberPositiveIntegers(Integer number){

        if(number == null){
            throw new NullPointerException("Number does not be null");
        }

        if(number <= 0){
            throw new ArithmeticException("The entered number must be an integer (> 0)");
        }
    }

}
