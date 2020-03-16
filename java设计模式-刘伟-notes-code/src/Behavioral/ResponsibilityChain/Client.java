package Behavioral.ResponsibilityChain;

public class Client {
    public static void main(String[] args) {
        Approver approverChain = new Director("张三");

        VicePresident vicePresident = new VicePresident("李四");
        approverChain.setApprover(vicePresident);

        President president = new President("张麻子");
        vicePresident.setApprover(president);

        Congress congress = new Congress("董事会");
        president.setApprover(congress);

        approverChain.handleRequest(new PuchaseRequest(80000.0));
    }
}
