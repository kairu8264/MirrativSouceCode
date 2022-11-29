package ai;

import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.nio.ByteBuffer;
import java.util.Date;

/* loaded from: classes3.dex */
public final class k54 extends zm3 {
    public Date H;
    public Date I;
    public long J;
    public long K;
    public double L;
    public float M;
    public jn3 N;
    public long O;

    public k54() {
        super("mvhd");
        this.L = 1.0d;
        this.M = 1.0f;
        this.N = jn3.f5855j;
    }

    @Override // ai.xm3
    public final void c(ByteBuffer byteBuffer) {
        g(byteBuffer);
        if (f() == 1) {
            this.H = en3.a(g54.d(byteBuffer));
            this.I = en3.a(g54.d(byteBuffer));
            this.J = g54.a(byteBuffer);
            this.K = g54.d(byteBuffer);
        } else {
            this.H = en3.a(g54.a(byteBuffer));
            this.I = en3.a(g54.a(byteBuffer));
            this.J = g54.a(byteBuffer);
            this.K = g54.a(byteBuffer);
        }
        this.L = g54.e(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.M = ((short) ((bArr[1] & TagConstant.TAG_CAT_RESERVED) | ((short) ((bArr[0] << 8) & 65280)))) / 256.0f;
        g54.b(byteBuffer);
        g54.a(byteBuffer);
        g54.a(byteBuffer);
        this.N = jn3.a(byteBuffer);
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.O = g54.a(byteBuffer);
    }

    public final long h() {
        return this.J;
    }

    public final long i() {
        return this.K;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.H + ";modificationTime=" + this.I + ";timescale=" + this.J + ";duration=" + this.K + ";rate=" + this.L + ";volume=" + this.M + ";matrix=" + this.N + ";nextTrackId=" + this.O + "]";
    }
}
