package lg;

/* loaded from: classes3.dex */
public final class j implements fg.b<e> {

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final j f40163a = new j();
    }

    public static j a() {
        return a.f40163a;
    }

    public static e c() {
        return (e) fg.d.c(f.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // rn.a
    /* renamed from: b */
    public e get() {
        return c();
    }
}
