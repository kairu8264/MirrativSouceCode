package p001if;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.InsetDrawable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import c3.a;
import jo.p;

/* renamed from: if.d  reason: invalid package */
/* loaded from: classes2.dex */
public final class d extends k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, int i10, int i11, int i12) {
        super(context, i10);
        p.h(context, "context");
        n(new InsetDrawable(a.f(context, i11), 0, i12, 0, i12));
    }

    @Override // androidx.recyclerview.widget.k, androidx.recyclerview.widget.RecyclerView.o
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        p.h(canvas, "canvas");
        p.h(recyclerView, "parent");
        p.h(b0Var, "state");
        RecyclerView.h adapter = recyclerView.getAdapter();
        if (adapter == null || adapter.getItemCount() == 1) {
            return;
        }
        super.i(canvas, recyclerView, b0Var);
    }
}
