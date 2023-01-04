package entities;

public class ImportedProduct extends Product{

	private	double customsFee;

	public ImportedProduct() {
	}

	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	public double getCustomsFee() {
		return customsFee;
	}
	
	public double totalPrice() {
		return super.price + customsFee;
	}
	
	@Override
	public String priceTag() {
		return super.name + " $ " + totalPrice() + " (Customs fee: $ " +  customsFee + ")";
	}
	
	
	
}
