
/**
 * Public class "TooLargeTooSmall" accepts parameters "seed," a given number
 * for comparison by the "guess" method to a guessed number "g."  The "guess"
 * method returns "0" if seed and g are equivalent, "1" if g is greater than
 * seed, and "-1" if g is less than seed.
 *
 * @Dave Kelly
 * @02/05/20
 */
public class TooLargeTooSmall {
    private Integer chosenNum;

    /**
     * Constructor for objects of class TooLargeTooSmall
     */
    public TooLargeTooSmall(Integer seed) {
        // initialise instance variables
        chosenNum = seed;
    }
    
    public Integer guess(Integer g) {
        if (g == chosenNum) {
            return 0;
        } else if (g < chosenNum) {
            return -1;
        } else {
            return 1;
        }
        
    
            
        
        
    }
}