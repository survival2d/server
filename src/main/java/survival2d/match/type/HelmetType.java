package survival2d.match.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum HelmetType {
  LEVEL_0(0),
  LEVEL_1(10);
  final double reduceDamage;
}