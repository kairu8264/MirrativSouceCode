package ng;

/* loaded from: classes3.dex */
public final class c implements fg.b<ng.a> {

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f43519a = new c();
    }

    public static c a() {
        return a.f43519a;
    }

    public static ng.a b() {
        return (ng.a) fg.d.c(b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // rn.a
    /* renamed from: c */
    public ng.a get() {
        return b();
    }
}
