package converter;

public class SelsiyToFarengeyt implements BaseConverter{

    @Override
    public double convert(double selsiyValue) {
        return selsiyValue * 9.0 / 5.0 + 32;
    }

    @Override
    public double convertReversed(double farengeytValue) {
        return (farengeytValue - 32) / 9.0 * 5.0;
    }
}
