package r8;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.widget.LeftRoundedWebView;

/* loaded from: classes.dex */
public final class q0 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49981b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49982c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final t8.c1 f49983a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final q0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            t8.c1 T = t8.c1.T(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            jo.p.g(T, "inflate(\n               …      false\n            )");
            return new q0(T);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(t8.c1 c1Var) {
        super(c1Var.u());
        jo.p.h(c1Var, "binding");
        this.f49983a = c1Var;
    }

    public static final void f(m0 m0Var, s8.l lVar, View view) {
        jo.p.h(lVar, "$bindModel");
        if (m0Var != null) {
            m0Var.a(lVar);
        }
    }

    public static final boolean g(q0 q0Var, m0 m0Var, s8.l lVar, View view, MotionEvent motionEvent) {
        jo.p.h(q0Var, "this$0");
        jo.p.h(lVar, "$bindModel");
        int action = motionEvent.getAction();
        if (action == 0) {
            q0Var.f49983a.u().startAnimation(AnimationUtils.loadAnimation(q0Var.f49983a.u().getContext(), z0.live_catalog_item_scale_down_animation));
            return false;
        } else if (action != 1) {
            return false;
        } else {
            q0Var.f49983a.u().startAnimation(AnimationUtils.loadAnimation(q0Var.f49983a.u().getContext(), z0.live_catalog_item_scale_up_animation));
            if (m0Var != null) {
                m0Var.a(lVar);
                return false;
            }
            return false;
        }
    }

    public static final boolean h(q0 q0Var, View view, MotionEvent motionEvent) {
        jo.p.h(q0Var, "this$0");
        int action = motionEvent.getAction();
        if (action == 0) {
            q0Var.f49983a.u().startAnimation(AnimationUtils.loadAnimation(q0Var.f49983a.u().getContext(), z0.live_catalog_item_scale_down_animation));
            return false;
        } else if (action == 1 || action == 3) {
            q0Var.f49983a.u().startAnimation(AnimationUtils.loadAnimation(q0Var.f49983a.u().getContext(), z0.live_catalog_item_scale_up_animation));
            return false;
        } else {
            return false;
        }
    }

    @SuppressLint({"SetJavaScriptEnabled", "ClickableViewAccessibility"})
    public final void d(final s8.l lVar, final m0 m0Var) {
        jo.p.h(lVar, "bindModel");
        this.f49983a.C.setText(lVar.c());
        this.f49983a.D.setText(lVar.d());
        LeftRoundedWebView leftRoundedWebView = this.f49983a.B;
        leftRoundedWebView.getSettings().setJavaScriptEnabled(true);
        leftRoundedWebView.getSettings().setDomStorageEnabled(true);
        this.f49983a.B.loadUrl(lVar.a());
        this.f49983a.u().setOnClickListener(new View.OnClickListener() { // from class: r8.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q0.f(m0.this, lVar, view);
            }
        });
        this.f49983a.B.setOnTouchListener(new View.OnTouchListener() { // from class: r8.p0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean g10;
                g10 = q0.g(q0.this, m0Var, lVar, view, motionEvent);
                return g10;
            }
        });
        this.f49983a.u().setOnTouchListener(new View.OnTouchListener() { // from class: r8.o0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean h10;
                h10 = q0.h(q0.this, view, motionEvent);
                return h10;
            }
        });
    }
}
