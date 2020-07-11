package com.creational.factorymethod;

/**
 * LifeTimeMember class is ConcreteProduct. The ConcreteProduct class implements the Product
 * interface.
 *
 * @author suraj dhamecha
 */
public class LifeTimeMember implements Member {
  @Override
  public void registerMember() {
    System.out.println("LifeTimeMember->regiterMember()");
  }

  @Override
  public void notifyMember() {
    System.out.println("LifeTimeMember->notifyMember()");
  }
}
