package ai;

import android.annotation.TargetApi;
import android.media.MediaCodec;

/* loaded from: classes3.dex */
public final class ce {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f2792a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f2793b;

    /* renamed from: c  reason: collision with root package name */
    public int f2794c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f2795d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f2796e;

    /* renamed from: f  reason: collision with root package name */
    public int f2797f;

    /* renamed from: g  reason: collision with root package name */
    public final MediaCodec.CryptoInfo f2798g;

    /* renamed from: h  reason: collision with root package name */
    public final be f2799h;

    public ce() {
        int i10 = vj.f11100a;
        MediaCodec.CryptoInfo cryptoInfo = i10 >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.f2798g = cryptoInfo;
        this.f2799h = i10 >= 24 ? new be(cryptoInfo, null) : null;
    }

    public final void a(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11) {
        this.f2797f = i10;
        this.f2795d = iArr;
        this.f2796e = iArr2;
        this.f2793b = bArr;
        this.f2792a = bArr2;
        this.f2794c = 1;
        int i12 = vj.f11100a;
        if (i12 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.f2798g;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = 1;
            if (i12 >= 24) {
                be.a(this.f2799h, 0, 0);
            }
        }
    }

    @TargetApi(16)
    public final MediaCodec.CryptoInfo b() {
        return this.f2798g;
    }
}
