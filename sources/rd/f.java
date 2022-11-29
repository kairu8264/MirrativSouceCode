package rd;

import android.view.ViewGroup;
import androidx.recyclerview.widget.j;
import com.dena.mirrativ.mirrativapi.closet.Closet;
import qf.n2;

/* loaded from: classes2.dex */
public final class f extends androidx.recyclerview.widget.t<Closet, n2> {

    /* renamed from: c  reason: collision with root package name */
    public io.l<? super Closet, wn.v> f51141c;

    /* loaded from: classes2.dex */
    public static final class a extends j.f<Closet> {
        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: d */
        public boolean a(Closet closet, Closet closet2) {
            jo.p.h(closet, "oldItem");
            jo.p.h(closet2, "newItem");
            return jo.p.c(closet, closet2);
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(Closet closet, Closet closet2) {
            jo.p.h(closet, "oldItem");
            jo.p.h(closet2, "newItem");
            return closet == closet2;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<Closet, wn.v> {
        public b() {
            super(1);
        }

        public final void a(Closet closet) {
            jo.p.h(closet, "it");
            io.l<Closet, wn.v> g10 = f.this.g();
            if (g10 != null) {
                g10.invoke(closet);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Closet closet) {
            a(closet);
            return wn.v.f59242a;
        }
    }

    public f() {
        super(new a());
    }

    public final io.l<Closet, wn.v> g() {
        return this.f51141c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: h */
    public void onBindViewHolder(n2 n2Var, int i10) {
        jo.p.h(n2Var, "viewHolder");
        Closet b10 = b(i10);
        jo.p.g(b10, "getItem(position)");
        n2Var.a(b10, new b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: i */
    public n2 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return n2.f49305b.a(viewGroup);
    }

    public final void j(io.l<? super Closet, wn.v> lVar) {
        this.f51141c = lVar;
    }
}
