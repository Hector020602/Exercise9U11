public class Player implements Comparable<Player>{

    private String name;
    private int strength;

    public Player(String player, int strength) {
        this.name = player;
        this.strength = strength;

    }

    @Override
    public String toString() {
        return name + "( " + strength + ")";
    }

    @Override
    public int compareTo(Player player) {
        return this.strength - player.strength;
        }

    }



