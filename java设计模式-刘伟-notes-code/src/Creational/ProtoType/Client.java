package Creational.ProtoType;

public class Client {
    public static void main(String[] args) {
        BTree tree = new BTree();
        tree.setRoot(new TNode(1.0));
        tree.getRoot().left = new TNode(2.0);
        tree.getRoot().right = new TNode(3.0);
        System.out.println(tree);

        BTree bTree = tree.deepClone();
        System.out.println(bTree);
    }
}
