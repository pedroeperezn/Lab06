/**
 * This class formats a name as a Star Wars name.
 * @author Alan Riveros.
 * @author Pedro Perez.
 * @version 1.0
 */
public class StarWarsName
{
    // Declare constants
    public static final int INPUT_ARGS_INDEX      = 0;
    public static final int[] FIRST_TWO_LETTERS   = new int[]{0,2};
    public static final int[] FIRST_THREE_LETTERS = new int[]{0,3};
    public static final int EXPECTED_ARGUMENTS    = 4;
    public static final int FIRST_NAME_INDEX      = 0;
    public static final int LAST_NAME_INDEX       = 1;
    public static final int MAIDEN_INDEX          = 2;
    public static final int CITY_INDEX            = 3;
    public static final int FIRST_CHAR            = 0;
    public static final int REMAIN_BODY_STRING    = 1;

    /**
     * Scans for input arguments to create a star wars name.
     * @param args String in which to look for the words.
     */
    public static void main(final String[] args)
    {

        final String[] allWords;
        allWords = args[INPUT_ARGS_INDEX].split("\\|");

        if(allWords.length != EXPECTED_ARGUMENTS)
        {
            throw new IllegalArgumentException("ERROR: Incorrect number of words provided.");
        }

        final String firstName;
        final String lastName;
        final String motherMaidenName;
        final String city;

        firstName = allWords[FIRST_NAME_INDEX];
        lastName = allWords[LAST_NAME_INDEX];
        motherMaidenName = allWords[MAIDEN_INDEX];
        city = allWords[CITY_INDEX];

        final String starWarsFirstName;
        final String starWarsLastName;


        starWarsFirstName = firstName.substring(FIRST_THREE_LETTERS[0],FIRST_THREE_LETTERS[1] ) + lastName.substring(FIRST_TWO_LETTERS[0], FIRST_TWO_LETTERS[1]).toLowerCase();
        starWarsLastName = motherMaidenName.substring(FIRST_TWO_LETTERS[0], FIRST_TWO_LETTERS[1]) + city.substring(FIRST_THREE_LETTERS[0], FIRST_THREE_LETTERS[1]).toLowerCase();

        System.out.format("Your Star Wars Name is: %s %s%n", UpperCaseFirstLetter(starWarsFirstName) , UpperCaseFirstLetter(starWarsLastName));

    }

    /**
     * Method that return the first character of the word in Upper Case(e.g. pedro -> Pedro).
     * @param stringToEvaluate Takes the word to extract the first character.
     * @return Return the final concatenated String.
     */
    private static String UpperCaseFirstLetter(final String stringToEvaluate)
    {
        final char firstLetter;

        firstLetter = Character.toUpperCase(stringToEvaluate.charAt(FIRST_CHAR));

        return firstLetter + stringToEvaluate.substring(REMAIN_BODY_STRING).toLowerCase();
    }
}
