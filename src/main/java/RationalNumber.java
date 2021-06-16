public class RationalNumber {

    private final Integer numerator;
    private final Integer denominator;

    public RationalNumber(
            final Integer numerator,
            final Integer denominator
    ) {
        if(numerator==null) {
            throw new IllegalArgumentException("Must not accept null numerator");
        }
        if(denominator==null){
            throw new IllegalArgumentException("Must not accept null denominator");
        }
        if(Integer.valueOf(0).equals(denominator)) {
            throw new IllegalArgumentException("Must not accept denominator equal to 0");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }
}

