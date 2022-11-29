package cc;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import ud.a;
import ud.d1;
import ud.e1;

/* loaded from: classes2.dex */
public final class k extends androidx.recyclerview.widget.t<ud.a, RecyclerView.e0> {

    /* loaded from: classes2.dex */
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

    public k() {
        super(new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return b(i10).getType().ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof m) {
            ud.a b10 = b(i10);
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.GiftRankingRankUpRouletteUserBindModel");
            ((m) e0Var).a((e1) b10);
        } else if (e0Var instanceof l) {
            ud.a b11 = b(i10);
            jo.p.f(b11, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.GiftRankingRankUpRouletteDummyUserBindModel");
            ((l) e0Var).a((d1) b11);
        } else {
            throw new IllegalArgumentException("unknown ViewHolder type " + e0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == a.EnumC0862a.GIFT_RANKING_RANK_UP_NEARBY_USER.ordinal()) {
            return m.f19079b.a(viewGroup);
        }
        if (i10 == a.EnumC0862a.GIFT_RANKING_RANK_UP_NEARBY_DUMMY_USER.ordinal()) {
            return l.f19075b.a(viewGroup);
        }
        throw new IllegalArgumentException("unknown view type " + i10);
    }
}
