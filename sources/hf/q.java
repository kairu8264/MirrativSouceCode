package hf;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: b  reason: collision with root package name */
    public static final a f35595b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f35596c = 8;

    /* renamed from: a  reason: collision with root package name */
    public final kf.g f35597a;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends en.a<ArrayList<n0>> {
    }

    /* loaded from: classes2.dex */
    public static final class c extends en.a<ArrayList<n0>> {
    }

    public q(kf.g gVar) {
        jo.p.h(gVar, "emokaraPreference");
        this.f35597a = gVar;
    }

    public final n0 a(int i10) {
        for (n0 n0Var : c()) {
            if (n0Var.a() == i10) {
                return n0Var;
            }
        }
        return new n0(i10, 0, 0);
    }

    public final int b(int i10) {
        return a(i10).b();
    }

    public final ArrayList<n0> c() {
        if (this.f35597a.b4().length() == 0) {
            return new ArrayList<>();
        }
        ArrayList<n0> arrayList = (ArrayList) new xm.e().j(this.f35597a.b4(), new b().getType());
        if (arrayList == null) {
            return new ArrayList<>();
        }
        jo.p.g(arrayList, "fromJson<ArrayList<SongS…typeToken) ?: ArrayList()");
        return arrayList;
    }

    public final int d(int i10) {
        return a(i10).c();
    }

    public final void e(n0 n0Var) {
        ArrayList<n0> c10 = c();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = c10.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((n0) next).a() != n0Var.a()) {
                arrayList.add(next);
            }
        }
        List D0 = xn.a0.D0(arrayList);
        D0.add(n0Var);
        if (D0.size() > 500) {
            D0.remove(0);
        }
        Type type = new c().getType();
        kf.g gVar = this.f35597a;
        String t10 = new xm.e().t(D0, type);
        jo.p.g(t10, "Gson().toJson(songSettingList, typeToken)");
        gVar.x3(t10);
    }

    public final void f(int i10, int i11) {
        n0 a10 = a(i10);
        a10.d(i11);
        e(a10);
    }

    public final void g(int i10, int i11) {
        n0 a10 = a(i10);
        a10.e(i11);
        e(a10);
    }
}
