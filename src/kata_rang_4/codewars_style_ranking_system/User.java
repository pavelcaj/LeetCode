package kata_rang_4.codewars_style_ranking_system;

public class User {


    private int rank;
    private int exp;

    public void jdo() {
        int randomNumber;
        do {
            randomNumber = (int) (Math.random() * 8) + 1;

        } while (randomNumber == 0);

        if (Math.abs(getRank()) - Math.abs(randomNumber) > 0) {
            this.exp += exp;
        }
        if (Math.abs(getRank()) - Math.abs(randomNumber) == 0) {
            this.exp += 1;
        }
        if (Math.abs(getRank()) - Math.abs(randomNumber) == -1) {
            this.exp += 2;
        }
        if (Math.abs(getRank()) - Math.abs(randomNumber) < -1) {
            this.exp += 3;
        }
        if (getRank() == 8) {

        } else if (getExp() >= 100) {

            this.rank += 1;
            this.exp = 0;

        }
    }

    public User() {
        exp = 0;
        rank = 1;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getExp() {
        return exp;
    }

    @Override
    public String toString() {
        return "User{" +
                "rank=" + rank +
                ", exp=" + exp +
                '}';
    }
}
