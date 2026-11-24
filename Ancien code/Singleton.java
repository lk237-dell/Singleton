public final class Singleton {
    private static Singleton instance = null;
    // D'autres attributs, classiques et non "static".
    private String attribut1;
    private int attribut2;
    // Constructeur de l'objet.
    private Singleton() {
        // La présence d'un constructeur privé supprime le constructeur public par défaut.
        super();
    }
    // Méthode renvoyant une instance de la classe Singleton
    public static Singleton getInstance()
    {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    // D'autres méthodes classiques et non "static".
    public void op1(int x, int y, int z) {
        this.attrib1 = "bonjour";
    }
    public void op2(int x, int y, int z) { }
}
//------------------utilisation possible---------------
public static void main(String[] args)
{
    Singleton.getInstance().op1(1, 2, 3);
    Singleton.getInstance().op2(3, 4, 5);
}

// autre façon
public static void main(String[] args)
{
    Singleton singl = Singleton.getInstance();
    singl.op1(1, 2, 3);
    singl.op2(3, 4, 5);
}