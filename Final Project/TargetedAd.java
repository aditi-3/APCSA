/*
 * Problem 2 Sell My Pet Food
 * 
 * Name: Aditi Verma
 * Period: 3
 * APCSA
 * 
 * Precondition(s): 
 *                  - text file with dog aand cat words called targetWords.txt
 *                  - text file with posts called socialMediaPosts.txt
 * Postcondition(s):
 *                  - an outputed text file named advertisementC.txt and advertisementD.txt
 */
public class TargetedAd {

  public static void main(String[] args)
  {
    DataCollector data = new DataCollector();
    data.setData("socialMediaPosts.txt", "targetWords.txt");
    String usernameD = "";
    String usernameC = "";

    String target = data.getNextTargetWord(); // stores a line of target words from dog list
    String target2 = data.getNextTargetWord(); // stores a line of target words from cat list
    String postUser = data.getNextPost(); // post (case sensitive)
    String post = postUser.substring(postUser.indexOf(" ")).toLowerCase(); // post without username (case insensitive)

    while(!(postUser.equals("NONE"))) // loop ends when it gets through all the posts
    {
      String targetD = target; // stores a line of target words from dog list
      String targetC = target2; // stores a line of target words from cat list
      post = postUser.substring(postUser.indexOf(" ")).toLowerCase(); // gets the next line of posts
      
      // (iterate through target) loop ends when the target string contains no characters 
      while((targetD.indexOf(" ") > -1) && (targetC.indexOf(" ") > -1)) 
      {
        String targetWordD = targetD.substring(0, targetD.indexOf(" ")); // a target word (dog)
        String targetWordC = targetC.substring(0, targetC.indexOf(" ")); // a target word (cat)
        
        // checks if dog target word appears in the post (makes sure the username is not duplicated)
        if((post.indexOf(targetWordD) > -1) && (usernameD.indexOf(postUser.substring(0, postUser.indexOf(" "))) < 0)) 
        {
          usernameD += postUser.substring(0, postUser.indexOf(" ")) + " "; // adds username to the dog username string
        }
        // checks if cat target word appears in the post (makes sure the username is not duplicated)
        else if(post.indexOf(targetWordC) > -1 && (usernameC.indexOf(postUser.substring(0, postUser.indexOf(" "))) < 0)) 
        {
          usernameC += postUser.substring(0, postUser.indexOf(" "))  + " "; // adds username to the cat username string
        }
        // updates the target lines to exclude the words we already checked
        targetD = targetD.substring(targetD.indexOf(" ")+1);
        targetC = targetC.substring(targetC.indexOf(" ")+1);
      } // target while loop ends
      postUser = data.getNextPost();
    } // post while loops ends

    // ad for dog owners
    String ad = "looks like you are interested in pets, why not buy our exquisite dog food?";
    data.prepareAdvertisement("advertisementD.txt", usernameD, ad); // outputs a txt file with the ad

    // ad for cat owners
    ad = "looks like you are interested in pets, why not buy our exquisite cat food?";
    data.prepareAdvertisement("advertisementC.txt", usernameC, ad); // outputs a txt file with the ad
    }
}
