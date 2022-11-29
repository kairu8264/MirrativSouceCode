package c;

import android.content.Context;
import android.content.Intent;
import c.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import jo.h;
import jo.p;
import po.n;
import wn.k;
import wn.q;
import xn.a0;
import xn.m0;
import xn.n0;
import xn.o;

/* loaded from: classes.dex */
public final class b extends c.a<String[], Map<String, Boolean>> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f18592a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final Intent a(String[] strArr) {
            p.h(strArr, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            p.g(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }
    }

    @Override // c.a
    /* renamed from: d */
    public Intent a(Context context, String[] strArr) {
        p.h(context, "context");
        p.h(strArr, "input");
        return f18592a.a(strArr);
    }

    @Override // c.a
    /* renamed from: e */
    public a.C0134a<Map<String, Boolean>> b(Context context, String[] strArr) {
        p.h(context, "context");
        p.h(strArr, "input");
        boolean z10 = true;
        if (strArr.length == 0) {
            return new a.C0134a<>(n0.e());
        }
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (!(c3.a.a(context, strArr[i10]) == 0)) {
                z10 = false;
                break;
            }
            i10++;
        }
        if (z10) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(n.d(m0.b(strArr.length), 16));
            for (String str : strArr) {
                k a10 = q.a(str, Boolean.TRUE);
                linkedHashMap.put(a10.c(), a10.d());
            }
            return new a.C0134a<>(linkedHashMap);
        }
        return null;
    }

    @Override // c.a
    /* renamed from: f */
    public Map<String, Boolean> c(int i10, Intent intent) {
        if (i10 != -1) {
            return n0.e();
        }
        if (intent == null) {
            return n0.e();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra != null && stringArrayExtra != null) {
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i11 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i11 == 0));
            }
            return n0.l(a0.I0(o.D(stringArrayExtra), arrayList));
        }
        return n0.e();
    }
}
