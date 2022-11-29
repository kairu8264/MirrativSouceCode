package w2;

import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class k implements Comparable<k> {
    public static String[] O = {"position", "x", "y", "width", "height", "pathRotate"};
    public float A;
    public float B;
    public float C;
    public float D;
    public int G;
    public int H;
    public float I;
    public g J;
    public LinkedHashMap<String, androidx.constraintlayout.widget.a> K;
    public int L;
    public double[] M;
    public double[] N;

    /* renamed from: w  reason: collision with root package name */
    public r2.b f58078w;

    /* renamed from: y  reason: collision with root package name */
    public float f58080y;

    /* renamed from: z  reason: collision with root package name */
    public float f58081z;

    /* renamed from: x  reason: collision with root package name */
    public int f58079x = 0;
    public float E = Float.NaN;
    public float F = Float.NaN;

    public k() {
        int i10 = d.f58013a;
        this.G = i10;
        this.H = i10;
        this.I = Float.NaN;
        this.J = null;
        this.K = new LinkedHashMap<>();
        this.L = 0;
        this.M = new double[18];
        this.N = new double[18];
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(k kVar) {
        return Float.compare(this.f58081z, kVar.f58081z);
    }

    public void c(double d10, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f10;
        float f11 = this.A;
        float f12 = this.B;
        float f13 = this.C;
        float f14 = this.D;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f19 = (float) dArr[i10];
            float f20 = (float) dArr2[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                f11 = f19;
                f15 = f20;
            } else if (i11 == 2) {
                f12 = f19;
                f17 = f20;
            } else if (i11 == 3) {
                f13 = f19;
                f16 = f20;
            } else if (i11 == 4) {
                f14 = f19;
                f18 = f20;
            }
        }
        float f21 = 2.0f;
        float f22 = (f16 / 2.0f) + f15;
        float f23 = (f18 / 2.0f) + f17;
        g gVar = this.J;
        if (gVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            gVar.b(d10, fArr3, fArr4);
            float f24 = fArr3[0];
            float f25 = fArr3[1];
            float f26 = fArr4[0];
            float f27 = fArr4[1];
            double d11 = f11;
            double d12 = f12;
            f10 = f13;
            double d13 = f15;
            double d14 = f17;
            float sin = (float) (f26 + (Math.sin(d12) * d13) + (Math.cos(d12) * d14));
            f23 = (float) ((f27 - (d13 * Math.cos(d12))) + (Math.sin(d12) * d14));
            f22 = sin;
            f11 = (float) ((f24 + (Math.sin(d12) * d11)) - (f13 / 2.0f));
            f12 = (float) ((f25 - (d11 * Math.cos(d12))) - (f14 / 2.0f));
            f21 = 2.0f;
        } else {
            f10 = f13;
        }
        fArr[0] = f11 + (f10 / f21) + 0.0f;
        fArr[1] = f12 + (f14 / f21) + 0.0f;
        fArr2[0] = f22;
        fArr2[1] = f23;
    }

    public void e(float f10, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z10) {
        float f11;
        boolean z11;
        boolean z12;
        float f12;
        float f13 = this.A;
        float f14 = this.B;
        float f15 = this.C;
        float f16 = this.D;
        if (iArr.length != 0 && this.M.length <= iArr[iArr.length - 1]) {
            int i10 = iArr[iArr.length - 1] + 1;
            this.M = new double[i10];
            this.N = new double[i10];
        }
        Arrays.fill(this.M, Double.NaN);
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.M[iArr[i11]] = dArr[i11];
            this.N[iArr[i11]] = dArr2[i11];
        }
        float f17 = Float.NaN;
        int i12 = 0;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        float f21 = 0.0f;
        while (true) {
            double[] dArr4 = this.M;
            if (i12 >= dArr4.length) {
                break;
            }
            if (Double.isNaN(dArr4[i12]) && (dArr3 == null || dArr3[i12] == 0.0d)) {
                f12 = f17;
            } else {
                double d10 = dArr3 != null ? dArr3[i12] : 0.0d;
                if (!Double.isNaN(this.M[i12])) {
                    d10 = this.M[i12] + d10;
                }
                f12 = f17;
                float f22 = (float) d10;
                float f23 = (float) this.N[i12];
                if (i12 == 1) {
                    f17 = f12;
                    f18 = f23;
                    f13 = f22;
                } else if (i12 == 2) {
                    f17 = f12;
                    f19 = f23;
                    f14 = f22;
                } else if (i12 == 3) {
                    f17 = f12;
                    f20 = f23;
                    f15 = f22;
                } else if (i12 == 4) {
                    f17 = f12;
                    f21 = f23;
                    f16 = f22;
                } else if (i12 == 5) {
                    f17 = f22;
                }
                i12++;
            }
            f17 = f12;
            i12++;
        }
        float f24 = f17;
        g gVar = this.J;
        if (gVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            gVar.b(f10, fArr, fArr2);
            float f25 = fArr[0];
            float f26 = fArr[1];
            float f27 = fArr2[0];
            float f28 = fArr2[1];
            double d11 = f13;
            double d12 = f14;
            float sin = (float) ((f25 + (Math.sin(d12) * d11)) - (f15 / 2.0f));
            f11 = f16;
            float cos = (float) ((f26 - (Math.cos(d12) * d11)) - (f16 / 2.0f));
            double d13 = f18;
            double d14 = f19;
            float sin2 = (float) (f27 + (Math.sin(d12) * d13) + (Math.cos(d12) * d11 * d14));
            float cos2 = (float) ((f28 - (d13 * Math.cos(d12))) + (d11 * Math.sin(d12) * d14));
            if (dArr2.length >= 2) {
                z11 = false;
                dArr2[0] = sin2;
                z12 = true;
                dArr2[1] = cos2;
            } else {
                z11 = false;
                z12 = true;
            }
            if (!Float.isNaN(f24)) {
                view.setRotation((float) (f24 + Math.toDegrees(Math.atan2(cos2, sin2))));
            }
            f13 = sin;
            f14 = cos;
        } else {
            f11 = f16;
            z11 = false;
            z12 = true;
            if (!Float.isNaN(f24)) {
                view.setRotation((float) (0.0f + f24 + Math.toDegrees(Math.atan2(f19 + (f21 / 2.0f), f18 + (f20 / 2.0f)))));
            }
        }
        if (view instanceof c) {
            ((c) view).a(f13, f14, f15 + f13, f14 + f11);
            return;
        }
        float f29 = f13 + 0.5f;
        int i13 = (int) f29;
        float f30 = f14 + 0.5f;
        int i14 = (int) f30;
        int i15 = (int) (f29 + f15);
        int i16 = (int) (f30 + f11);
        int i17 = i15 - i13;
        int i18 = i16 - i14;
        if (i17 != view.getMeasuredWidth() || i18 != view.getMeasuredHeight()) {
            z11 = z12;
        }
        if (z11 || z10) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(i18, 1073741824));
        }
        view.layout(i13, i14, i15, i16);
    }
}
