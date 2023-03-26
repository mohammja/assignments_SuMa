package Proxy;

import java.util.Date;

public class RealImage implements Image{
    private final String filename;
    private final String creationDate;


    /**
     * Constructor
     *
     * @param filename
     * @param creationDate
     */
    public RealImage(String filename, String creationDate) {
        this.filename = filename;
        this.creationDate = creationDate;
        loadImageFromDisk();
    }

    /**
     * Loads the image from the disk
     */
    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        System.out.println("Displaying " + filename);
    }

    @Override
    public void showData() {
        System.out.println("Image filename: " + filename + " taken at: " + creationDate);
    }
}
