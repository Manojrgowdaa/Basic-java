//Chain functions (method chaining) allow you to perform multiple operations 
//in a single statement by returning the object itself from each method.






public class chainexample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        
        // Chaining methods
        sb.append("Hello")
          .append(" ")
          .append("World")
          .append("!");
        
        System.out.println(sb.toString());  
    }
}
