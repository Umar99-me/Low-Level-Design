public class DebugLogProcessor extends LogProcessor{

    public DebugLogProcessor(LogProcessor next) {
        super(next);
    }

    public void log(String level,String message){
        if(level == "DEBUG")
            System.out.println("DEBUG :: "+message);
        else
            super.log(level,message);
    }
}
