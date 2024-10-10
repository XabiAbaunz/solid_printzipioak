package lsk;
import java.util.Vector;

public class Project {
	public Vector<ReadOnlyProjectFile> readOnlyFiles=new Vector<>();
	public Vector<ReadWriteProjectFile> readWriteFiles=new Vector<>();
	public void addProjectReadOnly(ReadOnlyProjectFile p){
		readOnlyFiles.add(p);
	}
	public void addProjectReadWrite(ReadWriteProjectFile p){
		readWriteFiles.add(p);
	}
	public void loadAllFiles(){
		for (ReadOnlyProjectFile f:readOnlyFiles)
			f.loadFile(f.filePath);
		for(ReadWriteProjectFile f:readWriteFiles)
			f.loadFile(f.filePath);
	}
	public void storeAllFiles(){
		for (ReadWriteProjectFile f:readWriteFiles)
			f.storeFile(f.filePath);
	}
}
