package ca.bcit.comp2522.lab04;

/**
 * Creates Name with first and last with implemented display method from printable.
 *
 * @author Mohammad Sadeghi
 * @author Brownie Tran
 * @version 1.0
 */
public class Name implements Printable
{
    private final int MAX_NAME_CHAR = 50;

    private final String firstName;
    private final String lastName;

    /**
     * Constructs a Name object.
     * Parameters are validated before instance variables are set.
     *
     * @param firstName given first name
     * @param lastName given last name
     */
    public Name(final String firstName, final String lastName)
    {
        validateName(firstName);
        validateName(lastName);

        this.firstName = firstName;
        this.lastName = lastName;
    }

    /*
     * Validates given name based criteria:
     * 1. Must not be null
     * 2. Must not be blank
     * 3. Must over the MAX_NAME_CHAR character limit
     *
     * @param name the given name being validated
     */
    private void validateName(final String name)
    {
        if(name == null || name.isEmpty() || name.length() > MAX_NAME_CHAR)
        {
            throw new IllegalArgumentException("bad name: " + name);
        }
    }


    /**
     * Overriding to print full name
     */
    @Override
    public void display()
    {
        StringBuilder fullName;
        fullName = new StringBuilder();

        fullName.append(firstName);
        fullName.append(" ");
        fullName.append(lastName);

        System.out.println(fullName);
    }
}
