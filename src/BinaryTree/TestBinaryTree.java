package BinaryTree;

public class TestBinaryTree {

	public static void main(String[] args) {
		MyBinaryTree theTree = new MyBinaryTree();
		StudentInfo someStudent;

		someStudent = new StudentInfo(20, "Tweety", "Bird");
		theTree.addToTree(theTree.root, someStudent);

		someStudent = new StudentInfo(37, "Sylvester", "Cat");
		theTree.addToTree(theTree.root, someStudent);

		someStudent = new StudentInfo(50, "Bugs", "Bunny");
		theTree.addToTree(theTree.root, someStudent);

		someStudent = new StudentInfo(29, "Daffy", "Duck");
		theTree.addToTree(theTree.root, someStudent);

		someStudent = new StudentInfo(10, "Porky", "Pig");
		theTree.addToTree(theTree.root, someStudent);

		someStudent = new StudentInfo(5, "Road", "Runner");
		theTree.addToTree(theTree.root, someStudent);

		someStudent = new StudentInfo(15, "Wile E.", "Coyote");
		theTree.addToTree(theTree.root, someStudent);

		someStudent = new StudentInfo(45, "Foghorn", "Leghorn");
		theTree.addToTree(theTree.root, someStudent);

		someStudent = new StudentInfo(60, "Tasmanian", "Devil");
		theTree.addToTree(theTree.root, someStudent);

		someStudent = new StudentInfo(32, "Marvin", "Martian");
		theTree.addToTree(theTree.root, someStudent);

		someStudent = new StudentInfo(25, "Pepe", "Le Pew");
		theTree.addToTree(theTree.root, someStudent);

		someStudent = new StudentInfo(55, "Speedy", "Gonzales");
		theTree.addToTree(theTree.root, someStudent);

		someStudent = new StudentInfo(8, "Yosemite", "Sam");
		theTree.addToTree(theTree.root, someStudent);

		someStudent = new StudentInfo(40, "Elmer", "Fudd");
		theTree.addToTree(theTree.root, someStudent);

		someStudent = new StudentInfo(70, "Granny", "Bird");
		theTree.addToTree(theTree.root, someStudent);

		theTree.inOrder(theTree.root);
	}

}
