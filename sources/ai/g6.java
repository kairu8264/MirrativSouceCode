package ai;

/* loaded from: classes3.dex */
public final class g6 {

    /* renamed from: a  reason: collision with root package name */
    public final da f4350a = new da();

    public final g6 a(int i10) {
        this.f4350a.a(i10);
        return this;
    }

    public final g6 b(int i10, boolean z10) {
        da daVar = this.f4350a;
        if (z10) {
            daVar.a(i10);
        }
        return this;
    }

    public final g6 c(int... iArr) {
        da daVar = this.f4350a;
        for (int i10 : iArr) {
            daVar.a(i10);
        }
        return this;
    }

    public final g6 d(h6 h6Var) {
        fa faVar;
        da daVar = this.f4350a;
        faVar = h6Var.f4757a;
        for (int i10 = 0; i10 < faVar.a(); i10++) {
            daVar.a(faVar.b(i10));
        }
        return this;
    }

    public final h6 e() {
        return new h6(this.f4350a.b(), null);
    }
}
