package com.survival2d.server.game.entity.base;

import lombok.ToString;
import lombok.Value;

@Value
@ToString
public class Circle implements Shape {
  //Không chứa Position do đã nằm trong MapObject rồi

  double radius;
}
