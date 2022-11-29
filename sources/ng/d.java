package ng;

/* loaded from: classes3.dex */
public final class d implements fg.b<ng.a> {

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f43520a = new d();
    }

    public static d a() {
        return a.f43520a;
    }

    public static ng.a c() {
        return (ng.a) fg.d.c(b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // rn.a
    /* renamed from: b */
    public ng.a get() {
        return c();
    }
}
