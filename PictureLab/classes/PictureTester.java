/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** method to test mirrorVerticalRightToLeft */
  public static void testMirrorVerticalRightToLeft()
  {
      Picture caterpillar = new Picture("caterpillar.jpg");
      caterpillar.explore();
      caterpillar.mirrorVerticalRightToLeft();
      caterpillar.explore();
  }
  /** method to test mirrorHorrizontal*/
  public static void testMirrorHorrizontal()
  {
      Picture caterpillar = new Picture("caterpillar.jpg");
      caterpillar.explore();
      caterpillar.mirrorHorrizontal();
      caterpillar.explore();
  }
  
  /** method to test mirrorHorrizontalTopToBot */
  public static void testMirrorHorrizontalTopToBot()
  {
      Picture caterpillar = new Picture("caterpillar.jpg");
      caterpillar.explore();
      caterpillar.mirrorHorrizontalTopToBot();
      caterpillar.explore();
  }
  
  /** method to test mirrorDiagonalLeftToRight */
  public static void testMirrorDiagonalLeftToRight()
  {
      Picture caterpillar = new Picture("square_for_diag.png");
      caterpillar.explore();
      caterpillar.mirrorDiagonalLeftToRight();
      caterpillar.explore();
  }
  /** method to test mirrorDiagonalRightToLeft */
  public static void testMirrorDiagonalRightToLeft()
  {
      Picture caterpillar = new Picture("square_for_diag.png");
      caterpillar.explore();
      caterpillar.mirrorDiagonalRightToLeft();
      caterpillar.explore();
  /** Method to test mirrorTemple */
  }
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture snowman = new Picture("snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture seagull = new Picture("seagull.jpg");
    seagull.explore();
    seagull.mirrorGull();
    seagull.explore();
  }
  
  public static void testPurpleFilter()
  {
    Picture seagull = new Picture("seagull.jpg");
    seagull.explore();
    seagull.purpleFilter();
    seagull.explore();
  }
  
  public static void testNegateFilter()
  {
    Picture seagull = new Picture("seagull.jpg");
    seagull.explore();
    seagull.negateFilter();
    seagull.explore();
  }
  
  public static void testPurpleNegateFilter()
  {
    Picture seagull = new Picture("seagull.jpg");
    seagull.explore();
    seagull.negateFilter();
    seagull.purpleFilter();
    seagull.explore();
  }
  
  public static void testGrayScale()
  {
    Picture seagull = new Picture("seagull.jpg");
    seagull.explore();
    seagull.grayScale();
    seagull.explore();
  }
  
  public static void testCropAndCopy()
  {
      Picture picture1 = new Picture("seagull.jpg");
      Picture picture2 = new Picture("caterpillar.jpg");
      picture2.explore();
      picture1.explore();
      picture1.cropAndCopy(picture2,10,30,20,50,30,40);
      picture2.explore();
      picture1.explore();
  }
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    testGrayScale();
    //testFixUnderwater();
    testMirrorVertical();
    testMirrorVerticalRightToLeft();
    testMirrorHorrizontal();
    testMirrorHorrizontalTopToBot();
    testMirrorDiagonalLeftToRight();
    testMirrorDiagonalRightToLeft();
    testMirrorArms();
    testMirrorGull();
    testPurpleFilter();
    testNegateFilter();
    testPurpleNegateFilter();
    testCropAndCopy();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}