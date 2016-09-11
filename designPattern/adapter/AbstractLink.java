package adapter;

abstract class AbstractLink {

    protected String urlTemplate;

    protected String resultLink;

    public AbstractLink(DayIds id, String template) {
        urlTemplate = template;
    }

    public void setLink(DayIds id) {
        resultLink = createLink(id);
    }

    public String getLink() {
        return resultLink;
    }

    abstract String createLink(DayIds id);

}
