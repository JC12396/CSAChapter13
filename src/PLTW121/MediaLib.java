package PLTW121;

public class MediaLib
{
    public static void main(String[] args)
    {
        double totalCost = 0.0;
        double totalRating = 0;
        int numSongs = 0;
        double aveCost;
        double aveRating;
        String delimiter = ",";






        System.out.println("Welcome to your Media Library");
        // according to Billboard's greatest songs...
        Song song1 =  new Song("The Twist", 1.29, 10);
        numSongs = numSongs + 1;
        totalCost = totalCost + song1.getPrice();
        totalRating = totalRating + song1.getRating();



        Song song2 =  new Song("Smooth", .99, 9);
        numSongs = numSongs + 1;
        totalCost = totalCost + song2.getPrice();
        totalRating = totalRating + song2.getRating();


        Song song3 =  new Song("Mack the Knife", 1.29, 8);
        numSongs = numSongs + 1;
        totalCost = totalCost + song3.getPrice();
        totalRating = totalRating + song3.getRating();

        Song song4 =  new Song("How Do I Live", 99, 7);
        numSongs = numSongs + 1;
        totalCost = totalCost + song4.getPrice();
        totalRating = totalRating + song4.getRating();

        Song song5 =  new Song("Party Rock Anthem", 1.29, 6);
        numSongs = numSongs + 1;
        totalCost = totalCost + song5.getPrice();
        totalRating = totalRating + song5.getRating();

        Song song6 =  new Song("I Gotta Feeling", .99, 7);
        numSongs = numSongs + 1;
        totalCost = totalCost + song6.getPrice();
        totalRating = totalRating + song6.getRating();

        Song song7 =  new Song("Macaren", 1.29, 8);
        numSongs = numSongs + 1;
        totalCost = totalCost + song7.getPrice();
        totalRating = totalRating + song7.getRating();

        Song song8 =  new Song("Physical", .99, 9);
        numSongs = numSongs + 1;
        totalCost = totalCost + song8.getPrice();
        totalRating = totalRating + song8.getRating();

        Song song9 =  new Song("You Light Up My Life", 1.29, 10);
        numSongs = numSongs + 1;
        totalCost = totalCost + song9.getPrice();
        totalRating = totalRating + song9.getRating();

        Song song10 =  new Song("Hey Jude", .99, 9);
        numSongs = numSongs + 1;
        totalCost = totalCost + song10.getPrice();
        totalRating = totalRating + song10.getRating();



        MediaFile.writeString(song1.getTitle() + delimiter + song1.getRating());

        MediaFile.writeString(song2.getTitle() + delimiter + song2.getRating());

        MediaFile.writeString(song3.getTitle() + delimiter + song3.getRating());

        MediaFile.writeString(song4.getTitle() + delimiter + song4.getRating());

        MediaFile.writeString(song5.getTitle() + delimiter + song5.getRating());

        MediaFile.writeString(song6.getTitle() + delimiter + song6.getRating());

        MediaFile.writeString(song7.getTitle() + delimiter + song7.getRating());

        MediaFile.writeString(song8.getTitle() + delimiter + song8.getRating());

        MediaFile.writeString(song9.getTitle() + delimiter + song9.getRating());

        MediaFile.writeString(song10.getTitle() + delimiter + song10.getRating());
        MediaFile.saveAndClose();

        System.out.println("Number of songs: " + numSongs);

        System.out.println("Total cost: " + totalCost);

        aveCost = totalCost / numSongs;
        System.out.println("Average cost: " + aveCost);

        aveRating = totalRating / numSongs;
        System.out.println("Average rating: " + aveRating);

        Movie movie1 = new Movie();
        movie1.setTitle("Young Frankenstein" + movie1.getTitle());
        movie1.setDuration(134);
        movie1.showHoursMinutes();

        System.out.println("Songs In Library "+ song10.getNumSongsInLibrary() + " should equal " + numSongs);

        MySong mine = new MySong();
        System.out.println("MINE: " + mine.showSong());
    }
}
