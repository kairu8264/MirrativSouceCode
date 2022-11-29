package rd;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import qf.q1;

/* loaded from: classes2.dex */
public final class p0 extends RecyclerView.h<q1> {

    /* renamed from: a  reason: collision with root package name */
    public List<String> f51213a = xn.s.k();

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: a */
    public void onBindViewHolder(q1 q1Var, int i10) {
        jo.p.h(q1Var, "holder");
        q1Var.a(this.f51213a.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: b */
    public q1 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return q1.f49348b.a(viewGroup);
    }

    public final void c(List<String> list) {
        jo.p.h(list, "value");
        this.f51213a = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f51213a.size();
    }
}
