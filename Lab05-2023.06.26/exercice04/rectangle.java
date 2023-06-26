
package exercise04;

public class rectangle extends shape
{
    protected int h,w,area;
    
    public rectangle(int h,int w)
    {
        this.h=h;
        this.w=w;
    }
     public void calculatearea()
     {
         
         area=h*w;
     
     }
     public void display()
     {
         System.out.println("area is "+area);
     }

}
