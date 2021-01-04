package io.minibuilds.designpatterns.builder;

import io.minibuilds.designpatterns.monster.Monster;

public interface MonsterBuilder {
  enum Type {UNKNOWN, CYCLOPES, MANTICORE}
  enum Weapon {NONE, SWORD, BOW}
  enum Status {NONE, ENCHANTED}

  MonsterBuilder name(String name);
  MonsterBuilder type(Type type);
  MonsterBuilder weapon(Weapon weapon);
  MonsterBuilder status(Status status);

  Monster build();
}
