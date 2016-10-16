package composite;

import lombok.Getter;

public class File implements DirectoryEntry {
    @Getter private String name;

    public File(String name) {
        this.name = name;
    }

    public void remove() {
        // do nothing
    }
}
