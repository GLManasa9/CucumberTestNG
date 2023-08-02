package cucumber;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ScenarioContext {
    private final Map<Context,Object> scenarioContext;

    public ScenarioContext() {
        this.scenarioContext = new ConcurrentHashMap<>();
    }

    public void setScenarioContext(Context key, Object value) {
        scenarioContext.put(key,value);
    }

    public boolean isContains(Context key){
        return scenarioContext.containsKey(key);
    }

    public Object getContext(Context key){
        return scenarioContext.get(key);
    }
}