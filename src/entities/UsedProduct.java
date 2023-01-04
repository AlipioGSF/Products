package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactareDate;

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, double price, Date manufactareDate) {
		super(name, price);
		this.manufactareDate = manufactareDate;
	}
	
	public Date getManufactareDate() {
		return manufactareDate;
	}
	
	@Override
	public String priceTag() {
		return super.name + " (used) $ " + super.price + " Manufacture Date: " + sdf.format(manufactareDate);
	}
	
}
