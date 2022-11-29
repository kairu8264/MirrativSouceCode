package rd;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import ud.r0;

/* loaded from: classes2.dex */
public final class c0 extends androidx.recyclerview.widget.t<ud.r0, RecyclerView.e0> {

    /* loaded from: classes2.dex */
    public static final class a extends j.f<ud.r0> {
        @Override // androidx.recyclerview.widget.j.f
        @SuppressLint({"DiffUtilEquals"})
        /* renamed from: d */
        public boolean a(ud.r0 r0Var, ud.r0 r0Var2) {
            jo.p.h(r0Var, "oldItem");
            jo.p.h(r0Var2, "newItem");
            return jo.p.c(r0Var, r0Var2);
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(ud.r0 r0Var, ud.r0 r0Var2) {
            jo.p.h(r0Var, "oldItem");
            jo.p.h(r0Var2, "newItem");
            if ((r0Var instanceof ud.s0) && (r0Var2 instanceof ud.s0)) {
                return jo.p.c(((ud.s0) r0Var).b(), ((ud.s0) r0Var2).b());
            }
            if ((r0Var instanceof ud.t0) && (r0Var2 instanceof ud.t0)) {
                return jo.p.c(((ud.t0) r0Var).b(), ((ud.t0) r0Var2).b());
            }
            return false;
        }
    }

    public c0() {
        super(new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return b(i10).getType().ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof qf.v0) {
            ud.r0 b10 = b(i10);
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.GiftItemAttributeBindModel");
            ((qf.v0) e0Var).a((ud.s0) b10);
        } else if (e0Var instanceof qf.u0) {
            ud.r0 b11 = b(i10);
            jo.p.f(b11, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.GiftItemAttributeEmomoQuestBindModel");
            ((qf.u0) e0Var).a((ud.t0) b11);
        } else {
            throw new IllegalArgumentException("unknown holder " + e0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == r0.a.DEFAULT.ordinal()) {
            return qf.v0.f49405b.a(viewGroup);
        }
        if (i10 == r0.a.EMOMO_QUEST.ordinal()) {
            return qf.u0.f49395b.a(viewGroup);
        }
        throw new IllegalArgumentException("unknown viewType " + i10);
    }
}
