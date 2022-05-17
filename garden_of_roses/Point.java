public class Point implements Comparable<Point> {
  int x;
  int y;
  
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
  
  public String toString() {
    return "(" + this.x + ", " + this.y + ")";
  }
  
  public boolean equals(Object o) {
    if(o == null) return false;
    if(!(o instanceof Point)) return false;
    Point p = (Point) o;
    return this.x == p.x && this.y == p.y;
  } 
  
  public int compareTo(Point p) {
    if(this.x == p.x) return 0;
    if(this.x > p.x) return 1;
    return -1;
  }
   
  
}
