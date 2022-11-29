package ai;

import android.media.MediaCodec;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class a1 {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f1666a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f1667b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f1668c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f1669d;

    /* renamed from: e  reason: collision with root package name */
    public final MediaCodec.CryptoInfo f1670e;

    /* renamed from: f  reason: collision with root package name */
    public final a0 f1671f;

    public a1() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f1670e = cryptoInfo;
        this.f1671f = sb.f9778a >= 24 ? new a0(cryptoInfo, null) : null;
    }

    public final void a(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f1668c = iArr;
        this.f1669d = iArr2;
        this.f1667b = bArr;
        this.f1666a = bArr2;
        MediaCodec.CryptoInfo cryptoInfo = this.f1670e;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (sb.f9778a >= 24) {
            a0 a0Var = this.f1671f;
            Objects.requireNonNull(a0Var);
            a0.a(a0Var, i12, i13);
        }
    }

    public final MediaCodec.CryptoInfo b() {
        return this.f1670e;
    }

    public final void c(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f1668c == null) {
            int[] iArr = new int[1];
            this.f1668c = iArr;
            this.f1670e.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f1668c;
        iArr2[0] = iArr2[0] + i10;
    }
}
