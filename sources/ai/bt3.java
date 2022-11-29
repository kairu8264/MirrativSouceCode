package ai;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import com.google.android.gms.internal.ads.zzli;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class bt3 extends z4 {

    /* renamed from: e  reason: collision with root package name */
    public final Resources f2494e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2495f;

    /* renamed from: g  reason: collision with root package name */
    public Uri f2496g;

    /* renamed from: h  reason: collision with root package name */
    public AssetFileDescriptor f2497h;

    /* renamed from: i  reason: collision with root package name */
    public InputStream f2498i;

    /* renamed from: j  reason: collision with root package name */
    public long f2499j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2500k;

    public bt3(Context context) {
        super(false);
        this.f2494e = context.getResources();
        this.f2495f = context.getPackageName();
    }

    @Override // ai.a6
    public final int b(byte[] bArr, int i10, int i11) throws zzli {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f2499j;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i11 = (int) Math.min(j10, i11);
                } catch (IOException e10) {
                    throw new zzli(null, e10, 2000);
                }
            }
            InputStream inputStream = this.f2498i;
            int i12 = sb.f9778a;
            int read = inputStream.read(bArr, i10, i11);
            if (read == -1) {
                if (this.f2499j == -1) {
                    return -1;
                }
                throw new zzli("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
            long j11 = this.f2499j;
            if (j11 != -1) {
                this.f2499j = j11 - read;
            }
            s(read);
            return read;
        }
        return -1;
    }

    @Override // ai.a8
    public final void g() throws zzli {
        this.f2496g = null;
        try {
            try {
                InputStream inputStream = this.f2498i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f2498i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f2497h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new zzli(null, e10, 2000);
                    }
                } finally {
                    this.f2497h = null;
                    if (this.f2500k) {
                        this.f2500k = false;
                        t();
                    }
                }
            } catch (Throwable th2) {
                this.f2498i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f2497h;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f2497h = null;
                        if (this.f2500k) {
                            this.f2500k = false;
                            t();
                        }
                        throw th2;
                    } catch (Throwable th3) {
                        this.f2497h = null;
                        if (this.f2500k) {
                            this.f2500k = false;
                            t();
                        }
                        throw th3;
                    }
                } catch (IOException e11) {
                    throw new zzli(null, e11, 2000);
                }
            }
        } catch (IOException e12) {
            throw new zzli(null, e12, 2000);
        }
    }

    @Override // ai.a8
    public final Uri h() {
        return this.f2496g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
        if (r3.matches("\\d+") != false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0162  */
    @Override // ai.a8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m(ai.bc r16) throws com.google.android.gms.internal.ads.zzli {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.bt3.m(ai.bc):long");
    }
}
