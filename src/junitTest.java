import org.junit.Test;

public class junitTest {
     @Test
     public void test1(){
          if(add(10,3)==15){
               System.out.println("pass");
          }
          else{
               System.out.println("fail");
          }
     }
     @Test
     public void test2(){
          if(add(10,5)==15){
               System.out.println("pass");
          }
          else{
               System.out.println("fail");
          }
     }
     public int add(int x,int y){
          return x+y;
     }

}
