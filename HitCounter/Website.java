import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import java.util.stream.Collectors;

public class Website implements Runnable{

    private List<WebPage> webPages;
    List<Semaphore> semaphores ;

    // use ConcurrentHashMap instead of semaphors
    // private ConcurrentHashMap<Integer, WebPage> webPages;
    private int totalPages;

    

    public Website(int totalPages) {
        this.totalPages = totalPages;

        webPages = new ArrayList<>();
        semaphores = new ArrayList<>();
        for(int i = 0;i<totalPages;i++){
            this.webPages.add(new WebPage(i, 0));
            this.semaphores.add(new Semaphore(1));
        }
    }

    public List<WebPage> getWebPages() {
        return webPages;
    }

    public void setWebPages(List<WebPage> webPages) {
        this.webPages = webPages;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public WebPage getPage(int index){
        try{
            semaphores.get(index).acquire();
            return webPages.stream().filter(page->page.getPageNumber() == index).collect(Collectors.toList()).get(0);
        }
        catch(Exception e){
            System.out.print(e);
        }
       return null;
    }

    public void visitpage(int index){
        WebPage page = getPage(index);
        page.increaseVisitCount();
        semaphores.get(index).release();
    }

    public int getVisitCount(int index){
        int count = getPage(index).getVisitCount().get();
        semaphores.get(index).release();
        return count;
    }

    @Override
    public void run() {
        for(int i =0;i<totalPages;i++){
            visitpage(i);
            System.out.println("Page " + (i + 1) + " visited " + getVisitCount(i) + " times by " + Thread.currentThread().getName());
        }
        
    }
    
    
    
}
