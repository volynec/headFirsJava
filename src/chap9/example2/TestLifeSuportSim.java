package chap9.example2;

import java.util.ArrayList;

/**
 * Created by user on 24.01.2017.
 */
public class TestLifeSuportSim {
    public static void main(String[] args) {
        ArrayList aList = new ArrayList();
        V2Radiator v2 = new V2Radiator(aList);
        V3Radiator v3 = new V3Radiator(aList);
        for (int z = 0; z < 20; z++) {
            RetentionBot ret = new RetentionBot(aList);
        }
    }

}
