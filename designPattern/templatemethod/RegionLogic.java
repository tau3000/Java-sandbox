package templatemethod;

import java.util.HashMap;
import java.util.Map;

public class RegionLogic extends AbstractFullDescriptionLogic {

    @Override
    public String remove(String target) {
        final int index = target.indexOf(": ");
        return target.substring(index + 2, target.length());
    }

    @Override
    public String replace(String target) {
        final Map<String, String> excludeWord = new HashMap<>();
        excludeWord.put("1000", " 1,000");
        excludeWord.put(",USD", ", USD");
        String result = target;
        for (String key : excludeWord.keySet()) {
            result = result.replace(key, excludeWord.get(key));
        }
        return result;
    }
}
