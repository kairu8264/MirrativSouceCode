package rd;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes2.dex */
public final class i extends RecyclerView.h<qf.q> {

    /* renamed from: a  reason: collision with root package name */
    public List<ud.z> f51152a = xn.s.k();

    /* renamed from: b  reason: collision with root package name */
    public io.a<wn.v> f51153b;

    /* loaded from: classes2.dex */
    public static final class a extends jo.q implements io.a<wn.v> {
        public a() {
            super(0);
        }

        public final void a() {
            io.a<wn.v> a10 = i.this.a();
            if (a10 != null) {
                a10.invoke();
            }
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    public final io.a<wn.v> a() {
        return this.f51153b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: b */
    public void onBindViewHolder(qf.q qVar, int i10) {
        jo.p.h(qVar, "holder");
        qVar.a(this.f51152a.get(i10), new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: c */
    public qf.q onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        return qf.q.f49335b.a(viewGroup);
    }

    public final void d(io.a<wn.v> aVar) {
        this.f51153b = aVar;
    }

    public final void f(List<ud.z> list) {
        jo.p.h(list, "value");
        this.f51152a = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f51152a.size();
    }
}
