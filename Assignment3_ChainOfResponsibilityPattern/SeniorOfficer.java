package Assignment3_ChainOfResponsibilityPattern;

public class SeniorOfficer implements AuthorizationHandler{
    private AuthorizationHandler nextHandler;

    @Override
    public void authorize(int amount){
        if(amount>10000 && amount<=1000000){
            System.out.println("SeniorOfficer authorized");
            System.out.println("Money withdraw: " + amount + "\n");
        }
        else if(nextHandler != null){
            System.out.println("SeniorOfficer authorized ...");
            nextHandler.authorize(amount);
        }
        else{
            System.out.println("Authorization denied.");
        }
    }

    @Override
    public void setNextHandler(AuthorizationHandler nextHandler){
        this.nextHandler = nextHandler;
    }
}
