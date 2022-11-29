package ai;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class g9 extends y8 {
    public static final Parcelable.Creator<g9> CREATOR = new f9();

    /* renamed from: x  reason: collision with root package name */
    public final String f4366x;

    /* renamed from: y  reason: collision with root package name */
    public final String f4367y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g9(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = ai.sb.f9778a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f4366x = r0
            java.lang.String r3 = r3.readString()
            r2.f4367y = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.g9.<init>(android.os.Parcel):void");
    }

    public static List<Integer> a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // ai.y8, ai.u7
    public final void E0(m5 m5Var) {
        char c10;
        String str = this.f12479w;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c10 = 20;
                    break;
                }
                c10 = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c10 = 17;
                    break;
                }
                c10 = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c10 = 21;
                    break;
                }
                c10 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c10 = 19;
                    break;
                }
                c10 = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                m5Var.B(this.f4367y);
                return;
            case 2:
            case 3:
                m5Var.C(this.f4367y);
                return;
            case 4:
            case 5:
                m5Var.E(this.f4367y);
                return;
            case 6:
            case 7:
                m5Var.D(this.f4367y);
                return;
            case '\b':
            case '\t':
                String[] Y = sb.Y(this.f4367y, "/");
                try {
                    int parseInt = Integer.parseInt(Y[0]);
                    Integer valueOf = Y.length > 1 ? Integer.valueOf(Integer.parseInt(Y[1])) : null;
                    m5Var.H(Integer.valueOf(parseInt));
                    m5Var.I(valueOf);
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            case '\n':
            case 11:
                try {
                    m5Var.a(Integer.valueOf(Integer.parseInt(this.f4367y)));
                    return;
                } catch (NumberFormatException unused2) {
                    return;
                }
            case '\f':
            case '\r':
                try {
                    int parseInt2 = Integer.parseInt(this.f4367y.substring(2, 4));
                    int parseInt3 = Integer.parseInt(this.f4367y.substring(0, 2));
                    m5Var.b(Integer.valueOf(parseInt2));
                    m5Var.c(Integer.valueOf(parseInt3));
                    return;
                } catch (NumberFormatException | StringIndexOutOfBoundsException unused3) {
                    return;
                }
            case 14:
                List<Integer> a10 = a(this.f4367y);
                int size = a10.size();
                if (size != 1) {
                    if (size != 2) {
                        if (size != 3) {
                            return;
                        }
                        m5Var.c(a10.get(2));
                    }
                    m5Var.b(a10.get(1));
                }
                m5Var.a(a10.get(0));
                return;
            case 15:
                List<Integer> a11 = a(this.f4367y);
                int size2 = a11.size();
                if (size2 != 1) {
                    if (size2 != 2) {
                        if (size2 != 3) {
                            return;
                        }
                        m5Var.f(a11.get(2));
                    }
                    m5Var.e(a11.get(1));
                }
                m5Var.d(a11.get(0));
                return;
            case 16:
            case 17:
                m5Var.h(this.f4367y);
                return;
            case 18:
            case 19:
                m5Var.i(this.f4367y);
                return;
            case 20:
            case 21:
                m5Var.g(this.f4367y);
                return;
            default:
                return;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g9.class == obj.getClass()) {
            g9 g9Var = (g9) obj;
            if (sb.H(this.f12479w, g9Var.f12479w) && sb.H(this.f4366x, g9Var.f4366x) && sb.H(this.f4367y, g9Var.f4367y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f12479w.hashCode() + 527) * 31;
        String str = this.f4366x;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4367y;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // ai.y8
    public final String toString() {
        String str = this.f12479w;
        String str2 = this.f4366x;
        String str3 = this.f4367y;
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 22 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(": description=");
        sb2.append(str2);
        sb2.append(": value=");
        sb2.append(str3);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f12479w);
        parcel.writeString(this.f4366x);
        parcel.writeString(this.f4367y);
    }

    public g9(String str, String str2, String str3) {
        super(str);
        this.f4366x = str2;
        this.f4367y = str3;
    }
}
