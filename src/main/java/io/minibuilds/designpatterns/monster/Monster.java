package io.minibuilds.designpatterns.monster;

import io.minibuilds.designpatterns.builder.MonsterBuilder;

public interface Monster {
  String getName();
  MonsterBuilder.Type getType();
  MonsterBuilder.Weapon getWeapon();
  void greet();
}
