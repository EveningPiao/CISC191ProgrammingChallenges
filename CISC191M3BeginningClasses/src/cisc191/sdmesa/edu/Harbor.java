package cisc191.sdmesa.edu;

/**
 * Lead Author(s):
 * TianLin Zhao
 * * Responsibilities of class:
 * Manage a harbor that can hold multiple boats. The harbor can park boats at
 * specific slips and retrieve them.
 */
public class Harbor {
    // harbor inventory: an array of Boat objects representing the boats parked at
    // each slip
    private Boat[] inventory;

    /**
     * Constructor: Create a harbor with the specified number of slips
     */
    public Harbor(int numberSlips) {
        inventory = new Boat[numberSlips];
    }

    /**
     * Get the boat at the specified slip number
     * 
     * @return the boat at the specified slip number, or null if the slip is empty
     */
    public Boat getBoatAt(int slipNumber) {
        if (slipNumber >= 0 && slipNumber < inventory.length) {
            return inventory[slipNumber];
        }
        return null;
    }

    /**
     * Park a boat at the specified slip number.
     * If the slip is already occupied (A), replace it with the new boat (B) and
     * return the old boat (A).
     * 
     * @return the boat that was previously parked at the slip, or null if the slip
     *         was empty.
     */
    public Boat parkBoatAt(Boat boat, int slipNumber) {
        if (slipNumber >= 0 && slipNumber < inventory.length) {
            Boat oldBoat = inventory[slipNumber];
            inventory[slipNumber] = boat;
            return oldBoat;
        }
        return null;
    }

    /**
     * Get a copy of the harbor inventory. This method returns a new array that is a
     * copy of the inventory array.
     * 
     * @return a copy of the harbor inventory array. Changes to the returned array
     *         will not affect the harbor's inventory.
     */
    public Boat[] getInventory() {
        Boat[] copy = new Boat[inventory.length];
        for (int i = 0; i < inventory.length; i++) {
            copy[i] = inventory[i]; // Changes to the Boat objects in the copy and change the original Boat objects
                                    // in the inventory.
        }
        return copy;
    }
}
