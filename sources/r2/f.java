package r2;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public a f49724a;

    /* renamed from: e  reason: collision with root package name */
    public int f49728e;

    /* renamed from: f  reason: collision with root package name */
    public String f49729f;

    /* renamed from: i  reason: collision with root package name */
    public long f49732i;

    /* renamed from: b  reason: collision with root package name */
    public int f49725b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int[] f49726c = new int[10];

    /* renamed from: d  reason: collision with root package name */
    public float[][] f49727d = (float[][]) Array.newInstance(float.class, 10, 3);

    /* renamed from: g  reason: collision with root package name */
    public float[] f49730g = new float[3];

    /* renamed from: h  reason: collision with root package name */
    public boolean f49731h = false;

    /* renamed from: j  reason: collision with root package name */
    public float f49733j = Float.NaN;

    public String toString() {
        String str = this.f49729f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f49728e; i10++) {
            str = str + "[" + this.f49726c[i10] + " , " + decimalFormat.format(this.f49727d[i10]) + "] ";
        }
        return str;
    }
}
