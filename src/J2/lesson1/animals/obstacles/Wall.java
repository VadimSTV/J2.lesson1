package J2.lesson1.animals.obstacles;
import J2.lesson1.animals.Participant.Participant;

//Класс наследования Obstacle подкласса Wall
public class Wall extends Obstacle {

    private int height; //метод height(высота стены)

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Participant participant) {
        participant.jump(height);
    }
}
