package ai;

import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes3.dex */
public final class xz3 extends h04 {

    /* renamed from: n  reason: collision with root package name */
    public zv3 f12374n;

    /* renamed from: o  reason: collision with root package name */
    public wz3 f12375o;

    public static boolean j(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // ai.h04
    public final void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f12374n = null;
            this.f12375o = null;
        }
    }

    @Override // ai.h04
    public final long b(hb hbVar) {
        if (j(hbVar.q())) {
            int i10 = (hbVar.q()[2] & TagConstant.TAG_CAT_RESERVED) >> 4;
            if (i10 != 6) {
                if (i10 == 7) {
                    i10 = 7;
                }
                int c10 = uv3.c(hbVar, i10);
                hbVar.p(0);
                return c10;
            }
            hbVar.s(4);
            hbVar.h();
            int c102 = uv3.c(hbVar, i10);
            hbVar.p(0);
            return c102;
        }
        return -1L;
    }

    @Override // ai.h04
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean c(hb hbVar, long j10, f04 f04Var) {
        byte[] q10 = hbVar.q();
        zv3 zv3Var = this.f12374n;
        if (zv3Var == null) {
            zv3 zv3Var2 = new zv3(q10, 17);
            this.f12374n = zv3Var2;
            f04Var.f3873a = zv3Var2.c(Arrays.copyOfRange(q10, 9, hbVar.m()), null);
            return true;
        } else if ((q10[0] & Byte.MAX_VALUE) == 3) {
            yv3 b10 = wv3.b(hbVar);
            zv3 e10 = zv3Var.e(b10);
            this.f12374n = e10;
            this.f12375o = new wz3(e10, b10);
            return true;
        } else if (j(q10)) {
            wz3 wz3Var = this.f12375o;
            if (wz3Var != null) {
                wz3Var.c(j10);
                f04Var.f3874b = this.f12375o;
            }
            Objects.requireNonNull(f04Var.f3873a);
            return false;
        } else {
            return true;
        }
    }
}
