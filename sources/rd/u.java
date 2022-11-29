package rd;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class u extends RecyclerView.h<qf.n0> {
    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: a */
    public void onBindViewHolder(qf.n0 n0Var, int i10) {
        jo.p.h(n0Var, "holder");
        View view = n0Var.itemView;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(1000L);
        view.startAnimation(alphaAnimation);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: b */
    public qf.n0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return qf.n0.f49303a.a(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return 1;
    }
}
