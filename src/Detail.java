//прямоугольники
public class Detail {
    private int height;
    private int width;
    private int area;

    public Detail(int height, int width){
        this.height = height;
        this.width = width;
        countArea();
    }

    //площадь прямоугольника
    private void countArea(){
        area = height * width;
    }

    public int getArea() {
        return area;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
