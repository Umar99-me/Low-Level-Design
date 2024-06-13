public class Main {
    public static void main(String[] args){
    LogProcessor logger = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
    
    logger.log("INFO","INFO MESSAGE");
    logger.log("DEBUG","INFO MESSAGE");
    logger.log("ERROR","INFO MESSAGE");
    }
    
}
