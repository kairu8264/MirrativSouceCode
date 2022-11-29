package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class z extends o3.a {

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f16353d;

    /* renamed from: e  reason: collision with root package name */
    public final a f16354e;

    /* loaded from: classes.dex */
    public static class a extends o3.a {

        /* renamed from: d  reason: collision with root package name */
        public final z f16355d;

        /* renamed from: e  reason: collision with root package name */
        public Map<View, o3.a> f16356e = new WeakHashMap();

        public a(z zVar) {
            this.f16355d = zVar;
        }

        @Override // o3.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            o3.a aVar = this.f16356e.get(view);
            if (aVar != null) {
                return aVar.a(view, accessibilityEvent);
            }
            return super.a(view, accessibilityEvent);
        }

        @Override // o3.a
        public p3.d b(View view) {
            o3.a aVar = this.f16356e.get(view);
            if (aVar != null) {
                return aVar.b(view);
            }
            return super.b(view);
        }

        @Override // o3.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            o3.a aVar = this.f16356e.get(view);
            if (aVar != null) {
                aVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // o3.a
        public void g(View view, p3.c cVar) {
            if (!this.f16355d.o() && this.f16355d.f16353d.getLayoutManager() != null) {
                this.f16355d.f16353d.getLayoutManager().W0(view, cVar);
                o3.a aVar = this.f16356e.get(view);
                if (aVar != null) {
                    aVar.g(view, cVar);
                    return;
                } else {
                    super.g(view, cVar);
                    return;
                }
            }
            super.g(view, cVar);
        }

        @Override // o3.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            o3.a aVar = this.f16356e.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // o3.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            o3.a aVar = this.f16356e.get(viewGroup);
            if (aVar != null) {
                return aVar.i(viewGroup, view, accessibilityEvent);
            }
            return super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // o3.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (!this.f16355d.o() && this.f16355d.f16353d.getLayoutManager() != null) {
                o3.a aVar = this.f16356e.get(view);
                if (aVar != null) {
                    if (aVar.j(view, i10, bundle)) {
                        return true;
                    }
                } else if (super.j(view, i10, bundle)) {
                    return true;
                }
                return this.f16355d.f16353d.getLayoutManager().q1(view, i10, bundle);
            }
            return super.j(view, i10, bundle);
        }

        @Override // o3.a
        public void l(View view, int i10) {
            o3.a aVar = this.f16356e.get(view);
            if (aVar != null) {
                aVar.l(view, i10);
            } else {
                super.l(view, i10);
            }
        }

        @Override // o3.a
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            o3.a aVar = this.f16356e.get(view);
            if (aVar != null) {
                aVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        public o3.a n(View view) {
            return this.f16356e.remove(view);
        }

        public void o(View view) {
            o3.a n10 = o3.c0.n(view);
            if (n10 == null || n10 == this) {
                return;
            }
            this.f16356e.put(view, n10);
        }
    }

    public z(RecyclerView recyclerView) {
        this.f16353d = recyclerView;
        o3.a n10 = n();
        if (n10 != null && (n10 instanceof a)) {
            this.f16354e = (a) n10;
        } else {
            this.f16354e = new a(this);
        }
    }

    @Override // o3.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().S0(accessibilityEvent);
        }
    }

    @Override // o3.a
    public void g(View view, p3.c cVar) {
        super.g(view, cVar);
        if (o() || this.f16353d.getLayoutManager() == null) {
            return;
        }
        this.f16353d.getLayoutManager().V0(cVar);
    }

    @Override // o3.a
    public boolean j(View view, int i10, Bundle bundle) {
        if (super.j(view, i10, bundle)) {
            return true;
        }
        if (o() || this.f16353d.getLayoutManager() == null) {
            return false;
        }
        return this.f16353d.getLayoutManager().o1(i10, bundle);
    }

    public o3.a n() {
        return this.f16354e;
    }

    public boolean o() {
        return this.f16353d.q0();
    }
}
