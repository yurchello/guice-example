import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by mezentsev.y on 12/29/2015.
 */
public class AgentsDB {

    public static List<Agent> getAgents() {
        return agents;
    }

    public static void setAgents(List<Agent> agents) {
        AgentsDB.agents = agents;
    }

    private static List<Agent>agents  = new  ArrayList();
    static {

        Agent a1 = new Agent();
        a1.setType("dev1");
        Agent a2 = new Agent();
        a2.setType("dev1");
        Agent a3 = new Agent();
        a3.setType("dev1");
        Agent a4 = new Agent();
        a4.setType("Java developer");
        Agent a5 = new Agent();
        a5.setType("Java developer");
        agents.add(a1);
        agents.add(a2);
        agents.add(a3);
        agents.add(a4);
        agents.add(a5);
    }
}
