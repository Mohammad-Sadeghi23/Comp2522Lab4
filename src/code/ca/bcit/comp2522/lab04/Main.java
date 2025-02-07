package ca.bcit.comp2522.lab04;

public class Main
{
    public static void main(String[] args)
    {
        Book book1;
        Book book2;
        Book book3;
        Book book4;
        Book book5;

        Biography biography1;
        Biography biography2;
        Biography biography3;
        Biography biography4;
        Biography biography5;

        Autobiography autobiography1;
        Autobiography autobiography2;
        Autobiography autobiography3;
        Autobiography autobiography4;
        Autobiography autobiography5;

        Author author1;
        Author author2;
        Author author3;
        Author author4;
        Author author5;

        Name name1;
        Name name2;
        Name name3;
        Name name4;
        Name name5;

        Date dateOfBirth1;
        Date dateOfBirth2;
        Date dateOfBirth3;
        Date dateOfBirth4;
        Date dateOfBirth5;

        Date dateOfDeath1;
        Date dateOfDeath2;
        Date dateOfDeath3;
        Date dateOfDeath4;
        Date dateOfDeath5;

        Date yearPublished1;
        Date yearPublished2;
        Date yearPublished3;
        Date yearPublished4;
        Date yearPublished5;

        name1 = new Name("George", "Orwell");
        name2 = new Name("Harper", "Lee");
        name3 = new Name("Jane", "Austen");
        name4 = new Name("F.Scott", "Fitzgerald");
        name5 = new Name("Herman", "Melville");

        dateOfBirth1 = new Date(25, 1, 1903);
        dateOfBirth2 = new Date(28, 4, 1926);
        dateOfBirth3 = new Date(16, 12, 1775);
        dateOfBirth4 = new Date(24, 9, 1896);
        dateOfBirth5 = new Date(1, 8, 1819);

        dateOfDeath1 = new Date(21, 1, 1950);
        dateOfDeath2 = new Date(19, 2, 2016);
        dateOfDeath3 = new Date(18, 6, 1817);
        dateOfDeath4 = new Date(21, 12, 1940);
        dateOfDeath5 = new Date(28, 9, 1891);

        author1 = new Author(dateOfBirth1, dateOfDeath1, name1, "Dystopia");
        author2 = new Author(dateOfBirth2, dateOfDeath2, name2, "Literature - Fiction");
        author3 = new Author(dateOfBirth3, dateOfDeath3, name3, "Romantic Fiction");
        author4 = new Author(dateOfBirth4, dateOfDeath4, name4, "Comedy - Fantasy");
        author5 = new Author(dateOfBirth5, dateOfDeath5, name5, "Nautical Fiction");

        yearPublished1 = new Date(8, 6, 1949);
        yearPublished2 = new Date(11, 7, 1960);
        yearPublished3 = new Date(28, 1, 1813);
        yearPublished4 = new Date(10, 4, 1925);
        yearPublished5 = new Date(18, 10, 1851);

        book1 = new Book("1984", yearPublished1, author1);
        book2 = new Book("To Kill a Mockingbird", yearPublished2, author2);
        book3 = new Book("Pride and Prejudice", yearPublished3, author3);
        book4 = new Book("The Great Gatsby", yearPublished4, author4);
        book5 = new Book("Moby-Dick", yearPublished5, author5);
    }
}
