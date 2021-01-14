package io.minibuilds.designpatterns.builder;

import io.minibuilds.designpatterns.monster.Monster;

public interface MonsterBuilder {
  enum Status {NONE, ENCHANTED}

  MonsterBuilder name(String name);
  MonsterBuilder type(Monster.Type type);
  MonsterBuilder weapon(Monster.Weapon weapon);
  MonsterBuilder status(Status status);

  Monster build();
}
