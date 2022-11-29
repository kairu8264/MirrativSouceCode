package ai;

/* loaded from: classes3.dex */
public final class xr2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f12093a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12094b;

    public xr2(String str, String str2) {
        this.f12093a = str;
        this.f12094b = str2;
    }

    public static xr2 a(String str, String str2) {
        xs2.b(str, "Name is null or empty");
        xs2.b(str2, "Version is null or empty");
        return new xr2(str, str2);
    }

    public final String b() {
        return this.f12093a;
    }

    public final String c() {
        return this.f12094b;
    }
}
