public class Main {
	public static void main(String[] args) {
		//write the logic for the main function
    Customers obj1 = new Customers();
      obj1.Customers(1001,"Saakshi",9000000000L,"Bangalore","16-Jul-1990",'F',"Lakme Kajal, Salwar");
      Customers obj2 = new Customers();
        obj2.Customers(1008,"Rahul",9000000001L,"Chennai","27-Jan-1992",'M',"T-Shirt, Jeans");
    Suppliers obj3 = new Suppliers();
      obj3.Suppliers(7901,"ABC Traders",8000000000L,"Mumbai",10,"Paid",4.75f);
      Suppliers obj4 = new Suppliers();
        obj4.Suppliers(7972,"XYZ Enterprises",8000000900L,"Kolkata",7,"Unpaid",4.35f);
      obj1.displayProfileDetails();
      obj2.displayProfileDetails();
      obj3.displayProfileDetails();
      obj4.displayProfileDetails();
      obj1.editAddress("Coimbatore");
      obj3.editAddress("Delhi");
      obj1.placeOrder();
      obj3.increaseStockLevel(5);
      obj4.increaseStockLevel(10);
    }	
}

class Users {
		//write the logic for the class Users	  
  int id;
  String name;
  long mobile;
  String add;
  public void displayProfileDetails()
  {
    System.out.println(name+", "+mobile);
  }
  public void editAddress(String newadd)
  {
    System.out.println(name+", "+add);
    this.add=newadd;
    System.out.println(name+", "+add);
  }
}

class Customers extends Users{
		//write the logic for the class Customers	
  String date;
  char gender;
  String order;
  public void Customers(int id,String name,long mobile,String add,String date,char gender,String order)
  {
    this.id=id;
    this.name=name;
    this.mobile=mobile;
    this.add=add;
    this.date=date;
    this.gender=gender;
    this.order=order;
  }
  public void placeOrder()
  {
    System.out.println("Order placed successfully!");
  }
}

class Suppliers extends Users {
		//write the logic for the class Suppliers
  int items;
  String payment;
  float feed;
  public void Suppliers(int id,String name,long mobile,String add,int items,String payment,float feed)
  {
    this.id=id;
    this.name=name;
    this.mobile=mobile;
    this.add=add;
    this.items=items;
    this.payment=payment;
    this.feed=feed;
  }
  public void increaseStockLevel(int stock)
  {
    System.out.println(name+", "+(items+stock));
  }
}