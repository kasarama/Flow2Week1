package dto;


import entities.Address;
import entities.Person;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author magda
 */
public class PersonDTO {
    private String fName;
    private String lName;
    private String phone; 
    private int id;
    private Address address;

    public PersonDTO(String fName, String lName, String phone, Address addres) {
        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
        this.address = addres;
    }
    
    public PersonDTO(Person person){
        this.fName=person.getFirstName();
        this.lName=person.getLastName();
        this.phone=person.getPhone();
        this.id=person.getId();
        this.address=person.getAddress();
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
      
    
    
  
    
}
