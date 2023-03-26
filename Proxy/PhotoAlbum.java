package Proxy;

import java.util.ArrayList;
import java.util.List;

public class PhotoAlbum {
    private List<Image> images;
    public PhotoAlbum (){
        images = new ArrayList<>();
        images.add(new ProxyImage("Image1.jpg", "26.03.2023"));
        images.add(new ProxyImage("Image2.jpg", "27.03.2023"));
        images.add(new ProxyImage("Image3.jpg", "20.03.2023"));
        images.add(new ProxyImage("Image4.png", "25.03.2023"));
    }

    public void listImages(){
        for (Image image : images){
            image.showData();
        }
    }

    public void displayImage(int inx){
        Image image = images.get(inx);
        image.displayImage();
    }
}
