package r8;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import s8.a;

/* loaded from: classes.dex */
public final class g extends RecyclerView.h<RecyclerView.e0> {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.lifecycle.u f49901a;

    /* renamed from: b  reason: collision with root package name */
    public List<? extends s8.a> f49902b;

    /* renamed from: c  reason: collision with root package name */
    public h0 f49903c;

    /* renamed from: d  reason: collision with root package name */
    public c f49904d;

    /* renamed from: e  reason: collision with root package name */
    public m0 f49905e;

    public g(androidx.lifecycle.u uVar) {
        jo.p.h(uVar, "lifecycleOwner");
        this.f49901a = uVar;
        this.f49902b = xn.s.k();
    }

    public final int a() {
        return getItemCount() / 2;
    }

    public final List<s8.a> b() {
        return this.f49902b;
    }

    public final int c(int i10) {
        return i10 % this.f49902b.size();
    }

    public final void d(c cVar) {
        this.f49904d = cVar;
    }

    public final void f(m0 m0Var) {
        this.f49905e = m0Var;
    }

    public final void g(List<? extends s8.a> list) {
        jo.p.h(list, "value");
        this.f49902b = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f49902b.size() * 1000;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return this.f49902b.get(c(i10)).getType().ordinal();
    }

    public final void h(h0 h0Var) {
        this.f49903c = h0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        int c10 = c(i10);
        if (e0Var instanceof g0) {
            s8.a aVar = this.f49902b.get(c10);
            jo.p.f(aVar, "null cannot be cast to non-null type com.dena.mirrativ.catalog.bindmodel.CatalogMirrativQBindModel");
            ((g0) e0Var).g((s8.i) aVar, this.f49901a, this.f49903c);
        } else if (e0Var instanceof f) {
            s8.a aVar2 = this.f49902b.get(c10);
            jo.p.f(aVar2, "null cannot be cast to non-null type com.dena.mirrativ.catalog.bindmodel.CatalogBannerBindModel");
            ((f) e0Var).c((s8.b) aVar2, this.f49904d);
        } else if (e0Var instanceof q0) {
            s8.a aVar3 = this.f49902b.get(c10);
            jo.p.f(aVar3, "null cannot be cast to non-null type com.dena.mirrativ.catalog.bindmodel.CatalogWebBannerBindModel");
            ((q0) e0Var).d((s8.l) aVar3, this.f49905e);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == a.b.MIRRATIV_Q.ordinal()) {
            return g0.f49906b.a(viewGroup);
        }
        if (i10 == a.b.CATALOG_BANNER.ordinal()) {
            return f.f49896b.a(viewGroup);
        }
        if (i10 == a.b.CATALOG_WEB_BANNER.ordinal()) {
            return q0.f49981b.a(viewGroup);
        }
        throw new IllegalArgumentException("unknown view type " + i10);
    }
}
