package HW4;

public class BeginsWithA implements IsGood<Object> {

    @Override
    public boolean isGood(Object arg) {
        return arg.toString().startsWith("A");
    }
}
