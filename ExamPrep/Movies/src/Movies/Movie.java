package Movies;

import java.util.Objects;

public class Movie {
    private String title;
    private int length;
    private boolean isAgeRestricted;
    public Movie(String title, int length,boolean isAgeRestricted){
        this.title=title;
        this.isAgeRestricted=isAgeRestricted;
        if(length<=0){
            this.length = 0;
        } else {
            this.length=length;
        }
    }
    public Movie(String title,int length){
        this.title=title;
        if(length<=0){
            this.length = 0;
        } else {
            this.length=length;
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLength(int length) {
        if(length>0){
            this.length = length;
        }
    }

    public void setAgeRestricted(boolean ageRestricted) {
        isAgeRestricted = ageRestricted;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public boolean getIsAgeRestricted() {
        return isAgeRestricted;
    }
    @Override
    public String toString(){
        return String.format("%s length is %d length minutes. Age restricted: %s",this.title,this.length, this.isAgeRestricted ? "age restricted" : "not");
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(this.length,movie.length);
    }
    public static Movie synergy(Movie movie1, Movie movie2){
        return new Movie(
                movie1.getTitle()+movie2.getTitle(),
                movie1.getLength()+movie2.getLength(),
                movie1.getIsAgeRestricted() || movie2.getIsAgeRestricted());
    }
}