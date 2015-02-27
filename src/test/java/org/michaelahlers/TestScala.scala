package org.michaelahlers

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import scala.collection.mutable.Stack
import org.junit.Test
import org.junit.runner.RunWith;
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class TestScala extends FlatSpec with Matchers {

  
  "A Stack" should "pop values in last-in order" in {
    val stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    
    stack.pop() should be (2)
    stack.pop() should be (1)
  }
  
}