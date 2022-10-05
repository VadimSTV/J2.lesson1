package J2.lesson1.animals.obstacles;
import J2.lesson1.animals.Participant.Participant;


//Кдасс наследования Obstacle подкласса Water
public class Water extends Obstacle {

    private int length; //метод length(длина)

    public Water(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant participant) {
        participant.swim(length);
    }
}
