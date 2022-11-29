package rd;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import qf.m1;
import ud.y1;
import yd.g1;

/* loaded from: classes2.dex */
public final class k0 extends RecyclerView.h<m1> {

    /* renamed from: a  reason: collision with root package name */
    public final io.l<Integer, wn.v> f51171a;

    /* renamed from: b  reason: collision with root package name */
    public List<y1> f51172b;

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.l<View, wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f51174x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10) {
            super(1);
            this.f51174x = i10;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            k0.this.a().invoke(Integer.valueOf(this.f51174x));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k0(io.l<? super Integer, wn.v> lVar) {
        jo.p.h(lVar, "itemClickListener");
        this.f51171a = lVar;
        this.f51172b = xn.s.k();
    }

    public final io.l<Integer, wn.v> a() {
        return this.f51171a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: b */
    public void onBindViewHolder(m1 m1Var, int i10) {
        jo.p.h(m1Var, "holder");
        m1Var.a(this.f51172b.get(i10));
        View view = m1Var.itemView;
        jo.p.g(view, "holder.itemView");
        g1.a(view, new a(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: c */
    public m1 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return m1.f49293b.a(viewGroup);
    }

    public final void d(List<y1> list) {
        jo.p.h(list, "value");
        this.f51172b = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f51172b.size();
    }
}
