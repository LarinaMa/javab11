package object;

public class NetFlixtest {
    public static void main(String[] args) {
        NetFlix flix = new NetFlix();
        flix.usage(20);// 1st user----->method called by creating object
        NetFlix.usage(5);//family usage----->method called by using family class
        NetFlix netflix = new NetFlix();
        netflix.usage(35);//2nd user
    }
}
