package assessment.prepop;

import assessment.entities.FCMToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import assessment.repositories.TokenRepository;

import java.util.List;

/**
 * Created by dsloane on 6/14/2016.
 */
@RestController
public class TestDataController {

    @Autowired
    TokenRepository tokenRepo;

    @Autowired BootstrapData bootstrapData;

    public void setTokenRepo(TokenRepository tokenRepo) { this.tokenRepo = tokenRepo; }

    @RequestMapping(value="/testDataInsert", method= RequestMethod.POST)
    public boolean insertTestData() {
        boolean success = false;

        tokenRepo.deleteAll();

        success = insertTokenData();

        return success;
    }

    private boolean insertTokenData() {
        boolean success = true;

        List<FCMToken> tokenList = bootstrapData.getTestTokens();
        if (tokenList.isEmpty()) {
            return false;
        }

        success = !tokenRepo.save(bootstrapData.getTestTokens()).isEmpty();

        return success;
    }
}
