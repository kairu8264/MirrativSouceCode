package ai;

import com.google.android.gms.internal.ads.zzanp;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ck {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f2852a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2853b;

    public ck(List<byte[]> list, int i10) {
        this.f2852a = list;
        this.f2853b = i10;
    }

    public static ck a(nj njVar) throws zzanp {
        try {
            njVar.j(21);
            int l10 = njVar.l() & 3;
            int l11 = njVar.l();
            int g10 = njVar.g();
            int i10 = 0;
            for (int i11 = 0; i11 < l11; i11++) {
                njVar.j(1);
                int m10 = njVar.m();
                for (int i12 = 0; i12 < m10; i12++) {
                    int m11 = njVar.m();
                    i10 += m11 + 4;
                    njVar.j(m11);
                }
            }
            njVar.i(g10);
            byte[] bArr = new byte[i10];
            int i13 = 0;
            for (int i14 = 0; i14 < l11; i14++) {
                njVar.j(1);
                int m12 = njVar.m();
                for (int i15 = 0; i15 < m12; i15++) {
                    int m13 = njVar.m();
                    System.arraycopy(lj.f6576a, 0, bArr, i13, 4);
                    int i16 = i13 + 4;
                    System.arraycopy(njVar.f7359a, njVar.g(), bArr, i16, m13);
                    i13 = i16 + m13;
                    njVar.j(m13);
                }
            }
            return new ck(i10 == 0 ? null : Collections.singletonList(bArr), l10 + 1);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new zzanp("Error parsing HEVC config", e10);
        }
    }
}
