class LibraryItem {
    String title;
     String author;
     String id;

    public LibraryItem(String title, String author, String id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    public void getInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ID: " + id);
    }
}

class Book extends LibraryItem {
    private int pages;

    public Book(String title, String author, String id, int pages) {
        super(title, author, id);
        this.pages = pages;
    }

    @Override
    public void getInfo() {
        System.out.println("Type: Book");
        super.getInfo();
        System.out.println("Pages: " + pages);
        System.out.println();
    }
}

class Magazine extends LibraryItem {
    private String publicationFrequency;
    private int issueNumber;

    public Magazine(String title, String author, String id, int issueNumber) {
        super(title, author, id);
        this.issueNumber = issueNumber;
    }

    @Override
    public void getInfo() {
        System.out.println("Type: Magazine");
        super.getInfo();
        System.out.println("Publication Frequency: " + publicationFrequency);
        System.out.println("Issue Number: " + issueNumber);
        System.out.println();
    }
}

class Newspaper extends LibraryItem {
    private String publicationDate;

    public Newspaper(String title, String author, String id, String publicationDate) {
        super(title, author, id);
        this.publicationDate = publicationDate;
    }

    @Override
    public void getInfo() {
        System.out.println("Type: Newspaper");
        super.getInfo();
        System.out.println("Publication Date: " + publicationDate);
        System.out.println();
    }
}

public class libarySystem {
    public static void main(String[] args) {
        LibraryItem[] catalog = new LibraryItem[4];

        catalog[0] = new Book("How to think like a monk ", "Jay Shetty", "2045", 360);
        catalog[1] = new Magazine("Nari", "Various", "2506",  202);
        catalog[2] = new Newspaper("Kantipur", "Hari krishna Bahadur", "5032", "2082-02-16");
        catalog[3] = new Book("The diary of young girl ", "Anna Frank", "6002", 328);

        for (LibraryItem item : catalog) {
            item.getInfo();
        }
    }
}

