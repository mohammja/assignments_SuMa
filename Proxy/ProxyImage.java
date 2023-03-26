package Proxy;

import java.util.Date;

public class ProxyImage implements Image {
    private final String filename;
    private RealImage image;
    private final String creationDate;

    /**
     * Constructor
     *
     * @param filename
     * @param creationDate
     */
    public ProxyImage(String filename, String creationDate) {
        this.filename = filename;
        this.creationDate = creationDate;
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        if (image == null) {
            image = new RealImage(filename, creationDate);
        }
        image.displayImage();
    }

    @Override
    public void showData() {
        System.out.println("Image filename: " + filename + " taken at: " + creationDate);
    }
}
