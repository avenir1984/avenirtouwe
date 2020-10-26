
public class ManagementCompany {
	private  int	MAX_PROPERTY;
	private  double	mgmFeePer;
	   private String name;
	   private Property[] properties;
	   private String taxID;
	   private int MGMT_WIDTH = 10;
	   private int MGMT_DEPTH = 10;
	   private Plot plot;

/**No-Arg Constructor that creates a ManagementCompany 
 * object using empty strings and the plot set to a Plot with x, y set to 0 , width and depth set to 10.

properties array is initialized here as well.

*/
	   
	  public  ManagementCompany() {
		  
		       this.name = "";
		       this.taxID = "";
		       this.mgmFeePer = 0;
		       this.plot = new Plot(0, 0,MGMT_WIDTH ,MGMT_DEPTH  );
		       properties = new Property[MAX_PROPERTY];
	  }
	   /**Constructor Creates a ManagementCompany object using the passed information.
	  plot is set to a Plot with x, y set to 0 , width and depth set to 10
	  properties array is initialized here as well
	  */
	  
	 public  ManagementCompany(String name, String taxID, double mgmFee) {
		  this.properties = new Property[MAX_PROPERTY];
	       this.name = name;
	       this.taxID = taxID;
	       this.mgmFeePer = mgmFee;
	       this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
	   }
	 
		 
	 /**Constructor Creates a ManagementCompany object using the passed information.
	 */
	 
	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth) {
		this.properties = new Property[MAX_PROPERTY];
	       this.name = name;
	       this.taxID = taxID;
	       this.mgmFeePer = mgmFee;
	       this.plot = new Plot(x,y,width,depth);
	}
	 
	 /**Copy Constructor creates a ManagementCompany object using another ManagementCompany object. 
	  * "properties" array is initialized here as well.
	
      Parameters:
       otherCompany - another management company
	 */
	
	public ManagementCompany(ManagementCompany otherCompany) {
		 this.properties = new Property[MAX_PROPERTY];
	       this.name = otherCompany.name;
	       this.taxID = otherCompany.taxID;
	       this.mgmFeePer = otherCompany.mgmFeePer;
	       this.plot = new Plot(otherCompany.plot);
	}
	 
	 /**Return the MAX_PROPERTY constant that represent the size of the "properties" array.
      Returns:
    the MAX_PROPERTY a constant attribute for this class that is set 5
	 */
	 public int getMAX_PROPERTY()
	   {
	       return MAX_PROPERTY;
	   }
	 
	 /**Adds the property object to the "properties" array.
         *Parameters:
        * property - a property object
          *     Returns:
                 Returns either -1 if the array is full, -2 if property is null,
                  -3 if the plot is not contained by the MgmtCo plot, -4 of the plot overlaps any other property,
             or the index in the array where the property was added successfully.
	 */
	 
	 public int addProperty(Property property) {
		 
		
		       if(property == null) {
		           return -2;
		       }
		       if(!plot.encompasses(property.getPlot())){
		           return -3;
		       }
		       for (int i = 0;i < properties.length; i++) {
		           if (properties[i] != null) {
		               if(properties[i].getPlot().overlaps(property.getPlot())) {
		                   return -4;
		               }
		           }
		           else {
		               properties[i] = property;
		               return i;
		           }
		       }
		       return -1;
	 }
	 
	 /**Creates a property object and adds it to the "properties" array, in a default plot.
      Parameters:
      name - property name
      city - location of the property
        rent - monthly rent
      owner - owner of the property
	 */
	 
	 
		 public int addProperty(String name,String city,double rent,String owner) {
			 return addProperty(new Property(name, city, rent, owner));
		    
		 }
		
		/** Method that creates object and adds it to properties array
		   * param name
		   * param city
		   * param rent
		   * param owner
		   * param x
		   * param y
		   * param width
		   * param depth
		   * return conditional values
		   */
		 
		 public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth)
		   {
		       return addProperty(new Property(name, city, rent, owner, x, y, width, depth));
		   }
		 
		 /**
		   * Method that finds total rent of all properties
		   * @return total
		   */
		   public double totalRent()
		   {
		       double total = 0.0;
		       for (Property property : properties)
		       {
		           if (property == null)
		           {
		               break;
		           }
		           total += property.getRentAmount();
		       }
		       return total;
		       
		   }
		   /**
		   * Method that finds maximum rent amount out of all properties and returns it
		   * @return maxRentAmount
		   */
		   public double maxRentProp()
		   {
			   double maxRentProp =0.0 ;
			   int count = 0;
			for(int i = 0; i < count; i++) {
                   if(properties[i] != null) {
                           
                	   maxRentProp += properties[i].getRentAmount();
                   }
           }
           return maxRentProp  ;
   }
		   
		   /**
		   * Method that finds index of property that has maximum rent amount
		   * @return index
		   */
		   public int maxPropertyRentIndex() {
               int indexOFMaxRent=0;
               
               int index = 0;
			for (int i =0; i < index; i++) {
                       if(properties[i] != null) {
                               if(properties[indexOFMaxRent].getRentAmount() < properties[i].getRentAmount()) {
                                       indexOFMaxRent = i;
                               }
                       }
               }
               
               return indexOFMaxRent;
       }
		   /**
		   * Method that takes index of a property and returns information
		   * @param i
		   * @return string
		   */
		   public String displayPropertyAtIndex(int i)
		   {
		       String string = properties[i].toString();
		       return string;
		   }
		   /**
		   * To string
		   * @return string
		   */
		   public String toString(){
		       String output = "";
		       for (int i=0; i<MAX_PROPERTY;i++) {
		           if(properties[i]==null){
		               break;
		           }
		           output += properties[i].toString()+"\n";
		       }
		       return "List of the properties for " + name + ", taxID: " + taxID + "\n___________________________________\n"+output+"\n"
		                       + "___________________________________\ntotal " + "management Fee: "+(totalRent()*mgmFeePer/100);
		   }
		}
		 
		 




