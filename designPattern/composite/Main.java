package composite;

public class Main {
    public static void main(String[] args) {
        Directory dir1 = new Directory("dir1");
        dir1.add(new File("file1"));
        Directory dir2 = new Directory("dir2");
        dir2.add(new File("file2"));
        dir2.add(new File("file3"));
        dir1.add(dir2);
        dir1.add(new File("file4"));

        dir1.remove();
    }
}
