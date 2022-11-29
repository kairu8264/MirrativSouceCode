package p001if;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import jo.p;

/* renamed from: if.a  reason: invalid package */
/* loaded from: classes2.dex */
public final class a extends RecyclerView.o {

    /* renamed from: a  reason: collision with root package name */
    public final int f36808a;

    public a(int i10) {
        this.f36808a = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        p.h(rect, "outRect");
        p.h(view, "view");
        p.h(recyclerView, "parent");
        p.h(b0Var, "state");
        super.g(rect, view, recyclerView, b0Var);
        RecyclerView.p layoutManager = recyclerView.getLayoutManager();
        p.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        int f32 = gridLayoutManager.f3();
        gridLayoutManager.j0();
        int f02 = recyclerView.f0(view);
        int i10 = this.f36808a;
        rect.left = i10 / 2;
        rect.right = i10 / 2;
        if (f32 <= 1 || f02 % f32 == 0) {
            return;
        }
        rect.top = i10 / 2;
    }
}
