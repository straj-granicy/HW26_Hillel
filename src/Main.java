public class Main {
    public static void main(String[] args) {
        /*
        Используя конструкцию if..else, напишите код, который получает число(возраст),
        если число меньше 0 - выводить неверный возрас, от 0 - 18 вы еще не совершеннолетний,
        18 и выше вы стали взрослым
         */

        int age = 18;
        if (age<0)
        {
            System.out.println("Неверный возраст");
        }
        else if  (age>0 && age <18)
        {
            System.out.println("вы еще не совершеннолетний");
        }

        else
        {
            System.out.println("вы стали взрослым");
        }

        /*
        Напишите код который будет осуществлять следующую логику.
        1.Если сотрудник проработал от 1 до 3х лет в компании, его зарплата увеличивается на 10%,
        2.если от 3x и выше то 20%.
        3.Если в результате увеличения полученная ЗП меньше 4000 тысяч,
        сотруднику прибавляется бонус в размере 1000 , а если 4000 и больше плюс 500.
         */
        double init_wages = 5000;
        double wages_1 = init_wages + (init_wages*0.1);
        double wages_2 = init_wages + (init_wages*0.2);
        double bonus_1 = 1000;
        double bonus_2 = 500;
        int years = 2;



        if (years==0)
        {
            System.out.println("Вы проработали меньше года. Ваша зарплата  " + init_wages + "$");
        }
        else if  (years>0 && years<3)
        {
            System.out.println("Вы проработали  "+ years + "года/лет.Ваша зарплата  " + wages_1+ "$");
        }

        else if  (years>3)
        {
            System.out.println("Вы проработали  "+ years + "года/лет.Ваша зарплата  " + wages_2 + "$");
        }

        if ((init_wages) <4000)
        {
            System.out.println("Вы проработали  "+ years +"года/лет, а зп низкая.Добавялем бонус к Зп. Ваша зарплата  " + (init_wages+bonus_1) + "$");
        } else if (wages_1<4000) {
            System.out.println("Вы проработали  "+ years +"года/лет, а зп низкая.Добавялем бонус к Зп. Ваша зарплата  " + (wages_1+bonus_1) + "$");
        }

        else if (wages_2<4000)
        {
        System.out.println("Вы проработали "+ years +"года/лет, а зп низкая.Добавялем бонус к Зп. Ваша зарплата" + (wages_2 +bonus_1) + "$");
        }

        if ((init_wages) >4000)
        {
            System.out.println("Вы проработали  "+ years +"года/лет, а зп низкая.Добавялем бонус к Зп. Ваша зарплата  " + (init_wages+bonus_2) + "$");
        } else if (wages_1>4000) {
            System.out.println("Вы проработали  "+ years +"года/лет, а зп низкая.Добавялем бонус к Зп. Ваша зарплата  " + (wages_1+bonus_2) + "$");
        }

        else if (wages_2>4000)
        {
            System.out.println("Вы проработали "+ years +"года/лет, а зп низкая.Добавялем бонус к Зп. Ваша зарплата" + (wages_2 +bonus_2) + "$");
        }

/*
        посчитать сумму цифр от 1 до 50
         */

    int i = 50;
    int sum = (i*(i+1))/2;
    System.out.println("Cумма от 1 до  " + i + "  равна  " + sum);


    }
}