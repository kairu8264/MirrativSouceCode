package t;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public static final a f52977a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public static final n f52978b = new o(new e0(null, null, null, null, 15, null));

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public n() {
    }

    public /* synthetic */ n(jo.h hVar) {
        this();
    }

    public abstract e0 a();

    public final n b(n nVar) {
        jo.p.h(nVar, "enter");
        s b10 = a().b();
        if (b10 == null) {
            b10 = nVar.a().b();
        }
        z d10 = a().d();
        if (d10 == null) {
            d10 = nVar.a().d();
        }
        i a10 = a().a();
        if (a10 == null) {
            a10 = nVar.a().a();
        }
        w c10 = a().c();
        if (c10 == null) {
            c10 = nVar.a().c();
        }
        return new o(new e0(b10, d10, a10, c10));
    }

    public boolean equals(Object obj) {
        return (obj instanceof n) && jo.p.c(((n) obj).a(), a());
    }

    public int hashCode() {
        return a().hashCode();
    }
}
