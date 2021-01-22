package models;

import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args) {
        Album album = new Album();
        album.setId(1L);
        album.setName("Loose");
        album.setArtist("Nelly Furtado");
        album.setGenre("Pop, R&B");
        album.setReleaseDate(2006);
        album.setSales(52000);

        System.out.println("album.getName() = " + album.getName());
        System.out.println("album.getArtist() = " + album.getArtist());

        Author author = new Author();
        author.setId(1L);
        author.setFirstName("John");
        author.setLastName("Doe");

        Quote firstQuote = new Quote();
        firstQuote.setId(1L);
        firstQuote.setAuthor(author);
        firstQuote.setContent("If you're happy and you know it, clap your hands");

        Quote secondQuote = new Quote();
        secondQuote.setId(2L);
        secondQuote.setAuthor(author);
        secondQuote.setContent("Ships are safe in their harbor, but that's not what ships were built for.");

        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(firstQuote);
        quotes.add(secondQuote);

        for( Quote q:quotes) {
            System.out.println(q.getContent());
            System.out.println(q.getAuthor().getFirstName());
            System.out.println(q.getAuthor().getLastName());
        }
    }

}
