package assessment.entities;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by dsloane on 6/13/2016.
 */
public class FCMToken {

    @Id
    private String id;
    @NotNull(message="User id is required")
    private String userId;
    private List<String> tokens;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
    public List<String> getTokens() { return tokens; }
    public void setTokens(List<String> tokens) { this.tokens = tokens; }
}
