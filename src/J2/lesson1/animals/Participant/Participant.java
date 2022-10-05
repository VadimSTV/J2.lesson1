package J2.lesson1.animals.Participant;

public interface Participant {   // Создание интерфейса участников

    String getName();

    boolean isOnDistance();

    void run(int distance);

    void jump(int height);

    void swim(int distance);
}
