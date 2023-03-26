package Proxy;

public class ProxyExample {
    /**
     * Test method
     */
    public static void main(final String[] arguments) {

        PhotoAlbum myAlbum = new PhotoAlbum();
        myAlbum.listImages();
        myAlbum.displayImage(0); //loading necessary
        myAlbum.displayImage(1); //loading necessary
        myAlbum.displayImage(0); //loading unnecessary
        myAlbum.displayImage(1); //loading unnecessary

    }
}
