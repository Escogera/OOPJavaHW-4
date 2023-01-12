package HW4;

public class IsPositive implements IsGood<Object> {

    @Override
    public boolean isGood(Object arg) {
        return (Integer) arg > 0;
    }
}
