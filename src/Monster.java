public class Monster extends Creature {
    protected double distance1 = 0;
    private double scareindex;

    public void setScare(int ScareMonster) throws ScareMonstersException {
        scareindex = ScareMonster;
        try {
            if (ScareMonster > 7)
                throw new ScareMonstersException();
        } catch (ScareMonstersException e) {
            System.out.println(e.getMessage());
            scareindex = 7;
        }
    }

    public double getScare() {
        return (scareindex);
    }

    public double findDistance(double X, double Y) {
        distance1 = Math.pow((X - this.getX()), 2) + Math.pow((Y - this.getY()), 2);
        return (distance1);
    }
}