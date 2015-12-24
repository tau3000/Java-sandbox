package composite;

public class CompositeTest{
    public void test(){
        System.out.println("Composite Test");

        File file1 = new File("file1");
        File file2 = new File("file2");
        File file3 = new File("file3");
        File file4 = new File("file4");
        SymbolicLink link1 = new SymbolicLink("symbolic_link1");
        SymbolicLink link2 = new SymbolicLink("symbolic_link2");
        Directory dir1 = new Directory("dir1");
        dir1.add(file1);
        dir1.add(link1);
        Directory dir2 = new Directory("dir2");
        dir2.add(file2);
        dir2.add(file3);
        dir2.add(link2);
        dir1.add(dir2);
        dir1.add(file4);

        dir1.remove();
    }
}