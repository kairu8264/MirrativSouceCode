package df;

/* loaded from: classes2.dex */
public enum d {
    HEXAGON("season_rating_classup_hexagon_animation", "image_7"),
    ROUND("season_rating_classup_round_animation", "image_4");
    
    private final String animationDirName;
    private final String currentRankImageId;

    d(String str, String str2) {
        this.animationDirName = str;
        this.currentRankImageId = str2;
    }

    public final String c() {
        return this.animationDirName;
    }
}
