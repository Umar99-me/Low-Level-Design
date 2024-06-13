public class ErrorLogProcessor extends LogProcessor{

    public ErrorLogProcessor(LogProcessor next) {
        super(next);
        //TODO Auto-generated constructor stub
    }

    public void log(String level,String message){
        if(level == "ERROR")
            System.out.println("ERROR :: "+message);
        else
            super.log(level,message);
    }
}
