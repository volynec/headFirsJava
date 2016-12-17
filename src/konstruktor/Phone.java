package konstruktor;

/**
 * Created by user on 20.10.2016.
 */
public class Phone {
    private int ram;
    private  String name;
    private  String tupe;

    public Phone(int ram, String name,  String tupe) {
        this.ram = ram;
        this.name = name;
        this.tupe = tupe;
    }


    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTupe() {
        return tupe;
    }

    public void setTupe(String tupe) {
        this.tupe = tupe;
    }
}
