package ai;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class z24 implements a34 {

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f12845a;

    public z24(ByteBuffer byteBuffer) {
        this.f12845a = byteBuffer.slice();
    }

    @Override // ai.a34
    public final void a(MessageDigest[] messageDigestArr, long j10, int i10) throws IOException {
        ByteBuffer slice;
        synchronized (this.f12845a) {
            int i11 = (int) j10;
            this.f12845a.position(i11);
            this.f12845a.limit(i11 + i10);
            slice = this.f12845a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }

    @Override // ai.a34
    public final long zza() {
        return this.f12845a.capacity();
    }
}
