package rd;

import android.view.ViewGroup;
import androidx.recyclerview.widget.j;
import qf.r2;
import ud.p3;

/* loaded from: classes2.dex */
public final class y0 extends androidx.recyclerview.widget.t<p3, r2> {

    /* renamed from: c  reason: collision with root package name */
    public final androidx.lifecycle.u f51299c;

    /* renamed from: d  reason: collision with root package name */
    public final io.l<String, wn.v> f51300d;

    /* loaded from: classes2.dex */
    public static final class a extends j.f<p3> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f51301a = new a();

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: d */
        public boolean a(p3 p3Var, p3 p3Var2) {
            jo.p.h(p3Var, "oldItem");
            jo.p.h(p3Var2, "newItem");
            return jo.p.c(p3Var, p3Var2);
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(p3 p3Var, p3 p3Var2) {
            jo.p.h(p3Var, "oldItem");
            jo.p.h(p3Var2, "newItem");
            return p3Var.d() == p3Var2.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y0(androidx.lifecycle.u uVar, io.l<? super String, wn.v> lVar) {
        super(a.f51301a);
        jo.p.h(uVar, "viewLifecycleOwner");
        jo.p.h(lVar, "onClickReject");
        this.f51299c = uVar;
        this.f51300d = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: g */
    public void onBindViewHolder(r2 r2Var, int i10) {
        jo.p.h(r2Var, "holder");
        androidx.lifecycle.u uVar = this.f51299c;
        p3 b10 = b(i10);
        jo.p.g(b10, "getItem(position)");
        r2Var.a(uVar, b10, this.f51300d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: h */
    public r2 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return r2.f49364b.a(viewGroup);
    }
}
