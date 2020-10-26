
public class Plot  {
	 private int x;
	   private int y;
	   private int width;
	   private int depth;


/**   No-arg Constructor, creates a default
*  Plot with args x=0, y=0, width=1, depth=1
*/
	   public Plot()
	   {
	       this.x = 0;
	       this.y = 0;
	       this.width = 1;
	       this.depth = 1;   
	   }
	   
/**Plot ( Plot p)
        Copy Constructor, creates a new object using the information of the object passed to it.
*/	   
	   
	   public Plot(Plot p)
	   {
	       this.x = p.x;
	       this.y = p.y;
	       this.width =p. width;
	       this.depth =p. depth;
	   }
	   
	   /**Plot(int x, int y, int width, int depth)
        Parameterized Constructor   
	   */
	   
	   public Plot(int x, int y, int width, int depth)
	   {
	       this.x = x;
	       this.y = y; 
	       this.width = width;
	       this.depth = depth;
	   }
	   
	   /**  method determines if this plot overlaps 
	    * the parameter,returns true if the two plots overlap, false otherwise
	    */
	   public boolean overlaps (Plot plot) {
		    if (this.x <= plot.x +(plot.width - plot.x) && this.y <= plot.y + (plot.depth - plot.y)) {
		     
		    
		    if (plot.x <= this.x + (this.width - this.x) && plot.y <= this.y + (this.depth - this.y))
		        return false;
		    }
		    
		return true;    
		}
	   
	   

/**method Determines if this plot encompasses the parameter
Returns:
Returns true if this plot encompasses the parameter, false otherwis
*/

public boolean encompasses (Plot plot) {
  if(this.x <= plot.x && this.y <= plot.y) {
      return true;
  }
  if (this.depth <= plot.depth && this.width <= plot.width) {
      return true;
  }
  return false;
}

/**getX()
Return the x value
Returns:
the x value
*/

public int getX() {
	
	   
	       return x;
	   }

/**Set the x value
Parameters:
x - the x value to set
*/
public void setX(int x) {
  this.x = x;
}
/**Return the y value
Returns:
the y value
*/

public int getY()
{
  return y;
}
/**Set the y value
Parameters:
y - the y value to set

*/
public void setY(int y) {
	
  this.y = y;
}

/**getWidth()
Return the width value
Returns:
the width value

*/
public int getWidth()
{
   return width;
}
/**Set the depth value
Parameters:
depth - the depth value to set

*/
public void setWidth(int width)
{
   this.width = width;
}
/**
getDepth()
Return the depth value
Returns:
the depth value
*/

public int getDepth()
{
   return depth;
}
/**setDepth(int depth)
Set the depth value
Parameters:
depth - the depth value to set

*/

public void setDepth(int depth)
{
   this.depth = depth;
}


/**Prints out the name, city, owner and rent amount for a property
Overrides:
toString in class java.lang.Object
Returns:
the string representation of a Plot object in the following format:
             Upper left: (1,1); Width: 3 Depth: 3


*/
public String toString() {
	    return "Upper left: (" + x + "," + y + "); " + "Width: " + width + " Depth: " + depth;
	}
}




