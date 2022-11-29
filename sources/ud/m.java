package ud;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final String f55183a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55184b;

    /* renamed from: c  reason: collision with root package name */
    public final androidx.lifecycle.e0<Integer> f55185c;

    public m(String str, String str2) {
        jo.p.h(str, "appImageUrl");
        jo.p.h(str2, "appName");
        this.f55183a = str;
        this.f55184b = str2;
        this.f55185c = new androidx.lifecycle.e0<>(Integer.valueOf(nd.y0.ic_my_app_check));
    }

    public final String a() {
        return this.f55183a;
    }

    public final String b() {
        return this.f55184b;
    }

    public final androidx.lifecycle.e0<Integer> c() {
        return this.f55185c;
    }
}
