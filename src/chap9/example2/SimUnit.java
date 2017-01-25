package chap9.example2;

/**
 * Created by user on 24.01.2017.
 */
public class SimUnit {
    String botType;

    SimUnit(String type) {
        botType = type;
    }

    int powerUse() {
        if ("Тепловая машина".equals(botType)) {
            return 2;

        }
        return 4;
    }
}


