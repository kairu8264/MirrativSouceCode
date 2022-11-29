package rd;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import com.mirrativ.llstream.decoder.PacketJitterConfig;
import ud.n0;
import yd.g1;

/* loaded from: classes2.dex */
public final class a0 extends androidx.recyclerview.widget.t<ud.n0, RecyclerView.e0> {

    /* renamed from: c  reason: collision with root package name */
    public final io.l<ud.m0, wn.v> f51084c;

    /* renamed from: d  reason: collision with root package name */
    public final io.l<ud.o0, wn.v> f51085d;

    /* renamed from: e  reason: collision with root package name */
    public long f51086e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f51087f;

    /* loaded from: classes2.dex */
    public static final class a extends j.f<ud.n0> {
        @Override // androidx.recyclerview.widget.j.f
        @SuppressLint({"DiffUtilEquals"})
        /* renamed from: d */
        public boolean a(ud.n0 n0Var, ud.n0 n0Var2) {
            jo.p.h(n0Var, "oldItem");
            jo.p.h(n0Var2, "newItem");
            if ((n0Var instanceof ud.m0) && (n0Var2 instanceof ud.m0)) {
                return jo.p.c(n0Var, n0Var2);
            }
            if ((n0Var instanceof ud.o0) && (n0Var2 instanceof ud.o0)) {
                return jo.p.c(n0Var, n0Var2);
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(ud.n0 n0Var, ud.n0 n0Var2) {
            jo.p.h(n0Var, "oldItem");
            jo.p.h(n0Var2, "newItem");
            if ((n0Var instanceof ud.m0) && (n0Var2 instanceof ud.m0)) {
                ud.m0 m0Var = (ud.m0) n0Var;
                ud.m0 m0Var2 = (ud.m0) n0Var2;
                if (m0Var.d() == m0Var2.d() && jo.p.c(m0Var.h(), m0Var2.h()) && m0Var.e() == m0Var2.e()) {
                    return true;
                }
            } else if ((n0Var instanceof ud.o0) && (n0Var2 instanceof ud.o0)) {
                ud.o0 o0Var = (ud.o0) n0Var;
                ud.o0 o0Var2 = (ud.o0) n0Var2;
                if (o0Var.b() == o0Var2.b() && jo.p.c(o0Var.d(), o0Var2.d())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ud.m0 f51089x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ud.m0 m0Var) {
            super(1);
            this.f51089x = m0Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - a0.this.f51086e > PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS) {
                a0.this.f51086e = elapsedRealtime;
                a0.this.f51084c.invoke(this.f51089x);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ud.o0 f51091x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ud.o0 o0Var) {
            super(1);
            this.f51091x = o0Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - a0.this.f51086e > PacketJitterConfig.MAX_BUFFER_QUEUE_TIME_MS) {
                a0.this.f51086e = elapsedRealtime;
                a0.this.f51085d.invoke(this.f51091x);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a0(io.l<? super ud.m0, wn.v> lVar, io.l<? super ud.o0, wn.v> lVar2) {
        super(new a());
        jo.p.h(lVar, "onClickGachaItem");
        jo.p.h(lVar2, "onClickMutualGiftItem");
        this.f51084c = lVar;
        this.f51085d = lVar2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return b(i10).getType().ordinal();
    }

    public final void k(boolean z10) {
        this.f51087f = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof qf.s0) {
            ud.n0 b10 = b(i10);
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.GiftGachaStockBindModel");
            ud.m0 m0Var = (ud.m0) b10;
            ((qf.s0) e0Var).a(m0Var);
            View view = e0Var.itemView;
            jo.p.g(view, "holder.itemView");
            g1.a(view, new b(m0Var));
            if (i10 == 0 && this.f51087f) {
                ((qf.s0) e0Var).c();
            }
        } else if (e0Var instanceof qf.r0) {
            ud.n0 b11 = b(i10);
            jo.p.f(b11, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.GiftGachaStockMutualGiftBindModel");
            ud.o0 o0Var = (ud.o0) b11;
            ((qf.r0) e0Var).a(o0Var);
            View view2 = e0Var.itemView;
            jo.p.g(view2, "holder.itemView");
            g1.a(view2, new c(o0Var));
            if (i10 == 0 && this.f51087f) {
                ((qf.r0) e0Var).c();
            }
        } else {
            throw new IllegalArgumentException("unknown ViewHolder type " + e0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == n0.a.GIFT_GACHA_STOCK.ordinal()) {
            return qf.s0.f49372b.a(viewGroup);
        }
        if (i10 == n0.a.GIFT_GACHA_STOCK_MUTUAL.ordinal()) {
            return qf.r0.f49358b.a(viewGroup);
        }
        throw new IllegalArgumentException("unknown view type " + i10);
    }
}
