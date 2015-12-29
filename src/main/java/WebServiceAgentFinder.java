import java.util.List;

/**
 * Created by mezentsev.y on 12/29/2015.
 */
public class WebServiceAgentFinder implements AgentFinder {
    public List<Agent> findAllAgents() {
        return AgentsDB.getAgents();
    }
}
