import java.util.ArrayList;
import java.util.List;

public class Buyer {
    private List<OrderFromPublisher> orderList = new ArrayList<OrderFromPublisher>();

    public void takeOrder(OrderFromPublisher orderFromPublisher){
        orderList.add(orderFromPublisher);
    }

    public void placeOrders(Library library){

        for (OrderFromPublisher orderFromPublisher : orderList) {
            orderFromPublisher.order(library);
        }
        orderList.clear();
    }
}
