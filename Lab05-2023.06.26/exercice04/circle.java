
package exercise04;


public  class circle extends shape
{    
    float r,area;
public circle(float r)
{
    this.r=r;
}


    public void calculatearea()
    {
        
        area=(float) (3.14*r*r);
    }
      public void display()
     {
         System.out.println("area is "+area);
     }
}
