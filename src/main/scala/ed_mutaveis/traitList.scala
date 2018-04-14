package ed_mutaveis

trait traitList[T] {
  def isEmpty: Boolean
  def size: Int
  def insertAt(pos: Int, value: T): Boolean
  def insert(value: T): Unit
  def removeAt(pos: Int): Boolean
  def remove(value: T): Boolean
  def elementAt(pos: Int): Option[T]
  def find(value: T): Option[Int]
  def sort: Unit
  def reverse: Unit
  def count(value: T): Int
  def clear: Unit
  def removeIf(func:(T) => Boolean): Boolean
  def show: Unit //A princípio mostrar os elementos, como um print. Depois pensar em retornar todos em uma lista.
}
