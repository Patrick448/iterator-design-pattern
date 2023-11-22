package filesystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileSystemTest {

    @Test
    void deveRetornarNumArquivos(){
        FileSystem fs = FileSystem.getInstance();
        fs.reset();
        Folder root = fs.getRoot();
        root.setName("C:");
        Folder folder1 = new Folder("folder1");
        Folder folder2 = new Folder("folder2");
        File file1 = new File("file1");
        File file2 = new File("file2");
        File file3 = new File("file3");
        folder2.add(file1);
        folder2.add(file2);
        folder2.add(file3);
        folder1.add(folder2);
        root.add(folder1);

        assertEquals(3, fs.countFilesRecursively(root));

    }

    @Test
    void deveRetornarZeroArquivos(){
        FileSystem fs = FileSystem.getInstance();
        fs.reset();
        Folder root = fs.getRoot();
        root.setName("C:");
        Folder folder1 = new Folder("folder1");
        Folder folder2 = new Folder("folder2");
        folder1.add(folder2);
        root.add(folder1);
        assertEquals(0, fs.countFilesRecursively(root));

    }

    @Test
    void deveRetornarUmArquivo(){
        FileSystem fs = FileSystem.getInstance();
        fs.reset();
        Folder root = fs.getRoot();
        root.setName("C:");
        Folder folder1 = new Folder("folder1");
        Folder folder2 = new Folder("folder2");
        File file1 = new File("file1");
        folder2.add(file1);
        folder1.add(folder2);
        root.add(folder1);
        assertEquals(1, fs.countFilesRecursively(root));

    }

}