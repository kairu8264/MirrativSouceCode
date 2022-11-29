package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.navigation.o;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class q extends o implements Iterable<o> {
    public final s.h<o> F;
    public int G;
    public String H;

    /* loaded from: classes.dex */
    public class a implements Iterator<o> {

        /* renamed from: w  reason: collision with root package name */
        public int f15785w = -1;

        /* renamed from: x  reason: collision with root package name */
        public boolean f15786x = false;

        public a() {
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public o next() {
            if (hasNext()) {
                this.f15786x = true;
                s.h<o> hVar = q.this.F;
                int i10 = this.f15785w + 1;
                this.f15785w = i10;
                return hVar.s(i10);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f15785w + 1 < q.this.F.r();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f15786x) {
                q.this.F.s(this.f15785w).B(null);
                q.this.F.q(this.f15785w);
                this.f15785w--;
                this.f15786x = false;
                return;
            }
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
    }

    public q(x<? extends q> xVar) {
        super(xVar);
        this.F = new s.h<>();
    }

    public final void H(o oVar) {
        int r10 = oVar.r();
        if (r10 != 0) {
            if (r10 != r()) {
                o h10 = this.F.h(r10);
                if (h10 == oVar) {
                    return;
                }
                if (oVar.t() == null) {
                    if (h10 != null) {
                        h10.B(null);
                    }
                    oVar.B(this);
                    this.F.n(oVar.r(), oVar);
                    return;
                }
                throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            }
            throw new IllegalArgumentException("Destination " + oVar + " cannot have the same id as graph " + this);
        }
        throw new IllegalArgumentException("Destinations must have an id. Call setId() or include an android:id in your navigation XML.");
    }

    public final o J(int i10) {
        return K(i10, true);
    }

    public final o K(int i10, boolean z10) {
        o h10 = this.F.h(i10);
        if (h10 != null) {
            return h10;
        }
        if (!z10 || t() == null) {
            return null;
        }
        return t().J(i10);
    }

    public String L() {
        if (this.H == null) {
            this.H = Integer.toString(this.G);
        }
        return this.H;
    }

    public final int M() {
        return this.G;
    }

    public final void N(int i10) {
        if (i10 != r()) {
            this.G = i10;
            this.H = null;
            return;
        }
        throw new IllegalArgumentException("Start destination " + i10 + " cannot use the same id as the graph " + this);
    }

    @Override // java.lang.Iterable
    public final Iterator<o> iterator() {
        return new a();
    }

    @Override // androidx.navigation.o
    public String m() {
        return r() != 0 ? super.m() : "the root navigation";
    }

    @Override // androidx.navigation.o
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" startDestination=");
        o J = J(M());
        if (J == null) {
            String str = this.H;
            if (str == null) {
                sb2.append("0x");
                sb2.append(Integer.toHexString(this.G));
            } else {
                sb2.append(str);
            }
        } else {
            sb2.append("{");
            sb2.append(J.toString());
            sb2.append("}");
        }
        return sb2.toString();
    }

    @Override // androidx.navigation.o
    public o.a u(n nVar) {
        o.a u10 = super.u(nVar);
        Iterator<o> it = iterator();
        while (it.hasNext()) {
            o.a u11 = it.next().u(nVar);
            if (u11 != null && (u10 == null || u11.compareTo(u10) > 0)) {
                u10 = u11;
            }
        }
        return u10;
    }

    @Override // androidx.navigation.o
    public void w(Context context, AttributeSet attributeSet) {
        super.w(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, s4.a.f52048y);
        N(obtainAttributes.getResourceId(s4.a.f52049z, 0));
        this.H = o.p(context, this.G);
        obtainAttributes.recycle();
    }
}
