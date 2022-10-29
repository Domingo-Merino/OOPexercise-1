 class Bicycle
{
	private String ownerName;
	private String tagNo;
	private String id;
	
	public Bicycle(){
		ownerName = "Unassigned";
		id = "XXX - XXX";
		tagNo = "Unknown";
	
	}	
	public Bicycle(String tagNo,String name){
		this.id = tagNo;
	    ownerName = name;
	}	
		    
	public String getOwnerName(){
		return ownerName;
	}
	public void setOwnerName (String name){
		ownerName = name;
	}
	public String getTagNo(){
	  return tagNo;
	  }
	  public void setTagNo(String tag){
		  tagNo = tag;
	  }
	  
}
