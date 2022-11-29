package g2;

import android.text.TextPaint;
import c1.c0;
import c1.d1;
import c1.e0;
import c1.f1;
import c1.i1;
import c1.u;
import j2.f;
import jo.p;

/* loaded from: classes.dex */
public final class h extends TextPaint {

    /* renamed from: a  reason: collision with root package name */
    public j2.f f32601a;

    /* renamed from: b  reason: collision with root package name */
    public f1 f32602b;

    /* renamed from: c  reason: collision with root package name */
    public u f32603c;

    /* renamed from: d  reason: collision with root package name */
    public b1.l f32604d;

    public h(int i10, float f10) {
        super(i10);
        ((TextPaint) this).density = f10;
        this.f32601a = j2.f.f37083b.c();
        this.f32602b = f1.f18663d.a();
    }

    public final void a(u uVar, long j10) {
        if (uVar == null) {
            setShader(null);
            return;
        }
        if (p.c(this.f32603c, uVar)) {
            b1.l lVar = this.f32604d;
            if (lVar == null ? false : b1.l.f(lVar.m(), j10)) {
                return;
            }
        }
        this.f32603c = uVar;
        this.f32604d = b1.l.c(j10);
        if (uVar instanceof i1) {
            setShader(null);
            b(((i1) uVar).b());
        } else if (uVar instanceof d1) {
            if (j10 != b1.l.f16742b.a()) {
                setShader(((d1) uVar).b(j10));
            }
        }
    }

    public final void b(long j10) {
        int i10;
        if (!(j10 != c0.f18634b.e()) || getColor() == (i10 = e0.i(j10))) {
            return;
        }
        setColor(i10);
    }

    public final void c(f1 f1Var) {
        if (f1Var == null) {
            f1Var = f1.f18663d.a();
        }
        if (p.c(this.f32602b, f1Var)) {
            return;
        }
        this.f32602b = f1Var;
        if (p.c(f1Var, f1.f18663d.a())) {
            clearShadowLayer();
        } else {
            setShadowLayer(this.f32602b.b(), b1.f.m(this.f32602b.d()), b1.f.n(this.f32602b.d()), e0.i(this.f32602b.c()));
        }
    }

    public final void d(j2.f fVar) {
        if (fVar == null) {
            fVar = j2.f.f37083b.c();
        }
        if (p.c(this.f32601a, fVar)) {
            return;
        }
        this.f32601a = fVar;
        f.a aVar = j2.f.f37083b;
        setUnderlineText(fVar.d(aVar.d()));
        setStrikeThruText(this.f32601a.d(aVar.b()));
    }
}
