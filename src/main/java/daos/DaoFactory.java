package daos;

public class DaoFactory {
    private static Ads adsDao;
    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new ;
        }
        return adsDao;
    }
}