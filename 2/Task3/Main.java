package Task3;

import java.util.ArrayList;

public class Main { private final ArrayList<Developer> developers = new ArrayList<>();

    public void startWork() {

        developers.add(new Frontender());
        developers.add(new Backender());
        developers.add(new Fullstacker());
        developers.add(new Frontender());

        for (Developer developer : developers) {
            if (developer instanceof Frontender) {
                developer.developGUI();
            }
        }
    }

    public static void main(String[] args) {
        new Main().startWork();
    }

}