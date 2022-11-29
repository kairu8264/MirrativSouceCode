package rd;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import qf.l2;
import ud.f3;

/* loaded from: classes2.dex */
public final class u0 extends RecyclerView.h<l2> {

    /* renamed from: a  reason: collision with root package name */
    public List<f3> f51238a = xn.s.k();

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: a */
    public void onBindViewHolder(l2 l2Var, int i10) {
        jo.p.h(l2Var, "holder");
        l2Var.a(this.f51238a.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: b */
    public l2 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return l2.f49286b.a(viewGroup);
    }

    public final void c(List<f3> list) {
        jo.p.h(list, "value");
        this.f51238a = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f51238a.size();
    }
}
