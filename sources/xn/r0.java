package xn;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class r0<T> extends c<T> implements RandomAccess {
    public int A;

    /* renamed from: x  reason: collision with root package name */
    public final Object[] f60455x;

    /* renamed from: y  reason: collision with root package name */
    public final int f60456y;

    /* renamed from: z  reason: collision with root package name */
    public int f60457z;

    /* loaded from: classes4.dex */
    public static final class a extends b<T> {
        public final /* synthetic */ r0<T> A;

        /* renamed from: y  reason: collision with root package name */
        public int f60458y;

        /* renamed from: z  reason: collision with root package name */
        public int f60459z;

        public a(r0<T> r0Var) {
            this.A = r0Var;
            this.f60458y = r0Var.size();
            this.f60459z = r0Var.f60457z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xn.b
        public void b() {
            if (this.f60458y != 0) {
                e(this.A.f60455x[this.f60459z]);
                this.f60459z = (this.f60459z + 1) % this.A.f60456y;
                this.f60458y--;
                return;
            }
            d();
        }
    }

    public r0(Object[] objArr, int i10) {
        jo.p.h(objArr, "buffer");
        this.f60455x = objArr;
        if (i10 >= 0) {
            if (i10 <= objArr.length) {
                this.f60456y = objArr.length;
                this.A = i10;
                return;
            }
            throw new IllegalArgumentException(("ring buffer filled size: " + i10 + " cannot be larger than the buffer size: " + objArr.length).toString());
        }
        throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i10).toString());
    }

    @Override // xn.a
    public int d() {
        return this.A;
    }

    @Override // xn.c, java.util.List
    public T get(int i10) {
        c.f60430w.b(i10, size());
        return (T) this.f60455x[(this.f60457z + i10) % this.f60456y];
    }

    @Override // xn.c, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<T> iterator() {
        return new a(this);
    }

    public final void k(T t10) {
        if (!p()) {
            this.f60455x[(this.f60457z + size()) % this.f60456y] = t10;
            this.A = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final r0<T> m(int i10) {
        Object[] array;
        int i11 = this.f60456y;
        int i12 = po.n.i(i11 + (i11 >> 1) + 1, i10);
        if (this.f60457z == 0) {
            array = Arrays.copyOf(this.f60455x, i12);
            jo.p.g(array, "copyOf(this, newSize)");
        } else {
            array = toArray(new Object[i12]);
        }
        return new r0<>(array, size());
    }

    public final boolean p() {
        return size() == this.f60456y;
    }

    public final void r(int i10) {
        if (i10 >= 0) {
            if (!(i10 <= size())) {
                throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i10 + ", size = " + size()).toString());
            } else if (i10 > 0) {
                int i11 = this.f60457z;
                int i12 = (i11 + i10) % this.f60456y;
                if (i11 > i12) {
                    n.r(this.f60455x, null, i11, this.f60456y);
                    n.r(this.f60455x, null, 0, i12);
                } else {
                    n.r(this.f60455x, null, i11, i12);
                }
                this.f60457z = i12;
                this.A = size() - i10;
                return;
            } else {
                return;
            }
        }
        throw new IllegalArgumentException(("n shouldn't be negative but it is " + i10).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xn.a, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        jo.p.h(tArr, "array");
        if (tArr.length < size()) {
            tArr = (T[]) Arrays.copyOf(tArr, size());
            jo.p.g(tArr, "copyOf(this, newSize)");
        }
        int size = size();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = this.f60457z; i11 < size && i12 < this.f60456y; i12++) {
            tArr[i11] = this.f60455x[i12];
            i11++;
        }
        while (i11 < size) {
            tArr[i11] = this.f60455x[i10];
            i11++;
            i10++;
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        jo.p.f(tArr, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.RingBuffer.toArray>");
        return tArr;
    }

    public r0(int i10) {
        this(new Object[i10], 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xn.a, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
