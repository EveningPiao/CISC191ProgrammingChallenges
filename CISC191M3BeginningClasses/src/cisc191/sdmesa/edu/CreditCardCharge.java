package cisc191.sdmesa.edu;

/**
 * Responsibilities of class:
 * Store the date, purchasedBoat, name of the company information.
 */
public class CreditCardCharge {
    private int year;
    private int month;
    private int day;
    private Boat purchasedBoat;
    private String companyName;
    private CreditCard chargedCard;

    /**
     * Constructor to initialize a CreditCardCharge object with the given year,
     * month, day, purchased boat, company name, and charged card.
     */
    public CreditCardCharge(int year, int month, int day, Boat purchasedBoat, String companyName,
            CreditCard chargedCard) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.purchasedBoat = purchasedBoat;
        this.companyName = companyName;
        this.chargedCard = chargedCard;
    }

    /**
     * The toString method provides a string representation of the credit card
     * charge, including the date of the charge, the details of the charged card,
     * the company name, and the make and price of the purchased boat.
     */
    @Override
    public String toString() {
        return year + "/" + month + "/" + day + " " +
                chargedCard.toString() + " " +
                companyName + " " +
                purchasedBoat.getMake() + " $" +
                purchasedBoat.getPrice();
    }
}
