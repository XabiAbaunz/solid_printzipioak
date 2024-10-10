package lsk;

public interface Loadable {
	
	public default void loadFile(String filePath){
		System.out.println("file loaded from "+filePath);
	}
	
}
