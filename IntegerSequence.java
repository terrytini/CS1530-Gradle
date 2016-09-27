import java.lang.NumberFormatException;

public class IntegerSequence{
  public static void main(String[] args){
    int num = 0;

    if(args.length != 2){
      System.out.println("Input format: java IntegerSequence <lazy/triangle> <32-bit integer>");
    }
    else if(!(args[0].equals("lazy") || args[0].equals("triangle"))){
      System.out.println("Input format: java IntegerSequence <lazy/triangle> <32-bit integer>");
      System.exit(1);
    }
    else{
      try{
        num = Integer.parseInt(args[1]);
      }
      catch(NumberFormatException e){
        System.out.println("Input format: java IntegerSequence <lazy/triangle> <32-bit integer>");
        System.exit(2);
      }
    }

    int mode = 0;
    if(args[0].equals("triangle")) mode = 1;

    if(mode == 0){
      //run lazy
      System.out.println("Test point 1");
    }
    else{
      //run triangle
      System.out.println("Test point 2");
    }
  }




}
