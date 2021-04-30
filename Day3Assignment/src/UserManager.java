
public class UserManager {
	public void addToCreditCard(CreditCard creditCard) {
		System.out.println("Sayýn "+creditCard.ownerFullName+" kredi kartý bilgileriniz eklendi.");
	}
	public void changeToCreditCard(CreditCard creditCard) {
		System.out.println("Sayýn "+creditCard.ownerFullName+" kredi kartý bilgileriniz kaydedildi.");
	}
	public void addToAddress() {
		System.out.println("Adres bilgileriniz eklendi.");
	}
	public void changeToAddress() {
		System.out.println("Adres bilgileriniz deðiþtirildi.");
	}
	public void saveToInfoPreferences() {
		System.out.println("Bilgilendirme tercihleri kaydedildi.");
	}
	public void linkToMyTeachableAcc() {
		System.out.println("Myteachable hesabýnýz baðlandý.");
	}
	public void unlinkToMyTeachableAcc() {
		System.out.println("Myteachable hesabýnýzýn baðlantýsý kaldýrýldý.");
	}
	
}
