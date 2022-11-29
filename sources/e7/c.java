package e7;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import rp.f;
import rp.w;

/* loaded from: classes.dex */
public abstract class c implements Closeable {
    public static final String[] C = new String[128];
    public boolean A;
    public boolean B;

    /* renamed from: w  reason: collision with root package name */
    public int f30303w;

    /* renamed from: x  reason: collision with root package name */
    public int[] f30304x = new int[32];

    /* renamed from: y  reason: collision with root package name */
    public String[] f30305y = new String[32];

    /* renamed from: z  reason: collision with root package name */
    public int[] f30306z = new int[32];

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f30307a;

        /* renamed from: b  reason: collision with root package name */
        public final w f30308b;

        public a(String[] strArr, w wVar) {
            this.f30307a = strArr;
            this.f30308b = wVar;
        }

        public static a a(String... strArr) {
            try {
                f[] fVarArr = new f[strArr.length];
                rp.c cVar = new rp.c();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    c.I(cVar, strArr[i10]);
                    cVar.readByte();
                    fVarArr[i10] = cVar.G();
                }
                return new a((String[]) strArr.clone(), w.r(fVarArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            C[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = C;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void I(rp.d r7, java.lang.String r8) throws java.io.IOException {
        /*
            java.lang.String[] r0 = e7.c.C
            r1 = 34
            r7.b1(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.g0(r8, r4, r3)
        L2e:
            r7.a0(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.g0(r8, r4, r2)
        L3b:
            r7.b1(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.c.I(rp.d, java.lang.String):void");
    }

    public static c v(rp.e eVar) {
        return new e(eVar);
    }

    public final void C(int i10) {
        int i11 = this.f30303w;
        int[] iArr = this.f30304x;
        if (i11 == iArr.length) {
            if (i11 != 256) {
                this.f30304x = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f30305y;
                this.f30305y = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f30306z;
                this.f30306z = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new e7.a("Nesting too deep at " + getPath());
            }
        }
        int[] iArr3 = this.f30304x;
        int i12 = this.f30303w;
        this.f30303w = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract int E(a aVar) throws IOException;

    public abstract void F() throws IOException;

    public abstract void G() throws IOException;

    public final e7.b K(String str) throws e7.b {
        throw new e7.b(str + " at path " + getPath());
    }

    public abstract void c() throws IOException;

    public abstract void d() throws IOException;

    public abstract void e() throws IOException;

    public final String getPath() {
        return d.a(this.f30303w, this.f30304x, this.f30305y, this.f30306z);
    }

    public abstract void h() throws IOException;

    public abstract boolean i() throws IOException;

    public abstract boolean j() throws IOException;

    public abstract double n() throws IOException;

    public abstract int o() throws IOException;

    public abstract String p() throws IOException;

    public abstract String q() throws IOException;

    public abstract b z() throws IOException;
}
