public class Main {
    public static void go_south_east(int lat, int lon){
        lat -= 1;
        lon += 1;
        
    }

    public static void main(String[] args) {
        int latitude = 32;
        int longitude = -64;

        go_south_east(latitude, longitude);
        System.out.println("현위치 : " + latitude + " , " + longitude);
    }
}
