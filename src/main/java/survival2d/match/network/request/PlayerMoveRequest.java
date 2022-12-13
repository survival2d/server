package survival2d.match.network.request;

import com.tvd12.ezyfox.binding.EzyReader;
import com.tvd12.ezyfox.binding.EzyUnmarshaller;
import com.tvd12.ezyfox.binding.annotation.EzyReaderImpl;
import lombok.Data;
import org.locationtech.jts.math.Vector2D;
import survival2d.util.serialize.GsonHolder;

@Data
public class PlayerMoveRequest {

  Vector2D direction;
  double rotation;

  @EzyReaderImpl
  public static class PlayerMoveRequestReader implements EzyReader<Object, PlayerMoveRequest> {

    @Override
    public PlayerMoveRequest read(EzyUnmarshaller ezyUnmarshaller, Object o) {
      return GsonHolder.getNormalGson().fromJson(o.toString(), PlayerMoveRequest.class);
    }
  }
}