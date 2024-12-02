package lesson8.hw7_8;

public class Football {

    private String name;
    private String country;
    private String[] teem = new String[11];
    private int rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String[] getTeem() {
        return teem;
    }

    public void setTeem(String[] teem) {
        this.teem = teem;
    }


    public void changeRating(int newRating){
        this.rating = newRating;
    }
    public void replacePlayer(String player,String newPlayer){
        for (int i = 0; i < this.teem.length; i++) {
            if (this.teem[i].equals(player)) {
                this.teem[i] = newPlayer;
            }
        }

    }

}
