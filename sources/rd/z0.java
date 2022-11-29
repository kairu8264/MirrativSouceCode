package rd;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import qf.s2;
import qf.w2;
import ud.a;
import ud.w3;
import ud.x3;

/* loaded from: classes2.dex */
public final class z0 extends androidx.recyclerview.widget.t<ud.a, RecyclerView.e0> {

    /* renamed from: c  reason: collision with root package name */
    public io.l<? super Integer, wn.v> f51305c;

    /* renamed from: d  reason: collision with root package name */
    public io.l<? super String, wn.v> f51306d;

    /* renamed from: e  reason: collision with root package name */
    public io.a<wn.v> f51307e;

    /* loaded from: classes2.dex */
    public static final class a extends j.f<ud.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f51308a = new a();

        @Override // androidx.recyclerview.widget.j.f
        @SuppressLint({"DiffUtilEquals"})
        /* renamed from: d */
        public boolean a(ud.a aVar, ud.a aVar2) {
            jo.p.h(aVar, "oldItem");
            jo.p.h(aVar2, "newItem");
            if ((aVar instanceof x3) && (aVar2 instanceof x3)) {
                return jo.p.c(aVar, aVar2);
            }
            if ((aVar instanceof w3) && (aVar2 instanceof w3)) {
                return jo.p.c(aVar, aVar2);
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(ud.a aVar, ud.a aVar2) {
            jo.p.h(aVar, "oldItem");
            jo.p.h(aVar2, "newItem");
            return ((aVar instanceof x3) && (aVar2 instanceof x3)) ? jo.p.c(String.valueOf(((x3) aVar).q()), String.valueOf(((x3) aVar2).q())) : (aVar instanceof w3) && (aVar2 instanceof w3) && aVar == aVar2;
        }
    }

    public z0() {
        super(a.f51308a);
    }

    public final void g(io.a<wn.v> aVar) {
        this.f51307e = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return b(i10).getType().ordinal();
    }

    public final void h(io.l<? super String, wn.v> lVar) {
        this.f51306d = lVar;
    }

    public final void i(io.l<? super Integer, wn.v> lVar) {
        this.f51305c = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof w2) {
            ud.a b10 = b(i10);
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.ShooterRankingUserBindModel");
            ((w2) e0Var).d((x3) b10, this.f51305c, this.f51306d);
        } else if (e0Var instanceof s2) {
            ud.a b11 = b(i10);
            jo.p.f(b11, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.ShooterRankingExpandBindModel");
            ((s2) e0Var).a((w3) b11, this.f51307e);
        } else {
            throw new IllegalArgumentException("unknown view holder " + e0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == a.EnumC0862a.SHOOTER_RANKING_USER.ordinal()) {
            return w2.f49420b.a(viewGroup);
        }
        if (i10 == a.EnumC0862a.SHOOTER_RANKING_EXPAND.ordinal()) {
            return s2.f49378b.a(viewGroup);
        }
        throw new IllegalArgumentException("unknown view type " + i10);
    }
}
