/**
 * This class formats a name as a Star Wars name
 * @author Alan Riveros
 * @author Pedro Perez
 * @version 1.0
 */
public class StarWarsName
{
    /**
     * Scans for input arguments to create a star wars name.
     * @param args String in which to look for the words.
     */
    public static void main(final String[] args)
    {
        final String[] allWords;
        allWords = args[0].split("\\|");

        if(allWords.length != 4)
        {
            throw new IllegalArgumentException("ERROR: Incorrect number of words provided.");
        }

        final String firstName;
        final String lastName;
        final String motherMaidenName;
        final String city;

        firstName = allWords[0];
        lastName = allWords[1];
        motherMaidenName = allWords[2];
        city = allWords[3];

        final String starWarsFirstName;
        final String starWarsLastName;


    }
}
