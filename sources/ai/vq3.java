package ai;

import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: classes3.dex */
public final class vq3 {

    /* renamed from: f  reason: collision with root package name */
    public static final x2<vq3> f11157f = vp3.f11152a;

    /* renamed from: a  reason: collision with root package name */
    public final int f11158a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11159b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11160c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f11161d;

    /* renamed from: e  reason: collision with root package name */
    public int f11162e;

    public vq3(int i10, int i11, int i12, byte[] bArr) {
        this.f11158a = i10;
        this.f11159b = i11;
        this.f11160c = i12;
        this.f11161d = bArr;
    }

    @Pure
    public static int a(int i10) {
        if (i10 != 1) {
            if (i10 != 9) {
                return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
            }
            return 6;
        }
        return 1;
    }

    @Pure
    public static int b(int i10) {
        if (i10 != 1) {
            if (i10 != 16) {
                if (i10 != 18) {
                    return (i10 == 6 || i10 == 7) ? 3 : -1;
                }
                return 7;
            }
            return 6;
        }
        return 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vq3.class == obj.getClass()) {
            vq3 vq3Var = (vq3) obj;
            if (this.f11158a == vq3Var.f11158a && this.f11159b == vq3Var.f11159b && this.f11160c == vq3Var.f11160c && Arrays.equals(this.f11161d, vq3Var.f11161d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f11162e;
        if (i10 == 0) {
            int hashCode = ((((((this.f11158a + 527) * 31) + this.f11159b) * 31) + this.f11160c) * 31) + Arrays.hashCode(this.f11161d);
            this.f11162e = hashCode;
            return hashCode;
        }
        return i10;
    }

    public final String toString() {
        int i10 = this.f11158a;
        int i11 = this.f11159b;
        int i12 = this.f11160c;
        boolean z10 = this.f11161d != null;
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("ColorInfo(");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(i12);
        sb2.append(", ");
        sb2.append(z10);
        sb2.append(")");
        return sb2.toString();
    }
}
