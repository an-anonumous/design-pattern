package Creational.ProtoType;

import java.io.*;

/**
 * 二叉树
 */
public class BTree implements Serializable {
    protected TNode root = null;

    public BTree() {
    }

    public BTree(TNode root) {
        this.root = root;
    }

    public TNode getRoot() {
        return root;
    }

    public void setRoot(TNode root) {
        this.root = root;
    }

    public BTree deepClone() {
        BTree tree = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(byteArrayOutputStream);
            out.writeObject(this);

            ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
            tree = (BTree) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return tree;
    }

    @Override
    public String toString() {
        return "BTree{" +
                "root=" + root +
                '}';
    }
}
