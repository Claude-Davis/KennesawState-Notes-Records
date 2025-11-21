public class CMYK implements Color{
    private int cyan;
    private int magenta;
    private int black;
    private int yellow;

    public CMYK(int black, int cyan, int magenta, int yellow){
        if (black < 0 ){
            this.black = 0;
        } else if (black > 100) {
            this.black = 100;
        } else {
            this.black = black;
        }

        if (cyan < 0 ){
            this.cyan = 0;
        } else if (cyan > 100) {
            this.cyan = 100;
        } else {
            this.cyan = cyan;
        }

        if (magenta < 0 ){
            this.magenta = 0;
        } else if (magenta > 100) {
            this.magenta = 100;
        } else {
            this.magenta = magenta;
        }

        if (yellow < 0 ){
            this.yellow = 0;
        } else if (yellow > 100) {
            this.yellow = 100;
        } else {
            this.yellow = yellow;
        }
    }

    @Override
    public void printColorValues(){
        System.out.println("C: " + cyan + " M: " + magenta + " Y: " + yellow + " K: " + black);
    }

    @Override
    public void flipColor(){
        this.black = 100 - black;
        this.magenta = 100 - magenta;
        this.yellow = 100 - yellow;
        this.cyan = 100 - cyan;
    }
}
