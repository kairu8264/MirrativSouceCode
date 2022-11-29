package t;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public static final a f52980a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public static final p f52981b = new q(new e0(null, null, null, null, 15, null));

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public p() {
    }

    public /* synthetic */ p(jo.h hVar) {
        this();
    }

    public abstract e0 a();

    public final p b(p pVar) {
        jo.p.h(pVar, "exit");
        s b10 = a().b();
        if (b10 == null) {
            b10 = pVar.a().b();
        }
        z d10 = a().d();
        if (d10 == null) {
            d10 = pVar.a().d();
        }
        i a10 = a().a();
        if (a10 == null) {
            a10 = pVar.a().a();
        }
        w c10 = a().c();
        if (c10 == null) {
            c10 = pVar.a().c();
        }
        return new q(new e0(b10, d10, a10, c10));
    }

    public boolean equals(Object obj) {
        return (obj instanceof p) && jo.p.c(((p) obj).a(), a());
    }

    public int hashCode() {
        return a().hashCode();
    }
}
