import com.google.inject.Inject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mezentsev.y on 12/29/2015.
 */
public class HollywoodServiceGuice {
    private AgentFinder finder = null;

    @Inject
    public  HollywoodServiceGuice(AgentFinder finder){
        this.finder = finder;
    }

    public List<Agent> getFriendlyAgents(){
        List<Agent> agents = finder.findAllAgents();
        List<Agent> friendlyAgents = filterAgents(agents, "Java developer");
        return friendlyAgents;
    }

    public List<Agent> filterAgents(List<Agent> agents, String agentType){
        List<Agent> filterAgents = new ArrayList<Agent>();
        for(Agent agent:agents){
            if (agent.getType().equals("Java developer")){
                filterAgents.add(agent);
            }
        }
        return filterAgents;
    }
}
