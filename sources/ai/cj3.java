package ai;

import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class cj3 extends InputStream {
    public int A;
    public boolean B;
    public byte[] C;
    public int D;
    public long E;

    /* renamed from: w  reason: collision with root package name */
    public Iterator<ByteBuffer> f2848w;

    /* renamed from: x  reason: collision with root package name */
    public ByteBuffer f2849x;

    /* renamed from: y  reason: collision with root package name */
    public int f2850y = 0;

    /* renamed from: z  reason: collision with root package name */
    public int f2851z;

    public cj3(Iterable<ByteBuffer> iterable) {
        this.f2848w = iterable.iterator();
        for (ByteBuffer byteBuffer : iterable) {
            this.f2850y++;
        }
        this.f2851z = -1;
        if (a()) {
            return;
        }
        this.f2849x = bj3.f2377d;
        this.f2851z = 0;
        this.A = 0;
        this.E = 0L;
    }

    public final boolean a() {
        this.f2851z++;
        if (this.f2848w.hasNext()) {
            ByteBuffer next = this.f2848w.next();
            this.f2849x = next;
            this.A = next.position();
            if (this.f2849x.hasArray()) {
                this.B = true;
                this.C = this.f2849x.array();
                this.D = this.f2849x.arrayOffset();
            } else {
                this.B = false;
                this.E = nl3.A(this.f2849x);
                this.C = null;
            }
            return true;
        }
        return false;
    }

    public final void c(int i10) {
        int i11 = this.A + i10;
        this.A = i11;
        if (i11 == this.f2849x.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte z10;
        if (this.f2851z == this.f2850y) {
            return -1;
        }
        if (this.B) {
            z10 = this.C[this.A + this.D];
            c(1);
        } else {
            z10 = nl3.z(this.A + this.E);
            c(1);
        }
        return z10 & TagConstant.TAG_CAT_RESERVED;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f2851z == this.f2850y) {
            return -1;
        }
        int limit = this.f2849x.limit();
        int i12 = this.A;
        int i13 = limit - i12;
        if (i11 > i13) {
            i11 = i13;
        }
        if (this.B) {
            System.arraycopy(this.C, i12 + this.D, bArr, i10, i11);
            c(i11);
        } else {
            int position = this.f2849x.position();
            ByteBuffer byteBuffer = (ByteBuffer) this.f2849x.position(this.A);
            this.f2849x.get(bArr, i10, i11);
            ByteBuffer byteBuffer2 = (ByteBuffer) this.f2849x.position(position);
            c(i11);
        }
        return i11;
    }
}
