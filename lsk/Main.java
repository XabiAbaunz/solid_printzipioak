package lsk;

public class Main {

	public static void main(String[] args) {
		Project project = new Project();
		project.addProject(new ReadOnlyProjectFile("/ro"));
		project.addProject(new WriteOnlyProjectFile("/wo"));
		project.addProject(new ReadWriteProjectFile("/rw"));

	}

}
