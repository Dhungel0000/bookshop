package bookshop.processes;

import bookshop.model.Order;
import bookshop.model.OrderItem;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class OrderCalculator
{
	private BigDecimal total = BigDecimal.ZERO;
	public String getTotalFor(Order order)
	{
		order.getItems().stream().forEach(e->addOrderItem(e));
		this.total=this.total.setScale(2, RoundingMode.HALF_UP);
		return this.total.toString();
	}

	private void addOrderItem(OrderItem item)
	{
		float productPrice = item.getProduct().getPrice();
		float totalPrice = item.getCount()*productPrice;
		this.total = this.total.add(new BigDecimal(totalPrice));
	}
}
