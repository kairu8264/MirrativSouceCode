package ai;

import com.google.android.exoplayer2.C;

/* loaded from: classes3.dex */
public final class n14 implements x14 {

    /* renamed from: a  reason: collision with root package name */
    public v4 f7151a;

    /* renamed from: b  reason: collision with root package name */
    public pb f7152b;

    /* renamed from: c  reason: collision with root package name */
    public pw3 f7153c;

    public n14(String str) {
        t4 t4Var = new t4();
        t4Var.n(str);
        this.f7151a = t4Var.I();
    }

    @Override // ai.x14
    public final void a(pb pbVar, pv3 pv3Var, k24 k24Var) {
        this.f7152b = pbVar;
        k24Var.a();
        pw3 p10 = pv3Var.p(k24Var.b(), 5);
        this.f7153c = p10;
        p10.b(this.f7151a);
    }

    @Override // ai.x14
    public final void b(hb hbVar) {
        u9.e(this.f7152b);
        int i10 = sb.f9778a;
        long b10 = this.f7152b.b();
        long c10 = this.f7152b.c();
        if (b10 == C.TIME_UNSET || c10 == C.TIME_UNSET) {
            return;
        }
        v4 v4Var = this.f7151a;
        if (c10 != v4Var.f10964p) {
            t4 a10 = v4Var.a();
            a10.r(c10);
            v4 I = a10.I();
            this.f7151a = I;
            this.f7153c.b(I);
        }
        int l10 = hbVar.l();
        nw3.b(this.f7153c, hbVar, l10);
        this.f7153c.e(b10, 1, l10, 0, null);
    }
}
