package km;

/* loaded from: classes4.dex */
public final class b implements rn.a {

    /* renamed from: a  reason: collision with root package name */
    public final a f38875a;

    public b(a aVar) {
        this.f38875a = aVar;
    }

    public static b a(a aVar) {
        return new b(aVar);
    }

    public static im.a c(a aVar) {
        return (im.a) pn.b.c(aVar.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // rn.a
    /* renamed from: b */
    public im.a get() {
        return c(this.f38875a);
    }
}
