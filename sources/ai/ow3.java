package ai;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ow3 {

    /* renamed from: a  reason: collision with root package name */
    public final int f7933a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f7934b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7935c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7936d;

    public ow3(int i10, byte[] bArr, int i11, int i12) {
        this.f7933a = i10;
        this.f7934b = bArr;
        this.f7935c = i11;
        this.f7936d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ow3.class == obj.getClass()) {
            ow3 ow3Var = (ow3) obj;
            if (this.f7933a == ow3Var.f7933a && this.f7935c == ow3Var.f7935c && this.f7936d == ow3Var.f7936d && Arrays.equals(this.f7934b, ow3Var.f7934b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f7933a * 31) + Arrays.hashCode(this.f7934b)) * 31) + this.f7935c) * 31) + this.f7936d;
    }
}
