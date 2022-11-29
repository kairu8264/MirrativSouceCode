package ai;

import android.util.SparseArray;

/* loaded from: classes3.dex */
public final class wq3<V> {

    /* renamed from: c  reason: collision with root package name */
    public final y9<V> f11723c;

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<V> f11722b = new SparseArray<>();

    /* renamed from: a  reason: collision with root package name */
    public int f11721a = -1;

    public wq3(y9<V> y9Var) {
        this.f11723c = y9Var;
    }

    public final V a(int i10) {
        if (this.f11721a == -1) {
            this.f11721a = 0;
        }
        while (true) {
            int i11 = this.f11721a;
            if (i11 > 0 && i10 < this.f11722b.keyAt(i11)) {
                this.f11721a--;
            }
        }
        while (this.f11721a < this.f11722b.size() - 1 && i10 >= this.f11722b.keyAt(this.f11721a + 1)) {
            this.f11721a++;
        }
        return this.f11722b.valueAt(this.f11721a);
    }

    public final void b(int i10, V v10) {
        if (this.f11721a == -1) {
            u9.d(this.f11722b.size() == 0);
            this.f11721a = 0;
        }
        if (this.f11722b.size() > 0) {
            SparseArray<V> sparseArray = this.f11722b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            u9.a(i10 >= keyAt);
            if (keyAt == i10) {
                SparseArray<V> sparseArray2 = this.f11722b;
                ((nq3) sparseArray2.valueAt(sparseArray2.size() - 1)).f7444b;
            }
        }
        this.f11722b.append(i10, v10);
    }

    public final V c() {
        SparseArray<V> sparseArray = this.f11722b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public final void d(int i10) {
        int i11 = 0;
        while (i11 < this.f11722b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f11722b.keyAt(i12)) {
                return;
            }
            ((nq3) this.f11722b.valueAt(i11)).f7444b;
            this.f11722b.removeAt(i11);
            int i13 = this.f11721a;
            if (i13 > 0) {
                this.f11721a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public final void e() {
        for (int i10 = 0; i10 < this.f11722b.size(); i10++) {
            ((nq3) this.f11722b.valueAt(i10)).f7444b;
        }
        this.f11721a = -1;
        this.f11722b.clear();
    }

    public final boolean f() {
        return this.f11722b.size() == 0;
    }
}
