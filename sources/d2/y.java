package d2;

/* loaded from: classes.dex */
public final class y extends j0 {
    public final String D;
    public final String E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(String str, String str2) {
        super(null);
        jo.p.h(str, "name");
        jo.p.h(str2, "fontFamilyName");
        this.D = str;
        this.E = str2;
    }

    public final String f() {
        return this.D;
    }

    public String toString() {
        return this.E;
    }
}
