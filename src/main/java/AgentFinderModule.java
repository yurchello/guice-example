import com.google.inject.AbstractModule;

/**
 * Created by mezentsev.y on 12/29/2015.
 */
public class AgentFinderModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(AgentFinder.class).to(WebServiceAgentFinder.class);
    }
}
