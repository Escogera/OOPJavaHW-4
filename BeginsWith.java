package HW4;

public class BeginsWith implements IsGood<Object> {
    private String userString;

    public BeginsWith(String userString) {
        this.userString = userString;
    }

    @Override
    public boolean isGood(Object arg) {
        return arg.toString().startsWith(userString);
    }
}
