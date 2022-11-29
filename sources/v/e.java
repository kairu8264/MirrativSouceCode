package v;

import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.c1;
import c1.g1;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes.dex */
public final class e {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<c1, wn.v> {

        /* renamed from: w */
        public final /* synthetic */ float f56177w;

        /* renamed from: x */
        public final /* synthetic */ c1.u f56178x;

        /* renamed from: y */
        public final /* synthetic */ g1 f56179y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10, c1.u uVar, g1 g1Var) {
            super(1);
            this.f56177w = f10;
            this.f56178x = uVar;
            this.f56179y = g1Var;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("background");
            c1Var.a().b("alpha", Float.valueOf(this.f56177w));
            c1Var.a().b("brush", this.f56178x);
            c1Var.a().b("shape", this.f56179y);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<c1, wn.v> {

        /* renamed from: w */
        public final /* synthetic */ long f56180w;

        /* renamed from: x */
        public final /* synthetic */ g1 f56181x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, g1 g1Var) {
            super(1);
            this.f56180w = j10;
            this.f56181x = g1Var;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b("background");
            c1Var.c(c1.c0.g(this.f56180w));
            c1Var.a().b(TtmlNode.ATTR_TTS_COLOR, c1.c0.g(this.f56180w));
            c1Var.a().b("shape", this.f56181x);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    public static final x0.f a(x0.f fVar, c1.u uVar, g1 g1Var, float f10) {
        jo.p.h(fVar, "<this>");
        jo.p.h(uVar, "brush");
        jo.p.h(g1Var, "shape");
        return fVar.L(new d(null, uVar, f10, g1Var, a1.c() ? new a(f10, uVar, g1Var) : a1.a(), 1, null));
    }

    public static /* synthetic */ x0.f b(x0.f fVar, c1.u uVar, g1 g1Var, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            g1Var = c1.a1.a();
        }
        if ((i10 & 4) != 0) {
            f10 = 1.0f;
        }
        return a(fVar, uVar, g1Var, f10);
    }

    public static final x0.f c(x0.f fVar, long j10, g1 g1Var) {
        jo.p.h(fVar, "$this$background");
        jo.p.h(g1Var, "shape");
        return fVar.L(new d(c1.c0.g(j10), null, 0.0f, g1Var, a1.c() ? new b(j10, g1Var) : a1.a(), 6, null));
    }

    public static /* synthetic */ x0.f d(x0.f fVar, long j10, g1 g1Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            g1Var = c1.a1.a();
        }
        return c(fVar, j10, g1Var);
    }
}
