package rd;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import ud.a;

/* loaded from: classes2.dex */
public final class n extends RecyclerView.h<RecyclerView.e0> {

    /* renamed from: a  reason: collision with root package name */
    public List<ud.a0> f51196a = xn.s.k();

    /* renamed from: b  reason: collision with root package name */
    public io.p<? super String, ? super View, wn.v> f51197b;

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: a */
    public qf.h0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == a.EnumC0862a.EMOMO_RUN_GIFT.ordinal()) {
            return qf.h0.f49192b.a(viewGroup);
        }
        throw new IllegalArgumentException("unknown view type " + i10);
    }

    public final void b(io.p<? super String, ? super View, wn.v> pVar) {
        this.f51197b = pVar;
    }

    public final void c(List<ud.a0> list) {
        jo.p.h(list, "value");
        this.f51196a = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f51196a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return this.f51196a.get(i10).getType().ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof qf.h0) {
            ((qf.h0) e0Var).b(this.f51196a.get(i10), this.f51197b);
            return;
        }
        throw new IllegalArgumentException("unknown view holder " + e0Var);
    }
}
