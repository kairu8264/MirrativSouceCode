package r9;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import ud.p;

/* loaded from: classes.dex */
public final class k2 extends androidx.recyclerview.widget.t<ud.p, RecyclerView.e0> {

    /* renamed from: c  reason: collision with root package name */
    public io.l<? super ud.q, wn.v> f50235c;

    /* renamed from: d  reason: collision with root package name */
    public io.l<? super ud.q, wn.v> f50236d;

    /* loaded from: classes.dex */
    public static final class a extends j.f<ud.p> {
        @Override // androidx.recyclerview.widget.j.f
        @SuppressLint({"DiffUtilEquals"})
        /* renamed from: d */
        public boolean a(ud.p pVar, ud.p pVar2) {
            jo.p.h(pVar, "oldItem");
            jo.p.h(pVar2, "newItem");
            if ((pVar instanceof ud.q) && (pVar2 instanceof ud.q)) {
                if (pVar == pVar2) {
                    return true;
                }
            } else if (pVar.getType() == pVar2.getType()) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(ud.p pVar, ud.p pVar2) {
            jo.p.h(pVar, "oldItem");
            jo.p.h(pVar2, "newItem");
            return ((pVar instanceof ud.q) && (pVar2 instanceof ud.q)) ? jo.p.c(((ud.q) pVar).j(), ((ud.q) pVar2).j()) : pVar.getType() == pVar2.getType();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ud.q f50238x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ud.q qVar) {
            super(0);
            this.f50238x = qVar;
        }

        public final void a() {
            io.l<ud.q, wn.v> g10 = k2.this.g();
            if (g10 != null) {
                g10.invoke(this.f50238x);
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ud.q f50240x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ud.q qVar) {
            super(0);
            this.f50240x = qVar;
        }

        public final void a() {
            io.l<ud.q, wn.v> h10 = k2.this.h();
            if (h10 != null) {
                h10.invoke(this.f50240x);
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    public k2() {
        super(new a());
    }

    public final io.l<ud.q, wn.v> g() {
        return this.f50235c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return b(i10).getType().ordinal();
    }

    public final io.l<ud.q, wn.v> h() {
        return this.f50236d;
    }

    public final void i(io.l<? super ud.q, wn.v> lVar) {
        this.f50235c = lVar;
    }

    public final void j(io.l<? super ud.q, wn.v> lVar) {
        this.f50236d = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "viewHolder");
        if (e0Var instanceof v1) {
            ud.p b10 = b(i10);
            jo.p.f(b10, "null cannot be cast to non-null type com.dena.mirrorman.bindmodel.ClosetPartsBindModel");
            ud.q qVar = (ud.q) b10;
            ((v1) e0Var).a(qVar, new b(qVar), new c(qVar));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 == p.a.PARTS.ordinal()) {
            return v1.f50515b.a(viewGroup);
        }
        if (i10 == p.a.SPACE.ordinal()) {
            return u1.f50495a.a(viewGroup);
        }
        throw new IllegalStateException("想定していないitemViewTypeです");
    }
}
