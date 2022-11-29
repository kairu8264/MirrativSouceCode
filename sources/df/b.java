package df;

/* loaded from: classes2.dex */
public enum b {
    HEXAGON("expup_hexagon", "image_6"),
    ROUND("expup_round", "image_6");
    
    private final String animationDirName;
    private final String badgeImageId;

    b(String str, String str2) {
        this.animationDirName = str;
        this.badgeImageId = str2;
    }

    public final String c() {
        return this.animationDirName;
    }
}
