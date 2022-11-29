package ri;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

/* loaded from: classes3.dex */
public class b extends sh.a {
    public byte[] A;
    public byte[] B;
    public File C;

    /* renamed from: w  reason: collision with root package name */
    public String f51529w;

    /* renamed from: x  reason: collision with root package name */
    public DataHolder f51530x;

    /* renamed from: y  reason: collision with root package name */
    public ParcelFileDescriptor f51531y;

    /* renamed from: z  reason: collision with root package name */
    public long f51532z;
    public static final String D = b.class.getSimpleName();
    public static final Parcelable.Creator<b> CREATOR = new o();

    public b() {
        this(null, null, null, 0L, null);
    }

    public static final void r0(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public long P() {
        return this.f51532z;
    }

    public DataHolder S() {
        return this.f51530x;
    }

    public String U() {
        return this.f51529w;
    }

    public byte[] k0() {
        return this.A;
    }

    public ParcelFileDescriptor p() {
        return this.f51531y;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void writeToParcel(android.os.Parcel r5, int r6) {
        /*
            r4 = this;
            android.os.ParcelFileDescriptor r0 = r4.f51531y
            r1 = 0
            if (r0 != 0) goto L63
            byte[] r0 = r4.B
            if (r0 == 0) goto L63
            java.io.File r0 = r4.C
            if (r0 != 0) goto Lf
        Ld:
            r2 = r1
            goto L3b
        Lf:
            java.lang.String r2 = "xlb"
            java.lang.String r3 = ".tmp"
            java.io.File r0 = java.io.File.createTempFile(r2, r3, r0)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L34
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L35
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L35
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r3 = android.os.ParcelFileDescriptor.open(r0, r3)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L35
            r4.f51531y = r3     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L35
            if (r0 == 0) goto L3b
            r0.delete()
            goto L3b
        L2a:
            r5 = move-exception
            r1 = r0
            goto L2e
        L2d:
            r5 = move-exception
        L2e:
            if (r1 == 0) goto L33
            r1.delete()
        L33:
            throw r5
        L34:
            r0 = r1
        L35:
            if (r0 == 0) goto Ld
            r0.delete()
            goto Ld
        L3b:
            if (r2 == 0) goto L63
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream
            r0.<init>(r2)
            java.io.DataOutputStream r2 = new java.io.DataOutputStream
            r2.<init>(r0)
            byte[] r0 = r4.B     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L60
            int r0 = r0.length     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L60
            r2.writeInt(r0)     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L60
            byte[] r0 = r4.B     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L60
            r2.write(r0)     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L60
            r0(r2)
            r6 = r6 | 1
            ri.o.a(r4, r5, r6)
            goto L66
        L5b:
            r5 = move-exception
            r0(r2)
            throw r5
        L60:
            r0(r2)
        L63:
            ri.o.a(r4, r5, r6)
        L66:
            r4.f51531y = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ri.b.writeToParcel(android.os.Parcel, int):void");
    }

    public b(String str, DataHolder dataHolder, ParcelFileDescriptor parcelFileDescriptor, long j10, byte[] bArr) {
        this.f51529w = str;
        this.f51530x = dataHolder;
        this.f51531y = parcelFileDescriptor;
        this.f51532z = j10;
        this.A = bArr;
    }
}
