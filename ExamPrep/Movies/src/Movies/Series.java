package Movies;

public class Series extends Movie{
    private int numberOfEpisodes;
    public Series(String title,int length, boolean isAgeRestricted,int numberOfEpisodes){
        super(title,length,isAgeRestricted);
        this.numberOfEpisodes = numberOfEpisodes;
    }
    public Series(String title,int length,int numberOfEpisodes){
        super(title,length,false);
        this.numberOfEpisodes = numberOfEpisodes;
    }
    @Override

    public String toString(){
        return super.toString() + String.format(" Number of Episodes: %d",this.numberOfEpisodes);
    }
}
