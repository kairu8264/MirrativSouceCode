package rd;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import yd.g1;

/* loaded from: classes2.dex */
public final class t extends RecyclerView.h<qf.m0> {

    /* renamed from: a  reason: collision with root package name */
    public final String f51231a;

    /* renamed from: b  reason: collision with root package name */
    public final io.l<String, wn.v> f51232b;

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.l<View, wn.v> {
        public a() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            String str = t.this.f51231a;
            if (str != null) {
                t.this.f51232b.invoke(str);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(String str, io.l<? super String, wn.v> lVar) {
        jo.p.h(lVar, "onClickListener");
        this.f51231a = str;
        this.f51232b = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: c */
    public void onBindViewHolder(qf.m0 m0Var, int i10) {
        jo.p.h(m0Var, "holder");
        View view = m0Var.itemView;
        jo.p.g(view, "holder.itemView");
        g1.a(view, new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: d */
    public qf.m0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return qf.m0.f49292a.a(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f51231a != null ? 1 : 0;
    }
}
