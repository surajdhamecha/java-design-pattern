package com.creational.factorymethod;

public class FactoryMethodDemo {
  public static void main(String[] args) {
    MemberShipManager memberShipManager = new AhmedabadBranch();
    Member member = memberShipManager.createMemberShip("temp");
    member.registerMember();
    member.notifyMember();
  }
}
