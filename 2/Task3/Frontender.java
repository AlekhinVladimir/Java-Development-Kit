package Task3;

public class Frontender extends Developer implements FrontendAction{
    @Override
    public void front() {
        System.out.println("Sleep");
    }

    @Override
    public void developGUI() {
        System.out.println("FrontEnder GUI method");
    }
}