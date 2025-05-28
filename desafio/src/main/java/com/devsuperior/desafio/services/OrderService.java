package com.devsuperior.desafio.services;

import com.devsuperior.desafio.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        double discount = order.getBasic() * (order.getDiscount() / 100.0);
        double valueDiscount = order.getBasic() - discount;
        double freight = shippingService.shipment(order);
        return valueDiscount + freight;
    }
}
