package ai;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class p21 {

    /* renamed from: a  reason: collision with root package name */
    public final long f8251a;

    /* renamed from: b  reason: collision with root package name */
    public final q7 f8252b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8253c;

    /* renamed from: d  reason: collision with root package name */
    public final bp3 f8254d;

    /* renamed from: e  reason: collision with root package name */
    public final long f8255e;

    /* renamed from: f  reason: collision with root package name */
    public final q7 f8256f;

    /* renamed from: g  reason: collision with root package name */
    public final int f8257g;

    /* renamed from: h  reason: collision with root package name */
    public final bp3 f8258h;

    /* renamed from: i  reason: collision with root package name */
    public final long f8259i;

    /* renamed from: j  reason: collision with root package name */
    public final long f8260j;

    public p21(long j10, q7 q7Var, int i10, bp3 bp3Var, long j11, q7 q7Var2, int i11, bp3 bp3Var2, long j12, long j13) {
        this.f8251a = j10;
        this.f8252b = q7Var;
        this.f8253c = i10;
        this.f8254d = bp3Var;
        this.f8255e = j11;
        this.f8256f = q7Var2;
        this.f8257g = i11;
        this.f8258h = bp3Var2;
        this.f8259i = j12;
        this.f8260j = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p21.class == obj.getClass()) {
            p21 p21Var = (p21) obj;
            if (this.f8251a == p21Var.f8251a && this.f8253c == p21Var.f8253c && this.f8255e == p21Var.f8255e && this.f8257g == p21Var.f8257g && this.f8259i == p21Var.f8259i && this.f8260j == p21Var.f8260j && hx2.a(this.f8252b, p21Var.f8252b) && hx2.a(this.f8254d, p21Var.f8254d) && hx2.a(this.f8256f, p21Var.f8256f) && hx2.a(this.f8258h, p21Var.f8258h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f8251a), this.f8252b, Integer.valueOf(this.f8253c), this.f8254d, Long.valueOf(this.f8255e), this.f8256f, Integer.valueOf(this.f8257g), this.f8258h, Long.valueOf(this.f8259i), Long.valueOf(this.f8260j)});
    }
}
