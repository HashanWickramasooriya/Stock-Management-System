package Product;

import java.util.ArrayList;

public class ProductDB {
     private ArrayList<Product> pList;
            
    public ProductDB() {
        pList=new ArrayList<>();
    }
    
    
    public boolean add(Product p){
        return pList.add(p);       
    }
    
    public Product get(int pID){
        for(Product p:pList){
            if(p.getProductID()==pID){
                return p;
            }
        }
        return null;
    }
  public boolean deleteProduct(int pID) {
      Product p= get(pID);
       if(p!=null){
           return pList.remove(p);
       }
       return false;
    }

    public boolean update(Product pp){
       Product p= get(pp.getProductID());
       if(p!=null){
            pList.remove(p);
            pList.add(pp);
            return true;
       }
       return false;
    }
    
    public ArrayList<Product> getAll(){
        return pList;
    }  
}
