package hn;

import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import com.neovisionaries.ws.client.WebSocketException;
import java.util.Map;

/* loaded from: classes4.dex */
public class y extends x {

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f36280i = {0, 0, -1, -1};

    /* renamed from: c  reason: collision with root package name */
    public boolean f36281c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f36282d;

    /* renamed from: e  reason: collision with root package name */
    public int f36283e;

    /* renamed from: f  reason: collision with root package name */
    public int f36284f;

    /* renamed from: g  reason: collision with root package name */
    public int f36285g;

    /* renamed from: h  reason: collision with root package name */
    public c f36286h;

    public y() {
        super("permessage-deflate");
        this.f36283e = 32768;
        this.f36284f = 32768;
    }

    public static byte[] j(byte[] bArr) throws n {
        c cVar = new c(bArr.length + 1);
        cVar.k(bArr);
        int[] iArr = new int[1];
        boolean[] zArr = new boolean[1];
        do {
        } while (p(cVar, iArr, zArr));
        if (zArr[0]) {
            return cVar.r(0, (((iArr[0] - 1) / 8) + 1) - 4);
        }
        k(cVar, iArr);
        return cVar.r(0, ((iArr[0] - 1) / 8) + 1);
    }

    public static void k(c cVar, int[] iArr) {
        int i10 = iArr[0] % 8;
        if (i10 == 0 || i10 == 6 || i10 == 7) {
            cVar.i(0);
        }
        iArr[0] = iArr[0] + 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean p(hn.c r5, int[] r6, boolean[] r7) throws hn.n {
        /*
            boolean r0 = r5.m(r6)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Le
            r3 = r6[r2]
            int r3 = r3 - r1
            r5.b(r3)
        Le:
            r3 = 2
            int r4 = r5.n(r6, r3)
            if (r4 == 0) goto L40
            if (r4 == r1) goto L3b
            if (r4 != r3) goto L1d
            r(r5, r6)
            goto L3e
        L1d:
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.Class<hn.y> r7 = hn.y.class
            java.lang.String r7 = r7.getSimpleName()
            r5[r2] = r7
            r6 = r6[r2]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r1] = r6
            java.lang.String r6 = "[%s] Bad compression type '11' at the bit index '%d'."
            java.lang.String r5 = java.lang.String.format(r6, r5)
            hn.n r6 = new hn.n
            r6.<init>(r5)
            throw r6
        L3b:
            s(r5, r6)
        L3e:
            r3 = r2
            goto L47
        L40:
            int r3 = t(r5, r6)
            if (r3 != 0) goto L3e
            r3 = r1
        L47:
            int r5 = r5.h()
            r6 = r6[r2]
            int r6 = r6 / 8
            if (r5 > r6) goto L52
            r0 = r1
        L52:
            if (r0 == 0) goto L58
            if (r3 == 0) goto L58
            r7[r2] = r1
        L58:
            r5 = r0 ^ 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: hn.y.p(hn.c, int[], boolean[]):boolean");
    }

    public static void q(c cVar, int[] iArr, q qVar, q qVar2) throws n {
        while (true) {
            int e10 = qVar.e(cVar, iArr);
            if (e10 == 256) {
                return;
            }
            if (e10 < 0 || e10 > 255) {
                h.e(cVar, iArr, e10);
                h.c(cVar, iArr, qVar2);
            }
        }
    }

    public static void r(c cVar, int[] iArr) throws n {
        q[] qVarArr = new q[2];
        h.d(cVar, iArr, qVarArr);
        q(cVar, iArr, qVarArr[0], qVarArr[1]);
    }

    public static void s(c cVar, int[] iArr) throws n {
        q(cVar, iArr, m.g(), l.g());
    }

    public static int t(c cVar, int[] iArr) {
        int i10 = ((iArr[0] + 7) & (-8)) / 8;
        int d10 = (cVar.d(i10) & TagConstant.TAG_CAT_RESERVED) + ((cVar.d(i10 + 1) & TagConstant.TAG_CAT_RESERVED) * 256);
        iArr[0] = (i10 + 4 + d10) * 8;
        return d10;
    }

    @Override // hn.p0
    public void g() throws WebSocketException {
        for (Map.Entry<String, String> entry : d().entrySet()) {
            u(entry.getKey(), entry.getValue());
        }
        this.f36285g = this.f36283e + 1024;
    }

    @Override // hn.x
    public byte[] h(byte[] bArr) throws WebSocketException {
        if (l(bArr)) {
            try {
                return j(f.a(bArr));
            } catch (Exception e10) {
                throw new WebSocketException(o0.COMPRESSION_ERROR, String.format("Failed to compress the message: %s", e10.getMessage()), e10);
            }
        }
        return bArr;
    }

    @Override // hn.x
    public byte[] i(byte[] bArr) throws WebSocketException {
        int length = bArr.length;
        byte[] bArr2 = f36280i;
        c cVar = new c(length + bArr2.length);
        cVar.k(bArr);
        cVar.k(bArr2);
        if (this.f36286h == null) {
            this.f36286h = new c(this.f36285g);
        }
        int h10 = this.f36286h.h();
        try {
            g.b(cVar, this.f36286h);
            byte[] q10 = this.f36286h.q(h10);
            this.f36286h.p(this.f36285g);
            if (this.f36281c) {
                this.f36286h.a();
            }
            return q10;
        } catch (Exception e10) {
            throw new WebSocketException(o0.DECOMPRESSION_ERROR, String.format("Failed to decompress the message: %s", e10.getMessage()), e10);
        }
    }

    public final boolean l(byte[] bArr) {
        int i10 = this.f36284f;
        return i10 == 32768 || bArr.length < i10;
    }

    public final int m(String str, String str2) throws WebSocketException {
        int n10 = n(str, str2);
        int i10 = 256;
        for (int i11 = 8; i11 < n10; i11++) {
            i10 *= 2;
        }
        return i10;
    }

    public final int n(String str, String str2) throws WebSocketException {
        int o10 = o(str2);
        if (o10 >= 0) {
            return o10;
        }
        throw new WebSocketException(o0.PERMESSAGE_DEFLATE_INVALID_MAX_WINDOW_BITS, String.format("The value of %s parameter of permessage-deflate extension is invalid: %s", str, str2));
    }

    public final int o(String str) {
        int parseInt;
        if (str == null) {
            return -1;
        }
        try {
            parseInt = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        if (parseInt < 8 || 15 < parseInt) {
            return -1;
        }
        return parseInt;
    }

    public final void u(String str, String str2) throws WebSocketException {
        if ("server_no_context_takeover".equals(str)) {
            this.f36281c = true;
        } else if ("client_no_context_takeover".equals(str)) {
            this.f36282d = true;
        } else if ("server_max_window_bits".equals(str)) {
            this.f36283e = m(str, str2);
        } else if ("client_max_window_bits".equals(str)) {
            this.f36284f = m(str, str2);
        } else {
            o0 o0Var = o0.PERMESSAGE_DEFLATE_UNSUPPORTED_PARAMETER;
            throw new WebSocketException(o0Var, "permessage-deflate extension contains an unsupported parameter: " + str);
        }
    }

    public y(String str) {
        super(str);
        this.f36283e = 32768;
        this.f36284f = 32768;
    }
}
