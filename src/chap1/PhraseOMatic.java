package chap1;

/**
 * Created by user on 18.08.2016.
 */
public class PhraseOMatic {
    public static void main(String[] args) {
        //Создаем 3 набора слов для выбора
        String[] wordListOne = {"круглосуточный", "трех-звенный", "30000-футовый", "взаимный", "обоюдный выигрыш", "фронтэнд", "на основе вэб технологий", "проникающий", "умный",
                "шесть сигм", "метод кретического пути", "динамчный"};
        String[] wordListTwo = {"уполномоченный", "трудный", "чистый продукт", "ориентированный", "центральный", "распределенный", "кластерезированый", "фирменный", "нестандартный ум",
                "позиционированный", "сетевой", "сфокусированный", "использованный с выгодой", "выровненый", "нацеленый на", "общий", "совместный", "ускоренный"};
        String[] wordListThree = {"процесс", "пункт разгрузки", "выход из положения", "тип структуры", "талант", "подход", "уровень завоеванного внимания", "портал", "период времени",
                "обзор", "образец", "пункт следования"};

        // Вычисляем сколько слов в каждом списке
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //Генерируем 3 случайных числа
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        //Строим фразу
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("Все, что нам нужно,- это " + phrase);
    }
}
