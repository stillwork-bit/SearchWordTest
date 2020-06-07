package SearchWord;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SearchWord extends ReadFile {
    private Map<String, Integer> CompasionList = new HashMap<String, Integer>();

    public Map<String, Integer> getCompasionList() {
        return CompasionList;
    }

    public JSONObject Compasion(List name, List wordBook) throws JsonProcessingException {
        Map<String, Integer> CompasionList = new HashMap<String, Integer>();
        JSONObject jsonObject = new JSONObject();
        int count;
        for (Object keyName : name) {
            count = 0;
            for (Object keyWordBook : wordBook) {
                if (keyName.equals(keyWordBook)) {
                    count++;
                    CompasionList.put((String) keyName, count);
                    jsonObject.put((String) keyName, count);
                }
            }
        }
        return jsonObject;
    }
}