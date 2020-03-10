package PLTW121;

public class LoopingMediaLin {
    public static void main(String[] args)
    {
        String s = MediaFile.readString();
//        while (s != null)
//        {
//            System.out.println("From File: " + s);
//            s = MediaFile.readString();
//        }
        while(s != null)
        {
            String title = s.substring(0, s.indexOf(","));

            int rating = Integer.parseInt(s.substring((s.indexOf(",") + 1)));

            if(rating >= 9) {
                System.out.println("Title: " +title);
                System.out.println("Rating: "+rating);
            }
            s= MediaFile.readString();
        }
    }
}
