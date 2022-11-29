package rd;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class v extends RecyclerView.h<qf.o0> {
    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: a */
    public void onBindViewHolder(qf.o0 o0Var, int i10) {
        jo.p.h(o0Var, "holder");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: b */
    public qf.o0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return qf.o0.f49314a.a(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return 1;
    }
}
