package ai;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class nu2 extends a4 {

    /* renamed from: h  reason: collision with root package name */
    public long f7533h;

    /* renamed from: i  reason: collision with root package name */
    public int f7534i;

    /* renamed from: j  reason: collision with root package name */
    public int f7535j;

    public nu2() {
        super(2, 0);
        this.f7535j = 32;
    }

    @Override // ai.a4, ai.t64
    public final void a() {
        super.a();
        this.f7534i = 0;
    }

    public final void m(int i10) {
        this.f7535j = i10;
    }

    public final long n() {
        return this.f7533h;
    }

    public final int o() {
        return this.f7534i;
    }

    public final boolean p() {
        return this.f7534i > 0;
    }

    public final boolean q(a4 a4Var) {
        ByteBuffer byteBuffer;
        u9.a(!a4Var.h(1073741824));
        u9.a(!a4Var.h(268435456));
        u9.a(!a4Var.h(4));
        if (p()) {
            if (this.f7534i >= this.f7535j || a4Var.h(Integer.MIN_VALUE) != h(Integer.MIN_VALUE)) {
                return false;
            }
            ByteBuffer byteBuffer2 = a4Var.f1723c;
            if (byteBuffer2 != null && (byteBuffer = this.f1723c) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i10 = this.f7534i;
        this.f7534i = i10 + 1;
        if (i10 == 0) {
            this.f1725e = a4Var.f1725e;
            if (a4Var.h(1)) {
                f(1);
            }
        }
        if (a4Var.h(Integer.MIN_VALUE)) {
            f(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer3 = a4Var.f1723c;
        if (byteBuffer3 != null) {
            i(byteBuffer3.remaining());
            this.f1723c.put(byteBuffer3);
        }
        this.f7533h = a4Var.f1725e;
        return true;
    }
}
