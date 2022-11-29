package po;

import xn.i0;

/* loaded from: classes4.dex */
public class g implements Iterable<Integer>, ko.a {

    /* renamed from: z  reason: collision with root package name */
    public static final a f48467z = new a(null);

    /* renamed from: w  reason: collision with root package name */
    public final int f48468w;

    /* renamed from: x  reason: collision with root package name */
    public final int f48469x;

    /* renamed from: y  reason: collision with root package name */
    public final int f48470y;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final g a(int i10, int i11, int i12) {
            return new g(i10, i11, i12);
        }
    }

    public g(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 != Integer.MIN_VALUE) {
            this.f48468w = i10;
            this.f48469x = p000do.c.c(i10, i11, i12);
            this.f48470y = i12;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            if (!isEmpty() || !((g) obj).isEmpty()) {
                g gVar = (g) obj;
                if (this.f48468w != gVar.f48468w || this.f48469x != gVar.f48469x || this.f48470y != gVar.f48470y) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f48468w * 31) + this.f48469x) * 31) + this.f48470y;
    }

    public boolean isEmpty() {
        if (this.f48470y > 0) {
            if (this.f48468w > this.f48469x) {
                return true;
            }
        } else if (this.f48468w < this.f48469x) {
            return true;
        }
        return false;
    }

    public final int k() {
        return this.f48468w;
    }

    public final int m() {
        return this.f48469x;
    }

    public final int p() {
        return this.f48470y;
    }

    @Override // java.lang.Iterable
    /* renamed from: r */
    public i0 iterator() {
        return new h(this.f48468w, this.f48469x, this.f48470y);
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f48470y > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f48468w);
            sb2.append("..");
            sb2.append(this.f48469x);
            sb2.append(" step ");
            i10 = this.f48470y;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f48468w);
            sb2.append(" downTo ");
            sb2.append(this.f48469x);
            sb2.append(" step ");
            i10 = -this.f48470y;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
