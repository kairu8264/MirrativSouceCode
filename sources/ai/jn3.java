package ai;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class jn3 {

    /* renamed from: j  reason: collision with root package name */
    public static final jn3 f5855j = new jn3(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: k  reason: collision with root package name */
    public static final jn3 f5856k = new jn3(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: l  reason: collision with root package name */
    public static final jn3 f5857l = new jn3(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: m  reason: collision with root package name */
    public static final jn3 f5858m = new jn3(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a  reason: collision with root package name */
    public final double f5859a;

    /* renamed from: b  reason: collision with root package name */
    public final double f5860b;

    /* renamed from: c  reason: collision with root package name */
    public final double f5861c;

    /* renamed from: d  reason: collision with root package name */
    public final double f5862d;

    /* renamed from: e  reason: collision with root package name */
    public final double f5863e;

    /* renamed from: f  reason: collision with root package name */
    public final double f5864f;

    /* renamed from: g  reason: collision with root package name */
    public final double f5865g;

    /* renamed from: h  reason: collision with root package name */
    public final double f5866h;

    /* renamed from: i  reason: collision with root package name */
    public final double f5867i;

    public jn3(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        this.f5859a = d14;
        this.f5860b = d15;
        this.f5861c = d16;
        this.f5862d = d10;
        this.f5863e = d11;
        this.f5864f = d12;
        this.f5865g = d13;
        this.f5866h = d17;
        this.f5867i = d18;
    }

    public static jn3 a(ByteBuffer byteBuffer) {
        double e10 = g54.e(byteBuffer);
        double e11 = g54.e(byteBuffer);
        double f10 = g54.f(byteBuffer);
        return new jn3(e10, e11, g54.e(byteBuffer), g54.e(byteBuffer), f10, g54.f(byteBuffer), g54.f(byteBuffer), g54.e(byteBuffer), g54.e(byteBuffer));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jn3.class != obj.getClass()) {
            return false;
        }
        jn3 jn3Var = (jn3) obj;
        return Double.compare(jn3Var.f5862d, this.f5862d) == 0 && Double.compare(jn3Var.f5863e, this.f5863e) == 0 && Double.compare(jn3Var.f5864f, this.f5864f) == 0 && Double.compare(jn3Var.f5865g, this.f5865g) == 0 && Double.compare(jn3Var.f5866h, this.f5866h) == 0 && Double.compare(jn3Var.f5867i, this.f5867i) == 0 && Double.compare(jn3Var.f5859a, this.f5859a) == 0 && Double.compare(jn3Var.f5860b, this.f5860b) == 0 && Double.compare(jn3Var.f5861c, this.f5861c) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f5859a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f5860b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f5861c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f5862d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f5863e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f5864f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f5865g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.f5866h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f5867i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3))) * 31) + ((int) ((doubleToLongBits4 >>> 32) ^ doubleToLongBits4))) * 31) + ((int) ((doubleToLongBits5 >>> 32) ^ doubleToLongBits5))) * 31) + ((int) ((doubleToLongBits6 >>> 32) ^ doubleToLongBits6))) * 31) + ((int) ((doubleToLongBits7 >>> 32) ^ doubleToLongBits7))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f5855j)) {
            return "Rotate 0°";
        }
        if (equals(f5856k)) {
            return "Rotate 90°";
        }
        if (equals(f5857l)) {
            return "Rotate 180°";
        }
        if (equals(f5858m)) {
            return "Rotate 270°";
        }
        double d10 = this.f5859a;
        double d11 = this.f5860b;
        double d12 = this.f5861c;
        double d13 = this.f5862d;
        double d14 = this.f5863e;
        double d15 = this.f5864f;
        double d16 = this.f5865g;
        double d17 = this.f5866h;
        double d18 = this.f5867i;
        StringBuilder sb2 = new StringBuilder(260);
        sb2.append("Matrix{u=");
        sb2.append(d10);
        sb2.append(", v=");
        sb2.append(d11);
        sb2.append(", w=");
        sb2.append(d12);
        sb2.append(", a=");
        sb2.append(d13);
        sb2.append(", b=");
        sb2.append(d14);
        sb2.append(", c=");
        sb2.append(d15);
        sb2.append(", d=");
        sb2.append(d16);
        sb2.append(", tx=");
        sb2.append(d17);
        sb2.append(", ty=");
        sb2.append(d18);
        sb2.append("}");
        return sb2.toString();
    }
}
