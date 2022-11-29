package z9;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import ud.a;

/* loaded from: classes.dex */
public final class b0 extends androidx.recyclerview.widget.t<ud.a, RecyclerView.e0> {

    /* renamed from: c  reason: collision with root package name */
    public io.l<? super Integer, wn.v> f62804c;

    /* renamed from: d  reason: collision with root package name */
    public io.l<? super String, wn.v> f62805d;

    /* renamed from: e  reason: collision with root package name */
    public io.a<wn.v> f62806e;

    /* loaded from: classes.dex */
    public static final class a extends j.f<ud.a> {
        @Override // androidx.recyclerview.widget.j.f
        @SuppressLint({"DiffUtilEquals"})
        /* renamed from: d */
        public boolean a(ud.a aVar, ud.a aVar2) {
            jo.p.h(aVar, "oldItem");
            jo.p.h(aVar2, "newItem");
            return jo.p.c(aVar, aVar2);
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(ud.a aVar, ud.a aVar2) {
            jo.p.h(aVar, "oldItem");
            jo.p.h(aVar2, "newItem");
            return jo.p.c(aVar, aVar2);
        }
    }

    public b0() {
        super(new a());
    }

    public final void g(io.a<wn.v> aVar) {
        this.f62806e = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return b(i10).getType().ordinal();
    }

    public final void h(io.l<? super String, wn.v> lVar) {
        this.f62805d = lVar;
    }

    public final void i(io.l<? super Integer, wn.v> lVar) {
        this.f62804c = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof d0) {
            ud.a b10 = b(i10);
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrativ.emomo.giftranking.GiftRankingWholeRankingUserBindModel");
            ((d0) e0Var).a((c0) b10, this.f62804c, this.f62805d);
        } else if (e0Var instanceof n) {
            ud.a b11 = b(i10);
            jo.p.f(b11, "null cannot be cast to non-null type com.dena.mirrativ.emomo.giftranking.GiftRankingExpandBindModel");
            ((n) e0Var).a((m) b11, this.f62806e);
        } else {
            throw new IllegalArgumentException("unknown view holder " + e0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == a.EnumC0862a.GIFT_RANKING_WHOLE_RANKING_USER.ordinal()) {
            return d0.f62813b.a(viewGroup);
        }
        if (i10 == a.EnumC0862a.GIFT_RANKING_EXPAND.ordinal()) {
            return n.f62859b.a(viewGroup);
        }
        throw new IllegalArgumentException("unknown view type " + i10);
    }
}
