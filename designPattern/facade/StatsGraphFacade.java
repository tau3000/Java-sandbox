package facade;

import java.util.List;

public class StatsGraphFacade {

    public static void serch() {
        final StatsDataSearch statsDataSearch = new StatsDataSearch();
        final CachedProperties cachedStatsData = statsDataSearch.search("国債");

        final ParseCache parseCache = new ParseCache(cachedStatsData);
        final List<Integer> statsData = parseCache.parse();

        final GraphWriter graphWriter = new GraphWriter();
        graphWriter.write(statsData);
        graphWriter.view();
    }

}
