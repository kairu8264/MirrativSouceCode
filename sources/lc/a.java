package lc;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes2.dex */
public final class a extends RecyclerView.h<d> {

    /* renamed from: a  reason: collision with root package name */
    public final io.a<wn.v> f39816a;

    /* renamed from: b  reason: collision with root package name */
    public List<b> f39817b;

    /* renamed from: lc.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0573a extends jo.q implements io.a<wn.v> {
        public C0573a() {
            super(0);
        }

        public final void a() {
            a.this.f39816a.invoke();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    public a(io.a<wn.v> aVar) {
        jo.p.h(aVar, "onGlobalLayoutListener");
        this.f39816a = aVar;
        this.f39817b = xn.s.k();
    }

    public final List<b> b() {
        return this.f39817b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: c */
    public void onBindViewHolder(d dVar, int i10) {
        jo.p.h(dVar, "holder");
        dVar.d(this.f39817b.get(i10), new C0573a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: d */
    public d onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return d.f39841b.a(viewGroup);
    }

    public final void f(List<b> list) {
        jo.p.h(list, "value");
        this.f39817b = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f39817b.size();
    }
}
