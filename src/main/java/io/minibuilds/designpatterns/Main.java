package io.minibuilds.designpatterns;

import io.minibuilds.designpatterns.builder.MonsterBuilder;
import io.minibuilds.designpatterns.builder.impl.DefaultMonsterBuilder;
import io.minibuilds.designpatterns.monster.Monster;

public class Main {

  private static MonsterBuilder builder() {
    return new DefaultMonsterBuilder();
  }

  public static void main(String[] args) {
    System.out.println("After entering a regular forest you hear from the bushes");

    Monster barry = builder().name("Barry").type(Monster.Type.CYCLOPES).weapon(Monster.Weapon.SWORD).build();
    Monster sally = builder().name("Sally").type(Monster.Type.MANTICORE).weapon(Monster.Weapon.BOW).build();

    barry.greet();
    sally.greet();

    System.out.println();
    System.out.println("Naturally you ignore these bush dwelling weirdos and proceed to the enchanted forest where from the bushes you hear");

    Monster jammy = builder().name("Jammy").type(Monster.Type.CYCLOPES).weapon(Monster.Weapon.SWORD).status(MonsterBuilder.Status.ENCHANTED).build();
    Monster becca = builder().name("Becca").type(Monster.Type.MANTICORE).weapon(Monster.Weapon.BOW).status(MonsterBuilder.Status.ENCHANTED).build();

    jammy.greet();
    becca.greet();
  }

}
