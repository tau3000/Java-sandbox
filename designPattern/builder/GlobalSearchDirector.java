package builder;

public class GlobalSearchDirector {
    private Builder builder;
    
    public GlobalSearchDirector(Builder builder) {
        this.builder = builder;
    }
    
    public void construct(){
        builder.makeFirstText();
        builder.makeLastText();
    }
}
