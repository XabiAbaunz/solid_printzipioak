package lsk;

public class Main {

	public static void main(String[] args) {
		Project project = new Project();
		project.addProjectReadOnly(new ReadOnlyProjectFile("/ro"));
		project.addProjectReadWrite(new ReadWriteProjectFile("/rw"));
		
		project.loadAllFiles();
		
		project.storeAllFiles();

	}

}
