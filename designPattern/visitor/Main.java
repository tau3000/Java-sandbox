package visitor;

public class Main {

    public static void main(String[] args) {
        System.out.println("準備");
        BaseCurrency jpy = new BaseCurrency("日本円(JPY)");
        Region region = new Region("北米");
        CurrencyConversion cad = new CurrencyConversion("加ドル(CAD)");
        CurrencyConversion usd = new CurrencyConversion("米ドル(USD)");
        jpy.add(region);
        region.add(cad);
        region.add(usd);

        System.out.println("開始");
        cad.checked();
        jpy.accept(new DisplayVisitor());
    }

}
