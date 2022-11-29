package ad;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;

/* loaded from: classes2.dex */
public final class c extends androidx.recyclerview.widget.t<bd.a, RecyclerView.e0> {

    /* renamed from: c  reason: collision with root package name */
    public io.l<? super bd.a, wn.v> f962c;

    /* loaded from: classes2.dex */
    public static final class a extends j.f<bd.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f963a = new a();

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: d */
        public boolean a(bd.a aVar, bd.a aVar2) {
            jo.p.h(aVar, "oldItem");
            jo.p.h(aVar2, "newItem");
            return jo.p.c(aVar, aVar2);
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(bd.a aVar, bd.a aVar2) {
            jo.p.h(aVar, "oldItem");
            jo.p.h(aVar2, "newItem");
            return aVar == aVar2;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ bd.a f965x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(bd.a aVar) {
            super(1);
            this.f965x = aVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            io.l<bd.a, wn.v> g10 = c.this.g();
            bd.a aVar = this.f965x;
            jo.p.g(aVar, "bindModel");
            g10.invoke(aVar);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* renamed from: ad.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0021c extends jo.q implements io.l<bd.a, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public static final C0021c f966w = new C0021c();

        public C0021c() {
            super(1);
        }

        public final void a(bd.a aVar) {
            jo.p.h(aVar, "it");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(bd.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    public c() {
        super(a.f963a);
        this.f962c = C0021c.f966w;
    }

    public final io.l<bd.a, wn.v> g() {
        return this.f962c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return b(i10).b();
    }

    public final void h(io.l<? super bd.a, wn.v> lVar) {
        jo.p.h(lVar, "<set-?>");
        this.f962c = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        bd.a b10 = b(i10);
        if (e0Var instanceof i) {
            ((i) e0Var).a(b10.a());
        } else if (e0Var instanceof g) {
            ((g) e0Var).a(b10.a());
        } else if (e0Var instanceof h) {
            ((h) e0Var).a(b10.a());
        }
        View view = e0Var.itemView;
        jo.p.g(view, "holder.itemView");
        yd.g1.a(view, new b(b10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return g.f1115b.a(viewGroup);
                }
                throw new IllegalArgumentException("unknown view type " + i10);
            }
            return h.f1120b.a(viewGroup);
        }
        return i.f1128b.a(viewGroup);
    }
}
