package rd;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes2.dex */
public final class b0 extends RecyclerView.h<RecyclerView.e0> {

    /* renamed from: a  reason: collision with root package name */
    public final List<ud.q0> f51096a;

    public b0(List<ud.q0> list) {
        jo.p.h(list, "items");
        this.f51096a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f51096a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return this.f51096a.get(i10).c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof qf.t0) {
            ((qf.t0) e0Var).a(this.f51096a.get(i10));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == 0) {
            return qf.p0.f49322b.a(viewGroup);
        }
        return qf.t0.f49384b.a(viewGroup);
    }
}
