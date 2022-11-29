package ai;

import tg.f;

/* loaded from: classes3.dex */
public final class n20 {

    /* renamed from: a */
    public final f.b f7156a;

    /* renamed from: b */
    public final f.a f7157b;

    /* renamed from: c */
    public tg.f f7158c;

    public n20(f.b bVar, f.a aVar) {
        this.f7156a = bVar;
        this.f7157b = aVar;
    }

    public final q10 c() {
        return new m20(this, null);
    }

    public final n10 d() {
        if (this.f7157b == null) {
            return null;
        }
        return new l20(this, null);
    }

    public final synchronized tg.f f(d10 d10Var) {
        tg.f fVar = this.f7158c;
        if (fVar != null) {
            return fVar;
        }
        e10 e10Var = new e10(d10Var);
        this.f7158c = e10Var;
        return e10Var;
    }
}
