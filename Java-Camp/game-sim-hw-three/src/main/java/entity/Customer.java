package entity;

import abstracts.IEntity;

import java.util.Date;

public class Customer implements IEntity {
    private int id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String email;
    private String password;
    private String nationalityId;


    public Customer() {
    }



    public Customer(int id, String firstName, String lastName, Date dateOfBirth, String email, String password, String nationalityId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.password = password;
        this.nationalityId = nationalityId;

    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }



    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNationalityId() {
        return nationalityId;
    }



}
