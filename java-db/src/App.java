import com.daoimpl.RestaurantDaoImpl;

public class App {

    public static void main(String[] args) {

        RestaurantDaoImpl rdi = new RestaurantDaoImpl();
        rdi.createRestaurantTable();

    }
}
