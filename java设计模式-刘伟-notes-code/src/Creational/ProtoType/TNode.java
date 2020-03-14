package Creational.ProtoType;

import java.io.Serializable;

/**
 * 二叉树节点
 */
public class TNode implements Serializable {
    public TNode left = null, right = null;

    public Double value;

    public TNode() {
    }

    public TNode(Double value) {
        this.value = value;
    }

    public TNode(TNode left, TNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "TNode{" +
                "left=" + left +
                ", right=" + right +
                ", value=" + value +
                '}';
    }
}
