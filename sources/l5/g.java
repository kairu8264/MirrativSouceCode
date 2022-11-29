package l5;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import k5.m;
import k5.r;
import k5.u;

/* loaded from: classes.dex */
public class g extends r {

    /* renamed from: j  reason: collision with root package name */
    public static final String f39562j = k5.j.f("WorkContinuationImpl");

    /* renamed from: a  reason: collision with root package name */
    public final i f39563a;

    /* renamed from: b  reason: collision with root package name */
    public final String f39564b;

    /* renamed from: c  reason: collision with root package name */
    public final k5.d f39565c;

    /* renamed from: d  reason: collision with root package name */
    public final List<? extends u> f39566d;

    /* renamed from: e  reason: collision with root package name */
    public final List<String> f39567e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f39568f;

    /* renamed from: g  reason: collision with root package name */
    public final List<g> f39569g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f39570h;

    /* renamed from: i  reason: collision with root package name */
    public m f39571i;

    public g(i iVar, List<? extends u> list) {
        this(iVar, null, k5.d.KEEP, list, null);
    }

    public static boolean i(g gVar, Set<String> set) {
        set.addAll(gVar.c());
        Set<String> l10 = l(gVar);
        for (String str : set) {
            if (l10.contains(str)) {
                return true;
            }
        }
        List<g> e10 = gVar.e();
        if (e10 != null && !e10.isEmpty()) {
            for (g gVar2 : e10) {
                if (i(gVar2, set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.c());
        return false;
    }

    public static Set<String> l(g gVar) {
        HashSet hashSet = new HashSet();
        List<g> e10 = gVar.e();
        if (e10 != null && !e10.isEmpty()) {
            for (g gVar2 : e10) {
                hashSet.addAll(gVar2.c());
            }
        }
        return hashSet;
    }

    public m a() {
        if (!this.f39570h) {
            u5.b bVar = new u5.b(this);
            this.f39563a.p().b(bVar);
            this.f39571i = bVar.d();
        } else {
            k5.j.c().h(f39562j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f39567e)), new Throwable[0]);
        }
        return this.f39571i;
    }

    public k5.d b() {
        return this.f39565c;
    }

    public List<String> c() {
        return this.f39567e;
    }

    public String d() {
        return this.f39564b;
    }

    public List<g> e() {
        return this.f39569g;
    }

    public List<? extends u> f() {
        return this.f39566d;
    }

    public i g() {
        return this.f39563a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.f39570h;
    }

    public void k() {
        this.f39570h = true;
    }

    public g(i iVar, String str, k5.d dVar, List<? extends u> list, List<g> list2) {
        this.f39563a = iVar;
        this.f39564b = str;
        this.f39565c = dVar;
        this.f39566d = list;
        this.f39569g = list2;
        this.f39567e = new ArrayList(list.size());
        this.f39568f = new ArrayList();
        if (list2 != null) {
            for (g gVar : list2) {
                this.f39568f.addAll(gVar.f39568f);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            String a10 = list.get(i10).a();
            this.f39567e.add(a10);
            this.f39568f.add(a10);
        }
    }
}
