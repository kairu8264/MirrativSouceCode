package f9;

import android.animation.Animator;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatTextView;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.customview.RoundedButtonView;
import io.l;
import jo.f0;
import jo.p;
import jo.q;
import kf.m;
import kf.x;
import sf.i;
import vb.j;
import wn.v;
import xn.s;
import yd.g1;

/* loaded from: classes.dex */
public final class a extends androidx.fragment.app.e {
    public static final C0346a S0 = new C0346a(null);
    public static final int T0 = 8;
    public j N0;
    public final wn.f O0;
    public final wn.f P0;
    public final wn.f Q0;
    public final wn.f R0;

    /* renamed from: f9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0346a {
        public C0346a() {
        }

        public /* synthetic */ C0346a(jo.h hVar) {
            this();
        }

        public final a a(boolean z10) {
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putBoolean("EXTRA_IS_HOST", z10);
            aVar.V2(bundle);
            return aVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements io.a<Boolean> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(a.this.M2().getBoolean("EXTRA_IS_HOST"));
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements i {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e9.a f31852a;

        public c(e9.a aVar) {
            this.f31852a = aVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            i.a.a(this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f31852a.E.setVisibility(8);
            this.f31852a.D.setVisibility(0);
            this.f31852a.D.r();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            i.a.c(this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            i.a.d(this, animator);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends q implements l<View, v> {
        public d() {
            super(1);
        }

        public final void a(View view) {
            p.h(view, "it");
            j jVar = a.this.N0;
            if (jVar != null) {
                jVar.B();
            }
            a.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends q implements l<View, v> {
        public e() {
            super(1);
        }

        public final void a(View view) {
            p.h(view, "it");
            j jVar = a.this.N0;
            if (jVar != null) {
                jVar.J();
            }
            a.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f31855w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f31856x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f31857y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f31855w = componentCallbacks;
            this.f31856x = aVar;
            this.f31857y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f31855w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f31856x, this.f31857y);
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends q implements io.a<m> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f31858w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f31859x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f31860y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f31858w = componentCallbacks;
            this.f31859x = aVar;
            this.f31860y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.m, java.lang.Object] */
        @Override // io.a
        public final m invoke() {
            ComponentCallbacks componentCallbacks = this.f31858w;
            return gq.a.a(componentCallbacks).c(f0.b(m.class), this.f31859x, this.f31860y);
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends q implements io.a<x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f31861w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f31862x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f31863y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f31861w = componentCallbacks;
            this.f31862x = aVar;
            this.f31863y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final x invoke() {
            ComponentCallbacks componentCallbacks = this.f31861w;
            return gq.a.a(componentCallbacks).c(f0.b(x.class), this.f31862x, this.f31863y);
        }
    }

    public a() {
        super(d9.e.dialog_fragment_collab_matched_dialog);
        this.O0 = wn.g.a(new b());
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.P0 = wn.g.b(iVar, new f(this, null, null));
        this.Q0 = wn.g.b(iVar, new g(this, null, null));
        this.R0 = wn.g.b(iVar, new h(this, null, null));
    }

    public final m C3() {
        return (m) this.Q0.getValue();
    }

    public final MRLogger D3() {
        return (MRLogger) this.P0.getValue();
    }

    public final x E3() {
        return (x) this.R0.getValue();
    }

    public final boolean F3() {
        return ((Boolean) this.O0.getValue()).booleanValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.N0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(de.e.b(this, 280), -2);
        }
        e9.a T = e9.a.T(view);
        String str = F3() ? "matching_confirm_host" : "matching_confirm_starter";
        LottieAnimationView lottieAnimationView = T.E;
        lottieAnimationView.setAnimation(str + "_start/" + str + "_start.json");
        LottieAnimationView lottieAnimationView2 = T.E;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("_start/images");
        lottieAnimationView2.setImageAssetsFolder(sb2.toString());
        LottieAnimationView lottieAnimationView3 = T.D;
        lottieAnimationView3.setAnimation(str + "_loop/" + str + "_loop.json");
        LottieAnimationView lottieAnimationView4 = T.D;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("_loop/images");
        lottieAnimationView4.setImageAssetsFolder(sb3.toString());
        T.E.r();
        T.E.e(new c(T));
        RoundedButtonView roundedButtonView = T.G;
        p.g(roundedButtonView, "binding.startButtonView");
        g1.a(roundedButtonView, new d());
        AppCompatTextView appCompatTextView = T.B;
        p.g(appCompatTextView, "binding.cancelTextView");
        g1.a(appCompatTextView, new e());
        MRLogger D3 = D3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_COLLAB_MATCHING_START_POP_IMP);
        builder.setTargetType(F3() ? "host" : "starter");
        builder.setPayload(s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, C3().b()), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, E3().T4())));
        D3.sendLog(builder.build());
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), 16973913);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        p.h(context, "context");
        super.x1(context);
        this.N0 = context instanceof j ? (j) context : null;
    }
}
