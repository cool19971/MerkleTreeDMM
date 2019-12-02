public class DataBlock {
	
	private String data1;
	private String data2;
	private String data3;
	
	public DataBlock(){
	}

	public String getData1() {
		return data1;
	}

	public void setData1(String data1) throws Exception {
		this.data1 = data1;
	}

	public String getData2() {
		return data2;
	}

	public void setData2(String data2) {
		this.data2 = data2;
	}

	public String getData3() {
		return data3;
	}

	public void setData3(String data3) {
		this.data3 = data3;
	}
	
	public void createMerkleTree() throws Exception {
		MerkleTree tree = new MerkleTree();
		tree.setLeaf1(this.data1);
		tree.setLeaf2(this.data2);
		tree.setLeaf3(this.data3);
		tree.hashData();
		tree.createMerkleTree();
	}
		
	
}
