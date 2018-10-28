package FlappyBird;

public class Check {
    private Bird bird = new Bird();
    private Pipe pipe = new Pipe();

    public boolean die() {
        if (bird.getY() + 10 >= 300) {
            return true;
        }
        if (bird.getY() <= pipe.getH1() &&(((bird.getX()+10) >= pipe.getX()))&&bird.getX() <= (pipe.getX()+45)) {
            return true;
        }
//        if ((bird.getX() + 10 == pipe.getX2()) && (bird.getY() + 10 <= pipe.getH2() || bird.getY() + 10 >= pipe.getH2() + 90) {
//            return true;
//        }
//        if ((bird.getX() + 10 == pipe.getX3()) && (bird.getY() + 10 <= pipe.getH3() || bird.getY() + 10 >= pipe.getH3() + 90)) {
//            return true;
//        }
//        if ((bird.getX() + 10 == pipe.getX4()) && (bird.getY() + 10 <= pipe.getH4() || bird.getY() + 10 >= pipe.getH4() + 90)) {
//            return true;
//        }
        return false;
    }

}
