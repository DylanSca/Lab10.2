
/**
 * Write a description of class Event_Post here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Event_Post extends Post
{
    // instance variables - replace the example below with your own
    private String event;
    private String discription;
    /**
     * Constructor for objects of class Event_Post
     */
    public Event_Post(String author,String event,String discription)
    {
        // initialise instance variables
        super(author);
        this.event = event;
        this.discription = discription;
    }

    public String getEvent(){
        return event+":" +" " + discription;
    }
    
    
}
