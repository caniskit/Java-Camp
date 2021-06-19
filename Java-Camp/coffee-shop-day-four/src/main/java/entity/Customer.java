package entity;


import abstracts.Entitiy;

import java.util.Date;

public class Customer implements Entitiy {

    private int id;
    private String firstName;
    private String lastName;
    private Date  dateOfBirth;
    private String nationalityId;

    public Customer() {
    }

    public Customer(int id, String firstName, String lastName, Date dateOfBirth, String nationalityId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationalityId = nationalityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalId() {
        return nationalityId;
    }

    public void setNationalId(String nationalityId) {
        this.nationalityId = nationalityId;
    }
}
