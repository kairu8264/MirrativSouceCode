package rd;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import be.g2;
import com.dena.mirrorman.viewholder.EventRankingViewHolder;
import ud.a;
import ud.q1;

/* loaded from: classes2.dex */
public final class g0 extends androidx.recyclerview.widget.t<q1, RecyclerView.e0> {

    /* renamed from: d  reason: collision with root package name */
    public static final b f51146d = new b(null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f51147e = 8;

    /* renamed from: f  reason: collision with root package name */
    public static final a f51148f = new a();

    /* renamed from: c  reason: collision with root package name */
    public g2 f51149c;

    /* loaded from: classes2.dex */
    public static final class a extends j.f<q1> {
        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: d */
        public boolean a(q1 q1Var, q1 q1Var2) {
            jo.p.h(q1Var, "oldItem");
            jo.p.h(q1Var2, "newItem");
            return jo.p.c(q1Var, q1Var2);
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(q1 q1Var, q1 q1Var2) {
            jo.p.h(q1Var, "oldItem");
            jo.p.h(q1Var2, "newItem");
            return q1Var == q1Var2;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }
    }

    public g0() {
        super(f51148f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: g */
    public EventRankingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == a.EnumC0862a.LANDING_PAGE_RANKING_LIST.ordinal()) {
            return EventRankingViewHolder.f26242c.a(viewGroup);
        }
        throw new IllegalArgumentException("unknown view type " + i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return b(i10).getType().ordinal();
    }

    public final void h(g2 g2Var) {
        this.f51149c = g2Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof EventRankingViewHolder) {
            q1 b10 = b(i10);
            jo.p.g(b10, "getItem(position)");
            ((EventRankingViewHolder) e0Var).b(b10, this.f51149c);
            return;
        }
        throw new IllegalArgumentException("unknown view holder " + e0Var);
    }
}
