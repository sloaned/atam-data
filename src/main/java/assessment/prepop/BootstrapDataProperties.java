package assessment.prepop;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by dsloane on 6/14/2016.
 */
@ConfigurationProperties(prefix="bootstrapping")
public class BootstrapDataProperties {

    private boolean tokens;

    public boolean getTokens() { return tokens; }

    public void setTokens(boolean tokens) { this.tokens = tokens; }
}
