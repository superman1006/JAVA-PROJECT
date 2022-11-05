package API.ArrayList_and_String.Test;

public class Movie {
    private String name;
    private String actor;
    private double score;
    // 用右键创建Getter和Setter以及有参数构造器和无参数构造器 ！
    public Movie() {
    }

    public Movie(String name, String actor, double score) {
        this.name = name;
        this.actor = actor;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
