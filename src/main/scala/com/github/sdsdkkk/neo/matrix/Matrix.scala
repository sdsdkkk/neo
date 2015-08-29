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

  def matricize(d: Vector[MatrixLine]): Vector[MatrixLine] = {
    val width = d.map(_.size).max
    d.map(l =>
      if (l.size < width) {
        padding(l, width)
      } else {
        l
      }
    )
  }

  def padding(line: MatrixLine, width: Long): MatrixLine = {
    if (line.size < width)
      padding(line :+ 0.0, width)
    else
      line
  }
}

class Matrix(val data: Vector[MatrixLine]) {
  val height = data.size
  val width = data(0).size

  def horizontalSplit: (Matrix, Matrix) = {
    val splitPoint = height / 2
    val matrixA = data.take(splitPoint)
    val matrixB = data.takeRight(height - splitPoint)
    (new Matrix(matrixA), new Matrix(matrixB))
  }

  def verticalSplit: (Matrix, Matrix) = {
    val splitPoint = width / 2
    val splittedMatrix = data.map(l =>
      (l.take(splitPoint), l.take(width - splitPoint))
    )
    val matrices = splittedMatrix.foldLeft((Vector.empty[MatrixLine], Vector.empty[MatrixLine]))((a, b) =>
      (a._1 :+ b._1, a._2 :+ b._2)
    )
    (new Matrix(matrices._1), new Matrix(matrices._2))
  }

  def inverse: Matrix = {
    ???
  }
}
