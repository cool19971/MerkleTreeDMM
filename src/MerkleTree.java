import TreePackage.BinaryTree;
import java.security.*;
import java.io.*;

public class MerkleTree extends DataBlock{
	
	private String leaf1;
	private String leaf2;
	private String leaf3;
	private String leaf4 = "";
	private String hashLeaf;
	private String hashLeaf2;
	private String hashLeaf3;
	
	public MerkleTree(){
	
	}
	
	public void hashData() throws Exception {
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		byte[] encodedhash = digest.digest();
		this.hashLeaf= (leaf1 + leaf2).getBytes().toString();
		this.hashLeaf2=(leaf3 + leaf4).getBytes().toString();
		this.hashLeaf3 = (hashLeaf2 + hashLeaf3).getBytes().toString();
		
		
	}
	
	public void createTree() {
		BinaryTree tree = new BinaryTree();
		BinaryTree tree2 = new BinaryTree();
		BinaryTree tree3 = new BinaryTree();
		BinaryTree tree4 = new BinaryTree();
		BinaryTree tree5 = new BinaryTree();
		BinaryTree tree6 = new BinaryTree();
		BinaryTree tree7 = new BinaryTree();
		tree.setTree(hashLeaf3,tree2, tree3);
		tree2.setTree(hashLeaf,tree4, tree5);
		tree3.setTree(hashLeaf2,tree6, tree7);
		tree4.setTree(leaf1);
		tree5.setTree(leaf2);
		tree6.setTree(leaf3);
		tree7.setTree(leaf4);
	}

	public String getLeaf1() {
		return leaf1;
	}

	public void setLeaf1(String leaf1) {
		this.leaf1 = leaf1;
	}

	public String getLeaf2() {
		return leaf2;
	}

	public void setLeaf2(String leaf2) {
		this.leaf2 = leaf2;
	}

	public String getLeaf3() {
		return leaf3;
	}

	public void setLeaf3(String leaf3) {
		this.leaf3 = leaf3;
	}

	public String getLeaf4() {
		return leaf4;
	}

	public void setLeaf4(String leaf4) {
		this.leaf4 = leaf4;
	}
	
	
}
