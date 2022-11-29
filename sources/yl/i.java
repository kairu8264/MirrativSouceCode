package yl;

/* loaded from: classes4.dex */
public class i implements l {

    /* renamed from: a  reason: collision with root package name */
    public final vi.h<String> f62062a;

    public i(vi.h<String> hVar) {
        this.f62062a = hVar;
    }

    @Override // yl.l
    public boolean a(am.d dVar) {
        if (dVar.l() || dVar.k() || dVar.i()) {
            this.f62062a.e(dVar.d());
            return true;
        }
        return false;
    }

    @Override // yl.l
    public boolean b(Exception exc) {
        return false;
    }
}
