public class PosisiKarakterGame {
    private String state = "Menunggu aba-aba";
    public void gerak(String command) { //1302204076 % 3 == 1
        switch (command) {
            case "Berdiri":
                this.state = "posisi standby";
                break;
            case "Tengkurap":
                this.state = "posisi istirahat";
                break;
        }
    }
    public String getState(){
        return this.state;

    }
}
