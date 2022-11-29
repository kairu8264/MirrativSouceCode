package le;

import android.view.animation.Interpolator;
import jo.h;

/* loaded from: classes2.dex */
public class a implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final double f40127a;

    /* renamed from: b  reason: collision with root package name */
    public final double f40128b;

    /* renamed from: c  reason: collision with root package name */
    public final double f40129c;

    /* renamed from: d  reason: collision with root package name */
    public final double f40130d;

    public a(double d10, double d11, double d12, double d13) {
        this.f40127a = d10;
        this.f40128b = d11;
        this.f40129c = d12;
        this.f40130d = d13;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        double d10 = f10;
        if (d10 >= this.f40129c && d10 <= this.f40130d) {
            return (float) (((-1) * Math.pow(2.718281828459045d, (-f10) / this.f40127a) * Math.cos(this.f40128b * d10)) + 1);
        }
        return 1.0f;
    }

    public /* synthetic */ a(double d10, double d11, double d12, double d13, int i10, h hVar) {
        this((i10 & 1) != 0 ? 0.1d : d10, (i10 & 2) != 0 ? 20.0d : d11, (i10 & 4) != 0 ? 0.0d : d12, (i10 & 8) != 0 ? 10.0d : d13);
    }
}
