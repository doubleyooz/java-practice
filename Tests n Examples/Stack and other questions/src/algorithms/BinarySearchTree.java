package src.algorithms;

import java.util.Arrays;

import src.utils.CustomArray;

public class BinarySearchTree {
    private class Node {
        private Integer value = null;
        public Node left = null;
        public Node right = null;

        public Node(int value) {
            this.value = value;

        }

        public Node() {
        }
    }

    Node head = new Node();
    private int size = 0;

    private void recAdd(Node node, int element) {

        if (element <= node.value) {
            if (node.left != null)
                recAdd(node.left, element);
            else {
                node.left = new Node(element);
                return;
            }

        } else {
            if (node.right != null)
                recAdd(node.right, element);
            else {
                node.right = new Node(element);
                return;
            }
        }

    }

    public void add(int element) {
        if (head.value == null)
            head.value = element;
        else
            recAdd(head, element);
        size++;

    }

    public boolean contains(int number) {
        return recContains(head, number);
    }

    public void deleteElement(int number) {
        recDelete(head, number);
    }

    private void recDelete(Node node, int number) {

        if (number <= node.value) {
            if (node.left != null) {
                if (number == node.left.value) {
                    
                    if (node.left.left != null && node.left.right != null) { 
                                
                        Node temp = getBiggerParentNode(node.left);
                        temp.value = temp.right.value;
                        temp.right = null;
                    } else if (node.left.left != null) {
                        node.left = node.left.left;

                    } else if (node.left.right != null) {
                        node.left = node.left.right;

                    } else
                        node.left = null;

                } else
                    recDelete(node.left, number);

            }

        } else if (node.right != null) {
            if (number == node.right.value) {
                System.out.println(node.right.right.value);
                if (node.right.left != null && node.right.right != null) {
                   
                  

                    Node temp = getSmallerParentNode(node.right);
                   
                    node.right.value = temp.left.value;
                    temp.left = null;
                    
                } else if (node.right.left != null) {
                    node.right = node.right.left;

                } else if (node.right.right != null) {
                    
                    node.right = node.right.right;
                } else
                    node.right = null;
            } else
                recDelete(node.right, number);
        }

    }

    private boolean recContains(Node node, int number) {
        if (number == node.value)
            return true;
        if (number <= node.value) {
            if (node.left != null)
                return recContains(node.left, number);

        } else if (node.right != null)
            return recContains(node.right, number);

        return false;

    }

    private Node getSmallerParentNode(Node node) {
        if (node.left.left == null)
            return node;

        else
            return getSmallerParentNode(node.left);

    }

    private Node getBiggerParentNode(Node node) {
        if (node.right.right == null)
            return node;

        else
            return getBiggerParentNode(node.right);

    }

    public void list() {
        recList(head);
    }

    public Integer[] getArray() {
        CustomArray arr = new CustomArray();
        recList(head, arr);
        return arr.getArray();
    }

    public Integer[] getSortedArray() {
        CustomArray arr = new CustomArray();
        recListInOrder(head, arr);
        return arr.getArray();
    }

    private void recList(Node node) {
        System.out.println(node.value);
        if (node.left != null) {
            recList(node.left);
        }
        if (node.right != null) {
            recList(node.right);
        }
    }

    private CustomArray recList(Node node, CustomArray arr) {
        arr.add(node.value);

        if (node.left != null) {
            recList(node.left, arr);
        }
        if (node.right != null) {
            recList(node.right, arr);
        }
        return arr;
    }

    private CustomArray recListInOrder(Node node, CustomArray arr) {
        // System.out.println(Arrays.toString(arr.getArray()));

        if (node.right == null && node.left == null)
            arr.add(node.value);
        else {
            if (node.left != null) {
                recListInOrder(node.left, arr);
                arr.add(node.value);
                if (node.right != null) {
                    recListInOrder(node.right, arr);
                }

            } else if (node.right != null) {
                arr.add(node.value);
                recListInOrder(node.right, arr);
            }

        }

        return arr;
    }

    public int getSize() {
        return size;
    }

}
