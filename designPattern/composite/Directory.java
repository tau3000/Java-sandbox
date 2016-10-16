package composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements DirectoryEntry {
    private List<DirectoryEntry> list;
    private String name;

    public Directory(String name) {
        this.name = name;
        list = new ArrayList<DirectoryEntry>();
    }

    public void add(DirectoryEntry entry) {
        list.add(entry);
    }

    public void remove() {
        if (list == null) {
            System.out.println(name + ": 削除");
            return;
        }
        list.stream().forEach(e -> {
            e.remove();
        });
        // リストを空にする
        list = null;

        // 結果をわかりやすくするために必要
        System.out.println(name + ": 削除");
    }
}
