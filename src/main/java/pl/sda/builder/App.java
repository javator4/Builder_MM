package pl.sda.builder;

/*    BUILDER PATTERN    */

public class App 
{
    public static void main( String[] args )
    {
        User user = new User.Builder()
                .name("test")
                .lastname("buildera")
                .city("torun")
                .password("blaipblaip")
                .active(true)
                .build();
        System.out.println(user);
    }
}
