package dc;

import ac.x1;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.WindowManager;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.d2;
import androidx.lifecycle.w0;

/* loaded from: classes2.dex */
public final class g extends sd.a {
    public final x1 G;

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: dc.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0282a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ g f29397w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0282a(g gVar) {
                super(0);
                this.f29397w = gVar;
            }

            public final void a() {
                this.f29397w.l();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        public a() {
            super(2);
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                xb.v.a(new C0282a(g.this), iVar, 0);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(context);
        jo.p.h(context, "context");
        x1 x1Var = (x1) androidx.databinding.f.e(LayoutInflater.from(context), xb.p.floating_ranking_focus_event_help, this, true);
        this.G = x1Var;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, q(), 552, -3);
        layoutParams.windowAnimations = 0;
        layoutParams.rotationAnimation = 0;
        layoutParams.layoutAnimationParameters = null;
        setMLayoutParams(layoutParams);
        androidx.lifecycle.y yVar = context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null;
        if (yVar != null) {
            w0.b(this, yVar);
        }
        y4.e eVar = context instanceof y4.e ? (y4.e) context : null;
        if (eVar != null) {
            y4.f.b(this, eVar);
        }
        ComposeView composeView = x1Var.B;
        composeView.setViewCompositionStrategy(d2.c.f14419b);
        composeView.setContent(s0.c.c(-951849393, true, new a()));
    }
}
