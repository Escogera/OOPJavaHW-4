package HW4;

public class IsEven implements IsGood<Object> {

    @Override
    public boolean isGood(Object arg) {
        return (Integer) arg != 0 & (Integer) arg % 2 == 0;
    }
}
