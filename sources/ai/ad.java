package ai;

/* loaded from: classes3.dex */
public final class ad implements z6 {

    /* renamed from: b  reason: collision with root package name */
    public pm f1812b;

    /* renamed from: c  reason: collision with root package name */
    public String f1813c;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1816f;

    /* renamed from: a  reason: collision with root package name */
    public final qj f1811a = new qj();

    /* renamed from: d  reason: collision with root package name */
    public int f1814d = 8000;

    /* renamed from: e  reason: collision with root package name */
    public int f1815e = 8000;

    public final ad a(String str) {
        this.f1813c = str;
        return this;
    }

    public final ad b(int i10) {
        this.f1814d = i10;
        return this;
    }

    public final ad c(int i10) {
        this.f1815e = i10;
        return this;
    }

    public final ad d(boolean z10) {
        this.f1816f = true;
        return this;
    }

    public final ad e(pm pmVar) {
        this.f1812b = pmVar;
        return this;
    }

    @Override // ai.z6
    /* renamed from: f */
    public final ye zza() {
        ye yeVar = new ye(this.f1813c, this.f1814d, this.f1815e, this.f1816f, this.f1811a, null, false, null);
        pm pmVar = this.f1812b;
        if (pmVar != null) {
            yeVar.l(pmVar);
        }
        return yeVar;
    }
}
