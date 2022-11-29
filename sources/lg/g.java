package lg;

/* loaded from: classes3.dex */
public final class g implements fg.b<String> {

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final g f40157a = new g();
    }

    public static g a() {
        return a.f40157a;
    }

    public static String b() {
        return (String) fg.d.c(f.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // rn.a
    /* renamed from: c */
    public String get() {
        return b();
    }
}
