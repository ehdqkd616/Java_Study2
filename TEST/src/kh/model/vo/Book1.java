package kh.model.vo;

import java.io.Serializable;

public class Book1 implements Serializable {
	
	private String title;
	private int price;
	
	public Book1() {}
	
	public Book1(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
}
