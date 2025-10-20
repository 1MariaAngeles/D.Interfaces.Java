public class Order {
String code;
String product;
int quantity;
double unitPrice;

    public Order(String code, String product, int quantity, double unitPrice){
        this.code = code;
        this.product = product;
        this. quantity = quantity;
        this.unitPrice = unitPrice;
    }
    public Order(){

    }

    public double calculateAmount(){
        return quantity*unitPrice;
    }

    public void showSummary(){
        System.out.println("\nOrder: " + this.code);
        System.out.println("Product: "+this.product);
        System.out.println("Unit Price: "+ this.unitPrice + "€");
        System.out.println("Total amount:" + calculateAmount()+"€");
    }

     
}
