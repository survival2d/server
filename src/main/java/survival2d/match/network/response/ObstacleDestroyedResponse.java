package survival2d.match.network.response;

import com.tvd12.ezyfox.binding.annotation.EzyObjectBinding;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@EzyObjectBinding
public class ObstacleDestroyedResponse {

  private long obstacleId;
}