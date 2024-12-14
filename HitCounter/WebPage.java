import java.util.concurrent.atomic.AtomicInteger;

public class WebPage {
    
    private int pageNumber;
    private AtomicInteger visitCount;

    public WebPage(int pageNumber, int visitCount) {
        this.pageNumber = pageNumber;
        this.visitCount = new AtomicInteger();
        this.visitCount.set(0);
    }

    public int getPageNumber() {
        return pageNumber;
    }
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
    public AtomicInteger getVisitCount() {
        return visitCount;
    }
    public void setVisitCount(int visitCount) {
        this.visitCount.set(visitCount);
    }
    public void increaseVisitCount(){
        this.visitCount.incrementAndGet();
    }
    
}
