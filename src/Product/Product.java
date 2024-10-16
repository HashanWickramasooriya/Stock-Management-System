
package Product;

public class Product {
 private int ProductID;
    private String ProductType;
    private String Productname;
    private String Price;
    private int NoOfItems;

    public Product() {
    }

    public Product(int ProductID,String ProductType, String Productname,String Price,int NoOfItems) {
        this.ProductID = ProductID;
        this.ProductType=ProductType;
        this.Productname=Productname;
        this.Price= Price;
         this.NoOfItems = NoOfItems;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID =  ProductID;
    }
    
     public String getProductType(){
        return ProductType;
    }
    
    public void setProductType(String ProductType){
        this.ProductType=ProductType;
    }

    
    public String getProductname(){
        return Productname;
    }
    
    public void setProductname(String Productname){
        this.Productname=Productname;
    }

      public String getPrice(){
        return Price;
    }
    
    public void setPrice(String Price){
        this.Price=Price;
    }

    public int getNoOfItems(){
        return NoOfItems;
    }

    public void setNoOfItems(int NoOfItems) {
        this.NoOfItems= NoOfItems;
    }   
}
