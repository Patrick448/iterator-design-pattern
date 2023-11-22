package filesystem;

public class FileSystem {
    private static FileSystem instance = new FileSystem();
    private Folder root;

    private FileSystem() {
        root = new Folder("root");
    }

    public void reset(){
        root = new Folder("root");
    }

    public static FileSystem getInstance() {
        return instance;
    }

    public Folder getRoot() {
        return root;
    }

    public int countFilesRecursively(Folder folder){
        int count =0;

        for(IFile file : folder){
            if(file instanceof Folder){
                count += countFilesRecursively((Folder) file);
            }else{
                count++;
            }
        }
        return count;
    }
}
