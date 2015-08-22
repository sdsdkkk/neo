package com.github.sdsdkkk.neo.matrix

import com.github.sdsdkkk.neo.matrix.TypeDef.MatrixLine

object Matrix {
  def add(a: Matrix, b: Matrix): Matrix = {
    ???
  }

  def subtract(a: Matrix, b: Matrix): Matrix = {
    ???
  }

  def multiply(a: Matrix, b: Matrix): Matrix = {
    ???
  }

  def divide(a: Matrix, b: Matrix): Matrix = {
    ???
  }
}

class Matrix(data: Vector[MatrixLine]) {
  val height = data.size
  val width = data.map(_.size).max

  def horizontalSplit: (Matrix, Matrix) = {
    ???
  }

  def verticalSplit: (Matrix, Matrix) = {
    ???
  }

  def inverse: Matrix = {
    ???
  }
}
