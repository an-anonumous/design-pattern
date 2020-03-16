package Behavioral.ResponsibilityChain;

public class Congress extends Approver {

    public Congress(String name, Approver next) {
        super(name, next);
    }

    public Congress(String name) {
        super(name);
    }

    @Override
    public void handleRequest(PuchaseRequest request) {
        if (request.getAmount() < 100000.0) {
            System.out.println("同意，批准者" + name);
        } else {
            approver.handleRequest(request);
        }
    }
}
