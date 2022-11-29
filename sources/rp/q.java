package rp;

import java.io.RandomAccessFile;

/* loaded from: classes4.dex */
public final class q extends g {

    /* renamed from: z  reason: collision with root package name */
    public final RandomAccessFile f51729z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(boolean z10, RandomAccessFile randomAccessFile) {
        super(z10);
        jo.p.h(randomAccessFile, "randomAccessFile");
        this.f51729z = randomAccessFile;
    }

    @Override // rp.g
    public synchronized void h() {
        this.f51729z.close();
    }

    @Override // rp.g
    public synchronized int i(long j10, byte[] bArr, int i10, int i11) {
        jo.p.h(bArr, "array");
        this.f51729z.seek(j10);
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            int read = this.f51729z.read(bArr, i10, i11 - i12);
            if (read != -1) {
                i12 += read;
            } else if (i12 == 0) {
                return -1;
            }
        }
        return i12;
    }

    @Override // rp.g
    public synchronized long j() {
        return this.f51729z.length();
    }
}
