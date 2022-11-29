package s6;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class d {

    /* renamed from: c  reason: collision with root package name */
    public Map<String, List<b7.e>> f52063c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, g> f52064d;

    /* renamed from: e  reason: collision with root package name */
    public Map<String, y6.c> f52065e;

    /* renamed from: f  reason: collision with root package name */
    public List<y6.h> f52066f;

    /* renamed from: g  reason: collision with root package name */
    public s.h<y6.d> f52067g;

    /* renamed from: h  reason: collision with root package name */
    public s.e<b7.e> f52068h;

    /* renamed from: i  reason: collision with root package name */
    public List<b7.e> f52069i;

    /* renamed from: j  reason: collision with root package name */
    public Rect f52070j;

    /* renamed from: k  reason: collision with root package name */
    public float f52071k;

    /* renamed from: l  reason: collision with root package name */
    public float f52072l;

    /* renamed from: m  reason: collision with root package name */
    public float f52073m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f52074n;

    /* renamed from: a  reason: collision with root package name */
    public final n f52061a = new n();

    /* renamed from: b  reason: collision with root package name */
    public final HashSet<String> f52062b = new HashSet<>();

    /* renamed from: o  reason: collision with root package name */
    public int f52075o = 0;

    public void a(String str) {
        f7.d.c(str);
        this.f52062b.add(str);
    }

    public Rect b() {
        return this.f52070j;
    }

    public s.h<y6.d> c() {
        return this.f52067g;
    }

    public float d() {
        return (e() / this.f52073m) * 1000.0f;
    }

    public float e() {
        return this.f52072l - this.f52071k;
    }

    public float f() {
        return this.f52072l;
    }

    public Map<String, y6.c> g() {
        return this.f52065e;
    }

    public float h(float f10) {
        return f7.g.k(this.f52071k, this.f52072l, f10);
    }

    public float i() {
        return this.f52073m;
    }

    public Map<String, g> j() {
        return this.f52064d;
    }

    public List<b7.e> k() {
        return this.f52069i;
    }

    public y6.h l(String str) {
        int size = this.f52066f.size();
        for (int i10 = 0; i10 < size; i10++) {
            y6.h hVar = this.f52066f.get(i10);
            if (hVar.a(str)) {
                return hVar;
            }
        }
        return null;
    }

    public int m() {
        return this.f52075o;
    }

    public n n() {
        return this.f52061a;
    }

    public List<b7.e> o(String str) {
        return this.f52063c.get(str);
    }

    public float p() {
        return this.f52071k;
    }

    public boolean q() {
        return this.f52074n;
    }

    public boolean r() {
        return !this.f52064d.isEmpty();
    }

    public void s(int i10) {
        this.f52075o += i10;
    }

    public void t(Rect rect, float f10, float f11, float f12, List<b7.e> list, s.e<b7.e> eVar, Map<String, List<b7.e>> map, Map<String, g> map2, s.h<y6.d> hVar, Map<String, y6.c> map3, List<y6.h> list2) {
        this.f52070j = rect;
        this.f52071k = f10;
        this.f52072l = f11;
        this.f52073m = f12;
        this.f52069i = list;
        this.f52068h = eVar;
        this.f52063c = map;
        this.f52064d = map2;
        this.f52067g = hVar;
        this.f52065e = map3;
        this.f52066f = list2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        for (b7.e eVar : this.f52069i) {
            sb2.append(eVar.y("\t"));
        }
        return sb2.toString();
    }

    public b7.e u(long j10) {
        return this.f52068h.h(j10);
    }

    public void v(boolean z10) {
        this.f52074n = z10;
    }

    public void w(boolean z10) {
        this.f52061a.b(z10);
    }
}
