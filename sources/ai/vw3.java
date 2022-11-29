package ai;

import com.google.android.gms.internal.ads.zzaha;

/* loaded from: classes3.dex */
public final class vw3 {
    public static int a(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    public static rw3 b(hb hbVar, boolean z10, boolean z11) throws zzaha {
        if (z10) {
            c(3, hbVar, false);
        }
        String e10 = hbVar.e((int) hbVar.C(), zw2.f13232c);
        long C = hbVar.C();
        String[] strArr = new String[(int) C];
        int length = e10.length() + 15;
        for (int i10 = 0; i10 < C; i10++) {
            String e11 = hbVar.e((int) hbVar.C(), zw2.f13232c);
            strArr[i10] = e11;
            length = length + 4 + e11.length();
        }
        if (z11 && (hbVar.v() & 1) == 0) {
            throw zzaha.b("framing bit expected to be set", null);
        }
        return new rw3(e10, strArr, length + 1);
    }

    public static boolean c(int i10, hb hbVar, boolean z10) throws zzaha {
        if (hbVar.l() < 7) {
            if (z10) {
                return false;
            }
            int l10 = hbVar.l();
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("too short header: ");
            sb2.append(l10);
            throw zzaha.b(sb2.toString(), null);
        } else if (hbVar.v() != i10) {
            if (z10) {
                return false;
            }
            String valueOf = String.valueOf(Integer.toHexString(i10));
            throw zzaha.b(valueOf.length() != 0 ? "expected header type ".concat(valueOf) : new String("expected header type "), null);
        } else if (hbVar.v() == 118 && hbVar.v() == 111 && hbVar.v() == 114 && hbVar.v() == 98 && hbVar.v() == 105 && hbVar.v() == 115) {
            return true;
        } else {
            if (z10) {
                return false;
            }
            throw zzaha.b("expected characters 'vorbis'", null);
        }
    }
}
