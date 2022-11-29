package androidx.compose.ui.platform;

import android.graphics.Matrix;

/* loaded from: classes.dex */
public final class g1<T> {

    /* renamed from: a  reason: collision with root package name */
    public final io.p<T, Matrix, wn.v> f14448a;

    /* renamed from: b  reason: collision with root package name */
    public Matrix f14449b;

    /* renamed from: c  reason: collision with root package name */
    public Matrix f14450c;

    /* renamed from: d  reason: collision with root package name */
    public float[] f14451d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f14452e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f14453f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f14454g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f14455h;

    /* JADX WARN: Multi-variable type inference failed */
    public g1(io.p<? super T, ? super Matrix, wn.v> pVar) {
        jo.p.h(pVar, "getMatrix");
        this.f14448a = pVar;
        this.f14453f = true;
        this.f14454g = true;
        this.f14455h = true;
    }

    public final float[] a(T t10) {
        float[] fArr = this.f14452e;
        if (fArr == null) {
            fArr = c1.o0.c(null, 1, null);
            this.f14452e = fArr;
        }
        if (this.f14454g) {
            this.f14455h = e1.a(b(t10), fArr);
            this.f14454g = false;
        }
        if (this.f14455h) {
            return fArr;
        }
        return null;
    }

    public final float[] b(T t10) {
        float[] fArr = this.f14451d;
        if (fArr == null) {
            fArr = c1.o0.c(null, 1, null);
            this.f14451d = fArr;
        }
        if (this.f14453f) {
            Matrix matrix = this.f14449b;
            if (matrix == null) {
                matrix = new Matrix();
                this.f14449b = matrix;
            }
            this.f14448a.invoke(t10, matrix);
            Matrix matrix2 = this.f14450c;
            if (matrix2 == null || !jo.p.c(matrix, matrix2)) {
                c1.g.b(fArr, matrix);
                this.f14449b = matrix2;
                this.f14450c = matrix;
            }
            this.f14453f = false;
            return fArr;
        }
        return fArr;
    }

    public final void c() {
        this.f14453f = true;
        this.f14454g = true;
    }
}
