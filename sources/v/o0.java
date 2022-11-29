package v;

import android.view.View;
import android.widget.Magnifier;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import v.n0;

/* loaded from: classes.dex */
public final class o0 implements m0 {

    /* renamed from: b  reason: collision with root package name */
    public static final o0 f56303b = new o0();

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f56304c = true;

    /* loaded from: classes.dex */
    public static final class a extends n0.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Magnifier magnifier) {
            super(magnifier);
            jo.p.h(magnifier, "magnifier");
        }

        @Override // v.n0.a, v.l0
        public void b(long j10, long j11, float f10) {
            if (!Float.isNaN(f10)) {
                d().setZoom(f10);
            }
            if (b1.g.c(j11)) {
                d().show(b1.f.m(j10), b1.f.n(j10), b1.f.m(j11), b1.f.n(j11));
            } else {
                d().show(b1.f.m(j10), b1.f.n(j10));
            }
        }
    }

    @Override // v.m0
    public boolean b() {
        return f56304c;
    }

    @Override // v.m0
    /* renamed from: c */
    public a a(c0 c0Var, View view, m2.d dVar, float f10) {
        jo.p.h(c0Var, TtmlNode.TAG_STYLE);
        jo.p.h(view, "view");
        jo.p.h(dVar, "density");
        if (jo.p.c(c0Var, c0.f56165g.b())) {
            return new a(new Magnifier(view));
        }
        long W0 = dVar.W0(c0Var.g());
        float I0 = dVar.I0(c0Var.d());
        float I02 = dVar.I0(c0Var.e());
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (W0 != b1.l.f16742b.a()) {
            builder.setSize(lo.c.c(b1.l.i(W0)), lo.c.c(b1.l.g(W0)));
        }
        if (!Float.isNaN(I0)) {
            builder.setCornerRadius(I0);
        }
        if (!Float.isNaN(I02)) {
            builder.setElevation(I02);
        }
        if (!Float.isNaN(f10)) {
            builder.setInitialZoom(f10);
        }
        builder.setClippingEnabled(c0Var.c());
        Magnifier build = builder.build();
        jo.p.g(build, "Builder(view).run {\n    …    build()\n            }");
        return new a(build);
    }
}
