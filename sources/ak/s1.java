package ak;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class s1 extends OutputStream {
    public long A;
    public FileOutputStream B;
    public a4 C;

    /* renamed from: w  reason: collision with root package name */
    public final y2 f13634w = new y2();

    /* renamed from: x  reason: collision with root package name */
    public final File f13635x;

    /* renamed from: y  reason: collision with root package name */
    public final u3 f13636y;

    /* renamed from: z  reason: collision with root package name */
    public long f13637z;

    public s1(File file, u3 u3Var) {
        this.f13635x = file;
        this.f13636y = u3Var;
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        write(new byte[]{(byte) i10}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        int min;
        while (i11 > 0) {
            if (this.f13637z == 0 && this.A == 0) {
                int b10 = this.f13634w.b(bArr, i10, i11);
                if (b10 == -1) {
                    return;
                }
                i10 += b10;
                i11 -= b10;
                a4 c10 = this.f13634w.c();
                this.C = c10;
                if (c10.d()) {
                    this.f13637z = 0L;
                    this.f13636y.l(this.C.f(), 0, this.C.f().length);
                    this.A = this.C.f().length;
                } else if (this.C.h() && !this.C.g()) {
                    this.f13636y.j(this.C.f());
                    File file = new File(this.f13635x, this.C.c());
                    file.getParentFile().mkdirs();
                    this.f13637z = this.C.b();
                    this.B = new FileOutputStream(file);
                } else {
                    byte[] f10 = this.C.f();
                    this.f13636y.l(f10, 0, f10.length);
                    this.f13637z = this.C.b();
                }
            }
            if (!this.C.g()) {
                if (this.C.d()) {
                    this.f13636y.e(this.A, bArr, i10, i11);
                    this.A += i11;
                    min = i11;
                } else if (this.C.h()) {
                    min = (int) Math.min(i11, this.f13637z);
                    this.B.write(bArr, i10, min);
                    long j10 = this.f13637z - min;
                    this.f13637z = j10;
                    if (j10 == 0) {
                        this.B.close();
                    }
                } else {
                    min = (int) Math.min(i11, this.f13637z);
                    this.f13636y.e((this.C.f().length + this.C.b()) - this.f13637z, bArr, i10, min);
                    this.f13637z -= min;
                }
                i10 += min;
                i11 -= min;
            }
        }
    }
}
