package pi;

/* loaded from: classes3.dex */
public final class j4 {

    /* renamed from: a  reason: collision with root package name */
    public final b5 f47968a;

    public j4(ba baVar) {
        this.f47968a = baVar.b0();
    }

    public final boolean a() {
        try {
            xh.b a10 = xh.c.a(this.f47968a.F());
            if (a10 != null) {
                return a10.f("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f47968a.r().u().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e10) {
            this.f47968a.r().u().b("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}
