package lsk;

public interface Storable {
	
	public default void storeFile(String filePath){
		System.out.println("file saved to "+filePath);
	}
	
}
