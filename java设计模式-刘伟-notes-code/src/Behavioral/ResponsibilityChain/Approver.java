package Behavioral.ResponsibilityChain;

public abstract class Approver {
    protected String name;
    protected Approver approver;

    public Approver(String name, Approver next) {
        this.name = name;
        this.approver = next;
    }

    public Approver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Approver getApprover() {
        return approver;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void handleRequest(PuchaseRequest request);
}
