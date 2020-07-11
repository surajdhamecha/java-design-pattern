package com.creational.factorymethod;

/**
 * TempMember class is ConcreteProduct. The ConcreteProduct class implements the Product interface.
 *
 * @author suraj dhamecha
 */
public class TempMember implements Member {

  @Override
  public void registerMember() {
    System.out.println("TempMember->registerMember()");
  }

  @Override
  public void notifyMember() {
    System.out.println("TempMember->notifyMember()");
  }
}
