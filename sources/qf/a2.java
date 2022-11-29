package qf;

import ae.gh;
import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class a2 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f49037b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f49038c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final gh f49039a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final a2 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_onboarding_app, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new a2((gh) e10, null);
        }
    }

    public a2(gh ghVar) {
        super(ghVar.u());
        this.f49039a = ghVar;
    }

    public /* synthetic */ a2(gh ghVar, jo.h hVar) {
        this(ghVar);
    }

    public static final boolean f(a2 a2Var, View view, MotionEvent motionEvent) {
        jo.p.h(a2Var, "this$0");
        int action = motionEvent.getAction();
        if (action == 0) {
            AppCompatImageView appCompatImageView = a2Var.f49039a.B;
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, 50.0f, 50.0f);
            scaleAnimation.setInterpolator(new DecelerateInterpolator());
            scaleAnimation.setDuration(150L);
            scaleAnimation.setFillAfter(true);
            appCompatImageView.startAnimation(scaleAnimation);
        } else if (action == 1 || action == 3) {
            AppCompatImageView appCompatImageView2 = a2Var.f49039a.B;
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 50.0f, 50.0f);
            scaleAnimation2.setInterpolator(new AccelerateInterpolator());
            scaleAnimation2.setDuration(150L);
            scaleAnimation2.setFillAfter(true);
            appCompatImageView2.startAnimation(scaleAnimation2);
            wn.v vVar = wn.v.f59242a;
            if (motionEvent.getAction() == 1) {
                a2Var.f49039a.u().performClick();
            }
        }
        return true;
    }

    public static final void g(io.a aVar, View view) {
        jo.p.h(aVar, "$onClick");
        aVar.invoke();
    }

    public final void c(androidx.lifecycle.u uVar, ud.m mVar) {
        jo.p.h(uVar, "lifecycleOwner");
        jo.p.h(mVar, "bindModel");
        this.f49039a.M(uVar);
        this.f49039a.T(mVar);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void d(final io.a<wn.v> aVar) {
        jo.p.h(aVar, "onClick");
        this.f49039a.E.setOnTouchListener(new View.OnTouchListener() { // from class: qf.z1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean f10;
                f10 = a2.f(a2.this, view, motionEvent);
                return f10;
            }
        });
        this.f49039a.u().setOnClickListener(new View.OnClickListener() { // from class: qf.y1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a2.g(io.a.this, view);
            }
        });
    }
}
