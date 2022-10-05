package J2.lesson1.animals.Participant;

public class Cat extends Animal {

    public Cat(String name, int maxRunDistance,
               int maxJumpHeight, int maxSwimDistance) {
        super(name, maxRunDistance, maxJumpHeight, maxSwimDistance); 
    }

    @Override
    public void voice() {
        System.out.println("Мяу-Мур"); // Вывод голоса кота
    }
}
