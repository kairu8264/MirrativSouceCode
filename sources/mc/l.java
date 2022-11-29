package mc;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;

/* loaded from: classes2.dex */
public final class l extends androidx.recyclerview.widget.t<n, RecyclerView.e0> {

    /* renamed from: c  reason: collision with root package name */
    public boolean f40791c;

    /* renamed from: d  reason: collision with root package name */
    public io.l<? super String, wn.v> f40792d;

    /* renamed from: e  reason: collision with root package name */
    public io.l<? super String, wn.v> f40793e;

    /* renamed from: f  reason: collision with root package name */
    public io.p<? super String, ? super Integer, wn.v> f40794f;

    /* loaded from: classes2.dex */
    public static final class a extends j.f<n> {
        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: d */
        public boolean a(n nVar, n nVar2) {
            jo.p.h(nVar, "oldItem");
            jo.p.h(nVar2, "newItem");
            return jo.p.c(nVar, nVar2);
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(n nVar, n nVar2) {
            jo.p.h(nVar, "oldItem");
            jo.p.h(nVar2, "newItem");
            return jo.p.c(nVar.l(), nVar2.l());
        }
    }

    public l() {
        super(new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: g */
    public o onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return o.f40818y.a(viewGroup);
    }

    public final void h(io.l<? super String, wn.v> lVar) {
        this.f40792d = lVar;
    }

    public final void i(io.p<? super String, ? super Integer, wn.v> pVar) {
        this.f40794f = pVar;
    }

    public final void j(io.l<? super String, wn.v> lVar) {
        this.f40793e = lVar;
    }

    public final void k(boolean z10) {
        this.f40791c = z10;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof o) {
            o oVar = (o) e0Var;
            n b10 = b(i10);
            jo.p.g(b10, "getItem(position)");
            oVar.b(b10, this.f40791c, this.f40792d, this.f40793e, this.f40794f);
        }
    }
}
