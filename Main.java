import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Object[][] films = new Object[5][5];
        films[0][0] = "Драйв";
        films[0][1] = 2011;
        films[0][2] = new String[]{"криминал, драма, триллер"};
        films[0][3] = 100;
        films[0][4] = "2D";

        films[1][0] = "Бегущий по лезвию";
        films[1][1] = 2017;
        films[1][2] = new String[]{"фантастика, боевик, триллер, драма"};
        films[1][3] = 164;
        films[1][4] = "3D";

        films[2][0] = "Барби";
        films[2][1] = 2023;
        films[2][2] = new String[]{"комедия, приключения, фэнтези"};
        films[2][3] = 114;
        films[2][4] = "2D";

        films[3][0] = "Бойцовский клуб";
        films[3][1] = 1999;
        films[3][2] = new String[]{"триллер, драма, криминал"};
        films[3][3] = 139;
        films[3][4] = "2D";

        films[4][0] = "Американский психопат";
        films[4][1] = 2000;
        films[4][2] = new String[]{"драма, криминал, триллер"};
        films[4][3] = 102;
        films[4][4] = "3D";


        Object[][] cinemas = new Object[3][5];
        cinemas[0][0] = "Космос";
        cinemas[0][1] = 25;
        cinemas[0][2] = new int[][]{
                new int[]{random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200),},
                new int[]{random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200),},
                new int[]{random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200),},
                new int[]{random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200),},
                new int[]{random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200),},
        };
        cinemas[0][3] = "Россия, г. Москва, ул. Проспект Мира, 109";
        cinemas[0][4] = new String[]{"2D", "3D"};

        cinemas[1][0] = "Каро Октябрь";
        cinemas[1][1] = 12;
        cinemas[1][2] = new int[][]{
                new int[]{random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200),},
                new int[]{random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200),},
        };
        cinemas[1][3] = "Россия, г. Москва, ул. Новый Арбат, 24";
        cinemas[1][4] = new String[]{"2D"};

        cinemas[2][0] = "Иллюзион";
        cinemas[2][1] = 36;
        cinemas[2][2] = new int[][]{
                new int[]{random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200),},
                new int[]{random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200),},
                new int[]{random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200),},
                new int[]{random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200), random.nextInt(50, 200),},
        };
        cinemas[2][3] = "Россия, г. Москва, ул. Котельническая наб., 1/15";
        cinemas[2][4] = new String[]{"2D", "3D"};


        Object[][] session = new Object[7][3];
        for (int i = 0; i < session.length; i++) {
            int cinemaInd = random.nextInt(cinemas.length);
            int filmInd = random.nextInt(films.length);
            session[i][0] = cinemas[cinemaInd];
            session[i][1] = films[filmInd][0];
            session[i][2] = films[filmInd][3];
        }


        System.out.println();
    }
}
