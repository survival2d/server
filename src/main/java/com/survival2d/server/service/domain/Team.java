package com.survival2d.server.service.domain;

import java.util.List;

public interface Team {
  public List<String> getPlayers();

  public void addPlayer(String username);

  public boolean removePlayer(String username);

  //  public Optional<String> getCaptain();
}