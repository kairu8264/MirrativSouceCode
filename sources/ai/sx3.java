package ai;

import com.google.android.exoplayer2.C;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class sx3 {

    /* renamed from: d  reason: collision with root package name */
    public static final x2<sx3> f10020d = sw3.f10012a;

    /* renamed from: a  reason: collision with root package name */
    public final int f10021a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final v4[] f10022b;

    /* renamed from: c  reason: collision with root package name */
    public int f10023c;

    public sx3(v4... v4VarArr) {
        this.f10022b = v4VarArr;
        c(v4VarArr[0].f10951c);
        int i10 = v4VarArr[0].f10953e;
    }

    public static String c(String str) {
        return (str == null || str.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str;
    }

    public final v4 a(int i10) {
        return this.f10022b[i10];
    }

    public final int b(v4 v4Var) {
        for (int i10 = 0; i10 <= 0; i10++) {
            if (v4Var == this.f10022b[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && sx3.class == obj.getClass() && Arrays.equals(this.f10022b, ((sx3) obj).f10022b);
    }

    public final int hashCode() {
        int i10 = this.f10023c;
        if (i10 == 0) {
            int hashCode = Arrays.hashCode(this.f10022b) + 527;
            this.f10023c = hashCode;
            return hashCode;
        }
        return i10;
    }
}
