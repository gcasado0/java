package tutorial;

import java.lang.annotation.Documented;

@EnhancementRequest (
    id= 1,
    synopsis = "Esto es una prueba",
    engineer = "John Doe",
    date= "25/03/2022"    
)
public class Example1 {


    
}
@Documented
@interface  EnhancementRequest  {
    int id();
    String synopsis();
    String engineer() default "unassigned";
    String date() default "unknown";
 }