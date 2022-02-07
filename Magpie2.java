public class Magpie2 {
    public String getGreeting()
   {
     return "Hello, let's talk.";
   }

   public String getResponse(String statement)
   {
     String response = "";
     if (statement.indexOf("no") >= 0) {
       response = "Why so negative?";
      } else if (statement.indexOf("mother") >= 0
                 || statement.indexOf("father") >= 0
                 || statement.indexOf("sister") >= 0
                 || statement.indexOf("brother") >= 0) {
       response = "Tell me more about your family.";
      } else if (statement.indexOf("Garrett") >= 0) {
        response = "Mr Garrett is a good teacher.";
      } else if (statement.indexOf("cat") >=0 
                || statement.indexOf("dog") >= 0
                || statement.indexOf("snake") >= 0) {
        response = "Tell me more about your pets.";
      } if (statement.indexOf("hotdog") >= 0
            || statement.indexOf("burger") >= 0
            || statement.indexOf("salad") >= 0) {
        response = "My favourite food is banans.";
      } else {
       response = getRandomResponse();
     }
     return response;
   }



  

    /**
       * Pick a default response to use if nothing else fits.
       * @return a non-committal string
       */

   private String getRandomResponse()
   {
     final int NUMBER_OF_RESPONSES = 4;
     double r = Math.random();
     int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
     String response = "";

     if (whichResponse == 0) {
       response = "Interesting, tell me more.";
     } else if (whichResponse == 1) {
       response = "Hmmm.";
     } else if (whichResponse == 2) {
       response = "Do you really think so?";
     } else if (whichResponse == 3) {
       response = "You don't say.";
     }
     return response;
         }

   public static void main(String[] args)
   {
     Magpie2 maggie = new Magpie2();

     System.out.println(maggie.getGreeting());
     System.out.println(">I am friends with my bother");
     System.out.println(maggie.getResponse("I am friends with my brother"));
     System.out.println(">My favourite food is hotdog");
     System.out.println(maggie.getResponse("My favourte food is hotdog"));
     System.out.println(">The weather bad bruh");
     System.out.println(maggie.getResponse("It's raining cats and dogs"));
     System.out.println(">Do you know my brother?");
     System.out.println(maggie.getResponse("Do you know my brother?"));
   }
}
