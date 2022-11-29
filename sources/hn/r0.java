package hn;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import com.neovisionaries.ws.client.WebSocketException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class r0 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f36262a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f36263b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f36264c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f36265d;

    /* renamed from: e  reason: collision with root package name */
    public int f36266e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f36267f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f36268g;

    public static byte[] H(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr.length >= 4 && bArr2 != null) {
            for (int i10 = 0; i10 < bArr2.length; i10++) {
                bArr2[i10] = (byte) (bArr2[i10] ^ bArr[i10 % 4]);
            }
        }
        return bArr2;
    }

    public static List<r0> Q(r0 r0Var, int i10) {
        byte[] u10 = r0Var.u();
        boolean r10 = r0Var.r();
        ArrayList arrayList = new ArrayList();
        r0Var.J(false).M(Arrays.copyOf(u10, i10));
        arrayList.add(r0Var);
        int i11 = i10;
        while (i11 < u10.length) {
            int i12 = i11 + i10;
            arrayList.add(k(Arrays.copyOfRange(u10, i11, Math.min(i12, u10.length))));
            i11 = i12;
        }
        if (r10) {
            ((r0) arrayList.get(arrayList.size() - 1)).J(true);
        }
        return arrayList;
    }

    public static List<r0> R(r0 r0Var, int i10, x xVar) {
        if (i10 != 0 && r0Var.v() > i10) {
            if (!r0Var.A() && !r0Var.G()) {
                if (!r0Var.C()) {
                    return null;
                }
            } else {
                r0Var = f(r0Var, xVar);
                if (r0Var.v() <= i10) {
                    return null;
                }
            }
            return Q(r0Var, i10);
        }
        return null;
    }

    public static byte[] e(byte[] bArr, x xVar) {
        try {
            return xVar.h(bArr);
        } catch (WebSocketException unused) {
            return bArr;
        }
    }

    public static r0 f(r0 r0Var, x xVar) {
        byte[] u10;
        if (xVar == null) {
            return r0Var;
        }
        if ((r0Var.G() || r0Var.A()) && r0Var.r() && !r0Var.x() && (u10 = r0Var.u()) != null && u10.length != 0) {
            byte[] e10 = e(u10, xVar);
            if (u10.length <= e10.length) {
                return r0Var;
            }
            r0Var.M(e10);
            r0Var.N(true);
        }
        return r0Var;
    }

    public static r0 g(byte[] bArr) {
        return new r0().J(true).L(2).M(bArr);
    }

    public static r0 h() {
        return new r0().J(true).L(8);
    }

    public static r0 i(int i10, String str) {
        return h().I(i10, str);
    }

    public static r0 j() {
        return new r0().L(0);
    }

    public static r0 k(byte[] bArr) {
        return j().M(bArr);
    }

    public static r0 l() {
        return new r0().J(true).L(9);
    }

    public static r0 m(byte[] bArr) {
        return l().M(bArr);
    }

    public static r0 n() {
        return new r0().J(true).L(10);
    }

    public static r0 o(byte[] bArr) {
        return n().M(bArr);
    }

    public boolean A() {
        return this.f36266e == 2;
    }

    public boolean B() {
        return this.f36266e == 8;
    }

    public boolean C() {
        return this.f36266e == 0;
    }

    public boolean D() {
        int i10 = this.f36266e;
        return 8 <= i10 && i10 <= 15;
    }

    public boolean E() {
        return this.f36266e == 9;
    }

    public boolean F() {
        return this.f36266e == 10;
    }

    public boolean G() {
        return this.f36266e == 1;
    }

    public r0 I(int i10, String str) {
        byte[] bArr = {(byte) ((i10 >> 8) & 255), (byte) (i10 & 255)};
        if (str != null && str.length() != 0) {
            byte[] d10 = t.d(str);
            byte[] bArr2 = new byte[d10.length + 2];
            System.arraycopy(bArr, 0, bArr2, 0, 2);
            System.arraycopy(d10, 0, bArr2, 2, d10.length);
            return M(bArr2);
        }
        return M(bArr);
    }

    public r0 J(boolean z10) {
        this.f36262a = z10;
        return this;
    }

    public r0 K(boolean z10) {
        this.f36267f = z10;
        return this;
    }

    public r0 L(int i10) {
        this.f36266e = i10;
        return this;
    }

    public r0 M(byte[] bArr) {
        if (bArr != null && bArr.length == 0) {
            bArr = null;
        }
        this.f36268g = bArr;
        return this;
    }

    public r0 N(boolean z10) {
        this.f36263b = z10;
        return this;
    }

    public r0 O(boolean z10) {
        this.f36264c = z10;
        return this;
    }

    public r0 P(boolean z10) {
        this.f36265d = z10;
        return this;
    }

    public final void a(StringBuilder sb2) {
        byte[] bArr;
        if (c(sb2)) {
            return;
        }
        int i10 = 0;
        while (true) {
            bArr = this.f36268g;
            if (i10 >= bArr.length) {
                break;
            }
            sb2.append(String.format("%02X ", Integer.valueOf(bArr[i10] & TagConstant.TAG_CAT_RESERVED)));
            i10++;
        }
        if (bArr.length != 0) {
            sb2.setLength(sb2.length() - 1);
        }
    }

    public final void b(StringBuilder sb2) {
        sb2.append(",CloseCode=");
        sb2.append(p());
        sb2.append(",Reason=");
        String q10 = q();
        if (q10 == null) {
            sb2.append("null");
            return;
        }
        sb2.append("\"");
        sb2.append(q10);
        sb2.append("\"");
    }

    public final boolean c(StringBuilder sb2) {
        sb2.append(",Payload=");
        if (this.f36268g == null) {
            sb2.append("null");
            return true;
        } else if (this.f36263b) {
            sb2.append("compressed");
            return true;
        } else {
            return false;
        }
    }

    public final void d(StringBuilder sb2) {
        if (c(sb2)) {
            return;
        }
        sb2.append("\"");
        sb2.append(w());
        sb2.append("\"");
    }

    public int p() {
        byte[] bArr = this.f36268g;
        if (bArr == null || bArr.length < 2) {
            return AnalyticsListener.EVENT_UPSTREAM_DISCARDED;
        }
        return (bArr[1] & TagConstant.TAG_CAT_RESERVED) | ((bArr[0] & TagConstant.TAG_CAT_RESERVED) << 8);
    }

    public String q() {
        byte[] bArr = this.f36268g;
        if (bArr == null || bArr.length < 3) {
            return null;
        }
        return t.r(bArr, 2, bArr.length - 2);
    }

    public boolean r() {
        return this.f36262a;
    }

    public boolean s() {
        return this.f36267f;
    }

    public int t() {
        return this.f36266e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("WebSocketFrame(FIN=");
        boolean z10 = this.f36262a;
        String str = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        sb2.append(z10 ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
        sb2.append(",RSV1=");
        sb2.append(this.f36263b ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
        sb2.append(",RSV2=");
        sb2.append(this.f36264c ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
        sb2.append(",RSV3=");
        if (!this.f36265d) {
            str = "0";
        }
        sb2.append(str);
        sb2.append(",Opcode=");
        sb2.append(t.p(this.f36266e));
        sb2.append(",Length=");
        sb2.append(v());
        int i10 = this.f36266e;
        if (i10 == 1) {
            d(sb2);
        } else if (i10 == 2) {
            a(sb2);
        } else if (i10 == 8) {
            b(sb2);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public byte[] u() {
        return this.f36268g;
    }

    public int v() {
        byte[] bArr = this.f36268g;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public String w() {
        byte[] bArr = this.f36268g;
        if (bArr == null) {
            return null;
        }
        return t.q(bArr);
    }

    public boolean x() {
        return this.f36263b;
    }

    public boolean y() {
        return this.f36264c;
    }

    public boolean z() {
        return this.f36265d;
    }
}
