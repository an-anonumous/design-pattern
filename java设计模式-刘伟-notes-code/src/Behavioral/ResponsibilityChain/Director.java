package Behavioral.ResponsibilityChain;

public class Director extends Approver {
    public Director(String name, Approver next) {
        super(name, next);
    }

    public Director(String name) {
        super(name);
    }

    @Override
    public void handleRequest(PuchaseRequest request) {
        if (request.getAmount() < 50000.0) {
            System.out.println("同意，批准者" + name);
        } else {
            approver.handleRequest(request);
        }

    }

}
