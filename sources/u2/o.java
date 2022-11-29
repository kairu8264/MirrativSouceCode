package u2;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class o {

    /* renamed from: g  reason: collision with root package name */
    public static int f54332g;

    /* renamed from: b  reason: collision with root package name */
    public int f54334b;

    /* renamed from: d  reason: collision with root package name */
    public int f54336d;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<t2.e> f54333a = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public boolean f54335c = false;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<a> f54337e = null;

    /* renamed from: f  reason: collision with root package name */
    public int f54338f = -1;

    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<t2.e> f54339a;

        /* renamed from: b  reason: collision with root package name */
        public int f54340b;

        /* renamed from: c  reason: collision with root package name */
        public int f54341c;

        /* renamed from: d  reason: collision with root package name */
        public int f54342d;

        /* renamed from: e  reason: collision with root package name */
        public int f54343e;

        /* renamed from: f  reason: collision with root package name */
        public int f54344f;

        /* renamed from: g  reason: collision with root package name */
        public int f54345g;

        public a(t2.e eVar, q2.d dVar, int i10) {
            this.f54339a = new WeakReference<>(eVar);
            this.f54340b = dVar.x(eVar.N);
            this.f54341c = dVar.x(eVar.O);
            this.f54342d = dVar.x(eVar.P);
            this.f54343e = dVar.x(eVar.Q);
            this.f54344f = dVar.x(eVar.R);
            this.f54345g = i10;
        }
    }

    public o(int i10) {
        this.f54334b = -1;
        this.f54336d = 0;
        int i11 = f54332g;
        f54332g = i11 + 1;
        this.f54334b = i11;
        this.f54336d = i10;
    }

    public boolean a(t2.e eVar) {
        if (this.f54333a.contains(eVar)) {
            return false;
        }
        this.f54333a.add(eVar);
        return true;
    }

    public void b(ArrayList<o> arrayList) {
        int size = this.f54333a.size();
        if (this.f54338f != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = arrayList.get(i10);
                if (this.f54338f == oVar.f54334b) {
                    g(this.f54336d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f54334b;
    }

    public int d() {
        return this.f54336d;
    }

    public final String e() {
        int i10 = this.f54336d;
        return i10 == 0 ? "Horizontal" : i10 == 1 ? "Vertical" : i10 == 2 ? "Both" : "Unknown";
    }

    public int f(q2.d dVar, int i10) {
        if (this.f54333a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f54333a, i10);
    }

    public void g(int i10, o oVar) {
        Iterator<t2.e> it = this.f54333a.iterator();
        while (it.hasNext()) {
            t2.e next = it.next();
            oVar.a(next);
            if (i10 == 0) {
                next.G0 = oVar.c();
            } else {
                next.H0 = oVar.c();
            }
        }
        this.f54338f = oVar.f54334b;
    }

    public void h(boolean z10) {
        this.f54335c = z10;
    }

    public void i(int i10) {
        this.f54336d = i10;
    }

    public final int j(q2.d dVar, ArrayList<t2.e> arrayList, int i10) {
        int x10;
        int x11;
        t2.f fVar = (t2.f) arrayList.get(0).I();
        dVar.D();
        fVar.g(dVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).g(dVar, false);
        }
        if (i10 == 0 && fVar.U0 > 0) {
            t2.b.b(fVar, dVar, arrayList, 0);
        }
        if (i10 == 1 && fVar.V0 > 0) {
            t2.b.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.z();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f54337e = new ArrayList<>();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f54337e.add(new a(arrayList.get(i12), dVar, i10));
        }
        if (i10 == 0) {
            x10 = dVar.x(fVar.N);
            x11 = dVar.x(fVar.P);
            dVar.D();
        } else {
            x10 = dVar.x(fVar.O);
            x11 = dVar.x(fVar.Q);
            dVar.D();
        }
        return x11 - x10;
    }

    public String toString() {
        Iterator<t2.e> it;
        String str = e() + " [" + this.f54334b + "] <";
        while (this.f54333a.iterator().hasNext()) {
            str = str + " " + it.next().r();
        }
        return str + " >";
    }
}
