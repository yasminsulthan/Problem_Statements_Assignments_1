
package stationary;

public class Book {
 
	private String book_title ;
	private double price;
	
	public Book( String new_title,double new_price)
	{
		book_title=new_title;
	 price=new_price ;
	}
	//Getter methods
	
	public String getBook_title()
	{
		return book_title ;
	}

	public double getPrice()
	{
		return price;
	}
	
	//setter methods 
	
	public void setBook_title(String newTitle)
	{
		this.book_title=newTitle ;
		
	}
	public void setPrice(double newPrice)
	{
		this.price=newPrice ;
	}
	void display()
	{
		System.out.println(book_title+""+price);
	}
	
}
