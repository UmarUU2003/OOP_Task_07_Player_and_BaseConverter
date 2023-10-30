package converter;

public class SelsiyToKelvin implements BaseConverter{

    @Override
    public double convert(double selsiyValue) {
        return selsiyValue + 273.15;
    }

    @Override
    public double convertReversed(double kelvinValue) {
        return kelvinValue - 273.15;
    }
}
