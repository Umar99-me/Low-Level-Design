public abstract class LogProcessor {

    LogProcessor next ;

    public LogProcessor(LogProcessor next){
        this.next = next;
    }

    public void log(String level,String message){
        if(null!=this.next)
            this.next.log(level,message);
    }

}
