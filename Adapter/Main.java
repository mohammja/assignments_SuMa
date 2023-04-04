package Adapter;

public class Main {
    public static void main(String[] args) {
        System.out.println("First example.....\n");
        PdfFile existingPdf = new PdfFile();
        System.out.printf("PDF file has %d pages\n",existingPdf.getNumOfPages());

        PdfFileAdapter adapterPdf = new PdfFileAdapter();
        System.out.printf("PDF file adapter has %d pages and the size of the page %d bytes\n",adapterPdf.getNumOfPages(),adapterPdf.getPageSize(3));


        //Toinen esimerkki:
        System.out.println("");
        System.out.println("Second example.....\n");
        ThirdPartyLibraryAdapter mathLibrary = new ThirdPartyLibraryAdapter();
        System.out.println(mathLibrary.calculate(4.5,5.0));
    }
}
