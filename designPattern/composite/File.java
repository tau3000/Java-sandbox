package composite;

public class File implements DirectoryEntry {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void remove() {
        // do nothing

        // 結果をわかりやすくするために必要
        System.out.println(name + ": 削除");
    }
}
