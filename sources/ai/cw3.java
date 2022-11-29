package ai;

import com.google.android.gms.internal.ads.zzaha;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class cw3 {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f3060a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3061b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3062c;

    public cw3(List<byte[]> list, int i10, String str) {
        this.f3060a = list;
        this.f3061b = i10;
        this.f3062c = str;
    }

    public static cw3 a(hb hbVar) throws zzaha {
        try {
            hbVar.s(21);
            int v10 = hbVar.v() & 3;
            int v11 = hbVar.v();
            int o10 = hbVar.o();
            int i10 = 0;
            for (int i11 = 0; i11 < v11; i11++) {
                hbVar.s(1);
                int w10 = hbVar.w();
                for (int i12 = 0; i12 < w10; i12++) {
                    int w11 = hbVar.w();
                    i10 += w11 + 4;
                    hbVar.s(w11);
                }
            }
            hbVar.p(o10);
            byte[] bArr = new byte[i10];
            int i13 = 0;
            String str = null;
            for (int i14 = 0; i14 < v11; i14++) {
                int v12 = hbVar.v() & 127;
                int w12 = hbVar.w();
                int i15 = 0;
                while (i15 < w12) {
                    int w13 = hbVar.w();
                    System.arraycopy(xa.f11894a, 0, bArr, i13, 4);
                    int i16 = i13 + 4;
                    System.arraycopy(hbVar.q(), hbVar.o(), bArr, i16, w13);
                    if (v12 == 33 && i15 == 0) {
                        i15 = 0;
                        str = w9.b(new ib(bArr, i16, i16 + w13));
                    }
                    i13 = i16 + w13;
                    hbVar.s(w13);
                    i15++;
                }
            }
            return new cw3(i10 == 0 ? null : Collections.singletonList(bArr), v10 + 1, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw zzaha.b("Error parsing HEVC config", e10);
        }
    }
}
