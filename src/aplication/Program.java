package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		List<Product> products = new ArrayList<>();
		
		System.out.print("Enter the number of the products: ");
		int qProducts = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<qProducts;i++) {
			System.out.printf("Product #%d data:\n", i+1);
			System.out.print("Commum, used or imported (c/u/i)? ");
			char option = sc.nextLine().charAt(0);
			String name;
			double price;
			switch(option) {
				case 'c':
					System.out.print("Name: ");;
					name = sc.nextLine();
					System.out.print("Price: ");
					price = sc.nextDouble();
					sc.nextLine();
					products.add(new Product(name, price));
					break;
				case 'u':
					System.out.print("Name: ");
					name = sc.nextLine();
					System.out.print("Price: ");
					price = sc.nextDouble();
					System.out.print("Manufacture Date (DD/MM/YYYY): ");
					sc.nextLine();
					String mDate = sc.nextLine();
					Date date = sdf.parse(mDate);
					products.add(new UsedProduct(name, price, date));
					break;
				case 'i':
					System.out.print("Name: ");
					name = sc.nextLine();
					System.out.print("Price: ");
					price = sc.nextDouble();
					System.out.print("Customs fee: ");
					double customsfee = sc.nextDouble();
					sc.nextLine();
					products.add(new ImportedProduct(name, price, customsfee));
					break;
			}
		}
	
	System.out.println("PRICE TAGS: ");
	for(Product p : products) {
		System.out.println(p.priceTag());
	}
		
	}
}
