package ca.bcit.comp2522.lab04;

/**
 * The Main class serves as the entry point for the application.
 * It demonstrates the creation and comparison of Book, Biography,
 * and Autobiography objects.
 *
 * @author Mohammad Sadeghi
 * @author Brownie Tran
 * @version 1.0
 */
public class Main
{
    /**
     * The main method initializes various books, biographies, and autobiographies,
     * performs comparisons, and prints their details.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(final String[] args)
    {
        // Books

        // Creates Name, Date, Author, and Book objects for "1984" by George Orwell
        Name georgeOName = new Name("George", "Orwell");
        Date georgeOBirthdate = new Date(25, 6, 1903);
        Date georgeODeathdate = new Date(21, 1, 1950);
        Date publishedDate1949 = new Date(8, 6, 1949);
        Author georgeO = new Author(georgeOBirthdate, georgeODeathdate, georgeOName, "Dystopian fiction");
        Book book1984 = new Book("1984", publishedDate1949, georgeO);

        // Creates Name, Date, Author, and Book objects for "To Kill a Mockingbird" by Harper Lee
        Name harperLName = new Name("Harper", "Lee");
        Date harperLBirthdate = new Date(28, 4, 1926);
        Date harperLDeathdate = new Date(19, 2, 2016);
        Date publishedDateMocking = new Date(11, 7, 1960);
        Author harperL = new Author(harperLBirthdate, harperLDeathdate, harperLName, "Literature fiction");
        Book bookMockingbird = new Book("To Kill a Mockingbird", publishedDateMocking, harperL);

        // Creates Name, Date, Author, and Book objects for "Pride and Prejudice" by Jane Austen
        Name janeAName = new Name("Jane", "Austen");
        Date janeABirthdate = new Date(16, 12, 1775);
        Date janeADeathdate = new Date(18, 7, 1817);
        Date publishedDatePride = new Date(28, 1, 1813);
        Author janeA = new Author(janeABirthdate, janeADeathdate, janeAName, "Romance Fiction");
        Book bookPride = new Book("Pride and Prejudice", publishedDatePride, janeA);

        // Creates Name, Date, Author, and Book objects for "The Great Gatsby" by F. Scott Fitzgerald
        Name scottFName = new Name("F. Scott", "Fitzgerald");
        Date scottFBirthdate = new Date(24, 9, 1896);
        Date scottFDeathdate = new Date(21, 12, 1940);
        Date publishedDateGatsby = new Date(10, 4, 1925);
        Author scottF = new Author(scottFBirthdate, scottFDeathdate, scottFName, "Literary Fiction");
        Book bookGatsby = new Book("The Great Gatsby", publishedDateGatsby, scottF);

        // Creates Name, Date, Author, and Book objects for "Moby-Dick" by Herman Melville
        Name hermanMName = new Name("Herman", "Melville");
        Date hermanMBirthdate = new Date(1, 8, 1819);
        Date hermanMDeathdate = new Date(28, 9, 1891);
        Date publishedDateMoby = new Date(18, 10, 1851);
        Author hermanM = new Author(hermanMBirthdate, hermanMDeathdate, hermanMName, "Adventure Fiction");
        Book bookMoby = new Book("Moby-Dick", publishedDateMoby, hermanM);


        // Biographies

        // Creates Name object for Robert Moses, date objects for his birthdate and death date,
        // a Person object representing him, an Author object for Robert Caro,
        // and a Biography object for "The Power Broker".
        Name robertMName = new Name("Robert", "Moses");
        Date robertMBirthdate = new Date(18, 12, 1888);
        Date robertMDeathdate = new Date(29, 7, 1981);
        Person robertMoses = new Person(robertMBirthdate, robertMDeathdate, robertMName);

        Name robertCaroName = new Name("Robert", "Caro");
        Date robertCaroBirthdate = new Date(30, 10, 1935);
        Author robertCaro = new Author(robertCaroBirthdate, null, robertCaroName, "Biography");

        Date publishedDatePowerBroker = new Date(16, 9, 1974);
        Biography bioPowerBroker = new Biography("The Power Broker", publishedDatePowerBroker, robertCaro, robertMoses);


        // Creates Name object for Steve Jobs, date objects for his birthdate and death date,
        // a Person object representing him, an Author object for Walter Isaacson,
        // and a Biography object for "Steve Jobs".
        Name steveJName = new Name("Steve", "Jobs");
        Date steveJBirthdate = new Date(24, 2, 1955);
        Date steveJDeathdate = new Date(5, 10, 2011);
        Person steveJobs = new Person(steveJBirthdate, steveJDeathdate, steveJName);

        Name walterIName = new Name("Walter", "Isaacson");
        Date walterIBirthdate = new Date(20, 5, 1952);
        Author walterI = new Author(walterIBirthdate, null, walterIName, "Biography");

        Date publishedDateSteveJobs = new Date(25, 10, 2011);
        Biography bioSteveJobs = new Biography("Steve Jobs", publishedDateSteveJobs, walterI, steveJobs);


        // Creates Name object for Winston Churchill, date objects for his birthdate and death date,
        // a Person object representing him, an Author object for Martin Gilbert,
        // and a Biography object for "Churchill: A Life".
        Name winstonCName = new Name("Winston", "Churchill");
        Date winstonCBirthdate = new Date(30, 11, 1874);
        Date winstonCDeathdate = new Date(24, 1, 1965);
        Person winstonChurchill = new Person(winstonCBirthdate, winstonCDeathdate, winstonCName);

        Name martinGName = new Name("Martin", "Gilbert");
        Date martinGBirthdate = new Date(25, 10, 1936);
        Date martinGDeathdate = new Date(3, 2, 2015);
        Author martinG = new Author(martinGBirthdate, martinGDeathdate, martinGName, "History");

        Date publishedDateChurchill = new Date(21, 10, 1991);
        Biography bioChurchill = new Biography("Churchill: A Life", publishedDateChurchill, martinG, winstonChurchill);


        // Creates Name object for Alexander Hamilton, date objects for his birthdate and death date,
        // a Person object representing him, an Author object for Ron Chernow,
        // and a Biography object for "Alexander Hamilton".
        Name alexanderHName = new Name("Alexander", "Hamilton");
        Date alexanderHBirthdate = new Date(11, 1, 1755);
        Date alexanderHDeathdate = new Date(12, 7, 1804);
        Person alexanderHamilton = new Person(alexanderHBirthdate, alexanderHDeathdate, alexanderHName);

        Name ronCName = new Name("Ron", "Chernow");
        Date ronCBirthdate = new Date(3, 3, 1949);
        Author ronC = new Author(ronCBirthdate, null, ronCName, "Biography");

        Date publishedDateHamilton = new Date(26, 4, 2004);
        Biography bioHamilton = new Biography("Alexander Hamilton", publishedDateHamilton, ronC, alexanderHamilton);


        // Creates Name object for Albert Einstein, date objects for his birthdate and death date,
        // a Person object representing him, and a Biography object for "Einstein: His Life and Universe"
        // written by Walter Isaacson.
        Name albertEName = new Name("Albert", "Einstein");
        Date albertEBirthdate = new Date(14, 3, 1879);
        Date albertEDeathdate = new Date(18, 4, 1955);
        Person albertEinstein = new Person(albertEBirthdate, albertEDeathdate, albertEName);

        Date publishedDateEinstein = new Date(10, 4, 2007);
        Biography bioEinstein = new Biography("Einstein: His Life and Universe", publishedDateEinstein, walterI, albertEinstein);

        // Autobiographies

        // Creates Name object for Anne Frank, date objects for her birthdate and death date,
        // an Author object for her, and an Autobiography object for "The Diary of a Young Girl".
        Name anneFName = new Name("Anne", "Frank");
        Date anneFBirthdate = new Date(12, 6, 1929);
        Date anneFDeathdate = new Date(1, 3, 1945);
        Author anneFrank = new Author(anneFBirthdate, anneFDeathdate, anneFName, "Memoir");

        Date publishedDateDiary = new Date(25, 6, 1947);
        Autobiography autoDiary = new Autobiography("The Diary of a Young Girl", publishedDateDiary, anneFrank);


        // Creates Name object for Nelson Mandela, date objects for his birthdate and death date,
        // an Author object for him, and an Autobiography object for "Long Walk to Freedom".
        Name nelsonMName = new Name("Nelson", "Mandela");
        Date nelsonMBirthdate = new Date(18, 7, 1918);
        Date nelsonMDeathdate = new Date(5, 12, 2013);
        Author nelsonMandela = new Author(nelsonMBirthdate, nelsonMDeathdate, nelsonMName, "Autobiography");

        Date publishedDateMandela = new Date(12, 11, 1994);
        Autobiography autoMandela = new Autobiography("Long Walk to Freedom", publishedDateMandela, nelsonMandela);


        // Creates Name object for Mahatma Gandhi, date objects for his birthdate and death date,
        // an Author object for him, and an Autobiography object for "The Story of My Experiments with Truth".
        Name mahatmaGName = new Name("Mahatma", "Gandhi");
        Date mahatmaGBirthdate = new Date(2, 10, 1869);
        Date mahatmaGDeathdate = new Date(30, 1, 1948);
        Author mahatmaGandhi = new Author(mahatmaGBirthdate, mahatmaGDeathdate, mahatmaGName, "Philosophy");

        Date publishedDateGandhi = new Date(1, 1, 1927);
        Autobiography autoGandhi = new Autobiography("The Story of My Experiments with Truth", publishedDateGandhi, mahatmaGandhi);


        // Creates Name object for Maya Angelou, date objects for her birthdate and death date,
        // an Author object for her, and an Autobiography object for "I Know Why the Caged Bird Sings".
        Name mayaAName = new Name("Maya", "Angelou");
        Date mayaABirthdate = new Date(4, 4, 1928);
        Date mayaADeathdate = new Date(28, 5, 2014);
        Author mayaAngelou = new Author(mayaABirthdate, mayaADeathdate, mayaAName, "Memoir");

        Date publishedDateMaya = new Date(1, 4, 1969);
        Autobiography autoMaya = new Autobiography("I Know Why the Caged Bird Sings", publishedDateMaya, mayaAngelou);


        // Creates Name object for Malcolm X, date objects for his birthdate and death date,
        // an Author object for him, and an Autobiography object for "The Autobiography of Malcolm X".
        Name malcolmXName = new Name("Malcolm", "X");
        Date malcolmXBirthdate = new Date(19, 5, 1925);
        Date malcolmXDeathdate = new Date(21, 2, 1965);
        Author malcolmX = new Author(malcolmXBirthdate, malcolmXDeathdate, malcolmXName, "Autobiography");

        Date publishedDateMalcolmX = new Date(29, 10, 1965);
        Autobiography autoMalcolmX = new Autobiography("The Autobiography of Malcolm X", publishedDateMalcolmX, malcolmX);


        // Comparing & Printing

        // 1. Compare Books by Publication Year (Older books are "larger")
        System.out.println("Comparing Books by Publication Year:");
        System.out.println("Is '1984' older than 'To Kill a Mockingbird'? " + (book1984.compareTo(bookMockingbird) > 0));
        System.out.println("Is 'Pride and Prejudice' older than 'The Great Gatsby'? " + (bookPride.compareTo(bookGatsby) > 0));
        System.out.println("Is 'Moby-Dick' newer than '1984'? " + (bookMoby.compareTo(book1984) < 0));
        System.out.println();

        // 2. Compare Authors by Birthdate (Older authors are "larger")
        System.out.println("Comparing Authors by Birthdate:");
        System.out.println("Is Jane Austen older than George Orwell? " + (janeA.compareTo(georgeO) > 0));
        System.out.println("Is Harper Lee older than F. Scott Fitzgerald? " + (harperL.compareTo(scottF) > 0));
        System.out.println("Is Herman Melville older than George Orwell? " + (hermanM.compareTo(georgeO) > 0));
        System.out.println();

        // 3. Compare Biographies by Subject (Two biographies are equal if they are about the same person)
        System.out.println("Comparing Biographies by Subject:");
        System.out.println("Is 'Steve Jobs' biography about the same person as 'The Power Broker'? " + bioSteveJobs.equals(bioPowerBroker));
        System.out.println("Is 'Alexander Hamilton' biography about the same person as 'Churchill: A Life'? " + bioHamilton.equals(bioChurchill));
        System.out.println();

        // 4. Printing Books, Biographies, and Autobiographies using the Printable Interface
        System.out.println("Printing Book Details:\n");
        book1984.display();
        System.out.println();
        bookMockingbird.display();
        System.out.println();
        bookPride.display();
        System.out.println();
        bookGatsby.display();
        System.out.println();
        bookMoby.display();
        System.out.println();

        System.out.println("Printing Biography Details:\n");
        bioPowerBroker.display();
        System.out.println();
        bioSteveJobs.display();
        System.out.println();
        bioChurchill.display();
        System.out.println();
        bioHamilton.display();
        System.out.println();
        bioEinstein.display();
        System.out.println();

        System.out.println("Printing Autobiography Details:\n");
        autoDiary.display();
        System.out.println();
        autoMandela.display();
        System.out.println();
        autoGandhi.display();
        System.out.println();
        autoMaya.display();
        System.out.println();
        autoMalcolmX.display();
        System.out.println();

        // 5. Print Titles & Names Backward using Reversible Interface
        System.out.println("Printing Reversed Titles:\n");
        System.out.println("1984 → " + book1984.backward());
        System.out.println("To Kill a Mockingbird → " + bookMockingbird.backward());
        System.out.println("Pride and Prejudice → " + bookPride.backward());
        System.out.println("The Great Gatsby → " + bookGatsby.backward());
        System.out.println("Moby-Dick → " + bookMoby.backward());
        System.out.println();

        System.out.println("Printing Reversed Author Names:");
        System.out.println("George Orwell → " + georgeO.backward());
        System.out.println("Harper Lee → " + harperL.backward());
        System.out.println("Jane Austen → " + janeA.backward());
        System.out.println("F. Scott Fitzgerald → " + scottF.backward());
        System.out.println("Herman Melville → " + hermanM.backward());
    }
}
