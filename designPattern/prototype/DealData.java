package prototype;

public abstract class DealData implements Cloneable {
    public abstract String getFormattedData(int value);

    public abstract DealData createClone();
}
