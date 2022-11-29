package c9;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import hf.c;

/* loaded from: classes.dex */
public final class n extends androidx.recyclerview.widget.t<c.a, RecyclerView.e0> {

    /* renamed from: h  reason: collision with root package name */
    public static final b f18971h = new b(null);

    /* renamed from: i  reason: collision with root package name */
    public static final int f18972i = 8;

    /* renamed from: j  reason: collision with root package name */
    public static final j.f<c.a> f18973j = new a();

    /* renamed from: c  reason: collision with root package name */
    public final boolean f18974c;

    /* renamed from: d  reason: collision with root package name */
    public final String f18975d;

    /* renamed from: e  reason: collision with root package name */
    public io.l<? super c.a, wn.v> f18976e;

    /* renamed from: f  reason: collision with root package name */
    public io.l<? super c.a, wn.v> f18977f;

    /* renamed from: g  reason: collision with root package name */
    public io.l<? super String, wn.v> f18978g;

    /* loaded from: classes.dex */
    public static final class a extends j.f<c.a> {
        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: d */
        public boolean a(c.a aVar, c.a aVar2) {
            jo.p.h(aVar, "oldItem");
            jo.p.h(aVar2, "newItem");
            return jo.p.c(aVar, aVar2);
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(c.a aVar, c.a aVar2) {
            jo.p.h(aVar, "oldItem");
            jo.p.h(aVar2, "newItem");
            return jo.p.c(aVar.d(), aVar2.d());
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }
    }

    public n(boolean z10, String str) {
        super(f18973j);
        this.f18974c = z10;
        this.f18975d = str;
    }

    public final void g(io.l<? super c.a, wn.v> lVar) {
        this.f18977f = lVar;
    }

    public final void h(io.l<? super c.a, wn.v> lVar) {
        this.f18976e = lVar;
    }

    public final void i(io.l<? super String, wn.v> lVar) {
        this.f18978g = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "viewHolder");
        if (e0Var instanceof l) {
            c.a b10 = b(i10);
            jo.p.g(b10, "getItem(position)");
            ((l) e0Var).c(b10, this.f18975d, this.f18978g);
        } else if (e0Var instanceof m) {
            c.a b11 = b(i10);
            jo.p.g(b11, "getItem(position)");
            ((m) e0Var).b(b11, this.f18976e, this.f18977f);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (this.f18974c) {
            return l.f18957c.a(viewGroup);
        }
        return m.f18963c.a(viewGroup);
    }
}
