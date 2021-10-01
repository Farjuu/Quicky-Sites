package dev.farjana.web_to_app;

public class SiteImages {

    private int imageSiteId;
    private String siteUrl;

    SiteImages(int imageSiteId, String siteUrl) {
        this.imageSiteId = imageSiteId;
        this.siteUrl = siteUrl;
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public void setISiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    public int getImageSiteId() {
        return imageSiteId;
    }

    public void setImageSiteId(int imageSiteId) {
        this.imageSiteId = imageSiteId;
    }
}
