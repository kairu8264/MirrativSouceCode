package ai;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzkw;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes3.dex */
public final class qs3 extends z4 {

    /* renamed from: e  reason: collision with root package name */
    public RandomAccessFile f9186e;

    /* renamed from: f  reason: collision with root package name */
    public Uri f9187f;

    /* renamed from: g  reason: collision with root package name */
    public long f9188g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f9189h;

    public qs3() {
        super(false);
    }

    @Override // ai.a6
    public final int b(byte[] bArr, int i10, int i11) throws zzkw {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f9188g;
        if (j10 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f9186e;
            int i12 = sb.f9778a;
            int read = randomAccessFile.read(bArr, i10, (int) Math.min(j10, i11));
            if (read > 0) {
                this.f9188g -= read;
                s(read);
            }
            return read;
        } catch (IOException e10) {
            throw new zzkw(e10, 2000);
        }
    }

    @Override // ai.a8
    public final void g() throws zzkw {
        this.f9187f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f9186e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f9186e = null;
                if (this.f9189h) {
                    this.f9189h = false;
                    t();
                }
            } catch (IOException e10) {
                throw new zzkw(e10, 2000);
            }
        } catch (Throwable th2) {
            this.f9186e = null;
            if (this.f9189h) {
                this.f9189h = false;
                t();
            }
            throw th2;
        }
    }

    @Override // ai.a8
    public final Uri h() {
        return this.f9187f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
        if (r1 != false) goto L33;
     */
    @Override // ai.a8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m(ai.bc r8) throws com.google.android.gms.internal.ads.zzkw {
        /*
            r7 = this;
            android.net.Uri r0 = r8.f2279a
            r7.f9187f = r0
            r7.q(r8)
            r1 = 1
            r2 = 2000(0x7d0, float:2.803E-42)
            r3 = 2006(0x7d6, float:2.811E-42)
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L59 java.io.FileNotFoundException -> L60
            java.lang.String r5 = r0.getPath()     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L59 java.io.FileNotFoundException -> L60
            java.util.Objects.requireNonNull(r5)
            java.lang.String r6 = "r"
            r4.<init>(r5, r6)     // Catch: java.lang.RuntimeException -> L52 java.lang.SecurityException -> L59 java.io.FileNotFoundException -> L60
            r7.f9186e = r4
            long r5 = r8.f2284f     // Catch: java.io.IOException -> L4b
            r4.seek(r5)     // Catch: java.io.IOException -> L4b
            long r3 = r8.f2285g     // Catch: java.io.IOException -> L4b
            r5 = -1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L32
            java.io.RandomAccessFile r0 = r7.f9186e     // Catch: java.io.IOException -> L4b
            long r3 = r0.length()     // Catch: java.io.IOException -> L4b
            long r5 = r8.f2284f     // Catch: java.io.IOException -> L4b
            long r3 = r3 - r5
        L32:
            r7.f9188g = r3     // Catch: java.io.IOException -> L4b
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L42
            r7.f9189h = r1
            r7.r(r8)
            long r0 = r7.f9188g
            return r0
        L42:
            com.google.android.gms.internal.ads.zzkw r8 = new com.google.android.gms.internal.ads.zzkw
            r0 = 2008(0x7d8, float:2.814E-42)
            r1 = 0
            r8.<init>(r1, r1, r0)
            throw r8
        L4b:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzkw r0 = new com.google.android.gms.internal.ads.zzkw
            r0.<init>(r8, r2)
            throw r0
        L52:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzkw r0 = new com.google.android.gms.internal.ads.zzkw
            r0.<init>(r8, r2)
            throw r0
        L59:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzkw r0 = new com.google.android.gms.internal.ads.zzkw
            r0.<init>(r8, r3)
            throw r0
        L60:
            r8 = move-exception
            java.lang.String r2 = r0.getQuery()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L8f
            java.lang.String r2 = r0.getFragment()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L8f
            com.google.android.gms.internal.ads.zzkw r0 = new com.google.android.gms.internal.ads.zzkw
            int r1 = ai.sb.f9778a
            r2 = 21
            r4 = 2005(0x7d5, float:2.81E-42)
            if (r1 < r2) goto L8a
            java.lang.Throwable r1 = r8.getCause()
            boolean r1 = ai.ps3.a(r1)
            if (r1 == 0) goto L8a
            goto L8b
        L8a:
            r3 = r4
        L8b:
            r0.<init>(r8, r3)
            throw r0
        L8f:
            com.google.android.gms.internal.ads.zzkw r2 = new com.google.android.gms.internal.ads.zzkw
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            java.lang.String r5 = r0.getPath()
            r3[r4] = r5
            java.lang.String r4 = r0.getQuery()
            r3[r1] = r4
            r1 = 2
            java.lang.String r0 = r0.getFragment()
            r3[r1] = r0
            java.lang.String r0 = "uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            r1 = 1004(0x3ec, float:1.407E-42)
            r2.<init>(r0, r8, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.qs3.m(ai.bc):long");
    }
}
