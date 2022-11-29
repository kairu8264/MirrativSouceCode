package ai;

import com.google.android.exoplayer2.C;
import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class d54 implements e54 {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f3156b = Logger.getLogger(d54.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final ThreadLocal<ByteBuffer> f3157a = new c54(this);

    @Override // ai.e54
    public final h54 a(cn3 cn3Var, i54 i54Var) throws IOException {
        int M1;
        long zzb;
        long b10 = cn3Var.b();
        this.f3157a.get().rewind().limit(8);
        do {
            M1 = cn3Var.M1(this.f3157a.get());
            if (M1 == 8) {
                this.f3157a.get().rewind();
                long a10 = g54.a(this.f3157a.get());
                byte[] bArr = null;
                if (a10 < 8 && a10 > 1) {
                    Logger logger = f3156b;
                    Level level = Level.SEVERE;
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Plausibility check failed: size < 8 (size = ");
                    sb2.append(a10);
                    sb2.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb2.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                this.f3157a.get().get(bArr2);
                try {
                    String str = new String(bArr2, C.ISO88591_NAME);
                    if (a10 == 1) {
                        this.f3157a.get().limit(16);
                        cn3Var.M1(this.f3157a.get());
                        this.f3157a.get().position(8);
                        zzb = g54.d(this.f3157a.get()) - 16;
                    } else {
                        zzb = a10 == 0 ? cn3Var.zzb() - cn3Var.b() : a10 - 8;
                    }
                    if ("uuid".equals(str)) {
                        this.f3157a.get().limit(this.f3157a.get().limit() + 16);
                        cn3Var.M1(this.f3157a.get());
                        bArr = new byte[16];
                        for (int position = this.f3157a.get().position() - 16; position < this.f3157a.get().position(); position++) {
                            bArr[position - (this.f3157a.get().position() - 16)] = this.f3157a.get().get(position);
                        }
                        zzb -= 16;
                    }
                    long j10 = zzb;
                    h54 b11 = b(str, bArr, i54Var instanceof h54 ? ((h54) i54Var).zzb() : "");
                    b11.a(i54Var);
                    this.f3157a.get().rewind();
                    b11.d(cn3Var, this.f3157a.get(), j10, this);
                    return b11;
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException(e10);
                }
            }
        } while (M1 >= 0);
        cn3Var.u(b10);
        throw new EOFException();
    }

    public abstract h54 b(String str, byte[] bArr, String str2);
}
