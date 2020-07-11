package com.creational.factorymethod;

/**
 * MembershipManager is abstract class seem like creator (Abstract Creator). The Creator abstract
 * class declares the factory method interface. The Creator class declares the factory method that
 * returns new product objects. It’s important that the return type of this method matches the
 * product interface. Here we can declare the factory method as abstract to force all subclasses to
 * implement their own versions of the method. As an alternative, the base factory method can return
 * some default product type.
 *
 * @author suraj dhamecha
 */
public abstract class MemberShipManager {
  protected abstract Member createMemberShip(String type);
}
