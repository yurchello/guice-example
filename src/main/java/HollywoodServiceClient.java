import com.google.inject.Guice;
import com.google.inject.Injector;

import java.util.List;

/**
 * Created by mezentsev.y on 12/29/2015.
 */
public class HollywoodServiceClient {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AgentFinderModule());
        HollywoodServiceGuice hollywoodService = injector.getInstance(HollywoodServiceGuice.class);
        List<Agent> agents = hollywoodService.getFriendlyAgents();
        for (Agent agent: agents){
            System.out.println(agent.getType());
        }

    }
}
