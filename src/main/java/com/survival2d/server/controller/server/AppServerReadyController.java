package com.survival2d.server.controller.server;

import com.tvd12.ezyfox.core.annotation.EzyEventHandler;
import com.tvd12.ezyfoxserver.constant.EzyEventNames;
import com.tvd12.ezyfoxserver.context.EzyAppContext;
import com.tvd12.ezyfoxserver.controller.EzyAbstractAppEventController;
import com.tvd12.ezyfoxserver.event.EzyServerReadyEvent;

@EzyEventHandler(event = EzyEventNames.SERVER_READY)
public class AppServerReadyController
    extends EzyAbstractAppEventController<EzyServerReadyEvent> {

  @Override
  public void handle(EzyAppContext ctx, EzyServerReadyEvent event) {
    logger.info("SURVIVAL2D APP - SERVER READY");
    logger.trace("SURVIVAL2D APP - SERVER READY");
  }
}