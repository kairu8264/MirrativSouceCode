package rd;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import qf.u1;

/* loaded from: classes2.dex */
public final class r0 extends RecyclerView.h<u1> {

    /* renamed from: a  reason: collision with root package name */
    public List<String> f51220a = xn.s.k();

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: a */
    public void onBindViewHolder(u1 u1Var, int i10) {
        jo.p.h(u1Var, "holder");
        u1Var.a(this.f51220a.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: b */
    public u1 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return u1.f49398b.a(viewGroup);
    }

    public final void c(List<String> list) {
        jo.p.h(list, "value");
        this.f51220a = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f51220a.size();
    }
}
