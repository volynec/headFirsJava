package chap9.example2;

import java.util.ArrayList;

/**
 * Created by user on 24.01.2017.
 */
public class V3Radiator extends V2Radiator{
    V3Radiator (ArrayList lglist) {
        super(lglist);
        for (int g = 0; g < 10; g++) {
            lglist.add(new SimUnit("V3Разиатор"));
        }
    }
}
