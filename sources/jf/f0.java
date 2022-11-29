package jf;

/* loaded from: classes2.dex */
public enum f0 {
    NONE("0", ""),
    EMOMO("4", "emomo_campaigns"),
    APP("5", "app_campaigns"),
    RECOMMEND("6", "recommend_campaigns");
    

    /* renamed from: id  reason: collision with root package name */
    private final String f37927id;
    private final String logName;

    f0(String str, String str2) {
        this.f37927id = str;
        this.logName = str2;
    }

    public final String c() {
        return this.logName;
    }

    public final String getId() {
        return this.f37927id;
    }
}
