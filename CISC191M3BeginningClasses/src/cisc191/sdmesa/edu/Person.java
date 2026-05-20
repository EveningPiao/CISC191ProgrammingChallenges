package cisc191.sdmesa.edu;

/**
 * Lead Author(s):
 * TianLin Zhao
 * * Responsibilities of class:
 * Store and manage information about a person, including their name, phone
 * number, and zip code. Provide methods to access and modify this information,
 * as well as a method to return a formatted string representation of the
 * person's details.
 */
public class Person {
    private String name;
    private String phone;
    private String zip;

    /**
     * Constructor to initialize a Person object with the given name, phone number,
     * and zip code.
     */
    public Person(String name, String phone, String zip) {
        this.name = name;
        this.phone = phone;
        this.zip = zip;
    }

    /**
     * Get the name of the person.
     * 
     * @return the name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the person.
     * 
     * @param newName the new name of the person
     */
    public void setName(String newName) {
        this.name = newName;
    }

    /**
     * A formatted string representation of the person's details.
     * 
     * @return a string containing the person's name, phone number, and zip code
     */
    @Override
    public String toString() {
        return name + " " + phone + " " + zip;
    }
}