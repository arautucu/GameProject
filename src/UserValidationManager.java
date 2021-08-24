public class UserValidationManager implements UserValidationService{
    @Override
    public boolean Validate(Gamer gamer) {
        if(gamer.getBirthYear() == 1985 && gamer.getFirstName() == "Engin" && gamer.getLastName() == "Demiroğ" && gamer.getIdentityNumber() == 12345){
            return true;
        } else {
            return false;
        }
    }
}
