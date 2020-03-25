public class VinniePooh extends Creature {

    private double scareIndex = 1;
    private String PoohSpeech;
    private double speed = 6;
    private int StepsCount = 0;
    private int StepsToRun = 0;
    private double health;
    protected int ScareCount = 0;
    private double viewPooh = 0;

    public double getScareIndex() {
        scareIndex = StepsCount * 0.5;
        return (scareIndex);
    }

    public void setScareIndex(double i) {
        scareIndex += i;

    }

    @Override
    public void stepX() {
        step = Math.random() * speed;
        if (pointX + step >= size + xForrest) endX = xForrest - size;
        if (pointX + step <= xForrest - size) endX = size + xForrest;
        if (endX == xForrest - size) step *= -1;
        pointX += step;
        if (speed == 20) speed = 6;
    }

    @Override
    public void stepY() {
        step = Math.random() * speed;
        if (pointY + step >= yForrest + size) endY = yForrest - size;
        if (pointY + step <= yForrest - size) endY = size + yForrest;
        if (endY == yForrest - size) step *= -1;
        pointY += step;
        if (speed == 20) speed = 6;
    }

    @Override
    public void go() {
        this.stepX();
        this.stepY();
        StepsCount += 1;
        speed -= 1;
        if (speed <= 0) {
            speed = 6;
        }
        if (speed == 2)
            System.out.println(this.Say(this.getName() + " остановился как вкопанный и начал идти медленнее"));
    }


    public void setHealth(double healthPooh) {
        health = healthPooh;
    }

    public double getHealth() {
        if (health <= 0) health = 0;
        return (health);
    }

    public void scare(String name, double x, double y, double PoohView, double damage) {
        if ((x >= (this.getX() - PoohView)) && (x <= (this.getX() + PoohView)) && (y >= (this.getY() - PoohView)) && (y <= (this.getY() + PoohView))) {
            this.setHealth(this.getHealth() - damage);
            this.speed = 20;

            if (this.getHealth() > 0)
                System.out.println(this.Say(this.getName() + " встретился с " + name));
            else System.out.println(this.Say(this.getName() + " уже не в силах осознать встречу с " + name));

            if (this.getHealth() > 0) {
                if (this.getScareIndex() * damage < 30)
                    System.out.println(this.Say(this.getName() + " закричал от страха"));

                else if ((this.getScareIndex() * damage >= 30) && (this.getScareIndex() * damage < 60))
                    System.out.println(this.Say(this.getName() + " очень хотел, чтобы Кристофер Робин была здесь. Ведь он так любит Кристофера Робина!"));

                else System.out.println(this.Say("Атеист " + this.getName() + " уверовал в Бога"));
            }
        }
        System.out.println("");

    }

    public void EmotionalState() {
        if ((this.getHealth() <= 0) && (ScareCount < 1)) {
            ScareCount += 1;
            System.out.println("Здоровье " + this.getName() + "а" + " состовляет " + this.getHealth());
            System.out.println(this.getName() + " сошёл с ума");
        }
    }

    public void setView(double view) throws ViewException {

        if (view <= 50) viewPooh = view;
        else {
            throw new ViewException();
        }
    }

    public double getView() {
        return (viewPooh);
}
     public static class Idea
    {
        public static void Granny()
        {
            System.out.println("");
            System.out.println("Пух: Как же этот дедушка выглядит? Вдруг мы сейчас охотимся как раз на двух дедушек, и интересно, если мы поймают этих дедушек, можно ли будет взять хоть одного домой и держать его у себя");
            System.out.println("");
        }
        public static void Robin()
        {
            System.out.println("");
            System.out.println("Что же об этом скажет Кристофер Робин?");
            System.out.println("");
        }

    }
    CharacterAction licknose = new CharacterAction() {
        @Override
        public void startAction() {
            System.out.println("Винни пух облизал кончик своего носа, потому что ему стало страшно жарко");
        }
    };
    public void nose ()
    {
        System.out.println("");
        licknose.startAction();
        System.out.println("");
    }
    public void findTraces() {
        class PoohPathfinder {
            final int min = 1; // Минимальное число для диапазона
            final int max = 9; // Максимальное число для диапазона

            private int rnd(int min, int max) {
                max -= min;
                return (int) (Math.random() * ++max) + min;}
            public void finder()
                {
                    int count = rnd(min,max);
                    System.out.println("Перед Пухом были следы " + count + " зверей! Да, по-видимому, так и было! Несомненно, это были следы " + count + " комплектов лап.");
                }
            }
            PoohPathfinder pooh = new PoohPathfinder();
        pooh.finder();

        }


    }






