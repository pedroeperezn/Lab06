/**
 * This class formats a name as a Star Wars name.
 * @author Alan Riveros.
 * @author Pedro Perez.
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
        final int EXPECTED_ARGUMENTS;

        FIRST_TWO_LETTERS = new int[]{0,2};
        FIRST_THREE_LETTERS = new int[]{0,3};
        EXPECTED_ARGUMENTS = 4;

        final String[] allWords;
        allWords = args[0].split("\\|");

        if(allWords.length != EXPECTED_ARGUMENTS)
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

        System.out.format("Your Star Wars Name is: %s %s%n", UpperCaseFirstLetter(starWarsFirstName) , UpperCaseFirstLetter(starWarsLastName));

    }

    /**
     * Method that return the first character of the word in Upper Case(e.g. pedro -> Pedro).
     * @param stringToEvaluate Takes the word to extract the first character.
     * @return Return the final concatenated String.
     */
    private static String UpperCaseFirstLetter(final String stringToEvaluate)
    {
        final char firstLetter = Character.toUpperCase(stringToEvaluate.charAt(0));

        return firstLetter + stringToEvaluate.substring(1).toLowerCase();
    }
}
