package survival2d.request;

import survival2d.model.Position;
import com.tvd12.ezyfox.binding.annotation.EzyObjectBinding;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EzyObjectBinding
public class SyncPositionRequest {

  private String gameName;
  private long gameId;
  private int objectId;
  private String objectName;
  private int objectType;
  private boolean visible;
  private Position position;
}