package q1;

import androidx.compose.ui.platform.c1;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes.dex */
public final class z {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<c1, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.q f48635w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(io.q qVar) {
            super(1);
            this.f48635w = qVar;
        }

        public final void a(c1 c1Var) {
            jo.p.h(c1Var, "$this$null");
            c1Var.b(TtmlNode.TAG_LAYOUT);
            c1Var.a().b("measure", this.f48635w);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(c1 c1Var) {
            a(c1Var);
            return wn.v.f59242a;
        }
    }

    public static final x0.f a(x0.f fVar, io.q<? super e0, ? super b0, ? super m2.b, ? extends d0> qVar) {
        jo.p.h(fVar, "<this>");
        jo.p.h(qVar, "measure");
        return fVar.L(new y(qVar, androidx.compose.ui.platform.a1.c() ? new a(qVar) : androidx.compose.ui.platform.a1.a()));
    }
}
