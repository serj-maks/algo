package org.serjmaks.algo;

import java.util.Objects;

//данный класс используется для всех алгоритмов с деревьями, где необходим объект TreeNode
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {

    }

    public TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode createTreeNode(int[] values) {
        if (values == null || values.length == 0) {
            return null;
        }
        return buildTree(values, 0);
    }

    private static TreeNode buildTree(int[] values, int index) {
        /**
         * чтобы создать дерево, где некоторые значения будут null (например, [3,9,20,null,null.15,7]), можно
         * <p>
         * 1. использовать Integer.MIN_VALUE как null,
         * т.е. если нужно создать дерево с null, то можно использовать такую конструкцию:
         * TreeNode.createTreeNode(new int[]{3, 9, 20, Integer.MIN_VALUE, Integer.MIN_VALUE, 15, 7});
         * здесь вместо null нужно подставить Integer.MIN_VALUE
         * <p>
         * 2. создать вручную
         * TreeNode root = new TreeNode(3);
         * root.left = new TreeNode(9);
         * root.right = new TreeNode(20);
         * root.right.left = new TreeNode(15);
         * root.right.right = new TreeNode(7);
         */
        if (index >= values.length || values[index] == Integer.MIN_VALUE) {
            return null;
        }
        TreeNode node = new TreeNode(values[index]);
        node.left = buildTree(values, 2 * index + 1);
        node.right = buildTree(values, 2 * index + 2);
        return node;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //cравнение ссылок
        if (o == null || getClass() != o.getClass()) return false; //проверка типа

        TreeNode that = (TreeNode) o;

        //cравниваем значения узлов и рекурсивно сравниваем левых и правых потомков
        return val == that.val
                && Objects.equals(left, that.left)
                && Objects.equals(right, that.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, left, right);
    }
}
