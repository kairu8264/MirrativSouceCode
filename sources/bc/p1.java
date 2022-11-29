package bc;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.clientlog.logs.KaraokeLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.api.response.Karaoke;
import ia.a;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class p1 extends androidx.fragment.app.e {
    public final AutoClearedValue N0 = nd.a.a(this);
    public q1 O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public final wn.f T0;
    public final wn.f U0;
    public final wn.f V0;
    public static final /* synthetic */ qo.h<Object>[] X0 = {jo.f0.d(new jo.s(p1.class, "binding", "getBinding()Lcom/dena/mirrativ/streaming/databinding/DialogFragmentEmokaraSettingBinding;", 0))};
    public static final a W0 = new a(null);
    public static final int Y0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final p1 a(Karaoke karaoke, boolean z10) {
            jo.p.h(karaoke, "karaoke");
            p1 p1Var = new p1();
            Bundle bundle = new Bundle();
            bundle.putSerializable("karaoke", karaoke);
            bundle.putBoolean("show_shadow", z10);
            p1Var.V2(bundle);
            return p1Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17427w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17428x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17429y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17427w = componentCallbacks;
            this.f17428x = aVar;
            this.f17429y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f17427w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f17428x, this.f17429y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<hf.d0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17430w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17431x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17432y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17430w = componentCallbacks;
            this.f17431x = aVar;
            this.f17432y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.d0, java.lang.Object] */
        @Override // io.a
        public final hf.d0 invoke() {
            ComponentCallbacks componentCallbacks = this.f17430w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.d0.class), this.f17431x, this.f17432y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<hf.q> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17433w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17434x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17435y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17433w = componentCallbacks;
            this.f17434x = aVar;
            this.f17435y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.q, java.lang.Object] */
        @Override // io.a
        public final hf.q invoke() {
            ComponentCallbacks componentCallbacks = this.f17433w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.q.class), this.f17434x, this.f17435y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements ia.a {
        public e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            a.C0469a.a(this, animation);
            p1.this.n3();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            a.C0469a.b(this, animation);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            a.C0469a.c(this, animation);
        }
    }

    public p1() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.T0 = wn.g.b(iVar, new b(this, null, null));
        this.U0 = wn.g.b(iVar, new c(this, null, null));
        this.V0 = wn.g.b(iVar, new d(this, null, null));
    }

    public static final void P3(p1 p1Var, View view) {
        jo.p.h(p1Var, "this$0");
        p1Var.Z3(p1Var.R0 + 1);
    }

    public static final void Q3(p1 p1Var, View view) {
        jo.p.h(p1Var, "this$0");
        p1Var.Z3(p1Var.R0 - 1);
    }

    public static final void R3(p1 p1Var, View view) {
        jo.p.h(p1Var, "this$0");
        p1Var.Y3(p1Var.S0 + 1);
    }

    public static final void S3(p1 p1Var, View view) {
        jo.p.h(p1Var, "this$0");
        p1Var.Y3(p1Var.S0 - 1);
    }

    public static final void T3(p1 p1Var, View view) {
        jo.p.h(p1Var, "this$0");
        p1Var.a4();
    }

    public final ac.g0 G3() {
        return (ac.g0) this.N0.b(this, X0[0]);
    }

    public final hf.q H3() {
        return (hf.q) this.V0.getValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.O0 = null;
        super.I1();
    }

    public final Karaoke I3() {
        Serializable serializable = M2().getSerializable("karaoke");
        jo.p.f(serializable, "null cannot be cast to non-null type com.dena.mirrorman.net.api.response.Karaoke");
        return (Karaoke) serializable;
    }

    public final int J3() {
        return I3().getId();
    }

    public final String K3() {
        return I3().getTitle();
    }

    public final hf.d0 L3() {
        return (hf.d0) this.U0.getValue();
    }

    public final MRLogger M3() {
        return (MRLogger) this.T0.getValue();
    }

    public final String N3() {
        return O3() ? KaraokeLog.SONG_LIST : "karaoke_screen";
    }

    public final boolean O3() {
        return M2().getBoolean("show_shadow", false);
    }

    public final void U3(int i10, int i11) {
        M3().sendLog(KaraokeLog.Companion.createKeyChangeLog(L3().c(), N3(), i10, i11, I3()));
    }

    public final void V3() {
        M3().sendLog(KaraokeLog.Companion.createOpenSettingLog(L3().c(), N3(), I3()));
    }

    public final void W3(int i10, int i11) {
        M3().sendLog(KaraokeLog.Companion.createTempoChangeLog(L3().c(), N3(), i10, i11, I3()));
    }

    public final void X3(ac.g0 g0Var) {
        this.N0.a(this, X0[0], g0Var);
    }

    public final void Y3(int i10) {
        G3().F.setEnabled(true);
        G3().H.setEnabled(true);
        if (-11 >= i10) {
            this.S0 = -11;
            G3().F.setEnabled(false);
        } else if (11 <= i10) {
            this.S0 = 11;
            G3().H.setEnabled(false);
        } else {
            this.S0 = i10;
        }
        H3().f(J3(), this.S0);
        q1 q1Var = this.O0;
        if (q1Var != null) {
            q1Var.F1(this.S0);
        }
        G3().I.setText(String.valueOf(this.S0));
        U3(this.Q0, this.S0);
        this.Q0 = this.S0;
    }

    @Override // androidx.fragment.app.Fragment
    public void Z1() {
        super.Z1();
        b4();
    }

    public final void Z3(int i10) {
        G3().K.setEnabled(true);
        G3().M.setEnabled(true);
        if (-8 >= i10) {
            this.R0 = -8;
            G3().K.setEnabled(false);
        } else if (8 <= i10) {
            this.R0 = 8;
            G3().M.setEnabled(false);
        } else {
            this.R0 = i10;
        }
        H3().g(J3(), this.R0);
        q1 q1Var = this.O0;
        if (q1Var != null) {
            q1Var.X1(this.R0);
        }
        G3().N.setText(String.valueOf(this.R0));
        W3(this.P0, this.R0);
        this.P0 = this.R0;
    }

    public final void a4() {
        ConstraintLayout constraintLayout = G3().B;
        Animation loadAnimation = AnimationUtils.loadAnimation(N2(), xb.j.f59918g);
        loadAnimation.setAnimationListener(new e());
        constraintLayout.startAnimation(loadAnimation);
    }

    public final void b4() {
        G3().B.startAnimation(AnimationUtils.loadAnimation(N2(), xb.j.f59917f));
        if (O3()) {
            G3().J.startAnimation(AnimationUtils.loadAnimation(N2(), xb.j.f59915c));
        }
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(q0()), xb.p.dialog_fragment_emokara_setting, null, false);
        ac.g0 g0Var = (ac.g0) e10;
        g0Var.M.setOnClickListener(new View.OnClickListener() { // from class: bc.l1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p1.P3(p1.this, view);
            }
        });
        g0Var.K.setOnClickListener(new View.OnClickListener() { // from class: bc.k1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p1.Q3(p1.this, view);
            }
        });
        g0Var.H.setOnClickListener(new View.OnClickListener() { // from class: bc.o1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p1.R3(p1.this, view);
            }
        });
        g0Var.F.setOnClickListener(new View.OnClickListener() { // from class: bc.m1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p1.S3(p1.this, view);
            }
        });
        g0Var.D.setText(K3());
        int d10 = H3().d(J3());
        this.R0 = d10;
        this.P0 = d10;
        int b10 = H3().b(J3());
        this.S0 = b10;
        this.Q0 = b10;
        g0Var.N.setText(String.valueOf(this.R0));
        g0Var.I.setText(String.valueOf(this.S0));
        int i10 = this.R0;
        if (i10 == 8) {
            g0Var.M.setEnabled(false);
        } else if (i10 == -8) {
            g0Var.K.setEnabled(false);
        }
        int i11 = this.S0;
        if (i11 == 11) {
            g0Var.H.setEnabled(false);
        } else if (i11 == -11) {
            g0Var.F.setEnabled(false);
        }
        g0Var.C.setOnClickListener(new View.OnClickListener() { // from class: bc.n1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p1.T3(p1.this, view);
            }
        });
        if (O3()) {
            g0Var.J.setVisibility(0);
        } else {
            g0Var.J.setVisibility(8);
        }
        jo.p.g(e10, "inflate<DialogFragmentEm…E\n            }\n        }");
        X3(g0Var);
        V3();
        Dialog dialog = new Dialog(N2(), 16973913);
        dialog.setContentView(G3().u());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.O0 = context instanceof q1 ? (q1) context : null;
    }
}
