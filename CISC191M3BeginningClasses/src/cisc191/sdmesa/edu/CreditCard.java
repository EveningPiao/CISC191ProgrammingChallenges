package cisc191.sdmesa.edu;

/**
 * Responsibilities of class:
 * Store and manage information about a credit card, including the card number,
 */
public class CreditCard {
    private String number;
    private String expiration;
    private String securityCode;
    private Person cardHolder;

    /**
     * Constructor to initialize a CreditCard object with the given card number,
     * expiration date, security code, and card holder.
     */
    public CreditCard(String number, String expiration, String securityCode, Person cardHolder) {
        this.number = number;
        this.expiration = expiration;
        this.securityCode = securityCode;
        this.cardHolder = cardHolder;
    }

    /**
     * Get the card number.
     * 
     * @return the card number
     */
    @Override
    public String toString() {
        return number + " " + expiration + " " + securityCode + " " + cardHolder.getName();
    }
}
