package ai;

import android.util.Log;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class a14 {

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f1678f = {0, 0, 1};

    /* renamed from: a  reason: collision with root package name */
    public boolean f1679a;

    /* renamed from: b  reason: collision with root package name */
    public int f1680b;

    /* renamed from: c  reason: collision with root package name */
    public int f1681c;

    /* renamed from: d  reason: collision with root package name */
    public int f1682d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f1683e = new byte[128];

    public a14(int i10) {
    }

    public final void a() {
        this.f1679a = false;
        this.f1681c = 0;
        this.f1680b = 0;
    }

    public final boolean b(int i10, int i11) {
        int i12 = this.f1680b;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i10 == 179 || i10 == 181) {
                            this.f1681c -= i11;
                            this.f1679a = false;
                            return true;
                        }
                    } else if ((i10 & PsExtractor.VIDEO_STREAM_MASK) != 32) {
                        Log.w("H263Reader", "Unexpected start code value");
                        a();
                    } else {
                        this.f1682d = this.f1681c;
                        this.f1680b = 4;
                    }
                } else if (i10 > 31) {
                    Log.w("H263Reader", "Unexpected start code value");
                    a();
                } else {
                    this.f1680b = 3;
                }
            } else if (i10 != 181) {
                Log.w("H263Reader", "Unexpected start code value");
                a();
            } else {
                this.f1680b = 2;
            }
        } else if (i10 == 176) {
            this.f1680b = 1;
            this.f1679a = true;
        }
        c(f1678f, 0, 3);
        return false;
    }

    public final void c(byte[] bArr, int i10, int i11) {
        if (this.f1679a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f1683e;
            int length = bArr2.length;
            int i13 = this.f1681c + i12;
            if (length < i13) {
                this.f1683e = Arrays.copyOf(bArr2, i13 + i13);
            }
            System.arraycopy(bArr, i10, this.f1683e, this.f1681c, i12);
            this.f1681c += i12;
        }
    }
}
