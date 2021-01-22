package models;

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
    }
}
