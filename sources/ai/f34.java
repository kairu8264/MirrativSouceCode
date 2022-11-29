package ai;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.internal.ads.zzvf;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class f34 {
    public static X509Certificate[][] a(String str) throws zzvf, SecurityException, IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, TopicConstant.EXTEND_AAC_RAW);
        try {
            Pair<ByteBuffer, Long> a10 = g34.a(randomAccessFile);
            if (a10 != null) {
                ByteBuffer byteBuffer = (ByteBuffer) a10.first;
                long longValue = ((Long) a10.second).longValue();
                long j10 = (-20) + longValue;
                if (j10 >= 0) {
                    randomAccessFile.seek(j10);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new zzvf("ZIP64 APK not supported");
                    }
                }
                long b10 = g34.b(byteBuffer);
                if (b10 < longValue) {
                    if (g34.d(byteBuffer) + b10 == longValue) {
                        if (b10 >= 32) {
                            ByteBuffer allocate = ByteBuffer.allocate(24);
                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                            allocate.order(byteOrder);
                            randomAccessFile.seek(b10 - allocate.capacity());
                            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                            if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                                int i10 = 0;
                                long j11 = allocate.getLong(0);
                                if (j11 < allocate.capacity() || j11 > 2147483639) {
                                    StringBuilder sb2 = new StringBuilder(57);
                                    sb2.append("APK Signing Block size out of range: ");
                                    sb2.append(j11);
                                    throw new zzvf(sb2.toString());
                                }
                                int i11 = (int) (8 + j11);
                                long j12 = b10 - i11;
                                if (j12 >= 0) {
                                    ByteBuffer allocate2 = ByteBuffer.allocate(i11);
                                    allocate2.order(byteOrder);
                                    randomAccessFile.seek(j12);
                                    randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                                    long j13 = allocate2.getLong(0);
                                    if (j13 == j11) {
                                        Pair create = Pair.create(allocate2, Long.valueOf(j12));
                                        ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                                        long longValue2 = ((Long) create.second).longValue();
                                        if (byteBuffer2.order() == byteOrder) {
                                            int capacity = byteBuffer2.capacity() - 24;
                                            if (capacity >= 8) {
                                                int capacity2 = byteBuffer2.capacity();
                                                if (capacity <= byteBuffer2.capacity()) {
                                                    int limit = byteBuffer2.limit();
                                                    int position = byteBuffer2.position();
                                                    byteBuffer2.position(0);
                                                    byteBuffer2.limit(capacity);
                                                    byteBuffer2.position(8);
                                                    ByteBuffer slice = byteBuffer2.slice();
                                                    slice.order(byteBuffer2.order());
                                                    byteBuffer2.position(0);
                                                    byteBuffer2.limit(limit);
                                                    byteBuffer2.position(position);
                                                    while (slice.hasRemaining()) {
                                                        i10++;
                                                        if (slice.remaining() >= 8) {
                                                            long j14 = slice.getLong();
                                                            if (j14 >= 4 && j14 <= 2147483647L) {
                                                                int i12 = (int) j14;
                                                                int position2 = slice.position() + i12;
                                                                if (i12 <= slice.remaining()) {
                                                                    if (slice.getInt() == 1896449818) {
                                                                        X509Certificate[][] b11 = b(randomAccessFile.getChannel(), new c34(i(slice, i12 - 4), longValue2, b10, longValue, byteBuffer, null));
                                                                        randomAccessFile.close();
                                                                        return b11;
                                                                    }
                                                                    slice.position(position2);
                                                                } else {
                                                                    int remaining = slice.remaining();
                                                                    StringBuilder sb3 = new StringBuilder(91);
                                                                    sb3.append("APK Signing Block entry #");
                                                                    sb3.append(i10);
                                                                    sb3.append(" size out of range: ");
                                                                    sb3.append(i12);
                                                                    sb3.append(", available: ");
                                                                    sb3.append(remaining);
                                                                    throw new zzvf(sb3.toString());
                                                                }
                                                            } else {
                                                                StringBuilder sb4 = new StringBuilder(76);
                                                                sb4.append("APK Signing Block entry #");
                                                                sb4.append(i10);
                                                                sb4.append(" size out of range: ");
                                                                sb4.append(j14);
                                                                throw new zzvf(sb4.toString());
                                                            }
                                                        } else {
                                                            StringBuilder sb5 = new StringBuilder(70);
                                                            sb5.append("Insufficient data to read size of APK Signing Block entry #");
                                                            sb5.append(i10);
                                                            throw new zzvf(sb5.toString());
                                                        }
                                                    }
                                                    throw new zzvf("No APK Signature Scheme v2 block in APK Signing Block");
                                                }
                                                StringBuilder sb6 = new StringBuilder(41);
                                                sb6.append("end > capacity: ");
                                                sb6.append(capacity);
                                                sb6.append(" > ");
                                                sb6.append(capacity2);
                                                throw new IllegalArgumentException(sb6.toString());
                                            }
                                            StringBuilder sb7 = new StringBuilder(38);
                                            sb7.append("end < start: ");
                                            sb7.append(capacity);
                                            sb7.append(" < ");
                                            sb7.append(8);
                                            throw new IllegalArgumentException(sb7.toString());
                                        }
                                        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                                    }
                                    StringBuilder sb8 = new StringBuilder(103);
                                    sb8.append("APK Signing Block sizes in header and footer do not match: ");
                                    sb8.append(j13);
                                    sb8.append(" vs ");
                                    sb8.append(j11);
                                    throw new zzvf(sb8.toString());
                                }
                                StringBuilder sb9 = new StringBuilder(59);
                                sb9.append("APK Signing Block offset out of range: ");
                                sb9.append(j12);
                                throw new zzvf(sb9.toString());
                            }
                            throw new zzvf("No APK Signing Block before ZIP Central Directory");
                        }
                        StringBuilder sb10 = new StringBuilder(87);
                        sb10.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                        sb10.append(b10);
                        throw new zzvf(sb10.toString());
                    }
                    throw new zzvf("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                StringBuilder sb11 = new StringBuilder(122);
                sb11.append("ZIP Central Directory offset out of range: ");
                sb11.append(b10);
                sb11.append(". ZIP End of Central Directory offset: ");
                sb11.append(longValue);
                throw new zzvf(sb11.toString());
            }
            long length = randomAccessFile.length();
            StringBuilder sb12 = new StringBuilder(102);
            sb12.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
            sb12.append(length);
            sb12.append(" bytes");
            throw new zzvf(sb12.toString());
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public static X509Certificate[][] b(FileChannel fileChannel, c34 c34Var) throws SecurityException {
        ByteBuffer byteBuffer;
        long j10;
        long j11;
        long j12;
        ByteBuffer byteBuffer2;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                byteBuffer = c34Var.f2696a;
                ByteBuffer j13 = j(byteBuffer);
                int i10 = 0;
                while (j13.hasRemaining()) {
                    i10++;
                    try {
                        arrayList.add(c(j(j13), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e10) {
                        StringBuilder sb2 = new StringBuilder(48);
                        sb2.append("Failed to parse/verify signer #");
                        sb2.append(i10);
                        sb2.append(" block");
                        throw new SecurityException(sb2.toString(), e10);
                    }
                }
                if (i10 > 0) {
                    if (!hashMap.isEmpty()) {
                        j10 = c34Var.f2697b;
                        j11 = c34Var.f2698c;
                        j12 = c34Var.f2699d;
                        byteBuffer2 = c34Var.f2700e;
                        d(hashMap, fileChannel, j10, j11, j12, byteBuffer2);
                        return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                    }
                    throw new SecurityException("No content digests found");
                }
                throw new SecurityException("No signers found");
            } catch (IOException e11) {
                throw new SecurityException("Failed to read list of signers", e11);
            }
        } catch (CertificateException e12) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        r11 = f(r5);
        r12 = f(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r11 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r12 == 1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.security.cert.X509Certificate[] c(java.nio.ByteBuffer r22, java.util.Map<java.lang.Integer, byte[]> r23, java.security.cert.CertificateFactory r24) throws java.lang.SecurityException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.f34.c(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    public static void d(Map<Integer, byte[]> map, FileChannel fileChannel, long j10, long j11, long j12, ByteBuffer byteBuffer) throws SecurityException {
        if (!map.isEmpty()) {
            b34 b34Var = new b34(fileChannel, 0L, j10);
            b34 b34Var2 = new b34(fileChannel, j11, j12 - j11);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.order(ByteOrder.LITTLE_ENDIAN);
            g34.c(duplicate, j10);
            z24 z24Var = new z24(duplicate);
            int size = map.size();
            int[] iArr = new int[size];
            int i10 = 0;
            for (Integer num : map.keySet()) {
                iArr[i10] = num.intValue();
                i10++;
            }
            try {
                byte[][] e10 = e(iArr, new a34[]{b34Var, b34Var2, z24Var});
                for (int i11 = 0; i11 < size; i11++) {
                    int i12 = iArr[i11];
                    if (!MessageDigest.isEqual(map.get(Integer.valueOf(i12)), e10[i11])) {
                        throw new SecurityException(g(i12).concat(" digest of contents did not verify"));
                    }
                }
                return;
            } catch (DigestException e11) {
                throw new SecurityException("Failed to compute digest(s) of contents", e11);
            }
        }
        throw new SecurityException("No digests provided");
    }

    public static byte[][] e(int[] iArr, a34[] a34VarArr) throws DigestException {
        long j10;
        int i10;
        int length;
        long j11 = 0;
        int i11 = 0;
        long j12 = 0;
        int i12 = 0;
        while (true) {
            j10 = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            if (i12 >= 3) {
                break;
            }
            j12 += (a34VarArr[i12].zza() + 1048575) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            i12++;
        }
        if (j12 < 2097151) {
            int i13 = (int) j12;
            byte[][] bArr = new byte[iArr.length];
            int i14 = 0;
            while (true) {
                length = iArr.length;
                if (i14 >= length) {
                    break;
                }
                byte[] bArr2 = new byte[(h(iArr[i14]) * i13) + 5];
                bArr2[0] = 90;
                l(i13, bArr2, 1);
                bArr[i14] = bArr2;
                i14++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            for (int i15 = 0; i15 < iArr.length; i15++) {
                String g10 = g(iArr[i15]);
                try {
                    messageDigestArr[i15] = MessageDigest.getInstance(g10);
                } catch (NoSuchAlgorithmException e10) {
                    throw new RuntimeException(g10.concat(" digest not supported"), e10);
                }
            }
            int i16 = 0;
            int i17 = 0;
            for (i10 = 3; i16 < i10; i10 = 3) {
                a34 a34Var = a34VarArr[i16];
                long j13 = j11;
                long zza = a34Var.zza();
                while (zza > j11) {
                    int min = (int) Math.min(zza, j10);
                    l(min, bArr3, 1);
                    for (int i18 = 0; i18 < length; i18++) {
                        messageDigestArr[i18].update(bArr3);
                    }
                    long j14 = j13;
                    try {
                        a34Var.a(messageDigestArr, j14, min);
                        byte[] bArr4 = bArr3;
                        int i19 = 0;
                        while (i19 < iArr.length) {
                            int i20 = iArr[i19];
                            a34 a34Var2 = a34Var;
                            byte[] bArr5 = bArr[i19];
                            int h10 = h(i20);
                            int i21 = length;
                            MessageDigest messageDigest = messageDigestArr[i19];
                            MessageDigest[] messageDigestArr2 = messageDigestArr;
                            int digest = messageDigest.digest(bArr5, (i17 * h10) + 5, h10);
                            if (digest != h10) {
                                String algorithm = messageDigest.getAlgorithm();
                                StringBuilder sb2 = new StringBuilder(String.valueOf(algorithm).length() + 46);
                                sb2.append("Unexpected output size of ");
                                sb2.append(algorithm);
                                sb2.append(" digest: ");
                                sb2.append(digest);
                                throw new RuntimeException(sb2.toString());
                            }
                            i19++;
                            a34Var = a34Var2;
                            length = i21;
                            messageDigestArr = messageDigestArr2;
                        }
                        MessageDigest[] messageDigestArr3 = messageDigestArr;
                        long j15 = min;
                        long j16 = j14 + j15;
                        zza -= j15;
                        i17++;
                        bArr3 = bArr4;
                        j11 = 0;
                        j13 = j16;
                        messageDigestArr = messageDigestArr3;
                        j10 = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                    } catch (IOException e11) {
                        StringBuilder sb3 = new StringBuilder(59);
                        sb3.append("Failed to digest chunk #");
                        sb3.append(i17);
                        sb3.append(" of section #");
                        sb3.append(i11);
                        throw new DigestException(sb3.toString(), e11);
                    }
                }
                i11++;
                i16++;
                j11 = 0;
                j10 = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            }
            byte[][] bArr6 = new byte[iArr.length];
            for (int i22 = 0; i22 < iArr.length; i22++) {
                int i23 = iArr[i22];
                byte[] bArr7 = bArr[i22];
                String g11 = g(i23);
                try {
                    bArr6[i22] = MessageDigest.getInstance(g11).digest(bArr7);
                } catch (NoSuchAlgorithmException e12) {
                    throw new RuntimeException(g11.concat(" digest not supported"), e12);
                }
            }
            return bArr6;
        }
        StringBuilder sb4 = new StringBuilder(37);
        sb4.append("Too many chunks: ");
        sb4.append(j12);
        throw new DigestException(sb4.toString());
    }

    public static int f(int i10) {
        if (i10 != 513) {
            if (i10 != 514) {
                if (i10 != 769) {
                    switch (i10) {
                        case TsExtractor.TS_STREAM_TYPE_AIT /* 257 */:
                        case 259:
                            return 1;
                        case 258:
                        case 260:
                            return 2;
                        default:
                            String valueOf = String.valueOf(Long.toHexString(i10));
                            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(valueOf) : new String("Unknown signature algorithm: 0x"));
                    }
                }
                return 1;
            }
            return 2;
        }
        return 1;
    }

    public static String g(int i10) {
        if (i10 != 1) {
            if (i10 == 2) {
                return "SHA-512";
            }
            StringBuilder sb2 = new StringBuilder(44);
            sb2.append("Unknown content digest algorthm: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        return "SHA-256";
    }

    public static int h(int i10) {
        if (i10 != 1) {
            if (i10 == 2) {
                return 64;
            }
            StringBuilder sb2 = new StringBuilder(44);
            sb2.append("Unknown content digest algorthm: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        return 32;
    }

    public static ByteBuffer i(ByteBuffer byteBuffer, int i10) throws BufferUnderflowException {
        if (i10 >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i11 = i10 + position;
            if (i11 >= position && i11 <= limit) {
                byteBuffer.limit(i11);
                try {
                    ByteBuffer slice = byteBuffer.slice();
                    slice.order(byteBuffer.order());
                    byteBuffer.position(i11);
                    return slice;
                } finally {
                    byteBuffer.limit(limit);
                }
            }
            throw new BufferUnderflowException();
        }
        StringBuilder sb2 = new StringBuilder(17);
        sb2.append("size: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static ByteBuffer j(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 4) {
            int i10 = byteBuffer.getInt();
            if (i10 >= 0) {
                if (i10 <= byteBuffer.remaining()) {
                    return i(byteBuffer, i10);
                }
                int remaining = byteBuffer.remaining();
                StringBuilder sb2 = new StringBuilder(101);
                sb2.append("Length-prefixed field longer than remaining buffer. Field length: ");
                sb2.append(i10);
                sb2.append(", remaining: ");
                sb2.append(remaining);
                throw new IOException(sb2.toString());
            }
            throw new IllegalArgumentException("Negative length");
        }
        int remaining2 = byteBuffer.remaining();
        StringBuilder sb3 = new StringBuilder(93);
        sb3.append("Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
        sb3.append(remaining2);
        throw new IOException(sb3.toString());
    }

    public static byte[] k(ByteBuffer byteBuffer) throws IOException {
        int i10 = byteBuffer.getInt();
        if (i10 >= 0) {
            if (i10 <= byteBuffer.remaining()) {
                byte[] bArr = new byte[i10];
                byteBuffer.get(bArr);
                return bArr;
            }
            int remaining = byteBuffer.remaining();
            StringBuilder sb2 = new StringBuilder(90);
            sb2.append("Underflow while reading length-prefixed value. Length: ");
            sb2.append(i10);
            sb2.append(", available: ");
            sb2.append(remaining);
            throw new IOException(sb2.toString());
        }
        throw new IOException("Negative length");
    }

    public static void l(int i10, byte[] bArr, int i11) {
        bArr[1] = (byte) (i10 & 255);
        bArr[2] = (byte) ((i10 >>> 8) & 255);
        bArr[3] = (byte) ((i10 >>> 16) & 255);
        bArr[4] = (byte) (i10 >> 24);
    }
}
