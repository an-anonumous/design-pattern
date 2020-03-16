package Behavioral.ResponsibilityChain;

public class VicePresident extends Approver {

    public VicePresident(String name, Approver next) {
        super(name, next);
    }

    public VicePresident(String name) {
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
