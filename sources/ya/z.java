package ya;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.RoundedButtonView;
import rd.b1;

/* loaded from: classes2.dex */
public final class z extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f61599b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f61600c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final db.a0 f61601a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final z a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), wa.f.view_holder_campaign_detail_share_award, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new z((db.a0) e10, null);
        }
    }

    public z(db.a0 a0Var) {
        super(a0Var.u());
        this.f61601a = a0Var;
        a0Var.E.g(new p001if.c(de.m.a(this, 4), 0, 0, 0, 0, 0, 32, null));
    }

    public /* synthetic */ z(db.a0 a0Var, jo.h hVar) {
        this(a0Var);
    }

    public static final boolean c(z zVar, io.a aVar, View view, MotionEvent motionEvent) {
        jo.p.h(zVar, "this$0");
        jo.p.h(aVar, "$listener");
        int action = motionEvent.getAction();
        if (action == 0) {
            RoundedButtonView roundedButtonView = zVar.f61601a.H;
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.95f, 1.0f, 0.95f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setInterpolator(new AccelerateInterpolator());
            scaleAnimation.setDuration(150L);
            scaleAnimation.setFillAfter(true);
            roundedButtonView.startAnimation(scaleAnimation);
        } else if (action == 1 || action == 3) {
            RoundedButtonView roundedButtonView2 = zVar.f61601a.H;
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.95f, 1.0f, 0.95f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation2.setInterpolator(new DecelerateInterpolator());
            scaleAnimation2.setDuration(150L);
            scaleAnimation2.setFillAfter(true);
            roundedButtonView2.startAnimation(scaleAnimation2);
            wn.v vVar = wn.v.f59242a;
            if (motionEvent.getAction() == 1) {
                aVar.invoke();
            }
        }
        return true;
    }

    public final void b(x xVar, final io.a<wn.v> aVar, io.l<? super Integer, wn.v> lVar, androidx.lifecycle.u uVar) {
        jo.p.h(xVar, "bindModel");
        jo.p.h(aVar, "listener");
        jo.p.h(lVar, "receivePrizesListener");
        jo.p.h(uVar, "lifecycleOwner");
        this.f61601a.T(xVar);
        db.a0 a0Var = this.f61601a;
        a0Var.F.setLayoutManager(new LinearLayoutManager(a0Var.u().getContext()));
        db.a0 a0Var2 = this.f61601a;
        a0Var2.E.setLayoutManager(new LinearLayoutManager(a0Var2.u().getContext()));
        RecyclerView recyclerView = this.f61601a.F;
        za.a aVar2 = new za.a(uVar);
        aVar2.a(xVar.b());
        aVar2.b(lVar);
        recyclerView.setAdapter(aVar2);
        RecyclerView recyclerView2 = this.f61601a.E;
        b1 b1Var = new b1(10.0f);
        b1Var.c(xVar.d());
        recyclerView2.setAdapter(b1Var);
        this.f61601a.B.setVisibility(xVar.c().length() == 0 ? 8 : 0);
        this.f61601a.H.setOnTouchListener(new View.OnTouchListener() { // from class: ya.y
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean c10;
                c10 = z.c(z.this, aVar, view, motionEvent);
                return c10;
            }
        });
    }
}
