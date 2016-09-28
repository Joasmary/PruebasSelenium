package example;
import com.google.gson.Gson;

public class Pruebas
{
    public static void main( String[] args )
    {
            Gson gson = new Gson();
        System.out.println(gson.toJson("Hello World!") );
    }
}

