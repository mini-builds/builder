package io.minibuilds.designpatterns.monster.impl;

import io.minibuilds.designpatterns.builder.MonsterBuilder;
import io.minibuilds.designpatterns.monster.Monster;

public class StandardMonster implements Monster {
  private final String name;
  private final MonsterBuilder.Type type;
  private final MonsterBuilder.Weapon weapon;

  public StandardMonster(String name, MonsterBuilder.Type type, MonsterBuilder.Weapon weapon) {
    this.name = name;
    this.type = type;
    this.weapon = weapon;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public MonsterBuilder.Type getType() {
    return type;
  }

  @Override
  public MonsterBuilder.Weapon getWeapon() {
    return weapon;
  }

  @Override
  public void greet() {
    System.out.println( "Hi I'm " + name +
        " the " + type.toString().toLowerCase() +
        " carrying my trusty " + weapon.toString().toLowerCase());
  }
}
