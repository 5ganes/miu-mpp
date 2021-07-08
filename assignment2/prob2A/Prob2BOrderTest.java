package MPP.assignment2.prob2A;

import java.util.ArrayList;
import java.util.List;

class Order{
    private int orderNum;
    List<OrderLine>  oLine = new ArrayList<>();
    Order(int orderNum, String orderItem){
        this.orderNum = orderNum;
        oLine.add(new OrderLine(orderItem, this));
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order Details : \n");
        for(OrderLine o : this.oLine){
            sb.append("Item : " + o.getOrderItem() + "\n");
        }
        return sb.toString();
    }
}

class OrderLine{
    private String orderItem;
    private Order order;
    OrderLine(String orderItem, Order order){
        this.orderItem = orderItem;
        this.order = order;
    }

    public String getOrderItem() {
        return orderItem;
    }
}

public class Prob2BOrderTest {
    public static void main(String[] args) {
        Order o1 = new Order(1234, "Screen Cover");
//        Order o2 = new Order(1235, "Samsung Mobile");
        System.out.println(o1);
    }
}
