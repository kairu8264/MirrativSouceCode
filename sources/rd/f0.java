package rd;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import ud.a;
import ud.n1;

/* loaded from: classes2.dex */
public final class f0 extends RecyclerView.h<RecyclerView.e0> {

    /* renamed from: a  reason: collision with root package name */
    public List<n1> f51143a = xn.s.k();

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: a */
    public qf.a1 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == a.EnumC0862a.LANDING_PAGE_DESCRIPTION.ordinal()) {
            return qf.a1.f49034b.a(viewGroup);
        }
        throw new IllegalArgumentException("unknown view type " + i10);
    }

    public final void b(List<n1> list) {
        jo.p.h(list, "value");
        this.f51143a = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f51143a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return this.f51143a.get(i10).getType().ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof qf.a1) {
            ((qf.a1) e0Var).a(this.f51143a.get(i10));
            return;
        }
        throw new IllegalArgumentException("unknown view holder " + e0Var);
    }
}
