package lsk;

public class ReadOnlyProjectFile extends ProjectFile implements Loadable{
	
	public ReadOnlyProjectFile(String filePath) {
		super(filePath);
	}
	
}