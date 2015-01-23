

/**
 * Creates a collage
 * 
 * @Chris Samp
 * @1/21/15
 */
public class Collage
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class Collage
     */
    public static void createCollage()
    {
    
        
        {
            Picture canvas = new Picture(600,1000);
            Picture shark1 = new Picture("shark.jpg");
            Picture shark2 = new Picture("shark.jpg");
            Picture shark3 = new Picture("shark.jpg");
            Picture shark4 = new Picture("shark.jpg");
            
            
            shark2.negateFilter();
            shark3.purpleFilter();
            shark4.grayScale();
            shark4.negateFilter();
            shark4.purpleFilter();
            
            shark2.mirrorDiagonalRightToLeft();
            shark2.mirrorVertical();
            shark3.mirrorDiagonalRightToLeft();
            shark3.mirrorHorrizontal();
            shark4.mirrorDiagonalRightToLeft();
            
            
            canvas.cropAndCopy(shark1,0,299,0,499,0,0);
            canvas.cropAndCopy(shark2,0,299,0,499,0,500);
            canvas.cropAndCopy(shark3,0,299,0,499,300,0);
            canvas.cropAndCopy(shark4,0,299,0,499,300,500);
            
            canvas.explore();
            canvas.write("MyCollage.jpg");
        }
    }
    
    public static void main(String[] args)
    {
        createCollage();
    }
}
