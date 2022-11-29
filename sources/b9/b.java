package b9;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import jo.p;
import s8.n;
import s8.o;
import xn.s;

/* loaded from: classes.dex */
public final class b extends RecyclerView.h<RecyclerView.e0> {

    /* renamed from: a  reason: collision with root package name */
    public List<? extends o> f17099a = s.k();

    public final void a(List<? extends o> list) {
        p.h(list, "value");
        this.f17099a = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f17099a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return this.f17099a.get(i10).getId().ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        p.h(e0Var, "holder");
        if (e0Var instanceof c) {
            o oVar = this.f17099a.get(i10);
            p.f(oVar, "null cannot be cast to non-null type com.dena.mirrativ.catalog.bindmodel.PrivateLiveCatalogViewerBindModel");
            ((c) e0Var).a((n) oVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        p.h(viewGroup, "parent");
        if (i10 == o.a.VIEWER.ordinal()) {
            return c.f17100b.a(viewGroup);
        }
        if (i10 == o.a.MORE_USERS.ordinal()) {
            return a.f17098a.a(viewGroup);
        }
        throw new IllegalArgumentException("unknown view type " + i10);
    }
}
