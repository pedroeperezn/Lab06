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
        final int[] FIRST_TWO_LETTERS;
        final int[] FIRST_THREE_LETTERS;

        FIRST_TWO_LETTERS = new int[]{0,2};
        FIRST_THREE_LETTERS = new int[]{0,3};

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

        starWarsFirstName = firstName.substring(FIRST_THREE_LETTERS[0],FIRST_THREE_LETTERS[1] ) + lastName.substring(FIRST_TWO_LETTERS[0], FIRST_TWO_LETTERS[1]).toLowerCase();
        starWarsLastName = motherMaidenName.substring(FIRST_TWO_LETTERS[0], FIRST_TWO_LETTERS[1]) + city.substring(FIRST_THREE_LETTERS[0], FIRST_THREE_LETTERS[1]).toLowerCase();

        
    }
}
