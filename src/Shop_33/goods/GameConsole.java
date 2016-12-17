package Shop_33.goods;

import Shop_33.interfaces.DepartmentInterface;

public class GameConsole extends ElectronicDevice{

    public GameConsole(int ram) {
        this.ram = ram;
    }


    public GameConsole(String name, int ram) {
        super(name);
        this.ram = ram;
    }

    public GameConsole(double price, boolean hasGuarantee, String name, String company, int ram) {
        super(price, hasGuarantee, name, company);
        this.ram = ram;
    }

    private int ram;


    public void loadGame(){

    }


}
