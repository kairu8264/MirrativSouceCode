package rd;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import qf.g3;

/* loaded from: classes2.dex */
public final class b1 extends RecyclerView.h<g3> {

    /* renamed from: a  reason: collision with root package name */
    public final float f51097a;

    /* renamed from: b  reason: collision with root package name */
    public List<String> f51098b = xn.s.k();

    public b1(float f10) {
        this.f51097a = f10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: a */
    public void onBindViewHolder(g3 g3Var, int i10) {
        jo.p.h(g3Var, "holder");
        g3Var.a(this.f51098b.get(i10), this.f51097a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: b */
    public g3 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return g3.f49172b.a(viewGroup);
    }

    public final void c(List<String> list) {
        jo.p.h(list, "value");
        this.f51098b = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f51098b.size();
    }
}
