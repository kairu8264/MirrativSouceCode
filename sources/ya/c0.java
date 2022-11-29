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
public final class c0 extends RecyclerView.e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f61405b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f61406c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final db.u f61407a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final c0 a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), wa.f.view_holder_campaign_detail_broadcast_award, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new c0((db.u) e10, null);
        }
    }

    public c0(db.u uVar) {
        super(uVar.u());
        this.f61407a = uVar;
    }

    public /* synthetic */ c0(db.u uVar, jo.h hVar) {
        this(uVar);
    }

    public static final boolean c(c0 c0Var, io.a aVar, View view, MotionEvent motionEvent) {
        jo.p.h(c0Var, "this$0");
        jo.p.h(aVar, "$listener");
        int action = motionEvent.getAction();
        if (action == 0) {
            RoundedButtonView roundedButtonView = c0Var.f61407a.G;
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.95f, 1.0f, 0.95f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setInterpolator(new AccelerateInterpolator());
            scaleAnimation.setDuration(150L);
            scaleAnimation.setFillAfter(true);
            roundedButtonView.startAnimation(scaleAnimation);
        } else if (action == 1 || action == 3) {
            RoundedButtonView roundedButtonView2 = c0Var.f61407a.G;
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

    public final void b(l lVar, final io.a<wn.v> aVar, io.l<? super Integer, wn.v> lVar2, androidx.lifecycle.u uVar) {
        jo.p.h(lVar, "bindModelBroadcast");
        jo.p.h(aVar, "listener");
        jo.p.h(lVar2, "receivePrizesListener");
        jo.p.h(uVar, "lifecycleOwner");
        this.f61407a.T(lVar);
        db.u uVar2 = this.f61407a;
        uVar2.F.setLayoutManager(new LinearLayoutManager(uVar2.u().getContext()));
        db.u uVar3 = this.f61407a;
        uVar3.E.setLayoutManager(new LinearLayoutManager(uVar3.u().getContext()));
        RecyclerView recyclerView = this.f61407a.F;
        za.a aVar2 = new za.a(uVar);
        aVar2.a(lVar.b());
        aVar2.b(lVar2);
        recyclerView.setAdapter(aVar2);
        RecyclerView recyclerView2 = this.f61407a.E;
        b1 b1Var = new b1(10.0f);
        b1Var.c(lVar.h());
        recyclerView2.setAdapter(b1Var);
        jo.p.g(recyclerView2, "");
        recyclerView2.g(new p001if.c(de.n.b(recyclerView2, 4), 0, 0, 0, 0, 0, 32, null));
        this.f61407a.B.setVisibility(lVar.g().length() == 0 ? 8 : 0);
        this.f61407a.G.setTitle(lVar.f());
        this.f61407a.G.setIcon(lVar.e());
        this.f61407a.G.setBackgroundColor(lVar.d());
        this.f61407a.G.setOnTouchListener(new View.OnTouchListener() { // from class: ya.b0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean c10;
                c10 = c0.c(c0.this, aVar, view, motionEvent);
                return c10;
            }
        });
    }
}
