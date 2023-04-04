package Adapter;

public class PdfFileAdapter implements IPdfFile{
    private final PdfFile pdfFile;
    public PdfFileAdapter(){
        this.pdfFile = new PdfFile();
    }
    public int getNumOfPages(){
        return this.pdfFile.getNumOfPages();
    }
    public int getPageSize(int pageNum) {
        int totalPages = this.pdfFile.getNumOfPages();
        if (pageNum < 1 || pageNum > totalPages){
            throw new IllegalArgumentException("Invalid page number" + pageNum);
        }
        return 10 * 1024; // size = 10KB
    }
}
