package rp;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes4.dex */
public interface d extends f0, WritableByteChannel {
    d H(int i10) throws IOException;

    long H0(h0 h0Var) throws IOException;

    d J0(long j10) throws IOException;

    d U0(int i10) throws IOException;

    d a0(String str) throws IOException;

    d b1(int i10) throws IOException;

    @Override // rp.f0, java.io.Flushable
    void flush() throws IOException;

    d g0(String str, int i10, int i11) throws IOException;

    c l();

    d o0(f fVar) throws IOException;

    d t1(long j10) throws IOException;

    d v0(byte[] bArr) throws IOException;

    d write(byte[] bArr, int i10, int i11) throws IOException;
}
