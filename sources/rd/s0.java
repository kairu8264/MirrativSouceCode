package rd;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import java.util.List;
import qf.a2;

/* loaded from: classes2.dex */
public final class s0 extends RecyclerView.h<a2> {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ qo.h<Object>[] f51221d = {jo.f0.d(new jo.s(s0.class, "bindModels", "getBindModels()Ljava/util/List;", 0))};

    /* renamed from: e  reason: collision with root package name */
    public static final int f51222e = 8;

    /* renamed from: a  reason: collision with root package name */
    public final androidx.lifecycle.u f51223a;

    /* renamed from: b  reason: collision with root package name */
    public final io.l<Integer, wn.v> f51224b;

    /* renamed from: c  reason: collision with root package name */
    public final mo.c f51225c;

    /* loaded from: classes2.dex */
    public static final class a extends j.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List<ud.m> f51226a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ List<ud.m> f51227b;

        public a(List<ud.m> list, List<ud.m> list2) {
            this.f51226a = list;
            this.f51227b = list2;
        }

        @Override // androidx.recyclerview.widget.j.b
        public boolean a(int i10, int i11) {
            return b(i10, i11);
        }

        @Override // androidx.recyclerview.widget.j.b
        public boolean b(int i10, int i11) {
            return jo.p.c(this.f51226a.get(i10).b(), this.f51227b.get(i11).b()) && jo.p.c(this.f51226a.get(i10).a(), this.f51227b.get(i11).a()) && jo.p.c(this.f51226a.get(i10).c(), this.f51227b.get(i11).c()) && i10 == i11;
        }

        @Override // androidx.recyclerview.widget.j.b
        public int d() {
            return this.f51227b.size();
        }

        @Override // androidx.recyclerview.widget.j.b
        public int e() {
            return this.f51226a.size();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f51229x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10) {
            super(0);
            this.f51229x = i10;
        }

        public final void a() {
            s0.this.f51224b.invoke(Integer.valueOf(this.f51229x));
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends mo.b<List<? extends ud.m>> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ s0 f51230b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, s0 s0Var) {
            super(obj);
            this.f51230b = s0Var;
        }

        @Override // mo.b
        public void c(qo.h<?> hVar, List<? extends ud.m> list, List<? extends ud.m> list2) {
            jo.p.h(hVar, "property");
            androidx.recyclerview.widget.j.b(new a(list, list2)).c(this.f51230b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s0(androidx.lifecycle.u uVar, io.l<? super Integer, wn.v> lVar) {
        jo.p.h(uVar, "lifecycleOwner");
        jo.p.h(lVar, "onClick");
        this.f51223a = uVar;
        this.f51224b = lVar;
        mo.a aVar = mo.a.f41224a;
        this.f51225c = new c(xn.s.k(), this);
    }

    public final List<ud.m> b() {
        return (List) this.f51225c.b(this, f51221d[0]);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: c */
    public void onBindViewHolder(a2 a2Var, int i10) {
        jo.p.h(a2Var, "holder");
        a2Var.c(this.f51223a, b().get(i10));
        a2Var.d(new b(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: d */
    public a2 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return a2.f49037b.a(viewGroup);
    }

    public final void f(List<ud.m> list) {
        jo.p.h(list, "<set-?>");
        this.f51225c.a(this, f51221d[0], list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return b().size();
    }
}
