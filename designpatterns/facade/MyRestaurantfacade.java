package com.facade;

public class MyRestaurantfacade {
	
	private Restaurant restaurant = new Restaurant();
	private DeliveryTeam deliveryTeam = new DeliveryTeam();
	private DeliveryBoy deliveryBoy = new DeliveryBoy();
	
	public void placeOrder() {
		restaurant.prepareOrder();
		deliveryTeam.assignDeliveryBoy();
		deliveryBoy.pickUpOrder();
		deliveryBoy.deliverOrder();
	}

}
