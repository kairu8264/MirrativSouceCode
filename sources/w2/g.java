package w2;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import v2.b;
import v2.c;
import v2.d;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public boolean f58016a;

    /* renamed from: b  reason: collision with root package name */
    public k f58017b;

    /* renamed from: c  reason: collision with root package name */
    public k f58018c;

    /* renamed from: d  reason: collision with root package name */
    public f f58019d;

    /* renamed from: e  reason: collision with root package name */
    public f f58020e;

    /* renamed from: f  reason: collision with root package name */
    public r2.a[] f58021f;

    /* renamed from: g  reason: collision with root package name */
    public r2.a f58022g;

    /* renamed from: h  reason: collision with root package name */
    public float f58023h;

    /* renamed from: i  reason: collision with root package name */
    public float f58024i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f58025j;

    /* renamed from: k  reason: collision with root package name */
    public double[] f58026k;

    /* renamed from: l  reason: collision with root package name */
    public double[] f58027l;

    /* renamed from: m  reason: collision with root package name */
    public String[] f58028m;

    /* renamed from: n  reason: collision with root package name */
    public float[] f58029n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<k> f58030o;

    /* renamed from: p  reason: collision with root package name */
    public HashMap<String, v2.d> f58031p;

    /* renamed from: q  reason: collision with root package name */
    public HashMap<String, v2.c> f58032q;

    /* renamed from: r  reason: collision with root package name */
    public HashMap<String, v2.b> f58033r;

    /* renamed from: s  reason: collision with root package name */
    public e[] f58034s;

    /* renamed from: t  reason: collision with root package name */
    public int f58035t;

    /* renamed from: u  reason: collision with root package name */
    public View f58036u;

    /* renamed from: v  reason: collision with root package name */
    public int f58037v;

    /* renamed from: w  reason: collision with root package name */
    public float f58038w;

    /* renamed from: x  reason: collision with root package name */
    public Interpolator f58039x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f58040y;

    public final float a(float f10, float[] fArr) {
        float f11 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f12 = this.f58024i;
            if (f12 != 1.0d) {
                float f13 = this.f58023h;
                if (f10 < f13) {
                    f10 = 0.0f;
                }
                if (f10 > f13 && f10 < 1.0d) {
                    f10 = Math.min((f10 - f13) * f12, 1.0f);
                }
            }
        }
        r2.b bVar = this.f58017b.f58078w;
        float f14 = Float.NaN;
        Iterator<k> it = this.f58030o.iterator();
        while (it.hasNext()) {
            k next = it.next();
            r2.b bVar2 = next.f58078w;
            if (bVar2 != null) {
                float f15 = next.f58080y;
                if (f15 < f10) {
                    bVar = bVar2;
                    f11 = f15;
                } else if (Float.isNaN(f14)) {
                    f14 = next.f58080y;
                }
            }
        }
        if (bVar != null) {
            float f16 = (Float.isNaN(f14) ? 1.0f : f14) - f11;
            double d10 = (f10 - f11) / f16;
            f10 = (((float) bVar.a(d10)) * f16) + f11;
            if (fArr != null) {
                fArr[0] = (float) bVar.b(d10);
            }
        }
        return f10;
    }

    public void b(double d10, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f58021f[0].b(d10, dArr);
        this.f58021f[0].d(d10, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f58017b.c(d10, this.f58025j, dArr, fArr, dArr2, fArr2);
    }

    public boolean c(View view, float f10, long j10, r2.c cVar) {
        d.a aVar;
        boolean z10;
        int i10;
        double d10;
        View view2;
        float f11;
        float a10 = a(f10, null);
        int i11 = this.f58037v;
        if (i11 != d.f58013a) {
            float f12 = 1.0f / i11;
            float floor = ((float) Math.floor(a10 / f12)) * f12;
            float f13 = (a10 % f12) / f12;
            if (!Float.isNaN(this.f58038w)) {
                f13 = (f13 + this.f58038w) % 1.0f;
            }
            Interpolator interpolator = this.f58039x;
            if (interpolator != null) {
                f11 = interpolator.getInterpolation(f13);
            } else {
                f11 = ((double) f13) > 0.5d ? 1.0f : 0.0f;
            }
            a10 = (f11 * f12) + floor;
        }
        float f14 = a10;
        HashMap<String, v2.c> hashMap = this.f58032q;
        if (hashMap != null) {
            for (v2.c cVar2 : hashMap.values()) {
                cVar2.b(view, f14);
            }
        }
        HashMap<String, v2.d> hashMap2 = this.f58031p;
        if (hashMap2 != null) {
            d.a aVar2 = null;
            boolean z11 = false;
            for (v2.d dVar : hashMap2.values()) {
                if (dVar instanceof d.a) {
                    aVar2 = (d.a) dVar;
                } else {
                    z11 |= dVar.b(view, f14, j10, cVar);
                }
            }
            z10 = z11;
            aVar = aVar2;
        } else {
            aVar = null;
            z10 = false;
        }
        r2.a[] aVarArr = this.f58021f;
        if (aVarArr != null) {
            double d11 = f14;
            aVarArr[0].b(d11, this.f58026k);
            this.f58021f[0].d(d11, this.f58027l);
            r2.a aVar3 = this.f58022g;
            if (aVar3 != null) {
                double[] dArr = this.f58026k;
                if (dArr.length > 0) {
                    aVar3.b(d11, dArr);
                    this.f58022g.d(d11, this.f58027l);
                }
            }
            if (this.f58040y) {
                d10 = d11;
            } else {
                d10 = d11;
                this.f58017b.e(f14, view, this.f58025j, this.f58026k, this.f58027l, null, this.f58016a);
                this.f58016a = false;
            }
            if (this.f58035t != d.f58013a) {
                if (this.f58036u == null) {
                    this.f58036u = ((View) view.getParent()).findViewById(this.f58035t);
                }
                if (this.f58036u != null) {
                    float top = (view2.getTop() + this.f58036u.getBottom()) / 2.0f;
                    float left = (this.f58036u.getLeft() + this.f58036u.getRight()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(left - view.getLeft());
                        view.setPivotY(top - view.getTop());
                    }
                }
            }
            HashMap<String, v2.c> hashMap3 = this.f58032q;
            if (hashMap3 != null) {
                for (v2.c cVar3 : hashMap3.values()) {
                    if (cVar3 instanceof c.a) {
                        double[] dArr2 = this.f58027l;
                        if (dArr2.length > 1) {
                            ((c.a) cVar3).c(view, f14, dArr2[0], dArr2[1]);
                        }
                    }
                }
            }
            if (aVar != null) {
                double[] dArr3 = this.f58027l;
                i10 = 1;
                z10 |= aVar.c(view, cVar, f14, j10, dArr3[0], dArr3[1]);
            } else {
                i10 = 1;
            }
            int i12 = i10;
            while (true) {
                r2.a[] aVarArr2 = this.f58021f;
                if (i12 >= aVarArr2.length) {
                    break;
                }
                aVarArr2[i12].c(d10, this.f58029n);
                this.f58017b.K.get(this.f58028m[i12 - 1]).e(view, this.f58029n);
                i12++;
            }
            f fVar = this.f58019d;
            if (fVar.f58014w == 0) {
                if (f14 <= 0.0f) {
                    view.setVisibility(fVar.f58015x);
                } else if (f14 >= 1.0f) {
                    view.setVisibility(this.f58020e.f58015x);
                } else if (this.f58020e.f58015x != fVar.f58015x) {
                    view.setVisibility(0);
                }
            }
            if (this.f58034s != null) {
                int i13 = 0;
                while (true) {
                    e[] eVarArr = this.f58034s;
                    if (i13 >= eVarArr.length) {
                        break;
                    }
                    eVarArr[i13].a(f14, view);
                    i13++;
                }
            }
        } else {
            i10 = 1;
            k kVar = this.f58017b;
            float f15 = kVar.A;
            k kVar2 = this.f58018c;
            float f16 = f15 + ((kVar2.A - f15) * f14);
            float f17 = kVar.B;
            float f18 = f17 + ((kVar2.B - f17) * f14);
            float f19 = kVar.C;
            float f20 = kVar2.C;
            float f21 = kVar.D;
            float f22 = kVar2.D;
            float f23 = f16 + 0.5f;
            int i14 = (int) f23;
            float f24 = f18 + 0.5f;
            int i15 = (int) f24;
            int i16 = (int) (f23 + ((f20 - f19) * f14) + f19);
            int i17 = (int) (f24 + ((f22 - f21) * f14) + f21);
            int i18 = i16 - i14;
            int i19 = i17 - i15;
            if (f20 != f19 || f22 != f21 || this.f58016a) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
                this.f58016a = false;
            }
            view.layout(i14, i15, i16, i17);
        }
        HashMap<String, v2.b> hashMap4 = this.f58033r;
        if (hashMap4 != null) {
            for (v2.b bVar : hashMap4.values()) {
                if (bVar instanceof b.a) {
                    double[] dArr4 = this.f58027l;
                    ((b.a) bVar).c(view, f14, dArr4[0], dArr4[i10]);
                } else {
                    bVar.b(view, f14);
                }
            }
        }
        return z10;
    }

    public String toString() {
        k kVar = this.f58017b;
        float f10 = kVar.A;
        float f11 = kVar.B;
        k kVar2 = this.f58018c;
        float f12 = kVar2.A;
        float f13 = kVar2.B;
        StringBuilder sb2 = new StringBuilder(88);
        sb2.append(" start: x: ");
        sb2.append(f10);
        sb2.append(" y: ");
        sb2.append(f11);
        sb2.append(" end: x: ");
        sb2.append(f12);
        sb2.append(" y: ");
        sb2.append(f13);
        return sb2.toString();
    }
}
