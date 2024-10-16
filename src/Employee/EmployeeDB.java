
package Employee;
import java.util.ArrayList;
public class EmployeeDB {
    
    private ArrayList<Employee> eList;
            
    public EmployeeDB() {
        eList=new ArrayList<>();
    }
    
    
    public boolean add(Employee e){
        return eList.add(e);       
    }
    
    public Employee get(int eID){
        for(Employee e:eList){
            if(e.getUserID()==eID){
                return e;
            }
        }
        return null;
    }
    
    public boolean delete(int eID){
       Employee e= get(eID);
       if(e!=null){
           return eList.remove(e);
       }
       return false;
    }
    
    public boolean update(Employee ee){
       Employee e= get(ee.getUserID());
       if(e!=null){
            eList.remove(e);
            eList.add(ee);
            return true;
       }
       return false;
    }
    
    public ArrayList<Employee> getAll(){
        return eList;
    }
}
