package r9;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes.dex */
public final class r1 extends RecyclerView.h<s1> {

    /* renamed from: a  reason: collision with root package name */
    public List<jf.l0> f50479a = xn.s.k();

    /* renamed from: b  reason: collision with root package name */
    public io.l<? super jf.l0, wn.v> f50480b;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f50482x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10) {
            super(1);
            this.f50482x = i10;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            io.l<jf.l0, wn.v> b10 = r1.this.b();
            if (b10 != null) {
                b10.invoke(r1.this.a().get(this.f50482x));
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public final List<jf.l0> a() {
        return this.f50479a;
    }

    public final io.l<jf.l0, wn.v> b() {
        return this.f50480b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: c */
    public void onBindViewHolder(s1 s1Var, int i10) {
        jo.p.h(s1Var, "viewHolder");
        s1Var.a(this.f50479a.get(i10));
        View view = s1Var.itemView;
        jo.p.g(view, "viewHolder.itemView");
        yd.g1.a(view, new a(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: d */
    public s1 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return s1.f50488b.a(viewGroup);
    }

    public final void f(List<jf.l0> list) {
        jo.p.h(list, "value");
        this.f50479a = list;
        notifyDataSetChanged();
    }

    public final void g(io.l<? super jf.l0, wn.v> lVar) {
        this.f50480b = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f50479a.size();
    }
}
