package km;

/* loaded from: classes4.dex */
public final class c implements rn.a {

    /* renamed from: a  reason: collision with root package name */
    public final a f38876a;

    public c(a aVar) {
        this.f38876a = aVar;
    }

    public static c a(a aVar) {
        return new c(aVar);
    }

    public static pk.c c(a aVar) {
        return (pk.c) pn.b.c(aVar.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // rn.a
    /* renamed from: b */
    public pk.c get() {
        return c(this.f38876a);
    }
}
