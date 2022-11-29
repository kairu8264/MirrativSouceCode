package g7;

/* loaded from: classes.dex */
public class c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final b<T> f32819a;

    /* renamed from: b  reason: collision with root package name */
    public v6.a<?, ?> f32820b;

    /* renamed from: c  reason: collision with root package name */
    public T f32821c;

    public c() {
        this.f32819a = new b<>();
        this.f32821c = null;
    }

    public T a(b<T> bVar) {
        return this.f32821c;
    }

    public final T b(float f10, float f11, T t10, T t11, float f12, float f13, float f14) {
        return a(this.f32819a.d(f10, f11, t10, t11, f12, f13, f14));
    }

    public final void c(v6.a<?, ?> aVar) {
        this.f32820b = aVar;
    }

    public c(T t10) {
        this.f32819a = new b<>();
        this.f32821c = null;
        this.f32821c = t10;
    }
}
