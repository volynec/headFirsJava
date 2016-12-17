package Shop_33.client;

import Shop_33.interfaces.GoodsInterface;
import Shop_33.interfaces.VisitorInterface;

public abstract class AbstractVisitor implements VisitorInterface {

    private String name;

    public AbstractVisitor() {
    }

    public AbstractVisitor(String name) {
        this.name = name;
    }

    @Override
    public void buy(GoodsInterface goods){
        System.out.println("buy "+goods.getName());
    }



    @Override
    public void returnGoods(GoodsInterface goods){

    }

    @Override
    public String getName() {
        return name;
    }



}
