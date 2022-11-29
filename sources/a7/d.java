package a7;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f551a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f552b;

    public d(float[] fArr, int[] iArr) {
        this.f551a = fArr;
        this.f552b = iArr;
    }

    public int[] a() {
        return this.f552b;
    }

    public float[] b() {
        return this.f551a;
    }

    public int c() {
        return this.f552b.length;
    }

    public void d(d dVar, d dVar2, float f10) {
        if (dVar.f552b.length == dVar2.f552b.length) {
            for (int i10 = 0; i10 < dVar.f552b.length; i10++) {
                this.f551a[i10] = f7.g.k(dVar.f551a[i10], dVar2.f551a[i10], f10);
                this.f552b[i10] = f7.b.c(f10, dVar.f552b[i10], dVar2.f552b[i10]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + dVar.f552b.length + " vs " + dVar2.f552b.length + ")");
    }
}
