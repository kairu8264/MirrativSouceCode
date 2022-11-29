package ai;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class cr2 {

    /* renamed from: a  reason: collision with root package name */
    public final f22 f2911a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2912b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2913c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2914d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f2915e;

    /* renamed from: f  reason: collision with root package name */
    public final tl2 f2916f;

    /* renamed from: g  reason: collision with root package name */
    public final vh.f f2917g;

    /* renamed from: h  reason: collision with root package name */
    public final u f2918h;

    public cr2(f22 f22Var, zj0 zj0Var, String str, String str2, Context context, tl2 tl2Var, vh.f fVar, u uVar) {
        this.f2911a = f22Var;
        this.f2912b = zj0Var.f13013w;
        this.f2913c = str;
        this.f2914d = str2;
        this.f2915e = context;
        this.f2916f = tl2Var;
        this.f2917g = fVar;
        this.f2918h = uVar;
    }

    public static final List<String> d(int i10, int i11, List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append("2.");
            sb2.append(i11);
            arrayList.add(e(str, "@gw_mpe@", sb2.toString()));
        }
        return arrayList;
    }

    public static String e(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public static String f(String str) {
        return (TextUtils.isEmpty(str) || !tj0.j()) ? str : "fakeForAdDebugLog";
    }

    public final List<String> a(sl2 sl2Var, fl2 fl2Var, List<String> list) {
        return b(sl2Var, fl2Var, false, "", "", list);
    }

    public final List<String> b(sl2 sl2Var, fl2 fl2Var, boolean z10, String str, String str2, List<String> list) {
        ArrayList arrayList = new ArrayList();
        String str3 = true != z10 ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        for (String str4 : list) {
            String e10 = e(e(e(str4, "@gw_adlocid@", sl2Var.f9875a.f8473a.f12652f), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.f2912b);
            if (fl2Var != null) {
                e10 = ci0.a(e(e(e(e10, "@gw_qdata@", fl2Var.f4114y), "@gw_adnetid@", fl2Var.f4113x), "@gw_allocid@", fl2Var.f4112w), this.f2915e, fl2Var.S);
            }
            String e11 = e(e(e(e10, "@gw_adnetstatus@", this.f2911a.g()), "@gw_seqnum@", this.f2913c), "@gw_sessid@", this.f2914d);
            boolean z11 = false;
            if (((Boolean) ft.c().c(ox.f7940a2)).booleanValue() && !TextUtils.isEmpty(str)) {
                z11 = true;
            }
            boolean z12 = !TextUtils.isEmpty(str2);
            if (!z11) {
                if (z12) {
                    z12 = true;
                } else {
                    arrayList.add(e11);
                }
            }
            if (this.f2918h.a(Uri.parse(e11))) {
                Uri.Builder buildUpon = Uri.parse(e11).buildUpon();
                if (z11) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z12) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                e11 = buildUpon.build().toString();
            }
            arrayList.add(e11);
        }
        return arrayList;
    }

    public final List<String> c(fl2 fl2Var, List<String> list, ye0 ye0Var) {
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = this.f2917g.currentTimeMillis();
        try {
            String zzb = ye0Var.zzb();
            String num = Integer.toString(ye0Var.b());
            tl2 tl2Var = this.f2916f;
            String f10 = tl2Var == null ? "" : f(tl2Var.f10349a);
            tl2 tl2Var2 = this.f2916f;
            String f11 = tl2Var2 != null ? f(tl2Var2.f10350b) : "";
            for (String str : list) {
                arrayList.add(ci0.a(e(e(e(e(e(e(str, "@gw_rwd_userid@", Uri.encode(f10)), "@gw_rwd_custom_data@", Uri.encode(f11)), "@gw_tmstmp@", Long.toString(currentTimeMillis)), "@gw_rwd_itm@", Uri.encode(zzb)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.f2912b), this.f2915e, fl2Var.S));
            }
            return arrayList;
        } catch (RemoteException e10) {
            uj0.d("Unable to determine award type and amount.", e10);
            return arrayList;
        }
    }
}
