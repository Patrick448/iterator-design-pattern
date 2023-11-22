package filesystem;

public interface IFile {

    public String getName();
    public String getPath();
    public void setName(String name);

    public String getContent();
    public void setParent(Folder parent);
}
