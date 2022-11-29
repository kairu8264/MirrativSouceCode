package km;

/* loaded from: classes4.dex */
public final class d implements rn.a {

    /* renamed from: a  reason: collision with root package name */
    public final a f38877a;

    public d(a aVar) {
        this.f38877a = aVar;
    }

    public static d a(a aVar) {
        return new d(aVar);
    }

    public static yl.f c(a aVar) {
        return (yl.f) pn.b.c(aVar.c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // rn.a
    /* renamed from: b */
    public yl.f get() {
        return c(this.f38877a);
    }
}
