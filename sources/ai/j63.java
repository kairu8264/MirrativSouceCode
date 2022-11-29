package ai;

import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class j63 implements Comparable<j63> {

    /* renamed from: w  reason: collision with root package name */
    public final byte[] f5636w;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(j63 j63Var) {
        j63 j63Var2 = j63Var;
        int length = this.f5636w.length;
        int length2 = j63Var2.f5636w.length;
        if (length != length2) {
            return length - length2;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f5636w;
            if (i10 >= bArr.length) {
                return 0;
            }
            byte b10 = bArr[i10];
            byte b11 = j63Var2.f5636w[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j63) {
            return Arrays.equals(this.f5636w, ((j63) obj).f5636w);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5636w);
    }

    public final String toString() {
        byte[] bArr = this.f5636w;
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b10 : bArr) {
            int i10 = b10 & TagConstant.TAG_CAT_RESERVED;
            sb2.append("0123456789abcdef".charAt(i10 >> 4));
            sb2.append("0123456789abcdef".charAt(i10 & 15));
        }
        return sb2.toString();
    }
}
