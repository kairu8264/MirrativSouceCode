package r9;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends RecyclerView.h<c> {

    /* renamed from: a  reason: collision with root package name */
    public List<? extends ud.o> f50127a = xn.s.k();

    /* renamed from: b  reason: collision with root package name */
    public io.l<? super ud.o, wn.v> f50128b;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ud.o f50130x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ud.o oVar) {
            super(1);
            this.f50130x = oVar;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            io.l<ud.o, wn.v> b10 = b.this.b();
            if (b10 != null) {
                b10.invoke(this.f50130x);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public final List<ud.o> a() {
        return this.f50127a;
    }

    public final io.l<ud.o, wn.v> b() {
        return this.f50128b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: c */
    public void onBindViewHolder(c cVar, int i10) {
        jo.p.h(cVar, "viewHolder");
        ud.o oVar = this.f50127a.get(i10);
        cVar.a(oVar);
        View view = cVar.itemView;
        jo.p.g(view, "viewHolder.itemView");
        yd.g1.a(view, new a(oVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: d */
    public c onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return c.f50136b.a(viewGroup);
    }

    public final void f(List<? extends ud.o> list) {
        jo.p.h(list, "value");
        this.f50127a = list;
        notifyDataSetChanged();
    }

    public final void g(io.l<? super ud.o, wn.v> lVar) {
        this.f50128b = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f50127a.size();
    }
}
