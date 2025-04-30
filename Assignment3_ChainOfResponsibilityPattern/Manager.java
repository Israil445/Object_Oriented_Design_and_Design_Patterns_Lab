package Assignment3_ChainOfResponsibilityPattern;

public class Manager implements AuthorizationHandler{
    @Override
    public void authorize(int amount){
        if(amount > 1000000){
            System.out.println("Manager authorized");
            System.out.println("Money Withdraw: " + amount + "\n");
        }
        else{
            System.out.println("Authorization denied."); 
        }
    }

    @Override
    public  void setNextHandler(AuthorizationHandler nextHandler){
        //Manager is the last handler in the chain 
    }
}
