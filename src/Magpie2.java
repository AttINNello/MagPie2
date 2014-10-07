/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
    /**
     * Get a default greeting
     * @return a greeting
     */
    public String getGreeting()
    {
        return "I miss you Nina.  Let's talk.";
    }

    /**
     * Gives a response to a user statement
     *
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement) {
        String response = "";
        statement = statement.toLowerCase().trim();

        if (statement.indexOf("no") >= 0) {
            response = "Why so negative?";
        } else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0) {
            response = "Tell me more about your family.";
        } else if (statement.indexOf("cat") >= 0
                || statement.indexOf("dog") >= 0
                || statement.indexOf("fish") >= 0) {
            response = "Tell me more about your pets.";
        } else if (statement.indexOf("mrs.") >= 0
                || statement.indexOf("miss") >= 0
                || statement.indexOf("ms.") >= 0) {
            response = "She sounds like a good teacher.";
        } else if (statement.indexOf("mr.") >= 0) {
            response = "He sounds like a good teacher.";
        } else if (statement.length() ==0) {
            response = "Say something, please.";
        } else if (statement.indexOf("potato") >= 0)
        {
            response = "There's ample starch in your diet already.";
        } else if (statement.indexOf("lips") >= 0)
        {
            response = "You look like you need chap stick.";
        } else if (statement.indexOf("friends") >= 0)
        {
            response = "That's a bit limiting, don't you think?";
        }
        else
        {
            response = getRandomResponse();
        }

        return response;

    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 8;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        else if (whichResponse == 4)
        {
            response = "Do you have any flour?";
        }
        else if (whichResponse == 5)
        {
            response = "Amazing!";
        }
        else if (whichResponse == 6)
        {
            response = "That is too cool.";
        }
        else if (whichResponse == 7)
        {
            response = "Do you have any coupons?";
        }
        else if (whichResponse == 8)
        {
            response = "Cheese isn't in the closet.";
        }
        return response;
    }
}
