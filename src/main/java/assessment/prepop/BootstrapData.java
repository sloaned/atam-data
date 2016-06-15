package assessment.prepop;

import assessment.entities.FCMToken;
import assessment.repositories.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dsloane on 6/14/2016.
 */
@Component
@EnableConfigurationProperties(BootstrapDataProperties.class)
public class BootstrapData {

    @Autowired(required=false)
    private BootstrapDataProperties properties;

    @Autowired
    private TokenRepository tokenRepository;

    @PostConstruct
    public void dataInsertion() {

        if (properties.getTokens()) {
            tokenRepository.deleteAll();
            List<FCMToken> tokenList = getTestTokens();
            tokenRepository.save(tokenList);
        }
    }

    public List<FCMToken> getTestTokens() {

        System.out.println("getting test tokens");
        List<FCMToken> tokens = new ArrayList<FCMToken>();

        FCMToken token = new FCMToken();
        token.setUserId("572bd0acd4fa346634ead4fe");
        String token1 = "yo I'm a token";
        ArrayList<String> userTokens = new ArrayList<String>();
        userTokens.add(token1);
        token.setTokens(userTokens);
        tokens.add(token);


        return tokens;
    }
}
