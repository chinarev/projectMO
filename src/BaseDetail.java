import java.util.HashMap;

//основа, которую мы делим на детали
public class BaseDetail extends Detail {
    public BaseDetail(int height, int width) {
        super(height, width);
    }

    //вычисление оставшегося места на основе
    public int countRemainSpace(Detail[] details, HashMap<Detail, Integer> card){
        int remainSpace = super.getArea();
        for (int i = 0; i < details.length; i++){
            remainSpace -= details[i].getArea() * card.get(details[i]);
        }
        return remainSpace;
    }

    public void printState(Detail[] details, HashMap<Detail, Integer> card){
        for (int i = 0; i < details.length; i++){
            System.out.println("Деталь " + details[i].getWidth() + "x" + details[i].getHeight() + " использована " + card.get(details[i]) + " раз");
        }
        System.out.println("Оставшееся свободное место на основе: " + countRemainSpace(details, card));
    }
}
