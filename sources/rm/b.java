package rm;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final lm.a f51566d = lm.a.e();

    /* renamed from: a  reason: collision with root package name */
    public final String f51567a;

    /* renamed from: b  reason: collision with root package name */
    public final xl.b<zf.g> f51568b;

    /* renamed from: c  reason: collision with root package name */
    public zf.f<tm.i> f51569c;

    public b(xl.b<zf.g> bVar, String str) {
        this.f51567a = str;
        this.f51568b = bVar;
    }

    public final boolean a() {
        if (this.f51569c == null) {
            zf.g gVar = this.f51568b.get();
            if (gVar != null) {
                this.f51569c = gVar.a(this.f51567a, tm.i.class, zf.b.b("proto"), a.f51565a);
            } else {
                f51566d.j("Flg TransportFactory is not available at the moment");
            }
        }
        return this.f51569c != null;
    }

    public void b(tm.i iVar) {
        if (!a()) {
            f51566d.j("Unable to dispatch event because Flg Transport is not available");
        } else {
            this.f51569c.b(zf.c.d(iVar));
        }
    }
}
