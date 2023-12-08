package Task3;

public interface FrontendAction {
    void front();
    default void drinkCoffee() {
        System.out.println("Drink coffee");
    };
}
