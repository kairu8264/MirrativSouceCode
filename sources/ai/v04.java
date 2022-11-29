package ai;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class v04 {

    /* renamed from: a  reason: collision with root package name */
    public int f10910a;

    /* renamed from: b  reason: collision with root package name */
    public final br3[] f10911b;

    public v04(br3[] br3VarArr, byte... bArr) {
        this.f10911b = br3VarArr;
        int length = br3VarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v04.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f10911b, ((v04) obj).f10911b);
    }

    public final int hashCode() {
        int i10 = this.f10910a;
        if (i10 == 0) {
            int hashCode = Arrays.hashCode(this.f10911b) + 527;
            this.f10910a = hashCode;
            return hashCode;
        }
        return i10;
    }
}
