package ai;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class b34 implements a34 {

    /* renamed from: a  reason: collision with root package name */
    public final FileChannel f2218a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2219b;

    /* renamed from: c  reason: collision with root package name */
    public final long f2220c;

    public b34(FileChannel fileChannel, long j10, long j11) {
        this.f2218a = fileChannel;
        this.f2219b = j10;
        this.f2220c = j11;
    }

    @Override // ai.a34
    public final void a(MessageDigest[] messageDigestArr, long j10, int i10) throws IOException {
        MappedByteBuffer map = this.f2218a.map(FileChannel.MapMode.READ_ONLY, this.f2219b + j10, i10);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // ai.a34
    public final long zza() {
        return this.f2220c;
    }
}
