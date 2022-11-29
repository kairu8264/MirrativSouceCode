package nm;

/* loaded from: classes4.dex */
public class a extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final lm.a f43703b = lm.a.e();

    /* renamed from: a  reason: collision with root package name */
    public final tm.c f43704a;

    public a(tm.c cVar) {
        this.f43704a = cVar;
    }

    @Override // nm.e
    public boolean c() {
        if (g()) {
            return true;
        }
        f43703b.j("ApplicationInfo is invalid");
        return false;
    }

    public final boolean g() {
        tm.c cVar = this.f43704a;
        if (cVar == null) {
            f43703b.j("ApplicationInfo is null");
            return false;
        } else if (!cVar.b0()) {
            f43703b.j("GoogleAppId is null");
            return false;
        } else if (!this.f43704a.Z()) {
            f43703b.j("AppInstanceId is null");
            return false;
        } else if (!this.f43704a.a0()) {
            f43703b.j("ApplicationProcessState is null");
            return false;
        } else if (this.f43704a.Y()) {
            if (!this.f43704a.V().U()) {
                f43703b.j("AndroidAppInfo.packageName is null");
                return false;
            } else if (this.f43704a.V().V()) {
                return true;
            } else {
                f43703b.j("AndroidAppInfo.sdkVersion is null");
                return false;
            }
        } else {
            return true;
        }
    }
}
