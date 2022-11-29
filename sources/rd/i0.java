package rd;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import ud.a;
import ud.r1;

/* loaded from: classes2.dex */
public final class i0 extends RecyclerView.h<RecyclerView.e0> {

    /* renamed from: a  reason: collision with root package name */
    public List<r1> f51155a = xn.s.k();

    /* renamed from: b  reason: collision with root package name */
    public io.l<? super Integer, wn.v> f51156b;

    /* renamed from: c  reason: collision with root package name */
    public io.l<? super String, wn.v> f51157c;

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: a */
    public qf.e1 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == a.EnumC0862a.LANDING_PAGE_RANKING_USER.ordinal()) {
            return qf.e1.f49118b.a(viewGroup);
        }
        throw new IllegalArgumentException("unknown view type " + i10);
    }

    public final void b(io.l<? super String, wn.v> lVar) {
        this.f51157c = lVar;
    }

    public final void c(io.l<? super Integer, wn.v> lVar) {
        this.f51156b = lVar;
    }

    public final void d(List<r1> list) {
        jo.p.h(list, "value");
        this.f51155a = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f51155a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return this.f51155a.get(i10).getType().ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof qf.e1) {
            ((qf.e1) e0Var).d(this.f51155a.get(i10), this.f51156b, this.f51157c);
            return;
        }
        throw new IllegalArgumentException("unknown view holder " + e0Var);
    }
}
