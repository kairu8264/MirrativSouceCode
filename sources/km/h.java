package km;

/* loaded from: classes4.dex */
public final class h implements rn.a {

    /* renamed from: a  reason: collision with root package name */
    public final a f38881a;

    public h(a aVar) {
        this.f38881a = aVar;
    }

    public static h a(a aVar) {
        return new h(aVar);
    }

    public static xl.b<zf.g> c(a aVar) {
        return (xl.b) pn.b.c(aVar.g(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // rn.a
    /* renamed from: b */
    public xl.b<zf.g> get() {
        return c(this.f38881a);
    }
}
