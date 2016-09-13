package fr.univlille1.m2iagl.petit;

import java.util.ArrayList;
import java.util.List;

public class Orders {

	protected List<Order> allOrders;

	public void addOrder(final Order order) {
		allOrders.add(order);
	}

	public void delOrder(final Order order) {
		allOrders.remove(order);
	}

	public Orders() {
		super();
		allOrders = new ArrayList<Order>();
	}

}
