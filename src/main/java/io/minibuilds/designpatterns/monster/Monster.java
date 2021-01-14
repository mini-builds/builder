package io.minibuilds.designpatterns.monster;


public interface Monster {
  enum Type {UNKNOWN, CYCLOPES, MANTICORE}
  enum Weapon {NONE, SWORD, BOW}

  String getName();
  Type getType();
  Weapon getWeapon();
  void greet();
}
