package ai;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ni {

    /* renamed from: a  reason: collision with root package name */
    public int f7341a;

    /* renamed from: b  reason: collision with root package name */
    public final fi[] f7342b;

    public ni(fi[] fiVarArr, byte... bArr) {
        this.f7342b = fiVarArr;
    }

    public final fi a(int i10) {
        return this.f7342b[i10];
    }

    public final fi[] b() {
        return (fi[]) this.f7342b.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ni.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f7342b, ((ni) obj).f7342b);
    }

    public final int hashCode() {
        int i10 = this.f7341a;
        if (i10 == 0) {
            int hashCode = Arrays.hashCode(this.f7342b) + 527;
            this.f7341a = hashCode;
            return hashCode;
        }
        return i10;
    }
}
