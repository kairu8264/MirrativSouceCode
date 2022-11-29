package ai;

import com.google.android.gms.internal.ads.zzaha;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class wu3 {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f11754a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11755b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11756c;

    /* renamed from: d  reason: collision with root package name */
    public final int f11757d;

    /* renamed from: e  reason: collision with root package name */
    public final float f11758e;

    /* renamed from: f  reason: collision with root package name */
    public final String f11759f;

    public wu3(List<byte[]> list, int i10, int i11, int i12, float f10, String str) {
        this.f11754a = list;
        this.f11755b = i10;
        this.f11756c = i11;
        this.f11757d = i12;
        this.f11758e = f10;
        this.f11759f = str;
    }

    public static wu3 a(hb hbVar) throws zzaha {
        int i10;
        int i11;
        float f10;
        String str;
        try {
            hbVar.s(4);
            int v10 = (hbVar.v() & 3) + 1;
            if (v10 != 3) {
                ArrayList arrayList = new ArrayList();
                int v11 = hbVar.v() & 31;
                for (int i12 = 0; i12 < v11; i12++) {
                    arrayList.add(b(hbVar));
                }
                int v12 = hbVar.v();
                for (int i13 = 0; i13 < v12; i13++) {
                    arrayList.add(b(hbVar));
                }
                if (v11 > 0) {
                    wa b10 = xa.b((byte[]) arrayList.get(0), v10, ((byte[]) arrayList.get(0)).length);
                    int i14 = b10.f11528e;
                    int i15 = b10.f11529f;
                    float f11 = b10.f11530g;
                    str = w9.a(b10.f11524a, b10.f11525b, b10.f11526c);
                    i10 = i14;
                    i11 = i15;
                    f10 = f11;
                } else {
                    i10 = -1;
                    i11 = -1;
                    f10 = 1.0f;
                    str = null;
                }
                return new wu3(arrayList, v10, i10, i11, f10, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw zzaha.b("Error parsing AVC config", e10);
        }
    }

    public static byte[] b(hb hbVar) {
        int w10 = hbVar.w();
        int o10 = hbVar.o();
        hbVar.s(w10);
        return w9.c(hbVar.q(), o10, w10);
    }
}
