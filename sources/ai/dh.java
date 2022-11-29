package ai;

import android.util.SparseArray;

/* loaded from: classes3.dex */
public final class dh implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ gh f3287w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ ih f3288x;

    public dh(ih ihVar, gh ghVar) {
        this.f3288x = ihVar;
        this.f3287w = ghVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        this.f3287w.a();
        sparseArray = this.f3288x.J;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArray2 = this.f3288x.J;
            ((wh) sparseArray2.valueAt(i10)).g();
        }
    }
}
