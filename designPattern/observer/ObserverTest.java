package observer;

public class ObserverTest{
    public void test(){
        System.out.println("Observer Test");

        JK jk = new JK();

        //おまわりさんが変態見たら通報してねと頼む
        OmawaListener omawarisan = new OmawaListener();
        jk.addObserver(omawarisan);

        OmawaListener omawarisan2 = new OmawaListener();
        jk.addObserver(omawarisan2);

        //変　態　出　没
        jk.hentaiShutsubotsu();

        //printfでクラス名が出てくることのテスト
        //System.out.printf("test:%s", jk);
    }
}

//参考
//http://d.hatena.ne.jp/backpaper0/20111111/1321012118