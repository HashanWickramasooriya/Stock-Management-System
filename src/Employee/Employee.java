package Employee;

public abstract class Employee {
    private int UserID;
    private String Username;
    private String FullName;
    private String JobCategory;
    private String Gender;
    private String Address;
    private int Contact;

    // Constructor
    public Employee(int UserID, String Username, String FullName, String JobCategory, String Gender, String Address, int Contact) {
        this.UserID = UserID;
        this.Username = Username;
        this.FullName = FullName;
        this.JobCategory = JobCategory;
        this.Gender = Gender;
        this.Address = Address;
        this.Contact = Contact;
    }

    // Abstract method to be implemented by subclasses
    protected abstract void displayInformation();

    // Getter methods
    public int getUserID() {
        return UserID;
    }

    public String getUsername() {
        return Username;
    }

    public String getFullName() {
        return FullName;
    }

    public String getJobCategory() {
        return JobCategory;
    }

    public String getGender() {
        return Gender;
    }

    public String getAddress() {
        return Address;
    }

    public int getContact() {
        return Contact;
    }

    // Setter methods
    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public void setJobCategory(String JobCategory) {
        this.JobCategory = JobCategory;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setContact(int Contact) {
        this.Contact = Contact;
    }
}