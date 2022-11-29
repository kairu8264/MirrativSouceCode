package yl;

/* loaded from: classes4.dex */
public class h implements l {

    /* renamed from: a  reason: collision with root package name */
    public final m f62060a;

    /* renamed from: b  reason: collision with root package name */
    public final vi.h<j> f62061b;

    public h(m mVar, vi.h<j> hVar) {
        this.f62060a = mVar;
        this.f62061b = hVar;
    }

    @Override // yl.l
    public boolean a(am.d dVar) {
        if (!dVar.k() || this.f62060a.f(dVar)) {
            return false;
        }
        this.f62061b.c(j.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }

    @Override // yl.l
    public boolean b(Exception exc) {
        this.f62061b.d(exc);
        return true;
    }
}
