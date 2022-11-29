package ai;

import android.util.Log;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class nv2 {

    /* renamed from: a  reason: collision with root package name */
    public long f7539a;

    /* renamed from: b  reason: collision with root package name */
    public long f7540b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7541c;

    public final void a() {
        this.f7539a = 0L;
        this.f7540b = 0L;
        this.f7541c = false;
    }

    public final long b(v4 v4Var, a4 a4Var) {
        if (this.f7540b == 0) {
            this.f7539a = a4Var.f1725e;
        }
        if (this.f7541c) {
            return a4Var.f1725e;
        }
        ByteBuffer byteBuffer = a4Var.f1723c;
        Objects.requireNonNull(byteBuffer);
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            i10 = (i10 << 8) | (byteBuffer.get(i11) & TagConstant.TAG_CAT_RESERVED);
        }
        int i12 = gw3.i(i10);
        if (i12 == -1) {
            this.f7541c = true;
            this.f7540b = 0L;
            this.f7539a = a4Var.f1725e;
            Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return a4Var.f1725e;
        }
        long d10 = d(v4Var.f10974z);
        this.f7540b += i12;
        return d10;
    }

    public final long c(v4 v4Var) {
        return d(v4Var.f10974z);
    }

    public final long d(long j10) {
        return this.f7539a + Math.max(0L, ((this.f7540b - 529) * 1000000) / j10);
    }
}
