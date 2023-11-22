package filesystem;

public class File implements IFile{
    private String name;
    private String content;

    private Folder parent;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getPath() {
        String path = "";

        if (parent != null) {
            path = parent.getPath() + "/" + name;
        }else {
            path = this.name;
        }

        return path;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setParent(Folder parent) {
        this.parent = parent;
    }
}
