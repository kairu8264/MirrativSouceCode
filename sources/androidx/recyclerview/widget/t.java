package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.e0;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.j;
import java.util.List;

/* loaded from: classes.dex */
public abstract class t<T, VH extends RecyclerView.e0> extends RecyclerView.h<VH> {

    /* renamed from: a  reason: collision with root package name */
    public final d<T> f16336a;

    /* renamed from: b  reason: collision with root package name */
    public final d.b<T> f16337b;

    /* loaded from: classes.dex */
    public class a implements d.b<T> {
        public a() {
        }

        @Override // androidx.recyclerview.widget.d.b
        public void a(List<T> list, List<T> list2) {
            t.this.c(list, list2);
        }
    }

    public t(j.f<T> fVar) {
        a aVar = new a();
        this.f16337b = aVar;
        d<T> dVar = new d<>(new b(this), new c.a(fVar).a());
        this.f16336a = dVar;
        dVar.a(aVar);
    }

    public List<T> a() {
        return this.f16336a.b();
    }

    public T b(int i10) {
        return this.f16336a.b().get(i10);
    }

    public void c(List<T> list, List<T> list2) {
    }

    public void d(List<T> list) {
        this.f16336a.e(list);
    }

    public void f(List<T> list, Runnable runnable) {
        this.f16336a.f(list, runnable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f16336a.b().size();
    }
}
