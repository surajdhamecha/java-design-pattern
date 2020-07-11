package com.creational.factorymethod;

/**
 * BarodaBranch class is ConcreteCreator. The ConcreteCreator class implements the Creator’s factory
 * method. returns an instance of the ConcreteProduct.
 *
 * @author suraj dhamecha
 */
public class BarodaBranch extends MemberShipManager {
  @Override
  protected Member createMemberShip(String type) {
    Member returnMember;
    switch (type) {
      case "lifetime":
        returnMember = new LifeTimeMember();
        break;
      case "temp":
        returnMember = new TempMember();
        break;
      default:
        throw new IllegalArgumentException("does not find membership");
    }
    return returnMember;
  }
}
