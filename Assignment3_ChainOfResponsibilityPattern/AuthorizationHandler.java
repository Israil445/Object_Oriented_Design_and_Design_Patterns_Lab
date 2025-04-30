package Assignment3_ChainOfResponsibilityPattern;

public interface AuthorizationHandler {
    void authorize(int amount);
    void setNextHandler(AuthorizationHandler nextHandler);
}
