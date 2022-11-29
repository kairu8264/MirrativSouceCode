package p001if;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import jo.p;

/* renamed from: if.b  reason: invalid package */
/* loaded from: classes2.dex */
public final class b extends RecyclerView.o {

    /* renamed from: a  reason: collision with root package name */
    public final int f36809a;

    public b(int i10) {
        this.f36809a = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        p.h(rect, "outRect");
        p.h(view, "view");
        p.h(recyclerView, "parent");
        p.h(b0Var, "state");
        super.g(rect, view, recyclerView, b0Var);
        int i10 = this.f36809a;
        rect.top = i10 / 2;
        rect.bottom = i10 / 2;
    }
}
