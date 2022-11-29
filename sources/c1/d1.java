package c1;

import android.graphics.Shader;
import c1.c0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes.dex */
public abstract class d1 extends u {

    /* renamed from: c  reason: collision with root package name */
    public Shader f18655c;

    /* renamed from: d  reason: collision with root package name */
    public long f18656d;

    public d1() {
        super(null);
        this.f18656d = b1.l.f16742b.a();
    }

    @Override // c1.u
    public final void a(long j10, s0 s0Var, float f10) {
        jo.p.h(s0Var, TtmlNode.TAG_P);
        Shader shader = this.f18655c;
        if (shader == null || !b1.l.f(this.f18656d, j10)) {
            shader = b(j10);
            this.f18655c = shader;
            this.f18656d = j10;
        }
        long a10 = s0Var.a();
        c0.a aVar = c0.f18634b;
        if (!c0.m(a10, aVar.a())) {
            s0Var.l(aVar.a());
        }
        if (!jo.p.c(s0Var.s(), shader)) {
            s0Var.r(shader);
        }
        if (s0Var.k() == f10) {
            return;
        }
        s0Var.b(f10);
    }

    public abstract Shader b(long j10);
}
