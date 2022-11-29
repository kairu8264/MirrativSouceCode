package yd;

import ae.el;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.customview.MutualFolloweeView;

/* loaded from: classes2.dex */
public final class s0 extends RecyclerView.o {

    /* renamed from: a  reason: collision with root package name */
    public final int f61793a;

    public s0(MutualFolloweeView mutualFolloweeView) {
        el elVar;
        elVar = mutualFolloweeView.f25538w;
        View u10 = elVar.u();
        jo.p.g(u10, "binding.root");
        this.f61793a = de.n.b(u10, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        jo.p.h(rect, "outRect");
        jo.p.h(view, "view");
        jo.p.h(recyclerView, "parent");
        jo.p.h(b0Var, "state");
        super.g(rect, view, recyclerView, b0Var);
        int f02 = recyclerView.f0(view);
        RecyclerView.h adapter = recyclerView.getAdapter();
        if (adapter == null || f02 == adapter.getItemCount() - 1) {
            return;
        }
        rect.left = -this.f61793a;
    }
}
