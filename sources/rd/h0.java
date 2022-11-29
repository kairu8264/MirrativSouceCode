package rd;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import qf.f1;
import ud.a;
import ud.s1;

/* loaded from: classes2.dex */
public final class h0 extends androidx.recyclerview.widget.t<s1, RecyclerView.e0> {

    /* loaded from: classes2.dex */
    public static final class a extends j.f<s1> {
        @Override // androidx.recyclerview.widget.j.f
        @SuppressLint({"DiffUtilEquals"})
        /* renamed from: d */
        public boolean a(s1 s1Var, s1 s1Var2) {
            jo.p.h(s1Var, "oldItem");
            jo.p.h(s1Var2, "newItem");
            return jo.p.c(s1Var, s1Var2);
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(s1 s1Var, s1 s1Var2) {
            jo.p.h(s1Var, "oldItem");
            jo.p.h(s1Var2, "newItem");
            return jo.p.c(s1Var.i(), s1Var2.i());
        }
    }

    public h0() {
        super(new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: g */
    public f1 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == a.EnumC0862a.LANDING_PAGE_REWARD.ordinal()) {
            return f1.f49139b.a(viewGroup);
        }
        throw new IllegalArgumentException("unknown view type " + i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return b(i10).getType().ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof f1) {
            s1 b10 = b(i10);
            jo.p.g(b10, "getItem(position)");
            ((f1) e0Var).a(b10);
            return;
        }
        throw new IllegalArgumentException("unknown view holder " + e0Var);
    }
}
