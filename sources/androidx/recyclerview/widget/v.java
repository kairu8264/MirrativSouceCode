package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d0;
import androidx.recyclerview.widget.g0;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    public final g0.c f16339a;

    /* renamed from: b  reason: collision with root package name */
    public final d0.d f16340b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView.h<RecyclerView.e0> f16341c;

    /* renamed from: d  reason: collision with root package name */
    public final b f16342d;

    /* renamed from: e  reason: collision with root package name */
    public int f16343e;

    /* renamed from: f  reason: collision with root package name */
    public RecyclerView.j f16344f = new a();

    /* loaded from: classes.dex */
    public class a extends RecyclerView.j {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            v vVar = v.this;
            vVar.f16343e = vVar.f16341c.getItemCount();
            v vVar2 = v.this;
            vVar2.f16342d.e(vVar2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i10, int i11) {
            v vVar = v.this;
            vVar.f16342d.a(vVar, i10, i11, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i10, int i11, Object obj) {
            v vVar = v.this;
            vVar.f16342d.a(vVar, i10, i11, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i10, int i11) {
            v vVar = v.this;
            vVar.f16343e += i11;
            vVar.f16342d.b(vVar, i10, i11);
            v vVar2 = v.this;
            if (vVar2.f16343e <= 0 || vVar2.f16341c.getStateRestorationPolicy() != RecyclerView.h.a.PREVENT_WHEN_EMPTY) {
                return;
            }
            v vVar3 = v.this;
            vVar3.f16342d.d(vVar3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i10, int i11, int i12) {
            n3.h.b(i12 == 1, "moving more than 1 item is not supported in RecyclerView");
            v vVar = v.this;
            vVar.f16342d.c(vVar, i10, i11);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i10, int i11) {
            v vVar = v.this;
            vVar.f16343e -= i11;
            vVar.f16342d.f(vVar, i10, i11);
            v vVar2 = v.this;
            if (vVar2.f16343e >= 1 || vVar2.f16341c.getStateRestorationPolicy() != RecyclerView.h.a.PREVENT_WHEN_EMPTY) {
                return;
            }
            v vVar3 = v.this;
            vVar3.f16342d.d(vVar3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void g() {
            v vVar = v.this;
            vVar.f16342d.d(vVar);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(v vVar, int i10, int i11, Object obj);

        void b(v vVar, int i10, int i11);

        void c(v vVar, int i10, int i11);

        void d(v vVar);

        void e(v vVar);

        void f(v vVar, int i10, int i11);
    }

    public v(RecyclerView.h<RecyclerView.e0> hVar, b bVar, g0 g0Var, d0.d dVar) {
        this.f16341c = hVar;
        this.f16342d = bVar;
        this.f16339a = g0Var.b(this);
        this.f16340b = dVar;
        this.f16343e = hVar.getItemCount();
        hVar.registerAdapterDataObserver(this.f16344f);
    }

    public void a() {
        this.f16341c.unregisterAdapterDataObserver(this.f16344f);
        this.f16339a.dispose();
    }

    public int b() {
        return this.f16343e;
    }

    public long c(int i10) {
        return this.f16340b.a(this.f16341c.getItemId(i10));
    }

    public int d(int i10) {
        return this.f16339a.b(this.f16341c.getItemViewType(i10));
    }

    public void e(RecyclerView.e0 e0Var, int i10) {
        this.f16341c.bindViewHolder(e0Var, i10);
    }

    public RecyclerView.e0 f(ViewGroup viewGroup, int i10) {
        return this.f16341c.onCreateViewHolder(viewGroup, this.f16339a.a(i10));
    }
}
