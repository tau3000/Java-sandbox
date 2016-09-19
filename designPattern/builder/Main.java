package builder;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String keyword;
        // keywordを取得したとする
        keyword = "ABC Company";

        final JsonTextBuilder jsonTextBuilder = new JsonTextBuilder();
        GlobalSearchDirector director1 = new GlobalSearchDirector(jsonTextBuilder);
        director1.construct();
        final List<String> result1 = jsonTextBuilder.getResult();
        System.out.println(result1.get(0) + keyword + result1.get(1));

        final ResultTextBuilder resultTextBuilder = new ResultTextBuilder();
        GlobalSearchDirector director2 = new GlobalSearchDirector(resultTextBuilder);
        director2.construct();
        final List<String> result2 = resultTextBuilder.getResult();
        System.out.println(result2.get(0) + keyword + result2.get(1));
    }

}
