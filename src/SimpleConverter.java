import java.util.Scanner;

public class SimpleConverter {
    public static void main(String[] args) {
        //Пользователю предлагается на выбор ввести массу или расстояние.
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Введите номер интересующей величины: 1 - масса, 2 - расстояние");
        int value = inputValue.nextInt();
        Scanner inputQuantity = new Scanner(System.in);
        Scanner inputUnit = new Scanner(System.in);


        casesForMassUnit:
        switch (value) {
            case 1:
                //Пользователю предлагается выбрать единицу измерения
                System.out.println("Введите номер интересующей единицы измерения 1- кг, 2- грамм, 3 - пуд, 4- унция");
                int massUnit = inputUnit.nextInt();
                //Пользователю предлагается ввести количество выбранных единиц:
                System.out.println("Введите количество выбранных единиц");
                double quantity = inputQuantity.nextDouble();
                double kg, gram, pood, ounce;
                kg = gram = pood = ounce = quantity;
                switch (massUnit) {
                    case 1:
                        gram *= 1000;
                        pood /= 16.3807;
                        ounce *= 35.27400;
                        break;
                    case 2:
                        kg *= 0.001;
                        pood /= 16.3807 * 1000;
                        ounce *= 35.27400 / 1000;
                        break;
                    case 3:
                        kg *= 16.3807;
                        gram *= 16.3807 * 1000;
                        ounce *= 16.3807 * 35.27400;
                        break;
                    case 4:
                        kg /= 35.27400;
                        gram /= 35.27400 / 1000;
                        pood /= 35.27400 * 16.3807;
                        break;
                    default:
                        System.out.println("Выбрана некорретная единица измерения");
                        break casesForMassUnit;
                }
                System.out.printf(" %s = %.3f\n %s = %.3f\n %s = %.3f\n %s = %.3f\n  ", "кг", kg, "грамм", gram, "пуд", pood, "унция", ounce);
                break;

            case 2:
                //Пользователю предлагается выбрать единицу измерения
                System.out.println("Введите номер интересующей единицы измерения  1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                int distanceUnit = inputUnit.nextInt();
                //Пользователю предлагается ввести количество выбранных единиц:
                System.out.println("Введите количество выбранных единиц");
                quantity = inputQuantity.nextDouble();
                double meter, mile, yard, foot;
                meter = mile = yard = foot = quantity;
                switch (distanceUnit) {
                    case 1:
                        mile /= 1609.343;
                        yard *= 1.09361;
                        foot *= 3.28084;
                        break;
                    case 2:
                        meter *= 1609.343;
                        yard = meter * 1.09361;
                        foot = meter * 3.28084;
                        break;
                    case 3:
                        meter /= 1.09361;
                        mile = meter / 1609.343;
                        foot = meter * 3.28084;
                        break;
                    case 4:
                        meter /= 3.28084;
                        mile = meter / 1609.343;
                        yard = meter * 1.09361;
                        break;
                    default:
                        System.out.println("Выбрана некорретная единица измерения");
                        break casesForMassUnit;
                }
                System.out.printf(" %s = %.3f\n %s = %.3f\n %s = %.3f\n %s = %.3f\n  ", "метр:", meter, "миля:", mile, "ярд:", yard, "фут:", foot);
                break;
            default:
                System.out.println("Выбрана некорретная величина");
                break;

        }
    }
}
