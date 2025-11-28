public class RGB implements Color{
    private int red;
    private int green;
    private int blue;

    public RGB(int red, int blue, int green){
        if (red < 0 ){
            this.red = 0;
        } else if (red > 255 ){
            this.red = 255;
        } else {
            this.red = red;
        }

        if (blue < 0 ){
            this.blue = 0;
        } else if (blue > 255 ){
            this.blue = 255;
        } else {
            this.blue = blue;
        }

        if (green < 0 ){
            this.green = 0;
        } else if (green > 255 ){
            this.green = 255;
        } else {
            this.green = green;
        }
    }

    @Override
    public void printColorValues(){
        System.out.println("R: " + red + " G: " + green + " B: " + blue);
    }

    @Override
    public void flipColor(){
        this.red = 255 - red;
        this.green = 255 - green;
        this.blue = 255 - blue;
    }
}
