package xb;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;

/* loaded from: classes2.dex */
public final class w extends androidx.recyclerview.widget.t<t, RecyclerView.e0> {

    /* renamed from: c  reason: collision with root package name */
    public io.l<? super t, wn.v> f60113c;

    /* loaded from: classes2.dex */
    public static final class a extends j.f<t> {
        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: d */
        public boolean a(t tVar, t tVar2) {
            jo.p.h(tVar, "oldItem");
            jo.p.h(tVar2, "newItem");
            return jo.p.c(tVar, tVar2);
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(t tVar, t tVar2) {
            jo.p.h(tVar, "oldItem");
            jo.p.h(tVar2, "newItem");
            return tVar.d() == tVar2.d() && jo.p.c(tVar.c(), tVar2.c());
        }
    }

    public w() {
        super(new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: g */
    public x onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return x.f60114b.a(viewGroup);
    }

    public final void h(io.l<? super t, wn.v> lVar) {
        this.f60113c = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof x) {
            t b10 = b(i10);
            jo.p.g(b10, "getItem(position)");
            ((x) e0Var).a(b10, this.f60113c);
            return;
        }
        throw new IllegalArgumentException("unknown view holder " + e0Var);
    }
}
