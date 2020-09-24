package tests

import model.game_objects.Platform
import org.scalatest._
import physics.objects.{DynamicObject, GameObject, StaticObject}

class TestCollisions extends FunSuite {


  test("Tests for accurate collision detection between two objects") {
    var GameObj1: GameObject = new GameObject((1.0, 1.0, 1.0), 1.0,1.0, 1.0)
    var GameObj2: GameObject = new GameObject((1.0, 2.0, 2.0), (1.0, 1.0, 1.0)
      assert()
    }
  test("Test for accurate collision between objects"){
    var GameObj3: GameObject = new GameObject((-1.0, -2.0, -3.0), (1.0, 2.0, 3.0)
    var GameObj4: GameObject = new GameObject((0.0, 0.0, 0.0), (3.0, 2.5, 1.0)
      assert()
  }
  test("Test for accurate collision between objects"){
    var GameObj5: GameObject = new GameObject((3.0, 4.0, 0.0), (0.1, 0.1, 5.0)
    var GameObj6: GameObject = new GameObject((2.0, 2.0, 4.5),(1.5, 2.5, 0.1)
      assert()
  }
  test("Check the object’s previous location, current location, velocity"){
    var DyGameObj1: DynamicObject = new DynamicObject((2.0, 2.0, 0.1), (1.0, 1.0, 1.0))
      DyGameObj1.velocity = 1.0, 2.0, 1.0
    assert()
  }
  test ("Checks that a player will land on a platform"){
    var StatObj: StaticObject = new StaticObject((0.0, 0.0, 0.0), (1.0, 1.0, 1.0)
    var DyGameObj2: DynamicObject = new DynamicObject((0.5, 0.5, 0.9), (1.0, 1.0, 1.0)
      assert()
  }
  test("For each of these test cases you should call “checkStaticCollision"){
    var StatObj2: StaticObject = new StaticObject((0.0, 0.0, 0.0), (1.0, 1.0, 1.0)
    var DyGameObj3: DynamicObject = new DynamicObject((-0.9, -0.4, 0.3), (1.0, 1.0, 1.0)
      assert()
  }
}
