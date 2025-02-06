package ca.bcit.comp2522.lab04;

/**
 * Represents a Biography, which extends Book and implements the Printable interface.
 * A Biography contains information about a specific subject, who is a Person.
 *
 * @author Mohammad Sadeghi
 * @author Brownie Tran
 * @version 1.0
 */
public class Biography extends Book implements Printable
{
    private Person subject;

    /**
     * Constructs a Biography object with a title, publication year, author, and subject.
     *
     * @param title The title of the biography.
     * @param yearPublished The year the biography was published.
     * @param author The author of the biography.
     * @param subject The person who is the subject of the biography.
     * @throws NullPointerException if the subject is null.
     */
    public Biography(final String title,
                     final Date yearPublished,
                     final Author author, final Person subject)
    {
        super(title, yearPublished, author);
        validateSubject(subject);
        this.subject = subject;
    }

    /**
     * Gets the subject of the biography.
     *
     * @return The person who is the subject of the biography.
     */
    protected Person getSubject()
    {
        return subject;
    }

    /**
     * Validates the subject to ensure it is not null.
     *
     * @param subject The subject to validate.
     * @throws NullPointerException if the subject is null.
     */
    private void validateSubject(final Person subject)
    {
        if(subject == null)
        {
            throw new NullPointerException("Subject cannot be null");
        }
    }

    /**
     * Checks if this Biography is equal to another object.
     *
     * @param obj The object to compare against.
     * @return true if the objects are equal, false otherwise.
     * @throws NullPointerException if the object is null.
     * @throws IllegalArgumentException if the object is not a Biography.
     */
    @Override
    public boolean equals(final Object obj)
    {
        if(obj == null)
        {
            throw new NullPointerException("Object cannot be null");
        } else if(!(obj instanceof Biography))
        {
            throw new IllegalArgumentException("Object is not a Biography");
        }
        return this.subject.equals(((Biography) obj).getSubject());
    }

    /**
     * Displays the biography details including the subject's information.
     */
    @Override
    public void display()
    {
        super.display();
        System.out.println("Subject: ");
        subject.display();
    }
}
