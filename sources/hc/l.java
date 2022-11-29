package hc;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class l extends RecyclerView.o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f35199a;

    public l(int i10) {
        this.f35199a = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        jo.p.h(rect, "outRect");
        jo.p.h(view, "view");
        jo.p.h(recyclerView, "parent");
        jo.p.h(b0Var, "state");
        int f02 = recyclerView.f0(view);
        int i10 = f02 % 3;
        int i11 = this.f35199a;
        rect.right = i11 / 2;
        rect.left = i11 / 2;
        rect.top = f02 / 3 == 0 ? 0 : i11 / 2;
        rect.bottom = 0;
    }
}
