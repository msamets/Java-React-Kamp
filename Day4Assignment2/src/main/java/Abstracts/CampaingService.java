package Abstracts;

import Entitites.Campaign;
import Entitites.Game;

public interface CampaingService {
	//bu classta biraz gereksiz gibi oldu çünkü yapýlmak istenilen
	//yerlere direkt get set kullnarak bu deðiþiklikleri yaparýz
	//ama dao kýsmý için daha farklý kodlar girileceði için
	//ilerleyen aþamalarda böyle kullanmalý olabilir SOR
	void addGameToCampaign(String gameName);
	void deleteGameFromCampaign(String gameName);
	void changeDiscountPercent(int discountPercent);
	void unitPriceWithCampaign(Game game);
	//void addCampaign(Campaign campaign);  açýklamayý manager da yaptým
}
