package Behavioral.ResponsibilityChain;

public class President extends Approver {

    public President(String name, Approver next) {
        super(name, next);
    }

    public President(String name) {
        super(name);
    }

    @Override
    public void handleRequest(PuchaseRequest request) {
        if (request.getAmount() < 500000.0) {
            System.out.println("同意，批准者" + name);
        } else {
            approver.handleRequest(request);
        }
    }
}
