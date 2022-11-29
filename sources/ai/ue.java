package ai;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ue {

    /* renamed from: a  reason: collision with root package name */
    public final int f10678a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f10679b;

    public ue(int i10, byte[] bArr) {
        this.f10679b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ue.class == obj.getClass() && Arrays.equals(this.f10679b, ((ue) obj).f10679b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10679b) + 31;
    }
}
