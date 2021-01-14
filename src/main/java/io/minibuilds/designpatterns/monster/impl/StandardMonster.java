package io.minibuilds.designpatterns.monster.impl;

import io.minibuilds.designpatterns.monster.Monster;

public class StandardMonster implements Monster {
  private final String name;
  private final Type type;
  private final Weapon weapon;

  public StandardMonster(String name, Type type, Weapon weapon) {
    this.name = name;
    this.type = type;
    this.weapon = weapon;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Type getType() {
    return type;
  }

  @Override
  public Weapon getWeapon() {
    return weapon;
  }

  @Override
  public void greet() {
    System.out.println( "Hi I'm " + name +
        " the " + type.toString().toLowerCase() +
        " carrying my trusty " + weapon.toString().toLowerCase());
  }
}
