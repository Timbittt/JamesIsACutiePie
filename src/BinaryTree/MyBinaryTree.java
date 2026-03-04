package BinaryTree;

public class MyBinaryTree {

    public StudentInfo root;
 
    public MyBinaryTree() {
        root = null;
    }

    public void addToTree(StudentInfo currentNode, StudentInfo itemToAdd) {
        if (root == null) {
            root = itemToAdd;
            return;
        }

        if (itemToAdd.studentNumber < currentNode.studentNumber) {
            if (currentNode.left == null) {
                currentNode.left = itemToAdd;
            } else {
                addToTree(currentNode.left, itemToAdd);
            }
        } else {
            if (currentNode.right == null) {
                currentNode.right = itemToAdd;
            } else {
                addToTree(currentNode.right, itemToAdd);
            } 
        }
    }

    public void inOrder(StudentInfo currentNode) {
        if(currentNode != null) {
            inOrder(currentNode.left);
            System.out.println(currentNode.studentNumber);
            inOrder(currentNode.right);
        }
    }
}