package ak;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public final class k2 {

    /* renamed from: g  reason: collision with root package name */
    public static final dk.f f13502g = new dk.f("ExtractorSessionStoreView");

    /* renamed from: a  reason: collision with root package name */
    public final o0 f13503a;

    /* renamed from: b  reason: collision with root package name */
    public final dk.b0<u4> f13504b;

    /* renamed from: c  reason: collision with root package name */
    public final t1 f13505c;

    /* renamed from: d  reason: collision with root package name */
    public final dk.b0<Executor> f13506d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<Integer, h2> f13507e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public final ReentrantLock f13508f = new ReentrantLock();

    public k2(o0 o0Var, dk.b0<u4> b0Var, t1 t1Var, dk.b0<Executor> b0Var2) {
        this.f13503a = o0Var;
        this.f13504b = b0Var;
        this.f13505c = t1Var;
        this.f13506d = b0Var2;
    }

    public static String s(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            return stringArrayList.get(0);
        }
        throw new p1("Session without pack received.");
    }

    public static <T> List<T> t(List<T> list) {
        return list == null ? Collections.emptyList() : list;
    }

    public final /* synthetic */ Boolean a(Bundle bundle) {
        int i10 = bundle.getInt("session_id");
        if (i10 == 0) {
            return Boolean.TRUE;
        }
        Map<Integer, h2> map = this.f13507e;
        Integer valueOf = Integer.valueOf(i10);
        if (!map.containsKey(valueOf)) {
            return Boolean.TRUE;
        }
        h2 h2Var = this.f13507e.get(valueOf);
        if (h2Var.f13386c.f13373d == 6) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!n0.c(h2Var.f13386c.f13373d, bundle.getInt(bk.b.a("status", s(bundle)))));
    }

    public final /* synthetic */ Boolean b(Bundle bundle) {
        i2 i2Var;
        int i10 = bundle.getInt("session_id");
        if (i10 == 0) {
            return Boolean.FALSE;
        }
        Map<Integer, h2> map = this.f13507e;
        Integer valueOf = Integer.valueOf(i10);
        boolean z10 = true;
        boolean z11 = false;
        if (map.containsKey(valueOf)) {
            h2 q10 = q(i10);
            int i11 = bundle.getInt(bk.b.a("status", q10.f13386c.f13370a));
            if (n0.c(q10.f13386c.f13373d, i11)) {
                f13502g.a("Found stale update for session %s with status %d.", valueOf, Integer.valueOf(q10.f13386c.f13373d));
                g2 g2Var = q10.f13386c;
                String str = g2Var.f13370a;
                int i12 = g2Var.f13373d;
                if (i12 == 4) {
                    this.f13504b.zza().b(i10, str);
                } else if (i12 == 5) {
                    this.f13504b.zza().q0(i10);
                } else if (i12 == 6) {
                    this.f13504b.zza().v0(Arrays.asList(str));
                }
            } else {
                q10.f13386c.f13373d = i11;
                if (n0.d(i11)) {
                    n(i10);
                    this.f13505c.c(q10.f13386c.f13370a);
                } else {
                    for (i2 i2Var2 : q10.f13386c.f13375f) {
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(bk.b.b("chunk_intents", q10.f13386c.f13370a, i2Var2.f13445a));
                        if (parcelableArrayList != null) {
                            for (int i13 = 0; i13 < parcelableArrayList.size(); i13++) {
                                if (parcelableArrayList.get(i13) != null && ((Intent) parcelableArrayList.get(i13)).getData() != null) {
                                    i2Var2.f13448d.get(i13).f13346a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String s10 = s(bundle);
            long j10 = bundle.getLong(bk.b.a("pack_version", s10));
            String string = bundle.getString(bk.b.a("pack_version_tag", s10), "");
            int i14 = bundle.getInt(bk.b.a("status", s10));
            long j11 = bundle.getLong(bk.b.a("total_bytes_to_download", s10));
            ArrayList<String> stringArrayList = bundle.getStringArrayList(bk.b.a("slice_ids", s10));
            ArrayList arrayList = new ArrayList();
            for (String str2 : t(stringArrayList)) {
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(bk.b.b("chunk_intents", s10, str2));
                ArrayList arrayList2 = new ArrayList();
                for (Intent intent : t(parcelableArrayList2)) {
                    if (intent == null) {
                        z10 = z11;
                    }
                    arrayList2.add(new e2(z10));
                    z10 = true;
                    z11 = false;
                }
                String string2 = bundle.getString(bk.b.b("uncompressed_hash_sha256", s10, str2));
                long j12 = bundle.getLong(bk.b.b("uncompressed_size", s10, str2));
                int i15 = bundle.getInt(bk.b.b("patch_format", s10, str2), 0);
                if (i15 != 0) {
                    i2Var = new i2(str2, string2, j12, arrayList2, 0, i15);
                    z11 = false;
                } else {
                    z11 = false;
                    i2Var = new i2(str2, string2, j12, arrayList2, bundle.getInt(bk.b.b("compression_format", s10, str2), 0), 0);
                }
                arrayList.add(i2Var);
                z10 = true;
            }
            this.f13507e.put(Integer.valueOf(i10), new h2(i10, bundle.getInt("app_version_code"), new g2(s10, j10, i14, j11, arrayList, string)));
        }
        return Boolean.TRUE;
    }

    public final /* synthetic */ Object c(String str, int i10, long j10) {
        h2 h2Var = u(Arrays.asList(str)).get(str);
        if (h2Var == null || n0.d(h2Var.f13386c.f13373d)) {
            f13502g.b(String.format("Could not find pack %s while trying to complete it", str), new Object[0]);
        }
        this.f13503a.e(str, i10, j10);
        h2Var.f13386c.f13373d = 4;
        return null;
    }

    public final /* synthetic */ Object d(int i10, int i11) {
        q(i10).f13386c.f13373d = 5;
        return null;
    }

    public final /* synthetic */ Object e(int i10) {
        h2 q10 = q(i10);
        if (n0.d(q10.f13386c.f13373d)) {
            o0 o0Var = this.f13503a;
            g2 g2Var = q10.f13386c;
            o0Var.e(g2Var.f13370a, q10.f13385b, g2Var.f13371b);
            g2 g2Var2 = q10.f13386c;
            int i11 = g2Var2.f13373d;
            if (i11 == 5 || i11 == 6) {
                this.f13503a.f(g2Var2.f13370a, q10.f13385b, g2Var2.f13371b);
                return null;
            }
            return null;
        }
        throw new p1(String.format("Could not safely delete session %d because it is not in a terminal state.", Integer.valueOf(i10)), i10);
    }

    public final Map<String, Integer> f(final List<String> list) {
        return (Map) r(new j2() { // from class: ak.b2
            @Override // ak.j2
            public final Object zza() {
                return k2.this.h(list);
            }
        });
    }

    public final Map<Integer, h2> g() {
        return this.f13507e;
    }

    public final /* synthetic */ Map h(List list) {
        Map<String, h2> u10 = u(list);
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            final h2 h2Var = u10.get(str);
            if (h2Var == null) {
                hashMap.put(str, 8);
            } else {
                if (n0.a(h2Var.f13386c.f13373d)) {
                    try {
                        h2Var.f13386c.f13373d = 6;
                        this.f13506d.zza().execute(new Runnable() { // from class: ak.d2
                            @Override // java.lang.Runnable
                            public final void run() {
                                k2.this.n(h2Var.f13384a);
                            }
                        });
                        this.f13505c.c(str);
                    } catch (p1 unused) {
                        f13502g.d("Session %d with pack %s does not exist, no need to cancel.", Integer.valueOf(h2Var.f13384a), str);
                    }
                }
                hashMap.put(str, Integer.valueOf(h2Var.f13386c.f13373d));
            }
        }
        return hashMap;
    }

    public final /* synthetic */ Map i(List list) {
        HashMap hashMap = new HashMap();
        for (h2 h2Var : this.f13507e.values()) {
            String str = h2Var.f13386c.f13370a;
            if (list.contains(str)) {
                h2 h2Var2 = (h2) hashMap.get(str);
                if ((h2Var2 == null ? -1 : h2Var2.f13384a) < h2Var.f13384a) {
                    hashMap.put(str, h2Var);
                }
            }
        }
        return hashMap;
    }

    public final void j() {
        this.f13508f.lock();
    }

    public final void k(final String str, final int i10, final long j10) {
        r(new j2() { // from class: ak.a2
            @Override // ak.j2
            public final Object zza() {
                k2.this.c(str, i10, j10);
                return null;
            }
        });
    }

    public final void l() {
        this.f13508f.unlock();
    }

    public final void m(final int i10, int i11) {
        r(new j2(i10, 5) { // from class: ak.x1

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ int f13711b;

            @Override // ak.j2
            public final Object zza() {
                k2.this.d(this.f13711b, 5);
                return null;
            }
        });
    }

    public final void n(final int i10) {
        r(new j2() { // from class: ak.w1
            @Override // ak.j2
            public final Object zza() {
                k2.this.e(i10);
                return null;
            }
        });
    }

    public final boolean o(final Bundle bundle) {
        return ((Boolean) r(new j2() { // from class: ak.y1
            @Override // ak.j2
            public final Object zza() {
                return k2.this.a(bundle);
            }
        })).booleanValue();
    }

    public final boolean p(final Bundle bundle) {
        return ((Boolean) r(new j2() { // from class: ak.z1
            @Override // ak.j2
            public final Object zza() {
                return k2.this.b(bundle);
            }
        })).booleanValue();
    }

    public final h2 q(int i10) {
        Map<Integer, h2> map = this.f13507e;
        Integer valueOf = Integer.valueOf(i10);
        h2 h2Var = map.get(valueOf);
        if (h2Var != null) {
            return h2Var;
        }
        throw new p1(String.format("Could not find session %d while trying to get it", valueOf), i10);
    }

    public final <T> T r(j2<T> j2Var) {
        try {
            this.f13508f.lock();
            return j2Var.zza();
        } finally {
            this.f13508f.unlock();
        }
    }

    public final Map<String, h2> u(final List<String> list) {
        return (Map) r(new j2() { // from class: ak.c2
            @Override // ak.j2
            public final Object zza() {
                return k2.this.i(list);
            }
        });
    }
}
