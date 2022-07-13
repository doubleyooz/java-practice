package src.algorithms;

import java.util.NoSuchElementException;
import src.interfaces.BST_IF;
import src.utils.CustomArray;

public class BinarySearchTree implements BST_IF {
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

    public BinarySearchTree() {
        limit = -1;
    }

    public BinarySearchTree(int limit) {
        this.limit = limit;
    }

    Node head = new Node();
    private int size = 0, limit = -1;

    public int getHeadValue() {
        return head.value;
    }

    public void insert(int element) {
        if (limit > 0) {
            if (size < limit) {
                if (head.value == null)
                    head.value = element;
                else
                    recAdd(head, element);
                size++;
            }
        } else {
            if (head.value == null)
                head.value = element;
            else
                recAdd(head, element);
            size++;
        }

    }

    public boolean contains(int number) {
        return recContains(head, number);
    }

    public int countOccurrences(int number) {
        return recCountOccurrences(head, number);
    }

    public void deleteElement(int number) {
        recDelete(head, number);
    }

    public void list() {
        recList(head);
    }

    public int[] preOrder() {
        CustomArray arr = new CustomArray();
        recPreOrder(head, arr);
        return arr.getIntArray();
    }

    public int[] order() {
        CustomArray arr = new CustomArray();
        recInOrder(head, arr);
        return arr.getIntArray();
    }

    public int[] postOrder() {
        CustomArray arr = new CustomArray();
        recPostOrder(head, arr);
        return arr.getIntArray();
    }

    public Integer[] getSortedArray() {
        CustomArray arr = new CustomArray();
        recSortedList(head, arr);
        return arr.getArray();
    }

    public int getSize() {
        return size;
    }

    public int search(int value) {
        return recSearch(head, value);
    }

    public boolean isComplete() {
        return size == limit;
    }

    private void recDelete(Node node, int number) {

        if (number <= node.value) {
            if (node.left != null) {
                if (number == node.left.value) {

                    if (node.left.left != null && node.left.right != null) {

                        Node temp = getSmallerParentNode(node.left.right);
                        /*
                         * System.out.println(node.value);
                         * System.out.println(node.left.value);
                         * System.out.println(node.left.left.value);
                         * System.out.println(node.left.right.value);
                         * System.out.println(temp.value);
                         */
                        if (temp.left != null) {
                            node.left.value = temp.left.value;
                            temp.left = temp.left.right;

                        } else {
                            node.left.value = temp.value;
                            node.left.right = temp.right;
                            temp = null;
                        }

                    } else if (node.left.left != null) {
                        node.left = node.left.left;

                    } else if (node.left.right != null) {
                        node.left = node.left.right;

                    } else
                        node.left = null;
                    size--;
                } else
                    recDelete(node.left, number);

            }

        } else if (node.right != null) {

            if (number == node.right.value) {

                if (node.right.left != null && node.right.right != null) {
                    Node temp = getSmallerParentNode(node.right.right);

                    /*
                     * System.out.println(node.value);
                     * System.out.println(node.right.value);
                     * System.out.println(node.right.left.value);
                     * System.out.println(node.right.right.value);
                     * System.out.println(temp.value);
                     */

                    if (temp.left != null) {
                        node.right.value = temp.left.value;
                        // if(temp.left.right != null){
                        temp.left = temp.left.right;
                        // } else temp.left = null;
                    } else {
                        node.right.value = temp.value;
                        node.right.right = temp.right;
                        temp = null;
                    }

                } else if (node.right.left != null) {
                    node.right = node.right.left;

                } else if (node.right.right != null) {

                    node.right = node.right.right;
                } else
                    node.right = null;
                size--;
            } else {

                recDelete(node.right, number);
            }

        }

    }

    private int recSearch(Node node, int number) {
        if (number == node.value)
            return number;
        if (number <= node.value) {
            if (node.left != null)
                return recSearch(node.left, number);

        } else if (node.right != null)
            return recSearch(node.right, number);

        throw new NoSuchElementException();

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

    private int recCountOccurrences(Node node, int number) {
        int occurrences = 0;
        if (node.value == number)
            occurrences++;
        if (node.left != null) {
            occurrences += recCountOccurrences(node.left, number);
        }
        if (node.right != null) {
            occurrences += recCountOccurrences(node.right, number);
        }
        return occurrences;

    }

    private Node getSmallerChildNode(Node node) {
        if (node.left == null)
            return node;

        else
            return getSmallerChildNode(node.left);

    }

    private Node getSmallerParentNode(Node node) {
        if (node.left == null)
            return node;
        else if (node.left.left == null)
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

    private void recList(Node node) {
        System.out.println(node.value);
        if (node.left != null) {
            recList(node.left);
        }
        if (node.right != null) {
            recList(node.right);
        }
    }

    private CustomArray recPreOrder(Node node, CustomArray arr) {
        arr.add(node.value);

        if (node.left != null) {
            recPreOrder(node.left, arr);
        }
        if (node.right != null) {
            recPreOrder(node.right, arr);
        }
        return arr;
    }

    private CustomArray recPostOrder(Node node, CustomArray arr) {

        if (node.left != null) {
            recPostOrder(node.left, arr);
        }
        if (node.right != null) {
            recPostOrder(node.right, arr);
        }
        arr.add(node.value);
        return arr;
    }

    private CustomArray recInOrder(Node node, CustomArray arr) {

        if (node.left != null) {
            recInOrder(node.left, arr);
        }
        arr.add(node.value);
        if (node.right != null) {
            recInOrder(node.right, arr);
        }

        return arr;
    }

    private CustomArray recSortedList(Node node, CustomArray arr) {
        // System.out.println(Arrays.toString(arr.getArray()));

        if (node.right == null && node.left == null)
            arr.add(node.value);
        else {
            if (node.left != null) {
                recSortedList(node.left, arr);
                arr.add(node.value);
                if (node.right != null) {
                    recSortedList(node.right, arr);
                }

            } else if (node.right != null) {
                arr.add(node.value);
                recSortedList(node.right, arr);
            }

        }

        return arr;
    }

}
