package y6;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f61274a;

    /* renamed from: b  reason: collision with root package name */
    public final float f61275b;

    /* renamed from: c  reason: collision with root package name */
    public final float f61276c;

    public h(String str, float f10, float f11) {
        this.f61274a = str;
        this.f61276c = f11;
        this.f61275b = f10;
    }

    public boolean a(String str) {
        if (this.f61274a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f61274a.endsWith("\r")) {
            String str2 = this.f61274a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
