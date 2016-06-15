package assessment.repositories;

import assessment.entities.FCMToken;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by dsloane on 6/13/2016.
 */
@RepositoryRestResource(path="/tokens", collectionResourceRel = "tokens")
public interface TokenRepository extends MongoRepository<FCMToken, String> {


}
