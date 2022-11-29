package cc;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import qf.y0;
import ud.a;
import ud.c1;

/* loaded from: classes2.dex */
public final class i extends RecyclerView.h<RecyclerView.e0> {

    /* renamed from: a  reason: collision with root package name */
    public List<? extends ud.a> f19060a = xn.s.k();

    /* renamed from: b  reason: collision with root package name */
    public io.l<? super String, wn.v> f19061b;

    public static final void c(i iVar, t0 t0Var, View view) {
        jo.p.h(iVar, "this$0");
        jo.p.h(t0Var, "$bindModel");
        io.l<? super String, wn.v> lVar = iVar.f19061b;
        if (lVar != null) {
            lVar.invoke(t0Var.c());
        }
    }

    public static final void d(i iVar, c1 c1Var, View view) {
        jo.p.h(iVar, "this$0");
        jo.p.h(c1Var, "$bindModel");
        io.l<? super String, wn.v> lVar = iVar.f19061b;
        if (lVar != null) {
            lVar.invoke(c1Var.b());
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void f(List<? extends ud.a> list) {
        jo.p.h(list, "value");
        this.f19060a = list;
        notifyDataSetChanged();
    }

    public final void g(io.l<? super String, wn.v> lVar) {
        this.f19061b = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        List<? extends ud.a> list = this.f19060a;
        return list.get(i10 % list.size()).getType().ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof j) {
            List<? extends ud.a> list = this.f19060a;
            ud.a aVar = list.get(i10 % list.size());
            jo.p.f(aVar, "null cannot be cast to non-null type com.dena.mirrativ.streaming.emomo.StreamingGiftRankingCurrentUserRankBindModel");
            final t0 t0Var = (t0) aVar;
            ((j) e0Var).d(t0Var);
            e0Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: cc.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i.c(i.this, t0Var, view);
                }
            });
        } else if (e0Var instanceof y0) {
            List<? extends ud.a> list2 = this.f19060a;
            ud.a aVar2 = list2.get(i10 % list2.size());
            jo.p.f(aVar2, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.GiftRankingCurrentUserRewardBindModel");
            final c1 c1Var = (c1) aVar2;
            ((y0) e0Var).d(c1Var);
            e0Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: cc.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i.d(i.this, c1Var, view);
                }
            });
        } else {
            throw new IllegalArgumentException("unknown view holder: " + e0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == a.EnumC0862a.GIFT_RANKING_CURRENT_USER_RANK.ordinal()) {
            return j.f19063y.a(viewGroup);
        }
        if (i10 == a.EnumC0862a.GIFT_RANKING_CURRENT_USER_REWARD.ordinal()) {
            return y0.f49443c.a(viewGroup);
        }
        throw new IllegalArgumentException("unknown view type: " + i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewAttachedToWindow(RecyclerView.e0 e0Var) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof j) {
            ((j) e0Var).c();
        } else if (e0Var instanceof y0) {
            ((y0) e0Var).c();
        } else {
            throw new IllegalArgumentException("unknown view holder: " + e0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewDetachedFromWindow(RecyclerView.e0 e0Var) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof j) {
            ((j) e0Var).f();
        } else if (e0Var instanceof y0) {
            ((y0) e0Var).f();
        } else {
            throw new IllegalArgumentException("unknown view holder: " + e0Var);
        }
    }
}
