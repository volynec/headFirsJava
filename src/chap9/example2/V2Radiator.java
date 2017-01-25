package chap9.example2;

import java.util.ArrayList;

/**
 * Created by user on 24.01.2017.
 */
public class V2Radiator {
    V2Radiator(ArrayList list) {
        for (int i = 0; i < 5; i++) {
            list.add(new SimUnit("V2Радиатор"));
        }
    }
}
