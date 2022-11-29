package ai;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public abstract class xm3 implements h54 {
    public static final in3 F = in3.b(xm3.class);
    public ByteBuffer A;
    public long B;
    public cn3 D;

    /* renamed from: w  reason: collision with root package name */
    public final String f12031w;

    /* renamed from: x  reason: collision with root package name */
    public i54 f12032x;
    public long C = -1;
    public ByteBuffer E = null;

    /* renamed from: z  reason: collision with root package name */
    public boolean f12034z = true;

    /* renamed from: y  reason: collision with root package name */
    public boolean f12033y = true;

    public xm3(String str) {
        this.f12031w = str;
    }

    @Override // ai.h54
    public final void a(i54 i54Var) {
        this.f12032x = i54Var;
    }

    public final synchronized void b() {
        if (this.f12034z) {
            return;
        }
        try {
            in3 in3Var = F;
            String str = this.f12031w;
            in3Var.a(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
            this.A = this.D.g(this.B, this.C);
            this.f12034z = true;
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public abstract void c(ByteBuffer byteBuffer);

    @Override // ai.h54
    public final void d(cn3 cn3Var, ByteBuffer byteBuffer, long j10, e54 e54Var) throws IOException {
        this.B = cn3Var.b();
        byteBuffer.remaining();
        this.C = j10;
        this.D = cn3Var;
        cn3Var.u(cn3Var.b() + j10);
        this.f12034z = false;
        this.f12033y = false;
        e();
    }

    public final synchronized void e() {
        String str;
        b();
        in3 in3Var = F;
        String str2 = this.f12031w;
        if (str2.length() != 0) {
            str = "parsing details of ".concat(str2);
        } else {
            str = new String("parsing details of ");
        }
        in3Var.a(str);
        ByteBuffer byteBuffer = this.A;
        if (byteBuffer != null) {
            this.f12033y = true;
            byteBuffer.rewind();
            c(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.E = byteBuffer.slice();
            }
            this.A = null;
        }
    }

    @Override // ai.h54
    public final String zzb() {
        return this.f12031w;
    }
}
