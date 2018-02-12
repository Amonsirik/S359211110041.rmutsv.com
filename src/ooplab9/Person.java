package ooplab9;
import ooplab9.Address;
import ooplab9.Job;

public class Person {
    private String personID;
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "personID='" + personID + '\'' +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", job=" + job +
                '}';
    }

    private Address address;
    private Job job;

    public Person(String personID, String name, Address address, Job job) {
        this.personID = personID;
        this.name = name;
        this.address = address;
        this.job = job;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}