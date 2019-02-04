package com.epam.game.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class PortalSettings {

  public static PortalSettings DEFAULT = PortalSettings.builder().build();

  private double openFactorForTick;
  private double planetQuantityFactor;
}
