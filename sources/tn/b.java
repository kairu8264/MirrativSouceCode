package tn;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import jo.p;
import tn.a;

/* loaded from: classes4.dex */
public class b extends a {
    @Override // tn.a
    public void c0(RecyclerView.e0 e0Var) {
        p.h(e0Var, "holder");
        ViewPropertyAnimator animate = e0Var.itemView.animate();
        animate.translationY(0.0f);
        animate.alpha(1.0f);
        animate.setDuration(l());
        animate.setInterpolator(animate.getInterpolator());
        animate.setListener(new a.d(this, e0Var));
        animate.setStartDelay(o0(e0Var));
        animate.start();
    }

    @Override // tn.a
    public void f0(RecyclerView.e0 e0Var) {
        p.h(e0Var, "holder");
        ViewPropertyAnimator animate = e0Var.itemView.animate();
        View view = e0Var.itemView;
        p.g(view, "holder.itemView");
        animate.translationY(-view.getHeight());
        animate.alpha(0.0f);
        animate.setDuration(o());
        animate.setInterpolator(animate.getInterpolator());
        animate.setListener(new a.e(this, e0Var));
        animate.setStartDelay(q0(e0Var));
        animate.start();
    }

    @Override // tn.a
    public void s0(RecyclerView.e0 e0Var) {
        p.h(e0Var, "holder");
        View view = e0Var.itemView;
        p.g(view, "holder.itemView");
        View view2 = e0Var.itemView;
        p.g(view2, "holder.itemView");
        view.setTranslationY(-view2.getHeight());
        View view3 = e0Var.itemView;
        p.g(view3, "holder.itemView");
        view3.setAlpha(0.0f);
    }
}
