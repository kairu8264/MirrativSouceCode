package rd;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import qf.j3;
import qf.r1;
import qf.s1;
import qf.x1;
import ud.a;
import ud.b5;
import ud.f2;
import ud.g2;
import ud.o2;

/* loaded from: classes2.dex */
public final class d1 extends androidx.recyclerview.widget.t<ud.a, RecyclerView.e0> {

    /* renamed from: c  reason: collision with root package name */
    public io.l<? super String, wn.v> f51110c;

    /* renamed from: d  reason: collision with root package name */
    public io.l<? super String, wn.v> f51111d;

    /* renamed from: e  reason: collision with root package name */
    public io.p<? super String, ? super Boolean, wn.v> f51112e;

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ b5 f51114x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b5 b5Var) {
            super(0);
            this.f51114x = b5Var;
        }

        public final void a() {
            io.l<String, wn.v> g10 = d1.this.g();
            if (g10 != null) {
                g10.invoke(this.f51114x.j());
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ b5 f51116x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b5 b5Var) {
            super(0);
            this.f51116x = b5Var;
        }

        public final void a() {
            io.l<String, wn.v> i10 = d1.this.i();
            if (i10 != null) {
                i10.invoke(this.f51116x.v());
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ b5 f51118x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b5 b5Var) {
            super(0);
            this.f51118x = b5Var;
        }

        public final void a() {
            io.p<String, Boolean, wn.v> h10 = d1.this.h();
            if (h10 != null) {
                h10.invoke(this.f51118x.v(), Boolean.valueOf(!this.f51118x.z()));
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    public d1() {
        super(new e1());
    }

    public final io.l<String, wn.v> g() {
        return this.f51110c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return b(i10).getType().ordinal();
    }

    public final io.p<String, Boolean, wn.v> h() {
        return this.f51112e;
    }

    public final io.l<String, wn.v> i() {
        return this.f51111d;
    }

    public final void j(io.l<? super String, wn.v> lVar) {
        this.f51110c = lVar;
    }

    public final void k(io.p<? super String, ? super Boolean, wn.v> pVar) {
        this.f51112e = pVar;
    }

    public final void l(io.l<? super String, wn.v> lVar) {
        this.f51111d = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        if (e0Var instanceof j3) {
            ud.a b10 = b(i10);
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.ViewHistoryBindModel");
            b5 b5Var = (b5) b10;
            ((j3) e0Var).a(b5Var, new a(b5Var), new b(b5Var), new c(b5Var));
        } else if (e0Var instanceof r1) {
            ud.a b11 = b(i10);
            jo.p.f(b11, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.LoadingBindModel");
            ((r1) e0Var).a((f2) b11);
        } else if (e0Var instanceof x1) {
            ud.a b12 = b(i10);
            jo.p.f(b12, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.NoContentsBindModel");
            ((x1) e0Var).a((o2) b12);
        } else if (e0Var instanceof s1) {
            ud.a b13 = b(i10);
            jo.p.f(b13, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.MessageBindModel");
            ((s1) e0Var).a((g2) b13);
        } else {
            throw new IllegalArgumentException("unknown view holder " + e0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == a.EnumC0862a.VIEW_HISTORY.ordinal()) {
            return j3.f49249b.a(viewGroup);
        }
        if (i10 == a.EnumC0862a.LOADING.ordinal()) {
            return r1.f49361b.a(viewGroup);
        }
        if (i10 == a.EnumC0862a.NO_CONTENTS.ordinal()) {
            return x1.f49432b.a(viewGroup);
        }
        if (i10 == a.EnumC0862a.MESSAGE.ordinal()) {
            return s1.f49375b.a(viewGroup);
        }
        throw new IllegalArgumentException("unknown view type " + i10);
    }
}
