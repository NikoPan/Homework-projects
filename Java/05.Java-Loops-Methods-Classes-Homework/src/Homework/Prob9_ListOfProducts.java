package Homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;

public class Prob9_ListOfProducts {
	public static void main(String[] args) {

		// TODO Create a class Product to hold products, which have name
		// (string) and price (decimal number). Read from a text file named
		// "Input.txt" a list of products. Each product will be in format name +
		// space + price. You should hold the products in objects of class
		// Product. Sort the products by price and write them in format price +
		// space + name in a file named "Output.txt". Ensure you close correctly
		// all used resources.

		ArrayList<Product> products = new ArrayList<Product>();
		BufferedReader reader;
		Writer writer = null;

		// loading txt from the file and assigning it to a string array
		try {
			reader = new BufferedReader(new FileReader("src/_09_Input.txt"));
			String line = null;

			while ((line = reader.readLine()) != null) {
				String[] splitLine = line.split(" ");
				products.add(new Product(splitLine[0], Double
						.parseDouble(splitLine[1])));
			}
			Collections.sort(products);

			// writing the sorted products by price and name
			writer = new BufferedWriter(new FileWriter("src/_09_Output.txt"));

			for (Product product : products) {

				writer.write(product.getPrice() + " " + product.getName()
						+ "\r\n");
			}

		} catch (Exception e) {
			System.out.println("Error");
		} finally {
			try {
				writer.close();
			} catch (Exception ex) {
			}
		}

	}

}