package Command_Pattern;

import java.util.ArrayList;
import java.util.List;


public class Broker {//command invoker class
    private List<Order> orderList = new ArrayList<Order>();//a list that can store any object that implements the Order interface.
    
    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for(Order order:orderList){
            order.execute();
        }
        orderList.clear();
    }
    
}
