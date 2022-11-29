package eh;

import ai.yn;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes3.dex */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f30599a;

    public /* synthetic */ j0(h0 h0Var, i0 i0Var) {
        String str;
        str = h0Var.f30593a;
        this.f30599a = str;
    }

    public final Set<String> a() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.f30599a.toLowerCase(Locale.ROOT));
        return hashSet;
    }

    public final String b() {
        return this.f30599a.toLowerCase(Locale.ROOT);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final yn c() {
        char c10;
        String str = this.f30599a;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        return yn.AD_INITIATER_UNSPECIFIED;
                    }
                    return yn.REWARD_BASED_VIDEO_AD;
                }
                return yn.AD_LOADER;
            }
            return yn.INTERSTITIAL;
        }
        return yn.BANNER;
    }
}
