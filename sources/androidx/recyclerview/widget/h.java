package androidx.recyclerview.widget;

import android.util.Log;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d0;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.g0;
import androidx.recyclerview.widget.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class h implements v.b {

    /* renamed from: a  reason: collision with root package name */
    public final g f16124a;

    /* renamed from: b  reason: collision with root package name */
    public final g0 f16125b;

    /* renamed from: c  reason: collision with root package name */
    public List<WeakReference<RecyclerView>> f16126c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final IdentityHashMap<RecyclerView.e0, v> f16127d = new IdentityHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public List<v> f16128e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public a f16129f = new a();

    /* renamed from: g  reason: collision with root package name */
    public final g.a.EnumC0074a f16130g;

    /* renamed from: h  reason: collision with root package name */
    public final d0 f16131h;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public v f16132a;

        /* renamed from: b  reason: collision with root package name */
        public int f16133b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f16134c;
    }

    public h(g gVar, g.a aVar) {
        this.f16124a = gVar;
        if (aVar.f16113a) {
            this.f16125b = new g0.a();
        } else {
            this.f16125b = new g0.b();
        }
        g.a.EnumC0074a enumC0074a = aVar.f16114b;
        this.f16130g = enumC0074a;
        if (enumC0074a == g.a.EnumC0074a.NO_STABLE_IDS) {
            this.f16131h = new d0.b();
        } else if (enumC0074a == g.a.EnumC0074a.ISOLATED_STABLE_IDS) {
            this.f16131h = new d0.a();
        } else if (enumC0074a == g.a.EnumC0074a.SHARED_STABLE_IDS) {
            this.f16131h = new d0.c();
        } else {
            throw new IllegalArgumentException("unknown stable id mode");
        }
    }

    public boolean A(RecyclerView.e0 e0Var) {
        v vVar = this.f16127d.get(e0Var);
        if (vVar != null) {
            boolean onFailedToRecycleView = vVar.f16341c.onFailedToRecycleView(e0Var);
            this.f16127d.remove(e0Var);
            return onFailedToRecycleView;
        }
        throw new IllegalStateException("Cannot find wrapper for " + e0Var + ", seems like it is not bound by this adapter: " + this);
    }

    public void B(RecyclerView.e0 e0Var) {
        s(e0Var).f16341c.onViewAttachedToWindow(e0Var);
    }

    public void C(RecyclerView.e0 e0Var) {
        s(e0Var).f16341c.onViewDetachedFromWindow(e0Var);
    }

    public void D(RecyclerView.e0 e0Var) {
        v vVar = this.f16127d.get(e0Var);
        if (vVar != null) {
            vVar.f16341c.onViewRecycled(e0Var);
            this.f16127d.remove(e0Var);
            return;
        }
        throw new IllegalStateException("Cannot find wrapper for " + e0Var + ", seems like it is not bound by this adapter: " + this);
    }

    public final void E(a aVar) {
        aVar.f16134c = false;
        aVar.f16132a = null;
        aVar.f16133b = -1;
        this.f16129f = aVar;
    }

    public boolean F(RecyclerView.h<RecyclerView.e0> hVar) {
        int u10 = u(hVar);
        if (u10 == -1) {
            return false;
        }
        v vVar = this.f16128e.get(u10);
        int k10 = k(vVar);
        this.f16128e.remove(u10);
        this.f16124a.notifyItemRangeRemoved(k10, vVar.b());
        for (WeakReference<RecyclerView> weakReference : this.f16126c) {
            RecyclerView recyclerView = weakReference.get();
            if (recyclerView != null) {
                hVar.onDetachedFromRecyclerView(recyclerView);
            }
        }
        vVar.a();
        i();
        return true;
    }

    @Override // androidx.recyclerview.widget.v.b
    public void a(v vVar, int i10, int i11, Object obj) {
        this.f16124a.notifyItemRangeChanged(i10 + k(vVar), i11, obj);
    }

    @Override // androidx.recyclerview.widget.v.b
    public void b(v vVar, int i10, int i11) {
        this.f16124a.notifyItemRangeInserted(i10 + k(vVar), i11);
    }

    @Override // androidx.recyclerview.widget.v.b
    public void c(v vVar, int i10, int i11) {
        int k10 = k(vVar);
        this.f16124a.notifyItemMoved(i10 + k10, i11 + k10);
    }

    @Override // androidx.recyclerview.widget.v.b
    public void d(v vVar) {
        i();
    }

    @Override // androidx.recyclerview.widget.v.b
    public void e(v vVar) {
        this.f16124a.notifyDataSetChanged();
        i();
    }

    @Override // androidx.recyclerview.widget.v.b
    public void f(v vVar, int i10, int i11) {
        this.f16124a.notifyItemRangeRemoved(i10 + k(vVar), i11);
    }

    public boolean g(int i10, RecyclerView.h<RecyclerView.e0> hVar) {
        if (i10 >= 0 && i10 <= this.f16128e.size()) {
            if (t()) {
                n3.h.b(hVar.hasStableIds(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
            } else if (hVar.hasStableIds()) {
                Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
            }
            if (m(hVar) != null) {
                return false;
            }
            v vVar = new v(hVar, this, this.f16125b, this.f16131h.a());
            this.f16128e.add(i10, vVar);
            for (WeakReference<RecyclerView> weakReference : this.f16126c) {
                RecyclerView recyclerView = weakReference.get();
                if (recyclerView != null) {
                    hVar.onAttachedToRecyclerView(recyclerView);
                }
            }
            if (vVar.b() > 0) {
                this.f16124a.notifyItemRangeInserted(k(vVar), vVar.b());
            }
            i();
            return true;
        }
        throw new IndexOutOfBoundsException("Index must be between 0 and " + this.f16128e.size() + ". Given:" + i10);
    }

    public boolean h(RecyclerView.h<RecyclerView.e0> hVar) {
        return g(this.f16128e.size(), hVar);
    }

    public final void i() {
        RecyclerView.h.a j10 = j();
        if (j10 != this.f16124a.getStateRestorationPolicy()) {
            this.f16124a.c(j10);
        }
    }

    public final RecyclerView.h.a j() {
        for (v vVar : this.f16128e) {
            RecyclerView.h.a stateRestorationPolicy = vVar.f16341c.getStateRestorationPolicy();
            RecyclerView.h.a aVar = RecyclerView.h.a.PREVENT;
            if (stateRestorationPolicy == aVar) {
                return aVar;
            }
            if (stateRestorationPolicy == RecyclerView.h.a.PREVENT_WHEN_EMPTY && vVar.b() == 0) {
                return aVar;
            }
        }
        return RecyclerView.h.a.ALLOW;
    }

    public final int k(v vVar) {
        v next;
        Iterator<v> it = this.f16128e.iterator();
        int i10 = 0;
        while (it.hasNext() && (next = it.next()) != vVar) {
            i10 += next.b();
        }
        return i10;
    }

    public final a l(int i10) {
        a aVar = this.f16129f;
        if (aVar.f16134c) {
            aVar = new a();
        } else {
            aVar.f16134c = true;
        }
        Iterator<v> it = this.f16128e.iterator();
        int i11 = i10;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            v next = it.next();
            if (next.b() > i11) {
                aVar.f16132a = next;
                aVar.f16133b = i11;
                break;
            }
            i11 -= next.b();
        }
        if (aVar.f16132a != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Cannot find wrapper for " + i10);
    }

    public final v m(RecyclerView.h<RecyclerView.e0> hVar) {
        int u10 = u(hVar);
        if (u10 == -1) {
            return null;
        }
        return this.f16128e.get(u10);
    }

    public List<RecyclerView.h<? extends RecyclerView.e0>> n() {
        if (this.f16128e.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.f16128e.size());
        for (v vVar : this.f16128e) {
            arrayList.add(vVar.f16341c);
        }
        return arrayList;
    }

    public long o(int i10) {
        a l10 = l(i10);
        long c10 = l10.f16132a.c(l10.f16133b);
        E(l10);
        return c10;
    }

    public int p(int i10) {
        a l10 = l(i10);
        int d10 = l10.f16132a.d(l10.f16133b);
        E(l10);
        return d10;
    }

    public int q(RecyclerView.h<? extends RecyclerView.e0> hVar, RecyclerView.e0 e0Var, int i10) {
        v vVar = this.f16127d.get(e0Var);
        if (vVar == null) {
            return -1;
        }
        int k10 = i10 - k(vVar);
        int itemCount = vVar.f16341c.getItemCount();
        if (k10 >= 0 && k10 < itemCount) {
            return vVar.f16341c.findRelativeAdapterPositionIn(hVar, e0Var, k10);
        }
        throw new IllegalStateException("Detected inconsistent adapter updates. The local position of the view holder maps to " + k10 + " which is out of bounds for the adapter with size " + itemCount + ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:" + e0Var + "adapter:" + hVar);
    }

    public int r() {
        int i10 = 0;
        for (v vVar : this.f16128e) {
            i10 += vVar.b();
        }
        return i10;
    }

    public final v s(RecyclerView.e0 e0Var) {
        v vVar = this.f16127d.get(e0Var);
        if (vVar != null) {
            return vVar;
        }
        throw new IllegalStateException("Cannot find wrapper for " + e0Var + ", seems like it is not bound by this adapter: " + this);
    }

    public boolean t() {
        return this.f16130g != g.a.EnumC0074a.NO_STABLE_IDS;
    }

    public final int u(RecyclerView.h<RecyclerView.e0> hVar) {
        int size = this.f16128e.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f16128e.get(i10).f16341c == hVar) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean v(RecyclerView recyclerView) {
        for (WeakReference<RecyclerView> weakReference : this.f16126c) {
            if (weakReference.get() == recyclerView) {
                return true;
            }
        }
        return false;
    }

    public void w(RecyclerView recyclerView) {
        if (v(recyclerView)) {
            return;
        }
        this.f16126c.add(new WeakReference<>(recyclerView));
        for (v vVar : this.f16128e) {
            vVar.f16341c.onAttachedToRecyclerView(recyclerView);
        }
    }

    public void x(RecyclerView.e0 e0Var, int i10) {
        a l10 = l(i10);
        this.f16127d.put(e0Var, l10.f16132a);
        l10.f16132a.e(e0Var, l10.f16133b);
        E(l10);
    }

    public RecyclerView.e0 y(ViewGroup viewGroup, int i10) {
        return this.f16125b.a(i10).f(viewGroup, i10);
    }

    public void z(RecyclerView recyclerView) {
        int size = this.f16126c.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference<RecyclerView> weakReference = this.f16126c.get(size);
            if (weakReference.get() == null) {
                this.f16126c.remove(size);
            } else if (weakReference.get() == recyclerView) {
                this.f16126c.remove(size);
                break;
            }
            size--;
        }
        for (v vVar : this.f16128e) {
            vVar.f16341c.onDetachedFromRecyclerView(recyclerView);
        }
    }
}
