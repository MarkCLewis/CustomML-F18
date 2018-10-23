package customml.clustering

class NVect(private val x: Seq[Double]) {
  def +(that: NVect) = new NVect((x, that.x).zipped.map(_+_))
  def -(that: NVect) = new NVect((x, that.x).zipped.map(_-_))
  def *(c: Double) = new NVect(x.map(_*c))
  def /(c: Double) = new NVect(x.map(_/c))
  def dim: Int = x.length

  def distSqr(that: NVect): Double = {
    (x, that.x).zipped.map((a, b) => (a-b)*(a-b)).sum
  }
  
  def dist(that: NVect): Double = {
    math.sqrt(this.distSqr(that))
  }
  
  override def toString(): String = {
    x.mkString("NVect(", ", ", ")")
  }
}

object KMeans {
  /**
   * Takes a sequence of N points and a k for the number of clusters.
   * Returns a sequence of k points for the centers and a sequence that maps the initial N points to the k centers.
   */
  def kMeans(data: Seq[NVect], k: Int): (Seq[NVect], Seq[Int]) = {
    ???
  }
  
}