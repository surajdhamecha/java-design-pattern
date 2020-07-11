package com.creational.factorymethod;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.Silent.class)
public class FactoryMethodTest {
  BarodaBranch barodaBranchMock;
  LifeTimeMember lifeTimeMemberMock;
  TempMember tempMemberMock;

  @Before
  public void setUp() {
    barodaBranchMock = mock(BarodaBranch.class);
    lifeTimeMemberMock = mock(LifeTimeMember.class);
    tempMemberMock = mock(TempMember.class);
  }

  @Test
  public void testBranchMembersip() throws Exception {
    when(barodaBranchMock.createMemberShip("temp")).thenReturn(tempMemberMock);
    MemberShipManager manager = new BarodaBranch();
    tempMemberMock.registerMember();
    tempMemberMock.notifyMember();
    Member expected = manager.createMemberShip("temp");
    expected.registerMember();
    expected.notifyMember();
    assertTrue(expected instanceof TempMember);
    verify(tempMemberMock, times(1)).registerMember();
    verify(tempMemberMock, times(1)).notifyMember();
  }

  @Test
  public void testBranchMemberShipException() {
    reset(barodaBranchMock);
    doThrow(IllegalArgumentException.class).when(barodaBranchMock).createMemberShip("");
    try {
      MemberShipManager manager = new BarodaBranch();
      Member expected = manager.createMemberShip("");
    } catch (IllegalArgumentException e) {
      assertEquals("does not find membership", e.getMessage());
      assertTrue(e.getMessage().contains("does not find membership"));
    }
  }
}
