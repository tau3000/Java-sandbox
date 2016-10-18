package composite;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

public class Directory implements DirectoryEntry {
    private List<DirectoryEntry> list;
    @Getter private String name;

    public Directory(String name) {
        this.name = name;
        list = new ArrayList<DirectoryEntry>();
    }

    public void add(DirectoryEntry entry) {
        list.add(entry);
    }

    public void remove() {
        System.out.println(name + "\t: 削除");
        if (list == null) {
            return;
        }
        list.stream().forEach(e -> {
            e.remove();
            // 結果をわかりやすくするために必要
            System.out.println(e.getName() + "\t: 削除");
        });
        // リストを空にする
        list = null;
    }
}
