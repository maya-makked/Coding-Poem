package poem;
/**
 * Displays "Coding" poem
 */
public class CodingPoem {

    /**
     * Display poem
     * @param args Args
     */
    public static void main(String[] args) {
       
        //Create "Coding" object
        Coding thePoem = new Coding();
        
        //Print out poem
        System.out.println(thePoem.concatenatePoem());
    }

}
