public class InfoLogProcessor extends LogProcessor{
    
    public InfoLogProcessor(LogProcessor next){
        super(next);
    }

    public void log(String level,String message){
        if(level == "INFO")
            System.out.println("INFO :: "+message);
        else
            super.log(level,message);
    }
}
