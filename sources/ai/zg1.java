package ai;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zg1 {

    /* renamed from: h  reason: collision with root package name */
    public static final zg1 f12979h = new zg1(new xg1());

    /* renamed from: a  reason: collision with root package name */
    public final k10 f12980a;

    /* renamed from: b  reason: collision with root package name */
    public final h10 f12981b;

    /* renamed from: c  reason: collision with root package name */
    public final x10 f12982c;

    /* renamed from: d  reason: collision with root package name */
    public final u10 f12983d;

    /* renamed from: e  reason: collision with root package name */
    public final x50 f12984e;

    /* renamed from: f  reason: collision with root package name */
    public final s.g<String, q10> f12985f;

    /* renamed from: g  reason: collision with root package name */
    public final s.g<String, n10> f12986g;

    public zg1(xg1 xg1Var) {
        this.f12980a = xg1Var.f11927a;
        this.f12981b = xg1Var.f11928b;
        this.f12982c = xg1Var.f11929c;
        this.f12985f = new s.g<>(xg1Var.f11932f);
        this.f12986g = new s.g<>(xg1Var.f11933g);
        this.f12983d = xg1Var.f11930d;
        this.f12984e = xg1Var.f11931e;
    }

    public final k10 a() {
        return this.f12980a;
    }

    public final h10 b() {
        return this.f12981b;
    }

    public final x10 c() {
        return this.f12982c;
    }

    public final u10 d() {
        return this.f12983d;
    }

    public final x50 e() {
        return this.f12984e;
    }

    public final q10 f(String str) {
        return this.f12985f.get(str);
    }

    public final n10 g(String str) {
        return this.f12986g.get(str);
    }

    public final ArrayList<String> h() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.f12982c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.f12980a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.f12981b != null) {
            arrayList.add(Integer.toString(2));
        }
        if (this.f12985f.size() > 0) {
            arrayList.add(Integer.toString(3));
        }
        if (this.f12984e != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public final ArrayList<String> i() {
        ArrayList<String> arrayList = new ArrayList<>(this.f12985f.size());
        for (int i10 = 0; i10 < this.f12985f.size(); i10++) {
            arrayList.add(this.f12985f.m(i10));
        }
        return arrayList;
    }
}
