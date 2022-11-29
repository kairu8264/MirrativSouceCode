package cc;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import com.dena.mirrativ.streaming.emomo.CurrentUserGiftRankingViewHolder;
import ud.a;

/* loaded from: classes2.dex */
public final class b extends androidx.recyclerview.widget.t<ud.a, RecyclerView.e0> {

    /* renamed from: c  reason: collision with root package name */
    public final androidx.lifecycle.u f19039c;

    /* renamed from: d  reason: collision with root package name */
    public io.l<? super String, wn.v> f19040d;

    /* loaded from: classes2.dex */
    public static final class a extends j.f<ud.a> {
        @Override // androidx.recyclerview.widget.j.f
        @SuppressLint({"DiffUtilEquals"})
        /* renamed from: d */
        public boolean a(ud.a aVar, ud.a aVar2) {
            jo.p.h(aVar, "oldItem");
            jo.p.h(aVar2, "newItem");
            if ((aVar instanceof c) && (aVar2 instanceof c)) {
                return jo.p.c(aVar, aVar2);
            }
            if ((aVar instanceof t0) && (aVar2 instanceof t0)) {
                return jo.p.c(aVar, aVar2);
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(ud.a aVar, ud.a aVar2) {
            jo.p.h(aVar, "oldItem");
            jo.p.h(aVar2, "newItem");
            if ((aVar instanceof c) && (aVar2 instanceof c)) {
                if (((c) aVar).a().d() == ((c) aVar2).a().d()) {
                    return true;
                }
            } else if ((aVar instanceof t0) && (aVar2 instanceof t0) && ((t0) aVar).d() == ((t0) aVar2).d()) {
                return true;
            }
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.lifecycle.u uVar) {
        super(new a());
        jo.p.h(uVar, "viewLifecycleOwner");
        this.f19039c = uVar;
    }

    public static final void h(b bVar, t0 t0Var, View view) {
        jo.p.h(bVar, "this$0");
        jo.p.h(t0Var, "$bindModel");
        io.l<? super String, wn.v> lVar = bVar.f19040d;
        if (lVar != null) {
            lVar.invoke(t0Var.c());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return b(i10).getType().ordinal();
    }

    public final void i(io.l<? super String, wn.v> lVar) {
        this.f19040d = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof CurrentUserGiftRankingViewHolder) {
            ud.a b10 = b(i10);
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrativ.streaming.emomo.CurrentUserGiftRankingBindModel");
            ((CurrentUserGiftRankingViewHolder) e0Var).g((c) b10);
        } else if (e0Var instanceof j) {
            ud.a b11 = b(i10);
            jo.p.f(b11, "null cannot be cast to non-null type com.dena.mirrativ.streaming.emomo.StreamingGiftRankingCurrentUserRankBindModel");
            final t0 t0Var = (t0) b11;
            ((j) e0Var).d(t0Var);
            e0Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: cc.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.h(b.this, t0Var, view);
                }
            });
        } else {
            throw new IllegalArgumentException("unknown ViewHolder type " + e0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == a.EnumC0862a.CURRENT_USER_GIFT_RANKING.ordinal()) {
            CurrentUserGiftRankingViewHolder a10 = CurrentUserGiftRankingViewHolder.f23088f.a(this.f19039c, viewGroup);
            a10.j(this.f19040d);
            return a10;
        } else if (i10 == a.EnumC0862a.GIFT_RANKING_CURRENT_USER_RANK.ordinal()) {
            return j.f19063y.a(viewGroup);
        } else {
            throw new IllegalArgumentException("unknown view type " + i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewAttachedToWindow(RecyclerView.e0 e0Var) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof j) {
            ((j) e0Var).c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewDetachedFromWindow(RecyclerView.e0 e0Var) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof j) {
            ((j) e0Var).f();
        }
    }
}
