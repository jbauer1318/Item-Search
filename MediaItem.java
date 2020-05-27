
public abstract class MediaItem extends Item {
	
	private int runtime;
	
	public MediaItem(){
		super();
		runtime = 0;
	}
	
	public MediaItem(int idNum, String title, int copies, int a){
		super(idNum,title,copies);
		runtime = a;
	}
	
	public int getRuntime(){
		return runtime;
	}
	
	public void setRuntime(int x){
		runtime = x;
	}
	
	public String toString(){
		return super.toString() + " Runtime: " + runtime;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof MediaItem) {
			MediaItem i = (MediaItem) obj;
			return super.equals(i) && runtime == i.runtime;
		}
		else
			return false;
	}
	
	public void print(){
		super.print();
		System.out.println("Runtime: " + runtime + " minutes");
	}

}
