import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Channel {
    private int cid;
    private String cname;
    private String description;
}
