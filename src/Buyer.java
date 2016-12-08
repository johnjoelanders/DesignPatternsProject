import java.util.ArrayList;
import java.util.List;

class Buyer {
    private List<OrderFromPublisher> orderList = new ArrayList<>();

    void takeOrder(OrderFromPublisher orderFromPublisher) {
        orderList.add(orderFromPublisher);
    }

    void placeOrders(Library library) {

        for (OrderFromPublisher orderFromPublisher : orderList) {
            orderFromPublisher.order(library);
        }
        orderList.clear();
    }
}
