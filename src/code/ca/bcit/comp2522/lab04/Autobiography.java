package ca.bcit.comp2522.lab04;

/**
 * Represents an Autobiography, which is a specialized form of Biography.
 * In an Autobiography, the author and the subject are the same person.
 *
 * @author Mohammad Sadeghi
 * @author Brownie Tran
 * @version 1.0
 */
public class Autobiography extends Biography implements Printable {
    /**
     * Constructs an Autobiography object with a title, publication year, and author.
     * The author is also the subject of the autobiography.
     *
     * @param title The title of the autobiography.
     * @param yearPublished The year the autobiography was published.
     * @param author The author and subject of the autobiography.
     */
    public Autobiography(final String title,
                         final Date yearPublished,
                         final Author author) {
        super(title, yearPublished, author, author);
    }

    /**
     * Displays the autobiography details.
     */
    @Override
    public void display() {
        super.display();
    }
}

