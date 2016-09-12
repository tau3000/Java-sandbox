package templatemethod;

public abstract class AbstractFullDescriptionLogic {
    public abstract String remove(String target);
    
    public abstract String replace(String target);

    public String editName(String name) {
        String removedName = remove(name);
        String result = replace(removedName);
        return result;
    }
}
