package rd;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import qf.b2;

/* loaded from: classes2.dex */
public final class t0 extends RecyclerView.h<b2> {

    /* renamed from: a  reason: collision with root package name */
    public List<ud.t> f51234a = xn.s.k();

    /* renamed from: b  reason: collision with root package name */
    public io.l<? super String, wn.v> f51235b;

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ud.t f51237x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ud.t tVar) {
            super(0);
            this.f51237x = tVar;
        }

        public final void a() {
            io.l<String, wn.v> a10 = t0.this.a();
            if (a10 != null) {
                a10.invoke(this.f51237x.c());
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    public final io.l<String, wn.v> a() {
        return this.f51235b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: b */
    public void onBindViewHolder(b2 b2Var, int i10) {
        jo.p.h(b2Var, "holder");
        ud.t tVar = this.f51234a.get(i10);
        b2Var.a(tVar, new a(tVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: c */
    public b2 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return b2.f49061b.a(viewGroup);
    }

    public final void d(io.l<? super String, wn.v> lVar) {
        this.f51235b = lVar;
    }

    public final void f(List<ud.t> list) {
        jo.p.h(list, "value");
        this.f51234a = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f51234a.size();
    }
}
