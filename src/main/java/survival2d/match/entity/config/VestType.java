package survival2d.match.entity.config;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum VestType {
  LEVEL_0(0),
  LEVEL_1(10);
  final double reduceDamage;
}
