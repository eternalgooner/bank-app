package pojos;
// Generated 05-May-2018 13:39:31 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Customer generated by hbm2java
 */
public class Customer  implements java.io.Serializable {


     private int id;
     private String name;
     private String address;
     private String email;
     private Integer pin;
     private Set accounts = new HashSet(0);

    public Customer() {
    }

	
    public Customer(int id) {
        this.id = id;
    }
    public Customer(int id, String name, String address, String email, Integer pin, Set accounts) {
       this.id = id;
       this.name = name;
       this.address = address;
       this.email = email;
       this.pin = pin;
       this.accounts = accounts;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getPin() {
        return this.pin;
    }
    
    public void setPin(Integer pin) {
        this.pin = pin;
    }
    public Set getAccounts() {
        return this.accounts;
    }
    
    public void setAccounts(Set accounts) {
        this.accounts = accounts;
    }




}

