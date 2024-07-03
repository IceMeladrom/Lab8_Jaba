import java.util.Random;
import java.util.Scanner;

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

        String[] times = new String[]{"10:00", "12:00", "14:00", "16:00", "18:00", "20:00"};
        Object[][] session = new Object[7][3];
        for (int i = 0; i < session.length; i++) {
            session[i][0] = cinemas[random.nextInt(cinemas.length)];
            session[i][1] = films[random.nextInt(films.length)][0];
            session[i][2] = times[random.nextInt(times.length)];
        }

        String clientFIO = "";
        String clientPhone = "";
        String clientEmail = "";
        int clientBudget = random.nextInt(50, 150);

        System.out.println("Афиша");
        System.out.println("Ваедите данные о себе:");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("\tФИО: ");
            clientFIO = scanner.nextLine().strip();
            if (clientFIO.isEmpty()) {
                System.out.println("Не введены данные");
                continue;
            }
            break;
        }
        while (true) {
            System.out.print("\tНомер телефона: ");
            clientPhone = scanner.nextLine().strip();
            if (clientPhone.isEmpty()) {
                System.out.println("Не введены данные");
                continue;
            }
            if (clientPhone.toCharArray()[0] == '+' && clientPhone.length() == 12) {
                boolean crash = false;
                for (int i = 0; i < 10; i++) {
                    if (!Character.isDigit(clientPhone.toCharArray()[i + 1])) {
                        crash = true;
                        break;
                    }
                }
                if (crash) {
                    System.out.println("Неверный формат номера телефона");
                    continue;
                } else
                    break;
            } else if (clientPhone.length() == 11) {
                boolean crash = false;
                for (int i = 0; i < 10; i++) {
                    if (!Character.isDigit(clientPhone.toCharArray()[i + 1])) {
                        crash = true;
                        break;
                    }
                }
                if (crash) {
                    System.out.println("Неверный формат номера телефона");
                    continue;
                } else
                    break;
            }
            System.out.println("Неверный формат номера телефона");

        }
        while (true) {
            System.out.print("\tЭлектронная почта: ");
            clientEmail = scanner.nextLine().strip();
            if (clientEmail.isEmpty()) {
                System.out.println("Не введены данные");
                continue;
            }
            if (!(clientEmail.split(" ").length == 1 && clientEmail.contains("@") && clientEmail.split("@").length == 2 && clientEmail.split("@")[1].split("\\.").length == 2))
                System.out.println("Неправильный формат электронной почты");
            else
                break;
        }

        String param = "";
        while (true) {
            System.out.print("\nПо какому параметру вы хотите выбрать сеанс?\n\t1. Время сеанся\n\t2. Стоимость билета\n\t3. Название фильма\nВаш выбор (введите цифру): ");
            param = scanner.nextLine();
            if (!param.equals("1") && !param.equals("2") && !param.equals("3")) {
                System.out.println("Неверный параметр");
                continue;
            }
            break;
        }

        if (param.equals("1")) {
            for (int i = 0; i < times.length; i++) {
                System.out.println("Сеансы в " + times[i] + ":");
                for (int j = 0; j < session.length; j++) {
                    if (session[j][2].equals(times[i])) {
                        System.out.format("\tКинотеатр: %s\n\tФильм: %s\n\n", ((Object[]) session[j][0])[0], session[j][1]);
                    }
                }
            }
            String session_time = "";
            String session_cinema = "";
            String session_film = "";
            System.out.println("\nВыберите интересующий вас сеанс");
            while (true) {
                System.out.print("\tВведите время сеанса: ");
                session_time = scanner.nextLine();
                boolean hasTime = false;
                for (int i = 0; i < times.length; i++) {
                    if (times[i].equals(session_time))
                        hasTime = true;
                }
                if (!hasTime) {
                    System.out.println("Неверный сеанс");
                    continue;
                }
                boolean hasInTimeSessions = false;
                for (int i = 0; i < times.length; i++) {
                    for (int j = 0; j < session.length; j++) {
                        if (session[j][2].equals(session_time)) {
                            if (session[j][1] != null)
                                hasInTimeSessions = true;
                        }
                    }
                }

                if (!hasInTimeSessions) {
                    System.out.println("На это время нет сеансов");
                    continue;
                }
                break;
            }
            while (true) {
                System.out.println("\nВыберите кинотеатр во время этого сеанса");
                System.out.print("\tВведите название кинотеатра: ");
                session_cinema = scanner.nextLine();

                boolean hasCinemaInSession = false;
                for (int i = 0; i < times.length; i++) {
                    for (int j = 0; j < session.length; j++) {
                        if (session[j][2].equals(session_time)) {
                            if (((Object[]) session[j][0])[0].equals(session_cinema)) {
                                hasCinemaInSession = true;
                            }
                        }
                    }
                }

                if (!hasCinemaInSession) {
                    System.out.println("На это время нет сеанса в данном кинотеатре");
                    continue;
                }
                break;
            }
            while (true) {
                System.out.println("\nВыберите фильм во время этого сеанса");
                System.out.print("\tВведите название фильм: ");
                session_film = scanner.nextLine();

                boolean hasFilmInSession = false;
                for (int i = 0; i < times.length; i++) {
                    for (int j = 0; j < session.length; j++) {
                        if (session[j][2].equals(session_time) && ((Object[]) session[j][0])[0].equals(session_cinema) && session[j][1].equals(session_film)) {
                            hasFilmInSession = true;
                        }
                    }
                }

                if (!hasFilmInSession) {
                    System.out.println("На это время нет сеанса на данный фильм");
                    continue;
                }
                break;
            }

            System.out.println("\nВыберите место в зале\nВаш баланс: " + clientBudget);

            for (int i = 0; i < cinemas.length; i++) {
                if (!cinemas[i][0].equals(session_cinema))
                    continue;
                for (int j = 0; j < ((int[][]) cinemas[i][2])[0].length; j++) {
                    System.out.print("\t" + (j + 1));
                }
            }
            System.out.println();
            for (int i = 0; i < cinemas.length; i++) {
                if (!cinemas[i][0].equals(session_cinema))
                    continue;
                for (int j = 0; j < ((int[][]) cinemas[i][2]).length; j++) {
                    System.out.print((j + 1));
                    for (int k = 0; k < ((int[][]) cinemas[i][2])[j].length; k++) {
                        System.out.print("\t" + ((int[][]) cinemas[i][2])[j][k]);
                    }
                    System.out.println();
                }
                break;
            }

            String session_row = "";
            String session_col = "";
            int row = 0;
            int col = 0;
            boolean enoughMoney = false;
            while (true) {
                boolean correctRow = false;
                boolean correctCol = false;
                while (true) {
                    System.out.print("Введите номер ряда (сверху вниз): ");
                    session_row = scanner.nextLine().strip();
                    for (int i = 0; i < cinemas.length; i++) {
                        if (!cinemas[i][0].equals(session_cinema))
                            continue;
                        for (int j = 0; j < ((int[][]) cinemas[i][2]).length; j++) {
                            for (int k = 0; k < ((int[][]) cinemas[i][2])[j].length; k++) {
                                if (session_row.equals(String.valueOf(k + 1)))
                                    correctRow = true;
                            }
                        }
                    }

                    if (!correctRow) {
                        System.out.println("Неверный номер ряда");
                        continue;
                    }
                    break;
                }
                while (true) {
                    System.out.print("Введите номер места (слева направо): ");
                    session_col = scanner.nextLine().strip();

                    for (int i = 0; i < cinemas.length; i++) {
                        if (!cinemas[i][0].equals(session_cinema))
                            continue;
                        for (int j = 0; j < ((int[][]) cinemas[i][2])[0].length; j++) {
                            if (session_col.equals(String.valueOf(j + 1)))
                                correctCol = true;
                        }
                    }

                    if (!correctCol) {
                        System.out.println("Неверный номер места");
                        continue;
                    }
                    break;
                }
                row = Integer.parseInt(session_row) - 1;
                col = Integer.parseInt(session_col) - 1;
                for (int i = 0; i < cinemas.length; i++) {
                    if (!cinemas[i][0].equals(session_cinema))
                        continue;
                    if (((int[][]) cinemas[i][2])[row][col] <= clientBudget) {
                        clientBudget -= ((int[][]) cinemas[i][2])[row][col];
                        enoughMoney = true;
                        break;
                    }
                }

                if (!enoughMoney) {
                    System.out.println("Выбраное место вам не по карману");
                    continue;
                }
                System.out.println("У вас осталось " + clientBudget + " денег");
                System.out.format("\n\nВы забронировали место %s на ряду %s на фильм %s в кинотеатре %s в %s\nУдачного просмотра\n", (col + 1), (row + 1), session_film, session_cinema, session_time);
                break;
            }

        } else if (param.equals("2")) {

        } else {

        }

    }
}
