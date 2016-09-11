package adapter;

abstract class AbstractLink {

    protected String urlTemplate;

    protected String resultLink;

    public AbstractLink(String id, String template) {
        urlTemplate = template;
    }

    public void setLink(String id) {
        resultLink = createLink(id);
    }

    public String getLink() {
        return resultLink;
    }

    abstract String createLink(String id);

}
