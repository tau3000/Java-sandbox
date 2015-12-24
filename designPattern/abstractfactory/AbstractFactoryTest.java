package abstractfactory;

import java.lang.System;

public class AbstractFactoryTest{
    public void test(){
        System.out.println("AbstractFactory Test");

        Anime anime = new Anime("あの日見た花の名前を僕達はまだ知らない");
        AnimeFactory animeFactory = new AnoHanaFactory();
        anime.addLeadingActor(animeFactory.getLeadingActor());
        anime.addSupportingActor(animeFactory.getSupportingActor());
        anime.introduce();

        Anime anime2 = new Anime("新世紀エヴァンゲリオン");
        AnimeFactory animeFactory2 = new EvaFactory();
        anime2.addLeadingActor(animeFactory2.getLeadingActor());
        anime2.addSupportingActor(animeFactory2.getSupportingActor());
        anime2.introduce();
    }
}
