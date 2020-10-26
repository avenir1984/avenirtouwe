
public class Property {
	 private String city;
	   private String owner;
	   private String propertyName;
	   private double rentAmount;
	 private  Plot plot;
	   
/**No-arg Constructor, creates a new object with default values of empty strings,
*  0 for rent amount, and default Plot (sets the x, y values to zero, depth and width to 1)
*/
	   
	   public Property()
	   {
	       this.city = "";
	       this.owner = "";
	       this.propertyName = "";
	       this.rentAmount = 0;
	       this.plot = new Plot();
	   }
	   
	   /** Copy Constructor, creates a new object using the information of the object passed to it.
	   Parameters:
	   p - a Property object
*/

	   public Property(Property p) {
		   this.city = p.city;
	       this.owner = p.owner;
	   this.propertyName = p.propertyName;
	   this.rentAmount = p.rentAmount;
	   this.plot = new Plot(p.plot);
	   }
	   
	   /**Constructor, Parameterized constructor with no Plot information
	    *  (uses default Plot where x,y are set to 0, width and depth set to 1)
	    */
	   public Property(String propertyName,String city,double rentAmount,String owner) {
		   this.propertyName = propertyName;
	       this.city = city;
	       this.owner = owner;
	       this.rentAmount = rentAmount;
	       this.plot = new Plot();
	   }
	   
       
/**Constructor, Parameterized constructor
Parameters:
propertyName - property name
city - city where the property is located
rentAmount - rent amount
owner - the owner's name
x - the x-value of the property's plot
y - the y-value of the property's plot
width - the horizontal size of the property's plot
depth - the vertical size of the property's plot
	*/   
	 
	   public Property(String propertyName, String city, double rentAmount, String owner,
	           int x, int y, int width, int depth) {
	       this.propertyName = propertyName;
	       this.city = city;
	       this.owner = owner;
	       this.rentAmount = rentAmount;
	       this.plot = new Plot(x, y, width, depth);
	   }
	   
	   /**Return the property Name
      Returns:
     the propertyName
     */
	   public String getPropertyName()
	   {
	       return propertyName;
	   }
	   
	   /**Set the property name
      Parameters:
      propertyName - the propertyName to set
     */
	   
	   public void setPropertyName(String propertyName) {
		   this.propertyName = propertyName;
	   }
	   
	   /**return the city
      Returns:
      the city
      */
	   public String getCity() {
		   return city;
	   } 
	   
	   /**set the city
     Parameters:
   city - the city to set
    */
	   public void setCity(String city) {
		   this.city = city;
	   }
	   
	   
	   /**return the rent amount
      Returns:
     the rentAmount
     */
	   public double getRentAmount() {
		   return  rentAmount;
	   }
	   
	   /**set the rent amount
       Parameters:
      rentAmount - the rentAmount to set
      */
	   public void setRentAmount(double rentAmount) {
		   this.rentAmount = rentAmount;
	   }
	   
	   /**return the owner name
      Returns:
        the owner
      */
	   public String getOwner() {
		   return   owner;
	   }
      
	   /**set the owner name
      Parameters:
      owner - the owner to set
      */
	   
	   public void setOwner(String owner) {

	       this.owner = owner;
	   }
	   
	   public Plot getPlot()
	   {
	       return plot;
	   }
      
	   /**set the Plot values
     Parameters:
     x - the x-value of the property's plot
     y - the y-value of the property's plot
     width - the horizontal size of the property's plot
     depth - the vertical size of the property's plot
     Returns:
     the Plot for the property
	   */
	   
	   public Plot setPlot(int x, int y, int width, int depth) {
		   
		       return new Plot(x, y, width, depth);
		   }
	   
	   /**Prints out the name, city, owner and rent amount for a property
       Overrides:
        toString in class java.lang.Object
       Returns:
          the string representation of a Property object in the following format:
            Property Name: propertyName
             Located in city
             Belonging to: owner
             Rent Amount: rentAmount
        Be sure the last item is the rent amount, preceded by a space.
        */
	   
	   public String toString()
	   {
		   return "Property Name: " + propertyName + "\nLocated in city: " + city + "\nBelonging to: " 
	   + owner + "\nRent Amount: " + rentAmount;
	   }
	  
	}
	   
	   
	   
	   

