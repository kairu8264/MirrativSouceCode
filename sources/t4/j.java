package t4;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f53146a = {112, 114, 111, 0};

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f53147b = {112, 114, 109, 0};

    public static void A(InputStream inputStream) throws IOException {
        c.h(inputStream);
        int j10 = c.j(inputStream);
        if (j10 == 6 || j10 == 7) {
            return;
        }
        while (j10 > 0) {
            c.j(inputStream);
            for (int j11 = c.j(inputStream); j11 > 0; j11--) {
                c.h(inputStream);
            }
            j10--;
        }
    }

    public static boolean B(OutputStream outputStream, byte[] bArr, b[] bVarArr) throws IOException {
        if (Arrays.equals(bArr, k.f53148a)) {
            N(outputStream, bVarArr);
            return true;
        } else if (Arrays.equals(bArr, k.f53149b)) {
            M(outputStream, bVarArr);
            return true;
        } else if (Arrays.equals(bArr, k.f53151d)) {
            K(outputStream, bVarArr);
            return true;
        } else if (Arrays.equals(bArr, k.f53150c)) {
            L(outputStream, bVarArr);
            return true;
        } else if (Arrays.equals(bArr, k.f53152e)) {
            J(outputStream, bVarArr);
            return true;
        } else {
            return false;
        }
    }

    public static void C(OutputStream outputStream, b bVar) throws IOException {
        int i10 = 0;
        for (int i11 : bVar.f53136h) {
            Integer valueOf = Integer.valueOf(i11);
            c.p(outputStream, valueOf.intValue() - i10);
            i10 = valueOf.intValue();
        }
    }

    public static l D(b[] bVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            c.p(byteArrayOutputStream, bVarArr.length);
            int i10 = 2;
            for (b bVar : bVarArr) {
                c.q(byteArrayOutputStream, bVar.f53131c);
                c.q(byteArrayOutputStream, bVar.f53132d);
                c.q(byteArrayOutputStream, bVar.f53135g);
                String j10 = j(bVar.f53129a, bVar.f53130b, k.f53148a);
                int k10 = c.k(j10);
                c.p(byteArrayOutputStream, k10);
                i10 = i10 + 4 + 4 + 4 + 2 + (k10 * 1);
                c.n(byteArrayOutputStream, j10);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i10 == byteArray.length) {
                l lVar = new l(d.DEX_FILES, i10, byteArray, false);
                byteArrayOutputStream.close();
                return lVar;
            }
            throw c.c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static void E(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f53146a);
        outputStream.write(bArr);
    }

    public static void F(OutputStream outputStream, b bVar) throws IOException {
        I(outputStream, bVar);
        C(outputStream, bVar);
        H(outputStream, bVar);
    }

    public static void G(OutputStream outputStream, b bVar, String str) throws IOException {
        c.p(outputStream, c.k(str));
        c.p(outputStream, bVar.f53133e);
        c.q(outputStream, bVar.f53134f);
        c.q(outputStream, bVar.f53131c);
        c.q(outputStream, bVar.f53135g);
        c.n(outputStream, str);
    }

    public static void H(OutputStream outputStream, b bVar) throws IOException {
        byte[] bArr = new byte[k(bVar.f53135g)];
        for (Map.Entry<Integer, Integer> entry : bVar.f53137i.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            if ((intValue2 & 2) != 0) {
                z(bArr, 2, intValue, bVar);
            }
            if ((intValue2 & 4) != 0) {
                z(bArr, 4, intValue, bVar);
            }
        }
        outputStream.write(bArr);
    }

    public static void I(OutputStream outputStream, b bVar) throws IOException {
        int i10 = 0;
        for (Map.Entry<Integer, Integer> entry : bVar.f53137i.entrySet()) {
            int intValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                c.p(outputStream, intValue - i10);
                c.p(outputStream, 0);
                i10 = intValue;
            }
        }
    }

    public static void J(OutputStream outputStream, b[] bVarArr) throws IOException {
        c.p(outputStream, bVarArr.length);
        for (b bVar : bVarArr) {
            String j10 = j(bVar.f53129a, bVar.f53130b, k.f53152e);
            c.p(outputStream, c.k(j10));
            c.p(outputStream, bVar.f53137i.size());
            c.p(outputStream, bVar.f53136h.length);
            c.q(outputStream, bVar.f53131c);
            c.n(outputStream, j10);
            for (Integer num : bVar.f53137i.keySet()) {
                c.p(outputStream, num.intValue());
            }
            for (int i10 : bVar.f53136h) {
                c.p(outputStream, i10);
            }
        }
    }

    public static void K(OutputStream outputStream, b[] bVarArr) throws IOException {
        c.r(outputStream, bVarArr.length);
        for (b bVar : bVarArr) {
            String j10 = j(bVar.f53129a, bVar.f53130b, k.f53151d);
            c.p(outputStream, c.k(j10));
            c.p(outputStream, bVar.f53136h.length);
            c.q(outputStream, bVar.f53137i.size() * 4);
            c.q(outputStream, bVar.f53131c);
            c.n(outputStream, j10);
            for (Integer num : bVar.f53137i.keySet()) {
                c.p(outputStream, num.intValue());
                c.p(outputStream, 0);
            }
            for (int i10 : bVar.f53136h) {
                c.p(outputStream, i10);
            }
        }
    }

    public static void L(OutputStream outputStream, b[] bVarArr) throws IOException {
        byte[] b10 = b(bVarArr, k.f53150c);
        c.r(outputStream, bVarArr.length);
        c.m(outputStream, b10);
    }

    public static void M(OutputStream outputStream, b[] bVarArr) throws IOException {
        byte[] b10 = b(bVarArr, k.f53149b);
        c.r(outputStream, bVarArr.length);
        c.m(outputStream, b10);
    }

    public static void N(OutputStream outputStream, b[] bVarArr) throws IOException {
        O(outputStream, bVarArr);
    }

    public static void O(OutputStream outputStream, b[] bVarArr) throws IOException {
        int length;
        byte[] bArr;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(D(bVarArr));
        arrayList.add(c(bVarArr));
        arrayList.add(d(bVarArr));
        long length2 = k.f53148a.length + f53146a.length + 4 + (arrayList.size() * 16);
        c.q(outputStream, arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            l lVar = (l) arrayList.get(i10);
            c.q(outputStream, lVar.f53155a.a());
            c.q(outputStream, length2);
            if (lVar.f53158d) {
                byte[] b10 = c.b(lVar.f53157c);
                arrayList2.add(b10);
                c.q(outputStream, b10.length);
                c.q(outputStream, bArr.length);
                length = b10.length;
            } else {
                arrayList2.add(lVar.f53157c);
                c.q(outputStream, lVar.f53157c.length);
                c.q(outputStream, 0L);
                length = lVar.f53157c.length;
            }
            length2 += length;
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            outputStream.write((byte[]) arrayList2.get(i11));
        }
    }

    public static int a(b bVar) {
        int i10 = 0;
        for (Map.Entry<Integer, Integer> entry : bVar.f53137i.entrySet()) {
            i10 |= entry.getValue().intValue();
        }
        return i10;
    }

    public static byte[] b(b[] bVarArr, byte[] bArr) throws IOException {
        int i10 = 0;
        int i11 = 0;
        for (b bVar : bVarArr) {
            i11 += c.k(j(bVar.f53129a, bVar.f53130b, bArr)) + 16 + (bVar.f53133e * 2) + bVar.f53134f + k(bVar.f53135g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i11);
        if (Arrays.equals(bArr, k.f53150c)) {
            int length = bVarArr.length;
            while (i10 < length) {
                b bVar2 = bVarArr[i10];
                G(byteArrayOutputStream, bVar2, j(bVar2.f53129a, bVar2.f53130b, bArr));
                F(byteArrayOutputStream, bVar2);
                i10++;
            }
        } else {
            for (b bVar3 : bVarArr) {
                G(byteArrayOutputStream, bVar3, j(bVar3.f53129a, bVar3.f53130b, bArr));
            }
            int length2 = bVarArr.length;
            while (i10 < length2) {
                F(byteArrayOutputStream, bVarArr[i10]);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == i11) {
            return byteArrayOutputStream.toByteArray();
        }
        throw c.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i11);
    }

    public static l c(b[] bVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            try {
                b bVar = bVarArr[i11];
                c.p(byteArrayOutputStream, i11);
                c.p(byteArrayOutputStream, bVar.f53133e);
                i10 = i10 + 2 + 2 + (bVar.f53133e * 2);
                C(byteArrayOutputStream, bVar);
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i10 == byteArray.length) {
            l lVar = new l(d.CLASSES, i10, byteArray, true);
            byteArrayOutputStream.close();
            return lVar;
        }
        throw c.c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
    }

    public static l d(b[] bVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            try {
                b bVar = bVarArr[i11];
                int a10 = a(bVar);
                byte[] e10 = e(bVar);
                byte[] f10 = f(bVar);
                c.p(byteArrayOutputStream, i11);
                int length = e10.length + 2 + f10.length;
                c.q(byteArrayOutputStream, length);
                c.p(byteArrayOutputStream, a10);
                byteArrayOutputStream.write(e10);
                byteArrayOutputStream.write(f10);
                i10 = i10 + 2 + 4 + length;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i10 == byteArray.length) {
            l lVar = new l(d.METHODS, i10, byteArray, true);
            byteArrayOutputStream.close();
            return lVar;
        }
        throw c.c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
    }

    public static byte[] e(b bVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            H(byteArrayOutputStream, bVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static byte[] f(b bVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            I(byteArrayOutputStream, bVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static String g(String str, String str2) {
        if ("!".equals(str2)) {
            return str.replace(":", "!");
        }
        return ":".equals(str2) ? str.replace("!", ":") : str;
    }

    public static String h(String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        return indexOf > 0 ? str.substring(indexOf + 1) : str;
    }

    public static b i(b[] bVarArr, String str) {
        if (bVarArr.length <= 0) {
            return null;
        }
        String h10 = h(str);
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            if (bVarArr[i10].f53130b.equals(h10)) {
                return bVarArr[i10];
            }
        }
        return null;
    }

    public static String j(String str, String str2, byte[] bArr) {
        String a10 = k.a(bArr);
        if (str.length() <= 0) {
            return g(str2, a10);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (!str2.contains("!") && !str2.contains(":")) {
            if (str2.endsWith(".apk")) {
                return str2;
            }
            return str + k.a(bArr) + str2;
        }
        return g(str2, a10);
    }

    public static int k(int i10) {
        return y(i10 * 2) / 8;
    }

    public static int l(int i10, int i11, int i12) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 4) {
                    return i11 + i12;
                }
                throw c.c("Unexpected flag: " + i10);
            }
            return i11;
        }
        throw c.c("HOT methods are not stored in the bitmap");
    }

    public static int[] m(InputStream inputStream, int i10) throws IOException {
        int[] iArr = new int[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += c.h(inputStream);
            iArr[i12] = i11;
        }
        return iArr;
    }

    public static int n(BitSet bitSet, int i10, int i11) {
        int i12 = bitSet.get(l(2, i10, i11)) ? 2 : 0;
        return bitSet.get(l(4, i10, i11)) ? i12 | 4 : i12;
    }

    public static byte[] o(InputStream inputStream, byte[] bArr) throws IOException {
        if (Arrays.equals(bArr, c.d(inputStream, bArr.length))) {
            return c.d(inputStream, k.f53149b.length);
        }
        throw c.c("Invalid magic");
    }

    public static void p(InputStream inputStream, b bVar) throws IOException {
        int available = inputStream.available() - bVar.f53134f;
        int i10 = 0;
        while (inputStream.available() > available) {
            i10 += c.h(inputStream);
            bVar.f53137i.put(Integer.valueOf(i10), 1);
            for (int h10 = c.h(inputStream); h10 > 0; h10--) {
                A(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw c.c("Read too much data during profile line parse");
        }
    }

    public static b[] q(InputStream inputStream, byte[] bArr, byte[] bArr2, b[] bVarArr) throws IOException {
        if (Arrays.equals(bArr, k.f53153f)) {
            if (!Arrays.equals(k.f53148a, bArr2)) {
                return r(inputStream, bArr, bVarArr);
            }
            throw c.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        } else if (Arrays.equals(bArr, k.f53154g)) {
            return t(inputStream, bArr2, bVarArr);
        } else {
            throw c.c("Unsupported meta version");
        }
    }

    public static b[] r(InputStream inputStream, byte[] bArr, b[] bVarArr) throws IOException {
        if (Arrays.equals(bArr, k.f53153f)) {
            int j10 = c.j(inputStream);
            byte[] e10 = c.e(inputStream, (int) c.i(inputStream), (int) c.i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e10);
                try {
                    b[] s10 = s(byteArrayInputStream, j10, bVarArr);
                    byteArrayInputStream.close();
                    return s10;
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            throw c.c("Content found after the end of file");
        }
        throw c.c("Unsupported meta version");
    }

    public static b[] s(InputStream inputStream, int i10, b[] bVarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new b[0];
        }
        if (i10 == bVarArr.length) {
            String[] strArr = new String[i10];
            int[] iArr = new int[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int h10 = c.h(inputStream);
                iArr[i11] = c.h(inputStream);
                strArr[i11] = c.f(inputStream, h10);
            }
            for (int i12 = 0; i12 < i10; i12++) {
                b bVar = bVarArr[i12];
                if (bVar.f53130b.equals(strArr[i12])) {
                    int i13 = iArr[i12];
                    bVar.f53133e = i13;
                    bVar.f53136h = m(inputStream, i13);
                } else {
                    throw c.c("Order of dexfiles in metadata did not match baseline");
                }
            }
            return bVarArr;
        }
        throw c.c("Mismatched number of dex files found in metadata");
    }

    public static b[] t(InputStream inputStream, byte[] bArr, b[] bVarArr) throws IOException {
        int h10 = c.h(inputStream);
        byte[] e10 = c.e(inputStream, (int) c.i(inputStream), (int) c.i(inputStream));
        if (inputStream.read() <= 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e10);
            try {
                b[] u10 = u(byteArrayInputStream, bArr, h10, bVarArr);
                byteArrayInputStream.close();
                return u10;
            } catch (Throwable th2) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        throw c.c("Content found after the end of file");
    }

    public static b[] u(InputStream inputStream, byte[] bArr, int i10, b[] bVarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new b[0];
        }
        if (i10 == bVarArr.length) {
            for (int i11 = 0; i11 < i10; i11++) {
                c.h(inputStream);
                String f10 = c.f(inputStream, c.h(inputStream));
                long i12 = c.i(inputStream);
                int h10 = c.h(inputStream);
                b i13 = i(bVarArr, f10);
                if (i13 == null) {
                    throw c.c("Missing profile key: " + f10);
                }
                i13.f53132d = i12;
                int[] m10 = m(inputStream, h10);
                if (Arrays.equals(bArr, k.f53152e)) {
                    i13.f53133e = h10;
                    i13.f53136h = m10;
                }
            }
            return bVarArr;
        }
        throw c.c("Mismatched number of dex files found in metadata");
    }

    public static void v(InputStream inputStream, b bVar) throws IOException {
        BitSet valueOf = BitSet.valueOf(c.d(inputStream, c.a(bVar.f53135g * 2)));
        int i10 = 0;
        while (true) {
            int i11 = bVar.f53135g;
            if (i10 >= i11) {
                return;
            }
            int n10 = n(valueOf, i10, i11);
            if (n10 != 0) {
                Integer num = bVar.f53137i.get(Integer.valueOf(i10));
                if (num == null) {
                    num = 0;
                }
                bVar.f53137i.put(Integer.valueOf(i10), Integer.valueOf(n10 | num.intValue()));
            }
            i10++;
        }
    }

    public static b[] w(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (Arrays.equals(bArr, k.f53149b)) {
            int j10 = c.j(inputStream);
            byte[] e10 = c.e(inputStream, (int) c.i(inputStream), (int) c.i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e10);
                try {
                    b[] x10 = x(byteArrayInputStream, str, j10);
                    byteArrayInputStream.close();
                    return x10;
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            throw c.c("Content found after the end of file");
        }
        throw c.c("Unsupported version");
    }

    public static b[] x(InputStream inputStream, String str, int i10) throws IOException {
        if (inputStream.available() == 0) {
            return new b[0];
        }
        b[] bVarArr = new b[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int h10 = c.h(inputStream);
            int h11 = c.h(inputStream);
            bVarArr[i11] = new b(str, c.f(inputStream, h10), c.i(inputStream), 0L, h11, (int) c.i(inputStream), (int) c.i(inputStream), new int[h11], new TreeMap());
        }
        for (int i12 = 0; i12 < i10; i12++) {
            b bVar = bVarArr[i12];
            p(inputStream, bVar);
            bVar.f53136h = m(inputStream, bVar.f53133e);
            v(inputStream, bVar);
        }
        return bVarArr;
    }

    public static int y(int i10) {
        return ((i10 + 8) - 1) & (-8);
    }

    public static void z(byte[] bArr, int i10, int i11, b bVar) {
        int l10 = l(i10, i11, bVar.f53135g);
        int i12 = l10 / 8;
        bArr[i12] = (byte) ((1 << (l10 % 8)) | bArr[i12]);
    }
}
