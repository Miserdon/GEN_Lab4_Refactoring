package ch.heigvd.gen.lab4;

import java.util.ArrayList;

public class OrdersWriter {
    private ArrayList<Order> orders = new ArrayList<>();

    public OrdersWriter(ArrayList<Order> orders) {
         this.orders = orders;
    }

    public String getContents() {
        StringBuffer sb = new StringBuffer("{\"orders\": [");

        for (Order order: orders ) {


            sb.append("{");
            sb.append("\"id\": ");
            sb.append(order.getOrderId());
            sb.append(", ");
            sb.append("\"products\": [");
            for (int j = 0; j < order.getProductsCount(); j++) {

                order.getProduct(j).getProductContents(sb);
            }

            if (order.getProductsCount() > 0) {
                sb.delete(sb.length() - 2, sb.length());
            }

            sb.append("]");
            sb.append("}, ");
        }

        if (orders.size() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        return sb.append("]}").toString();
    }

}