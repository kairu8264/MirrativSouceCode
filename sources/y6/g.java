package y6;

/* loaded from: classes.dex */
public class g {

    /* renamed from: b  reason: collision with root package name */
    public static final g f61272b = new g();

    /* renamed from: a  reason: collision with root package name */
    public final s.f<String, s6.d> f61273a = new s.f<>(20);

    public static g b() {
        return f61272b;
    }

    public s6.d a(String str) {
        if (str == null) {
            return null;
        }
        return this.f61273a.get(str);
    }

    public void c(String str, s6.d dVar) {
        if (str == null) {
            return;
        }
        this.f61273a.put(str, dVar);
    }
}
