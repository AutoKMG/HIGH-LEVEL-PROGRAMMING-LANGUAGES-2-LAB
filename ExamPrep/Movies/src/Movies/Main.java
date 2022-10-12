package Movies;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Thor",64,false);
        Movie movie2 = new Movie("Vikings",32);
        Series series1 = new Series("Breaking Bad",952,true,72);
        System.out.println(movie1);
        System.out.println(movie2);
        System.out.println(series1);
        System.out.println(String.format("Movies are equal in length: %s",movie1.equals(movie2) ? "YES" : "NO"));

        addAdvertisement(movie1,6);
        System.out.println(String.format("Movie 1 new length %d",movie1.getLength()));
    }
    public static void addAdvertisement(Movie o, int duration){
        o.setLength(o.getLength()+duration);
    }
}
