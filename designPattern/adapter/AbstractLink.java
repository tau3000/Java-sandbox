package adapter;

abstract class AbstractLink {

    protected String urlTemplate;

    protected String resultLink;

    public AbstractLink(String template) {
        urlTemplate = template;
    }

    public void setLink(String endLink) {
        resultLink = createLink(endLink);
    }

    public String getLink() {
        return resultLink;
    }

    abstract String createLink(String endLink);
}
