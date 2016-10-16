package composite;

public class Main {
    public static void main(String[] args) {
        Directory dir1 = new Directory("temp");
        dir1.add(new File("industries.dat"));
        Directory dir2 = new Directory("currency_dat");
        dir2.add(new File("jpn.dat"));
        dir2.add(new File("chn.dat"));
        dir1.add(dir2);
        dir1.add(new File("companies.dat"));

        dir1.remove();
    }
}
