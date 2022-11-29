package ai;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class on0 implements cn3 {

    /* renamed from: w  reason: collision with root package name */
    public final ByteBuffer f7866w;

    public on0(ByteBuffer byteBuffer) {
        this.f7866w = byteBuffer.duplicate();
    }

    @Override // ai.cn3
    public final int M1(ByteBuffer byteBuffer) throws IOException {
        if (this.f7866w.remaining() != 0 || byteBuffer.remaining() <= 0) {
            int min = Math.min(byteBuffer.remaining(), this.f7866w.remaining());
            byte[] bArr = new byte[min];
            this.f7866w.get(bArr);
            byteBuffer.put(bArr);
            return min;
        }
        return -1;
    }

    @Override // ai.cn3
    public final long b() throws IOException {
        return this.f7866w.position();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // ai.cn3
    public final ByteBuffer g(long j10, long j11) throws IOException {
        int position = this.f7866w.position();
        this.f7866w.position((int) j10);
        ByteBuffer slice = this.f7866w.slice();
        slice.limit((int) j11);
        this.f7866w.position(position);
        return slice;
    }

    @Override // ai.cn3
    public final void u(long j10) throws IOException {
        this.f7866w.position((int) j10);
    }

    @Override // ai.cn3
    public final long zzb() throws IOException {
        return this.f7866w.limit();
    }
}
