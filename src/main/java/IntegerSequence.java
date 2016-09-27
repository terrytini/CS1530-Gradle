import java.lang.NumberFormatException;

public class IntegerSequence{
  public static void main(String[] args){
    int n = 0;

    if(args.length != 2){
      System.out.println("Input format: java IntegerSequence <lazy/triangle> <32-bit integer>");
    }
    else if(!(args[0].equals("lazy") || args[0].equals("triangle"))){
      System.out.println("Input format: java IntegerSequence <lazy/triangle> <32-bit integer>");
      System.exit(1);
    }
    else{
      try{
        n = Integer.parseInt(args[1]);
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
      //answer = tri(n);
      System.out.println(tri(n));
    }
    else{
      //run triangle
      System.out.println(lazy(n));
    }
  } //end of main method

  static int tri(int n){
      int x=0;
      for(int i=1; i<=n; i++){
        x += i;
      }
      return x;
  }
  static int lazy(int n){
      int x=0;
      x = (n*n + n + 2) / 2;
      return x;
  }
}
