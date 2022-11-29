package r2;

import java.text.DecimalFormat;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public a f49719a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f49720b = new int[10];

    /* renamed from: c  reason: collision with root package name */
    public float[] f49721c = new float[10];

    /* renamed from: d  reason: collision with root package name */
    public int f49722d;

    /* renamed from: e  reason: collision with root package name */
    public String f49723e;

    public float a(float f10) {
        return (float) this.f49719a.a(f10, 0);
    }

    public String toString() {
        String str = this.f49723e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f49722d; i10++) {
            str = str + "[" + this.f49720b[i10] + " , " + decimalFormat.format(this.f49721c[i10]) + "] ";
        }
        return str;
    }
}
