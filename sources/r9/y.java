package r9;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.SeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarGradientColor;
import com.dena.mirrorman.AutoClearedValue;
import ia.a;
import java.io.Serializable;
import ud.u;

/* loaded from: classes.dex */
public final class y extends androidx.fragment.app.e {
    public z N0;
    public final AutoClearedValue O0;
    public final wn.f P0;
    public GestureDetector Q0;
    public static final /* synthetic */ qo.h<Object>[] S0 = {jo.f0.d(new jo.s(y.class, "binding", "getBinding()Lcom/dena/mirrativ/emomo/databinding/DialogFragmentColorGradientPickerBinding;", 0))};
    public static final a R0 = new a(null);
    public static final int T0 = 8;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final y a(jf.k0 k0Var, ClosetAvatarGradientColor closetAvatarGradientColor) {
            jo.p.h(k0Var, "selectedCategory");
            jo.p.h(closetAvatarGradientColor, "gradientColor");
            y yVar = new y();
            Bundle bundle = new Bundle();
            bundle.putSerializable("EXTRA_SELECTED_CATEGORY", k0Var);
            bundle.putSerializable("EXTRA_GRADIENT_COLOR", closetAvatarGradientColor);
            yVar.V2(bundle);
            return yVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.a<ud.u> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final ud.u invoke() {
            Serializable serializable = y.this.M2().getSerializable("EXTRA_SELECTED_CATEGORY");
            jo.p.f(serializable, "null cannot be cast to non-null type com.dena.mirrorman.model.PartsCategory");
            jf.k0 k0Var = (jf.k0) serializable;
            Serializable serializable2 = y.this.M2().getSerializable("EXTRA_GRADIENT_COLOR");
            jo.p.f(serializable2, "null cannot be cast to non-null type com.dena.mirrativ.mirrativapi.closet.ClosetAvatarGradientColor");
            return u.a.b(ud.u.f55546h, (ClosetAvatarGradientColor) serializable2, k0Var, false, 4, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {
        public c() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            y.this.L3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements SeekBar.OnSeekBarChangeListener {
        public d() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            z zVar = y.this.N0;
            if (zVar != null) {
                zVar.W(1 - (i10 / 100.0f), y.this.H3().f());
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends GestureDetector.SimpleOnGestureListener {
        public e() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            if (motionEvent != null) {
                float y10 = motionEvent.getY();
                if (motionEvent2 != null) {
                    if (motionEvent2.getY() - y10 >= 50.0f) {
                        y.this.L3();
                        return true;
                    }
                    return super.onFling(motionEvent, motionEvent2, f10, f11);
                }
            }
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (y.this.G3().G.getHeight() / 2 > (motionEvent != null ? (int) motionEvent.getY() : 0)) {
                y.this.L3();
                return true;
            }
            return super.onSingleTapUp(motionEvent);
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements ia.a {
        public f() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            a.C0469a.a(this, animation);
            y.this.n3();
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

    public y() {
        super(q9.h.dialog_fragment_color_gradient_picker);
        this.O0 = nd.a.a(this);
        this.P0 = wn.g.a(new b());
    }

    public static final boolean K3(y yVar, View view, MotionEvent motionEvent) {
        jo.p.h(yVar, "this$0");
        GestureDetector gestureDetector = yVar.Q0;
        if (gestureDetector == null) {
            jo.p.v("gestureDetector");
            gestureDetector = null;
        }
        gestureDetector.onTouchEvent(motionEvent);
        return true;
    }

    public final s9.w G3() {
        return (s9.w) this.O0.b(this, S0[0]);
    }

    public final ud.u H3() {
        return (ud.u) this.P0.getValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.N0 = null;
        super.I1();
    }

    public final void I3(s9.w wVar) {
        this.O0.a(this, S0[0], wVar);
    }

    public final void J3() {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{H3().h() | (-16777216), H3().d(), H3().e() | (-16777216)});
        gradientDrawable.setCornerRadius(50.0f);
        G3().C.setBackgroundDrawable(gradientDrawable);
        G3().D.setOnSeekBarChangeListener(new d());
        G3().D.setProgress((int) ((1.0f - H3().g()) * 100));
        this.Q0 = new GestureDetector(N2(), new e());
        G3().G.setOnTouchListener(new View.OnTouchListener() { // from class: r9.x
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean K3;
                K3 = y.K3(y.this, view, motionEvent);
                return K3;
            }
        });
    }

    public final void L3() {
        ConstraintLayout constraintLayout = G3().B;
        Animation loadAnimation = AnimationUtils.loadAnimation(N2(), q9.c.f48802b);
        loadAnimation.setAnimationListener(new f());
        constraintLayout.startAnimation(loadAnimation);
    }

    public final void M3() {
        G3().B.startAnimation(AnimationUtils.loadAnimation(N2(), q9.c.f48801a));
    }

    @Override // androidx.fragment.app.Fragment
    public void Z1() {
        super.Z1();
        M3();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        s9.w T = s9.w.T(view);
        jo.p.g(T, "bind(view)");
        I3(T);
        ConstraintLayout constraintLayout = G3().E;
        jo.p.g(constraintLayout, "binding.container");
        yd.g1.a(constraintLayout, new c());
        J3();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), 16973913);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        Fragment H0 = H0();
        z zVar = null;
        z zVar2 = H0 instanceof z ? (z) H0 : null;
        if (zVar2 != null) {
            zVar = zVar2;
        } else if (context instanceof z) {
            zVar = (z) context;
        }
        this.N0 = zVar;
    }
}
