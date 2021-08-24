public class GamerManager implements GamerService{

    UserValidationService userValidationService;

    public GamerManager(UserValidationService userValidationService) {
        this.userValidationService = userValidationService;
    }


    @Override
    public void Add(Gamer gamer) {
        if(userValidationService.Validate(gamer)){
            System.out.println("Kayıt oldu");
        } else {
            System.out.println("Doğrulama başarısız. Kayıt başarısız.");
        }
    }

    @Override
    public void Update(Gamer gamer) {
        if(userValidationService.Validate(gamer)){
            System.out.println("Kayıt silindi");
        } else {
            System.out.println("Doğrulama başarısız. Güncelleme başarısız.");
        }
    }

    @Override
    public void Delete(Gamer gamer) {
        if(userValidationService.Validate(gamer)){
            System.out.println("Kayıt güncellendi");
        } else {
            System.out.println("Doğrulama başarısız. Silme işlemi başarısız.");
        }
    }
}
