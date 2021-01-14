package io.minibuilds.designpatterns.builder.impl;

import io.minibuilds.designpatterns.monster.Monster;
import io.minibuilds.designpatterns.monster.impl.EnchantedMonster;
import io.minibuilds.designpatterns.monster.impl.StandardMonster;
import io.minibuilds.designpatterns.builder.MonsterBuilder;

public class DefaultMonsterBuilder implements MonsterBuilder {
  private String name = "Unknown";
  private Monster.Type type = Monster.Type.UNKNOWN;
  private Monster.Weapon weapon = Monster.Weapon.NONE;
  private MonsterBuilder.Status status = Status.NONE;

  @Override
  public MonsterBuilder name(String name) {
    this.name = name;
    return this;
  }

  @Override
  public MonsterBuilder type(Monster.Type type) {
    this.type = type;
    return this;
  }

  @Override
  public MonsterBuilder weapon(Monster.Weapon weapon) {
    this.weapon = weapon;
    return this;
  }

  @Override
  public MonsterBuilder status(Status status) {
    this.status = status;
    return this;
  }

  @Override
  public Monster build() {
    if (status == Status.ENCHANTED) {
      return new EnchantedMonster(name, type, weapon);
    }
    return new StandardMonster(name, type, weapon);
  }
}
