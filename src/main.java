public class main{
    public static void main(String[] args) throws InterruptedException, ScareMonstersException {


        MapInfo location = new MapInfo();
        Walk walk = new Walk();


        VinniePooh Pooh = new VinniePooh();
        Pooh.setRandomXY();
        Pooh.setName("Винни Пух");
        Pooh.setHealth(18);
        Pooh.setView(25);

        Piglet Piglet = new Piglet();
        Piglet.setRandomXY();
        Piglet.setName("Пяточёк");
        Piglet.setHealth(15);
        Piglet.setView(20);

        Monster SpringTrap = new Monster();
        SpringTrap.setScare(6);
        SpringTrap.setRandomXY();
        SpringTrap.setName("СпрингТрап");


        Monster MaxPower = new Monster();
        MaxPower.setScare(5);
        MaxPower.setRandomXY();
        MaxPower.setName("Max Power");

        Monster Goblach = new Monster();
        Goblach.setScare(3);
        Goblach.setRandomXY();
        Goblach.setName("Гоблач");


        FairyForest DarkForest = new FairyForest();

        location.Info(Pooh, Piglet, SpringTrap, MaxPower, Goblach, DarkForest);

        DarkForest.getXY("Тёмный лес");

        VinniePooh.Idea.Granny();
        VinniePooh.Idea.Robin();

        walk.walkInForest(Pooh, Piglet, SpringTrap, MaxPower, Goblach);

        Pooh.nose();
        Pooh.findTraces();
        System.out.println("");
        System.out.println(
                "                    ,▒╢                                                         \n" +
                "                   ¿░░░╢                                                        \n" +
                "                  /░▒╢░▒╢                                                       \n" +
                "                 ,░▒▒▒╣░▒╖                                                      \n" +
                "                 ▒░▒▒▒║░░▒╖                                                     \n" +
                "                ]░░░░▒▒╢░░▒╖                                                    \n" +
                "                ▒░░░░░░▒▒░░▒╗                                                   \n" +
                "                ░░░░░░░░╢░░░▒╢╖                                                 \n" +
                "                ░░░░░░░░░▒▒░▒▒▒╢╖,                                              \n" +
                "                ░░░░░░░▓██▀▒▒▒╢╜╙`                                              \n" +
                "                ░░░░░░▒╬▄▄▒▒╜      ,╖@▓█▄▒╢@╖   ,╓╓,     ,,╓╓╓╓╓,,,             \n" +
                "                ]░░░▒ ███▀▌      g╣▓▓▒▒▒▀█▓▒▒▒▒▒▒▒╢╢╢▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒╢╣Ñ@╗    \n" +
                "                 ▒░░     ░     ╔╝▐▄███▀▌▒▒▒▒▒▒▒▒▒╢╣╢╢╣▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒╢╢Ñ     \n" +
                "             ▄M4▄▄▄,╙   `     ]\" ╙▓█▀ ░▓▒▒▒▒▒▒▒▒╢╣▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒Ñ       \n" +
                "             ▀██████▀         ▐       ░▓▒▒▒▒▒▒▒▒╢╢▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒╢╝         \n" +
                "                ▀▀             ╚╖   ,▒░▒▒▒▒▒▒▒▒▒╢╢╣▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒╣╜           \n" +
                "            ─~                 ~,`\"╙╨╨╝╢▒▒▒▒▒▒▒▒╢╢╢▒▒▒▒▒▒▒▒▒▒▒▒▒╣╝`             \n" +
                "               `─            ,▄░\"         ▒▒▒▒▒▒▒╢╢▒▒▒▒▒▒▒▒▒▒╣Ñ\"                \n" +
                "                  ▒▒g▄▄▄▄▄▄███▀           ║▒▒▒▒▒▒╢╢╣╣@▒▒╢╣╢╝\"                   \n" +
                "                  ░░▀███▀▀▀▀▀▀            ╢▒▒▒▒▒╢╢╢ \"\"╙\"`                       \n" +
                "               ,║▒▒▒▒▒▒▒▒▒╢╝             ]▒▒▒▒▒▒╢╢╢                             \n" +
                "              ╓▒▒▒▒▒▒▒▒╢╣▒[              ║▒▒▒▒▒▒╢╢╢                             \n" +
                "              ▒▒▒▒▒▒╢╣╜ ]╣╢              ▒▒▒▒▒▒▒╢╢╢                             \n" +
                "              ║╢╣▒▒╢╣╗   ╚╣             ║▒▒▒▒▒▒▒╢╢╢                             \n" +
                "               ╢╣ ▒░▒▒[                 ╣▒▒▒▒▒▒▒╢╢╢                             \n" +
                "               ╙╣  ░▒▒╣                ]▒▒▒▒▒▒▒▒╢╢╢                             \n" +
                "                   ]║▒▒╖               ║▒▒▒▒▒▒▒▒╢╢╢▓                            \n" +
                "                    ▒╢▒╢               ╢▒▒▒▒▒▒▒▒╣╢▓\"                            \n" +
                "                     ░╢╣╢              ║▒▒▒▒▒▒▒▒╝`                              \n" +
                "                     └░║▒@             ]▒▒▒▒╣╝`                                 \n" +
                "                      `╙╨╢@           ░░╨╜`                                     \n" +
                "                                                                                \n" +
                "                                                                                \n" +
                "                                                                                ");
    }

    }








