package fn;

import com.google.protobuf.d0;

/* loaded from: classes4.dex */
public final class u implements l {

    /* renamed from: a  reason: collision with root package name */
    public final d0 f32101a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32102b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f32103c;

    /* renamed from: d  reason: collision with root package name */
    public final int f32104d;

    public u(d0 d0Var, String str, Object[] objArr) {
        this.f32101a = d0Var;
        this.f32102b = str;
        this.f32103c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f32104d = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char charAt2 = str.charAt(i12);
            if (charAt2 < 55296) {
                this.f32104d = i10 | (charAt2 << i11);
                return;
            }
            i10 |= (charAt2 & 8191) << i11;
            i11 += 13;
            i12 = i13;
        }
    }

    @Override // fn.l
    public boolean a() {
        return (this.f32104d & 2) == 2;
    }

    @Override // fn.l
    public d0 b() {
        return this.f32101a;
    }

    @Override // fn.l
    public s c() {
        return (this.f32104d & 1) == 1 ? s.PROTO2 : s.PROTO3;
    }

    public Object[] d() {
        return this.f32103c;
    }

    public String e() {
        return this.f32102b;
    }
}
