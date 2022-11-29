package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class c0<T> extends e0<T> {

    /* renamed from: l  reason: collision with root package name */
    public m.b<LiveData<?>, a<?>> f15521l = new m.b<>();

    /* loaded from: classes.dex */
    public static class a<V> implements f0<V> {

        /* renamed from: a  reason: collision with root package name */
        public final LiveData<V> f15522a;

        /* renamed from: b  reason: collision with root package name */
        public final f0<? super V> f15523b;

        /* renamed from: c  reason: collision with root package name */
        public int f15524c = -1;

        public a(LiveData<V> liveData, f0<? super V> f0Var) {
            this.f15522a = liveData;
            this.f15523b = f0Var;
        }

        public void a() {
            this.f15522a.j(this);
        }

        public void b() {
            this.f15522a.n(this);
        }

        @Override // androidx.lifecycle.f0
        public void d(V v10) {
            if (this.f15524c != this.f15522a.g()) {
                this.f15524c = this.f15522a.g();
                this.f15523b.d(v10);
            }
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void k() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f15521l.iterator();
        while (it.hasNext()) {
            it.next().getValue().a();
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void l() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f15521l.iterator();
        while (it.hasNext()) {
            it.next().getValue().b();
        }
    }

    public <S> void q(LiveData<S> liveData, f0<? super S> f0Var) {
        a<?> aVar = new a<>(liveData, f0Var);
        a<?> l10 = this.f15521l.l(liveData, aVar);
        if (l10 != null && l10.f15523b != f0Var) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (l10 == null && h()) {
            aVar.a();
        }
    }
}
