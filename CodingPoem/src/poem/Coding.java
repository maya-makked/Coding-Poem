package poem;

/**
 * This class puts together the poem.
 */
public class Coding {
    
    /**
     * Title
     */
    private String title;
    /**
     * First stanza
     */
    private String stanza1;
    /**
     * Second stanza
     */
    private String stanza2;
    /**
     * Third stanza
     */
    private String stanza3;
    /**
     * Fourth stanza
     */
    private String stanza4;
    
    /**
     * Constructor
     */
    public Coding() {
        
    }
    
    /**
     * Title and author
     */
    public void title() {
        title = "\"Coding\"\nBy Maya Makked";
    }
    
    /**
     * First stanza
     */
    public void stanza1() {
        stanza1 = "I sit down\nTo write my abstract logical poem.";
    }
    
    /**
     * Second stanza
     */
    public void stanza2() {
        stanza2 = "I traverse line by line,\nNurturing each one\nWith the perfect words and syntax.\n"
            + "I think to the innermost depths of my core\nBecause I want each line of this beautiful language\n"
            + "To unlock its fullest potential.\nWhen simple words are arranged together,\nThey hold" 
            + " so much power.";
    }
    
    /**
     * Third stanza
     */
    public void stanza3() {
        stanza3 = "My program is composed of many stanzas,\nCalled methods or functions\nIn the coding world,"
            + "\nWith each one holding\nIts very own purpose.\nSome of them are only a couple lines long,"
            + "\nWhile others span entire chapters.\nThese stanzas join together,\nWorking closely with one "
            + "another\nTo drive the application as a whole.";
    }
    
    /**
     * Fourth stanza
     */
    public void stanza4() {
        stanza4 = "To see the creation\nI birthed with my very own mind\nCome to life"
            + "\nEvokes indescribable emotion within me.";
    }
    
    /**
     * Put together each element of "Coding" poem
     * @return "Coding" poem
     */
    public String concatenatePoem() {
        title();
        stanza1();
        stanza2();
        stanza3();
        stanza4();
        String codingPoem = title + "\n\n" + stanza1 + "\n\n" + stanza2 + "\n\n" + stanza3 + "\n\n" + stanza4;
        return codingPoem;
    }
}
