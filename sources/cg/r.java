package cg;

/* loaded from: classes3.dex */
public final class r<T> implements zf.f<T> {

    /* renamed from: a  reason: collision with root package name */
    public final o f19625a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19626b;

    /* renamed from: c  reason: collision with root package name */
    public final zf.b f19627c;

    /* renamed from: d  reason: collision with root package name */
    public final zf.e<T, byte[]> f19628d;

    /* renamed from: e  reason: collision with root package name */
    public final s f19629e;

    public r(o oVar, String str, zf.b bVar, zf.e<T, byte[]> eVar, s sVar) {
        this.f19625a = oVar;
        this.f19626b = str;
        this.f19627c = bVar;
        this.f19628d = eVar;
        this.f19629e = sVar;
    }

    public static /* synthetic */ void d(Exception exc) {
    }

    @Override // zf.f
    public void a(zf.c<T> cVar, zf.h hVar) {
        this.f19629e.a(n.a().e(this.f19625a).c(cVar).f(this.f19626b).d(this.f19628d).b(this.f19627c).a(), hVar);
    }

    @Override // zf.f
    public void b(zf.c<T> cVar) {
        a(cVar, q.f19624a);
    }
}
