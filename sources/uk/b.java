package uk;

import android.os.Bundle;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import pi.b6;
import pi.o7;
import pi.y5;
import pi.z5;
import rh.p;
import tk.a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f55962a = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));

    /* renamed from: b  reason: collision with root package name */
    public static final List<String> f55963b = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c  reason: collision with root package name */
    public static final List<String> f55964c = Arrays.asList(TtmlNode.TEXT_EMPHASIS_AUTO, "app", TopicConstant.PACKET_TYPE_AUDIO_MP3);

    /* renamed from: d  reason: collision with root package name */
    public static final List<String> f55965d = Arrays.asList("_r", "_dbg");

    /* renamed from: e  reason: collision with root package name */
    public static final List<String> f55966e = Arrays.asList((String[]) vh.b.a(b6.f47645a, b6.f47646b));

    /* renamed from: f  reason: collision with root package name */
    public static final List<String> f55967f = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static Bundle a(a.c cVar) {
        Bundle bundle = new Bundle();
        String str = cVar.f53769a;
        if (str != null) {
            bundle.putString(TtmlNode.ATTR_TTS_ORIGIN, str);
        }
        String str2 = cVar.f53770b;
        if (str2 != null) {
            bundle.putString("name", str2);
        }
        Object obj = cVar.f53771c;
        if (obj != null) {
            y5.b(bundle, obj);
        }
        String str3 = cVar.f53772d;
        if (str3 != null) {
            bundle.putString("trigger_event_name", str3);
        }
        bundle.putLong("trigger_timeout", cVar.f53773e);
        String str4 = cVar.f53774f;
        if (str4 != null) {
            bundle.putString("timed_out_event_name", str4);
        }
        Bundle bundle2 = cVar.f53775g;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str5 = cVar.f53776h;
        if (str5 != null) {
            bundle.putString("triggered_event_name", str5);
        }
        Bundle bundle3 = cVar.f53777i;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", cVar.f53778j);
        String str6 = cVar.f53779k;
        if (str6 != null) {
            bundle.putString("expired_event_name", str6);
        }
        Bundle bundle4 = cVar.f53780l;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", cVar.f53781m);
        bundle.putBoolean("active", cVar.f53782n);
        bundle.putLong("triggered_timestamp", cVar.f53783o);
        return bundle;
    }

    public static a.c b(Bundle bundle) {
        p.i(bundle);
        a.c cVar = new a.c();
        cVar.f53769a = (String) p.i((String) y5.a(bundle, TtmlNode.ATTR_TTS_ORIGIN, String.class, null));
        cVar.f53770b = (String) p.i((String) y5.a(bundle, "name", String.class, null));
        cVar.f53771c = y5.a(bundle, "value", Object.class, null);
        cVar.f53772d = (String) y5.a(bundle, "trigger_event_name", String.class, null);
        cVar.f53773e = ((Long) y5.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
        cVar.f53774f = (String) y5.a(bundle, "timed_out_event_name", String.class, null);
        cVar.f53775g = (Bundle) y5.a(bundle, "timed_out_event_params", Bundle.class, null);
        cVar.f53776h = (String) y5.a(bundle, "triggered_event_name", String.class, null);
        cVar.f53777i = (Bundle) y5.a(bundle, "triggered_event_params", Bundle.class, null);
        cVar.f53778j = ((Long) y5.a(bundle, "time_to_live", Long.class, 0L)).longValue();
        cVar.f53779k = (String) y5.a(bundle, "expired_event_name", String.class, null);
        cVar.f53780l = (Bundle) y5.a(bundle, "expired_event_params", Bundle.class, null);
        cVar.f53782n = ((Boolean) y5.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
        cVar.f53781m = ((Long) y5.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
        cVar.f53783o = ((Long) y5.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        return cVar;
    }

    public static String c(String str) {
        String a10 = z5.a(str);
        return a10 != null ? a10 : str;
    }

    public static void d(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    public static boolean e(String str, String str2, Bundle bundle) {
        char c10;
        if ("_cmp".equals(str2)) {
            if (i(str) && bundle != null) {
                for (String str3 : f55965d) {
                    if (bundle.containsKey(str3)) {
                        return false;
                    }
                }
                int hashCode = str.hashCode();
                if (hashCode == 101200) {
                    if (str.equals("fcm")) {
                        c10 = 0;
                    }
                    c10 = 65535;
                } else if (hashCode != 101230) {
                    if (hashCode == 3142703 && str.equals("fiam")) {
                        c10 = 2;
                    }
                    c10 = 65535;
                } else {
                    if (str.equals("fdl")) {
                        c10 = 1;
                    }
                    c10 = 65535;
                }
                if (c10 == 0) {
                    bundle.putString("_cis", "fcm_integration");
                    return true;
                } else if (c10 == 1) {
                    bundle.putString("_cis", "fdl_integration");
                    return true;
                } else if (c10 != 2) {
                    return false;
                } else {
                    bundle.putString("_cis", "fiam_integration");
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean f(a.c cVar) {
        String str;
        if (cVar == null || (str = cVar.f53769a) == null || str.isEmpty()) {
            return false;
        }
        Object obj = cVar.f53771c;
        if ((obj == null || o7.a(obj) != null) && i(str) && j(str, cVar.f53770b)) {
            String str2 = cVar.f53779k;
            if (str2 == null || (g(str2, cVar.f53780l) && e(str, cVar.f53779k, cVar.f53780l))) {
                String str3 = cVar.f53776h;
                if (str3 == null || (g(str3, cVar.f53777i) && e(str, cVar.f53776h, cVar.f53777i))) {
                    String str4 = cVar.f53774f;
                    if (str4 != null) {
                        return g(str4, cVar.f53775g) && e(str, cVar.f53774f, cVar.f53775g);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean g(String str, Bundle bundle) {
        if (f55963b.contains(str)) {
            return false;
        }
        if (bundle != null) {
            for (String str2 : f55965d) {
                if (bundle.containsKey(str2)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static boolean h(String str) {
        return !f55962a.contains(str);
    }

    public static boolean i(String str) {
        return !f55964c.contains(str);
    }

    public static boolean j(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        } else if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        } else if (f55966e.contains(str2)) {
            return false;
        } else {
            for (String str3 : f55967f) {
                if (str2.matches(str3)) {
                    return false;
                }
            }
            return true;
        }
    }
}
