public class Main {

    public static void main(String[] args) {
        GamerManager gamerManager = new GamerManager(new UserValidationManager());
        gamerManager.Add(new Gamer(1, "Engin", "Demiroğ", 1985, 12345));
        gamerManager.Delete(new Gamer(1, "Engin", "Demiroğ", 1985, 12345));
        gamerManager.Update(new Gamer(1, "Engin", "Demiroğ", 1985, 12345));
    }
}