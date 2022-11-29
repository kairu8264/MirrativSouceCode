package ai;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
public final class m74 {

    /* renamed from: a */
    public static boolean f6828a = false;

    /* renamed from: b */
    public static MessageDigest f6829b;

    /* renamed from: c */
    public static final Object f6830c = new Object();

    /* renamed from: d */
    public static final Object f6831d = new Object();

    /* renamed from: e */
    public static final CountDownLatch f6832e = new CountDownLatch(1);

    public static void b() {
        synchronized (f6831d) {
            if (!f6828a) {
                f6828a = true;
                new Thread(new k74(null)).start();
            }
        }
    }

    public static String c(s64 s64Var, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] g10;
        byte[] L = s64Var.L();
        if (((Boolean) ft.c().c(ox.R1)).booleanValue()) {
            Vector<byte[]> d10 = d(L, 255);
            if (d10 != null && d10.size() != 0) {
                f74 B = g74.B();
                int size = d10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    B.r(oh3.N(g(d10.get(i10), str, false)));
                }
                B.s(oh3.N(e(L)));
                g10 = B.n().L();
            } else {
                g10 = g(f(4096).L(), str, true);
            }
        } else if (s0.f9645a != null) {
            byte[] a10 = s0.f9645a.a(L, str != null ? str.getBytes() : new byte[0]);
            f74 B2 = g74.B();
            B2.r(oh3.N(a10));
            B2.t(3);
            g10 = B2.n().L();
        } else {
            throw new GeneralSecurityException();
        }
        return i74.a(g10, true);
    }

    public static Vector<byte[]> d(byte[] bArr, int i10) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        int i11 = (length + 254) / 255;
        Vector<byte[]> vector = new Vector<>();
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i12 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i13 > 255) {
                    length2 = i13 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i13, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x001c, code lost:
        r1.reset();
        r1.update(r6);
        r6 = ai.m74.f6829b.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] e(byte[] r6) throws java.security.NoSuchAlgorithmException {
        /*
            java.lang.Object r0 = ai.m74.f6830c
            monitor-enter(r0)
            b()     // Catch: java.lang.Throwable -> L32
            r1 = 0
            java.util.concurrent.CountDownLatch r2 = ai.m74.f6832e     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L32
            r3 = 2
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L32
            boolean r2 = r2.await(r3, r5)     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L32
            if (r2 != 0) goto L14
            goto L1a
        L14:
            java.security.MessageDigest r2 = ai.m74.f6829b     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L19
            goto L1a
        L19:
            r1 = r2
        L1a:
            if (r1 == 0) goto L2a
            r1.reset()     // Catch: java.lang.Throwable -> L32
            r1.update(r6)     // Catch: java.lang.Throwable -> L32
            java.security.MessageDigest r6 = ai.m74.f6829b     // Catch: java.lang.Throwable -> L32
            byte[] r6 = r6.digest()     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r6
        L2a:
            java.security.NoSuchAlgorithmException r6 = new java.security.NoSuchAlgorithmException     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "Cannot compute hash"
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L32
            throw r6     // Catch: java.lang.Throwable -> L32
        L32:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.m74.e(byte[]):byte[]");
    }

    public static s64 f(int i10) {
        c64 y02 = s64.y0();
        y02.i0(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
        return y02.n();
    }

    public static byte[] g(byte[] bArr, String str, boolean z10) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] array;
        int i10 = true != z10 ? 255 : 239;
        if (bArr.length > i10) {
            bArr = f(4096).L();
        }
        int length = bArr.length;
        if (length < i10) {
            byte[] bArr2 = new byte[i10 - length];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i10 + 1).put((byte) length).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i10 + 1).put((byte) length).put(bArr).array();
        }
        if (z10) {
            array = ByteBuffer.allocate(256).put(e(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        n74[] n74VarArr = new j().G2;
        int length2 = n74VarArr.length;
        for (int i11 = 0; i11 < 12; i11++) {
            n74VarArr[i11].a(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new vg3(str.getBytes(C.UTF8_NAME)).a(bArr3);
        }
        return bArr3;
    }
}
