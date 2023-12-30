package com.example.softassign2api.Database;

import com.example.softassign2api.Models.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class InMemoryOrder implements OrderDatabase{
    private static final ArrayList<Order> orders = new ArrayList<>();
    @Override
    public boolean addOrder(Order order) {
        return orders.add(order);
    }
    @Override
    public boolean removeOrder(int id) {
        return orders.remove(getOrder(id));
    }
    public Order getOrder(int id){
        for (Order order : orders){
            if (order.getId() == id){
                return order;
            }
        }
        return null;
    }
    public int getLastID(){
        if (orders.isEmpty()){
            return 0;
        }else {
            return orders.get(orders.size()-1).getId();
        }
    }
}
