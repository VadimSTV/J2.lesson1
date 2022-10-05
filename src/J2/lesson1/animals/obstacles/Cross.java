package J2.lesson1.animals.obstacles;
import J2.lesson1.animals.Participant.Participant;

//Класс наследования Obstacle подкласса Cross
public class Cross extends Obstacle {

    private int length; //метод length(длина кросса)

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant animal) {
        animal.run(length);
    }
}
