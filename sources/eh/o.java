package eh;

import ai.as;
import ai.sl2;
import ai.yl2;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;

/* loaded from: classes3.dex */
public final class o {
    public static boolean a(sl2 sl2Var) {
        if (e(sl2Var)) {
            as asVar = sl2Var.f9875a.f8473a.f12650d;
            return (asVar.O == null && asVar.T == null) ? false : true;
        }
        return false;
    }

    public static String b(sl2 sl2Var) {
        return !e(sl2Var) ? "" : sl2Var.f9875a.f8473a.f12650d.L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String c(sl2 sl2Var) {
        char c10;
        if (e(sl2Var)) {
            String d10 = d(sl2Var.f9875a.f8473a);
            if (TextUtils.isEmpty(d10)) {
                return "unspecified";
            }
            switch (d10.hashCode()) {
                case 1743582862:
                    if (d10.equals("requester_type_0")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1743582863:
                    if (d10.equals("requester_type_1")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1743582864:
                    if (d10.equals("requester_type_2")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1743582865:
                    if (d10.equals("requester_type_3")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1743582866:
                    if (d10.equals("requester_type_4")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1743582867:
                    if (d10.equals("requester_type_5")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1743582868:
                    if (d10.equals("requester_type_6")) {
                        c10 = 6;
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
                    return "0";
                case 1:
                    return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                case 2:
                    return "2";
                case 3:
                    return "3";
                case 4:
                    return "4";
                case 5:
                    return "5";
                case 6:
                    return "6";
                default:
                    return d10;
            }
        }
        return "unspecified";
    }

    public static String d(yl2 yl2Var) {
        Bundle bundle = yl2Var.f12650d.f1985y;
        return bundle == null ? "unspecified" : bundle.getString("query_info_type");
    }

    public static boolean e(sl2 sl2Var) {
        return sl2Var != null;
    }
}
