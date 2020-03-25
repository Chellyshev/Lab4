import java.util.Arrays;
import java.util.Objects;

public class Walk {

    boolean meet = false;
    double[] Distance;
    double[] coordinates;
    double damage = 0;
    double damage1 = 0;
    int[] ScareCount;
    String name;
    String name1;

    {
        Distance = new double[6];
        coordinates = new double[4];
        ScareCount = new int[2];
    }
public class Robin
    {
        public void MotivationalSpeech()
        {
            System.out.println("Кристофер Робин однажды говорил: Ничего не бойтесь, друзья!");
        }
    }

    Robin robin = new Robin();
    public void walkInForest(VinniePooh Pooh, Piglet Piglet, Monster SpringTrap, Monster MaxPower, Monster Goblach) throws InterruptedException {
        while ((Pooh.getHealth() > 0) || (Piglet.getHealth() >0))
        {
            Thread.sleep(800);
            Pooh.go();
            Pooh.getXY(Pooh.getName());
            //System.out.println(Pooh.getHealth());

            Piglet.go();
            Piglet.getXY(Piglet.getName());
            //System.out.println( Piglet.getHealth());

            SpringTrap.go();
            SpringTrap.getXY(SpringTrap.getName());
            //System.out.println(SpringTrap.getScare());

            MaxPower.go();
            MaxPower.getXY(MaxPower.getName());
            //System.out.println(MaxPower.getScare());

            Goblach.go();
            Goblach.getXY(Goblach.getName());

            if (Math.random() <= 0.3) {
                System.out.println("");
                robin.MotivationalSpeech();
                System.out.println("");
            }

            // Рассчитать дистанцию от монстров до Винни Пуха
            Distance[0] = SpringTrap.findDistance(Pooh.getX(), Pooh.getY());
            Distance[1] = MaxPower.findDistance(Pooh.getX(), Pooh.getY());
            Distance[2] = Goblach.findDistance(Pooh.getX(), Pooh.getY());

            // Рассчитать дистанцию от монстров до Пяточка

            Distance[3] = SpringTrap.findDistance(Piglet.getX(), Piglet.getY());
            Distance[4] = MaxPower.findDistance(Piglet.getX(), Piglet.getY());
            Distance[5] = Goblach.findDistance(Piglet.getX(), Piglet.getY());

            // Найти самого близкого монстра к Винни Пуху

            if ((Distance[0] < Distance[1]) && (Distance[0] < Distance[2])) {
                coordinates[0] = SpringTrap.getX();
                coordinates[1]= SpringTrap.getY();
                damage = SpringTrap.getScare();
                name=SpringTrap.getName(); }

            else if ((Distance[1] < Distance[0]) && (Distance[1] < Distance[2])) {
                coordinates[0] = MaxPower.getX();
                coordinates[1]= MaxPower.getY();
                name= MaxPower.getName();
                damage= MaxPower.getScare(); }
            else {
                coordinates[0] = Goblach.getX();
                coordinates[1]= Goblach.getY();
                name= Goblach.getName();
                damage= Goblach.getScare(); }

                //Найти самого близкого монстра к пяточку

            if ((Distance[3] < Distance[4]) && (Distance[3] < Distance[5])) {
                coordinates[2] = SpringTrap.getX();
                coordinates[3]= SpringTrap.getY();
                damage1 = SpringTrap.getScare();
                name1=SpringTrap.getName(); }

            else if ((Distance[4] < Distance[3]) && (Distance[4] < Distance[5])) {
                coordinates[2] = MaxPower.getX();
                coordinates[3]= MaxPower.getY();
                name1= MaxPower.getName();
                damage1= MaxPower.getScare(); }
            else {
                coordinates[2] = Goblach.getX();
                coordinates[3]= Goblach.getY();
                name1= Goblach.getName();
                damage1= Goblach.getScare(); }

            Pooh.scare(name,coordinates[0],coordinates[1],Pooh.getView(),damage);
            Piglet.scare(name1,coordinates[2],coordinates[3],Piglet.getView(), damage1);
            Pooh.EmotionalState();
            Piglet.EmotionalState();

        }




    }


}
