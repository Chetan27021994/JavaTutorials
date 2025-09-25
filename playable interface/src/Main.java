
interface Playable
{
    void play();
}


class Guitar implements Playable
{
    public void play()
    {
        System.out.println("Playing guitar!");
    }
}

// Implementing the interface in Piano class
class Piano implements Playable
{
    public void play() {
        System.out.println("Playing piano!");
    }
}

public class Main {
    public static void main(String[] args) {
        Playable guitar = new Guitar();
        Playable piano = new Piano();
        guitar.play();
        piano.play();


    }
}
