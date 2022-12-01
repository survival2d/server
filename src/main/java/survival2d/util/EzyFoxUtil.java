package survival2d.util;

import com.tvd12.ezyfox.bean.annotation.EzyAutoBind;
import com.tvd12.ezyfox.bean.annotation.EzyConfigurationAfter;
import com.tvd12.ezyfox.bean.annotation.EzySingleton;
import com.tvd12.ezyfoxserver.support.factory.EzyResponseFactory;
import lombok.AllArgsConstructor;
import lombok.Getter;

@EzySingleton
@AllArgsConstructor
@EzyConfigurationAfter
public class EzyFoxUtil {

  @Getter @EzyAutoBind private static EzyFoxUtil instance;
  //  @Getter @EzyAutoBind private MatchingService matchingService;

  @Getter @EzyAutoBind private final EzyResponseFactory responseFactory;
}