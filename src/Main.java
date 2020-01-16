import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        BaseDetail base = new BaseDetail(100, 100);//основа

        Detail detail1 = new Detail(10, 10);
        Detail detail2 = new Detail(5, 10);
        Detail detail3 = new Detail(10, 4);

        Detail[] details = {detail1, detail2, detail3};//детали

        HashMap<Detail, Integer> card = new HashMap<>(); //текущая карта раскроя(содержит пары вида "деталь - количество повторений детали на основе")

        for (int i = 0; i < details.length; i++){
            card.put(details[i], 0); //детали ещё не расположены на основе, количество использования каждой детали - 0
        }

        //рассмотрение возможных вариантов расположения деталей

        base.printState(details, card); //информация об использовании текущей карты раскроя
    }
}
