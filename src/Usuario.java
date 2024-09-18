public class Usuario {
    String name;
    int age;
    private final String password;
    boolean login;
    String tipoDePlan;
    public Usuario(String name, int age, String plan, String password) {
        this.name = name;
        this.age = age;
        this.login = false;
        this.tipoDePlan = plan;
        this.password = password;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    public boolean isLogin() {
        return login;
    }

    public void inicioSesion(String contrasena) {
        if (contrasena.equals(password)) {
            System.out.println("Acceso autorizado!");
            setLogin(true);
        } else {
            System.out.println("Contraseña incorrecta.");
            setLogin(false);
        }

}}
