package hn;

import com.google.android.exoplayer2.C;
import com.neovisionaries.ws.client.WebSocketException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class s0 extends FilterInputStream {
    public s0(InputStream inputStream) {
        super(inputStream);
    }

    public void a(byte[] bArr, int i10) throws IOException, WebSocketException {
        int i11 = 0;
        while (i11 < i10) {
            int read = read(bArr, i11, i10 - i11);
            if (read <= 0) {
                throw new r(i10, i11);
            }
            i11 += read;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public hn.r0 c() throws java.io.IOException, com.neovisionaries.ws.client.WebSocketException {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hn.s0.c():hn.r0");
    }

    public String d() throws IOException {
        return t.o(this, C.UTF8_NAME);
    }

    public final byte[] e(long j10, boolean z10, byte[] bArr) throws IOException, WebSocketException {
        if (j10 == 0) {
            return null;
        }
        int i10 = (int) j10;
        try {
            byte[] bArr2 = new byte[i10];
            a(bArr2, i10);
            if (z10) {
                r0.H(bArr, bArr2);
            }
            return bArr2;
        } catch (OutOfMemoryError e10) {
            h(j10);
            o0 o0Var = o0.INSUFFICIENT_MEMORY_FOR_PAYLOAD;
            throw new WebSocketException(o0Var, "OutOfMemoryError occurred during a trial to allocate a memory area for a frame's payload: " + e10.getMessage(), e10);
        }
    }

    public final void h(long j10) {
        try {
            skip(j10);
        } catch (IOException unused) {
        }
    }
}
