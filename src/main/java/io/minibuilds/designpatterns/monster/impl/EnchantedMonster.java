package io.minibuilds.designpatterns.monster.impl;

import io.minibuilds.designpatterns.builder.MonsterBuilder;

public class EnchantedMonster extends StandardMonster {

  public static final String YELLOW = "\033[0;33m";
  public static final String RESET = "\033[0m";

  public EnchantedMonster(String name, MonsterBuilder.Type type, MonsterBuilder.Weapon weapon) {
    super(name, type, weapon);
  }

  @Override
  public void greet() {
    System.out.println("Hi I'm " + getName() +
        " the " + YELLOW + "enchanted " + getType().toString().toLowerCase() + RESET +
        " carrying my trusty " + getWeapon().toString().toLowerCase());
  }
}
