package ai;

import android.text.TextUtils;
import com.dena.mirrorman.clientlog.logs.ActionLogBase;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes3.dex */
public final class ey {

    /* renamed from: a  reason: collision with root package name */
    public final List<ay> f3815a = new LinkedList();

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, String> f3816b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f3817c;

    public ey(boolean z10, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f3816b = linkedHashMap;
        this.f3817c = new Object();
        linkedHashMap.put(ActionLogBase.ACTION, "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final ay f() {
        return new ay(wg.t.k().elapsedRealtime(), null, null);
    }

    public final void a(ey eyVar) {
        synchronized (this.f3817c) {
        }
    }

    public final boolean b(ay ayVar, long j10, String... strArr) {
        synchronized (this.f3817c) {
            for (int i10 = 0; i10 <= 0; i10++) {
                this.f3815a.add(new ay(j10, strArr[i10], ayVar));
            }
        }
        return true;
    }

    public final cy c() {
        cy cyVar;
        boolean booleanValue = ((Boolean) ft.c().c(ox.f8030l1)).booleanValue();
        StringBuilder sb2 = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.f3817c) {
            for (ay ayVar : this.f3815a) {
                long a10 = ayVar.a();
                String b10 = ayVar.b();
                ay c10 = ayVar.c();
                if (c10 != null && a10 > 0) {
                    sb2.append(b10);
                    sb2.append('.');
                    sb2.append(a10 - c10.a());
                    sb2.append(',');
                    if (booleanValue) {
                        if (!hashMap.containsKey(Long.valueOf(c10.a()))) {
                            hashMap.put(Long.valueOf(c10.a()), new StringBuilder(b10));
                        } else {
                            StringBuilder sb3 = (StringBuilder) hashMap.get(Long.valueOf(c10.a()));
                            sb3.append('+');
                            sb3.append(b10);
                        }
                    }
                }
            }
            this.f3815a.clear();
            String str = null;
            if (!TextUtils.isEmpty(null)) {
                sb2.append((String) null);
            } else if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            StringBuilder sb4 = new StringBuilder();
            if (booleanValue) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    sb4.append((CharSequence) entry.getValue());
                    sb4.append('.');
                    sb4.append(wg.t.k().currentTimeMillis() + (((Long) entry.getKey()).longValue() - wg.t.k().elapsedRealtime()));
                    sb4.append(',');
                }
                if (sb4.length() > 0) {
                    sb4.setLength(sb4.length() - 1);
                }
                str = sb4.toString();
            }
            cyVar = new cy(sb2.toString(), str);
        }
        return cyVar;
    }

    public final void d(String str, String str2) {
        tx e10;
        if (TextUtils.isEmpty(str2) || (e10 = wg.t.h().e()) == null) {
            return;
        }
        synchronized (this.f3817c) {
            zx d10 = e10.d(str);
            Map<String, String> map = this.f3816b;
            map.put(str, d10.a(map.get(str), str2));
        }
    }

    public final Map<String, String> e() {
        Map<String, String> map;
        synchronized (this.f3817c) {
            wg.t.h().e();
            map = this.f3816b;
        }
        return map;
    }
}
