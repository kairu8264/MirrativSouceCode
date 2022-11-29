package r8;

import android.view.ViewGroup;
import androidx.recyclerview.widget.j;

/* loaded from: classes.dex */
public final class k extends androidx.recyclerview.widget.t<v8.a, n> {

    /* renamed from: c  reason: collision with root package name */
    public o f49949c;

    /* loaded from: classes.dex */
    public static final class a extends j.f<v8.a> {
        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: d */
        public boolean a(v8.a aVar, v8.a aVar2) {
            jo.p.h(aVar, "oldItem");
            jo.p.h(aVar2, "newItem");
            return jo.p.c(aVar, aVar2);
        }

        @Override // androidx.recyclerview.widget.j.f
        /* renamed from: e */
        public boolean b(v8.a aVar, v8.a aVar2) {
            jo.p.h(aVar, "oldItem");
            jo.p.h(aVar2, "newItem");
            return aVar == aVar2;
        }
    }

    public k() {
        super(new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: g */
    public void onBindViewHolder(n nVar, int i10) {
        jo.p.h(nVar, "holder");
        v8.a b10 = b(i10);
        jo.p.g(b10, "getItem(position)");
        nVar.b(b10, this.f49949c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: h */
    public n onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return n.f49964b.a(viewGroup);
    }

    public final void i(o oVar) {
        this.f49949c = oVar;
    }
}
