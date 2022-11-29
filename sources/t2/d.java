package t2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q2.i;
import u2.o;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b  reason: collision with root package name */
    public int f53044b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f53045c;

    /* renamed from: d  reason: collision with root package name */
    public final e f53046d;

    /* renamed from: e  reason: collision with root package name */
    public final b f53047e;

    /* renamed from: f  reason: collision with root package name */
    public d f53048f;

    /* renamed from: i  reason: collision with root package name */
    public q2.i f53051i;

    /* renamed from: a  reason: collision with root package name */
    public HashSet<d> f53043a = null;

    /* renamed from: g  reason: collision with root package name */
    public int f53049g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f53050h = Integer.MIN_VALUE;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f53052a;

        static {
            int[] iArr = new int[b.values().length];
            f53052a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53052a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53052a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53052a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f53052a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f53052a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f53052a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f53052a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f53052a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.f53046d = eVar;
        this.f53047e = bVar;
    }

    public boolean a(d dVar, int i10, int i11, boolean z10) {
        if (dVar == null) {
            p();
            return true;
        } else if (z10 || o(dVar)) {
            this.f53048f = dVar;
            if (dVar.f53043a == null) {
                dVar.f53043a = new HashSet<>();
            }
            HashSet<d> hashSet = this.f53048f.f53043a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f53049g = i10;
            this.f53050h = i11;
            return true;
        } else {
            return false;
        }
    }

    public void b(int i10, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.f53043a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                u2.i.a(it.next().f53046d, i10, arrayList, oVar);
            }
        }
    }

    public HashSet<d> c() {
        return this.f53043a;
    }

    public int d() {
        if (this.f53045c) {
            return this.f53044b;
        }
        return 0;
    }

    public int e() {
        d dVar;
        if (this.f53046d.Q() == 8) {
            return 0;
        }
        if (this.f53050h != Integer.MIN_VALUE && (dVar = this.f53048f) != null && dVar.f53046d.Q() == 8) {
            return this.f53050h;
        }
        return this.f53049g;
    }

    public final d f() {
        switch (a.f53052a[this.f53047e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f53046d.P;
            case 3:
                return this.f53046d.N;
            case 4:
                return this.f53046d.Q;
            case 5:
                return this.f53046d.O;
            default:
                throw new AssertionError(this.f53047e.name());
        }
    }

    public e g() {
        return this.f53046d;
    }

    public q2.i h() {
        return this.f53051i;
    }

    public d i() {
        return this.f53048f;
    }

    public b j() {
        return this.f53047e;
    }

    public boolean k() {
        HashSet<d> hashSet = this.f53043a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().n()) {
                return true;
            }
        }
        return false;
    }

    public boolean l() {
        HashSet<d> hashSet = this.f53043a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean m() {
        return this.f53045c;
    }

    public boolean n() {
        return this.f53048f != null;
    }

    public boolean o(d dVar) {
        boolean z10 = false;
        if (dVar == null) {
            return false;
        }
        b j10 = dVar.j();
        b bVar = this.f53047e;
        if (j10 == bVar) {
            return bVar != b.BASELINE || (dVar.g().U() && g().U());
        }
        switch (a.f53052a[bVar.ordinal()]) {
            case 1:
                return (j10 == b.BASELINE || j10 == b.CENTER_X || j10 == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z11 = j10 == b.LEFT || j10 == b.RIGHT;
                if (dVar.g() instanceof g) {
                    if (z11 || j10 == b.CENTER_X) {
                        z10 = true;
                    }
                    return z10;
                }
                return z11;
            case 4:
            case 5:
                boolean z12 = j10 == b.TOP || j10 == b.BOTTOM;
                if (dVar.g() instanceof g) {
                    if (z12 || j10 == b.CENTER_Y) {
                        z10 = true;
                    }
                    return z10;
                }
                return z12;
            case 6:
                return (j10 == b.LEFT || j10 == b.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f53047e.name());
        }
    }

    public void p() {
        HashSet<d> hashSet;
        d dVar = this.f53048f;
        if (dVar != null && (hashSet = dVar.f53043a) != null) {
            hashSet.remove(this);
            if (this.f53048f.f53043a.size() == 0) {
                this.f53048f.f53043a = null;
            }
        }
        this.f53043a = null;
        this.f53048f = null;
        this.f53049g = 0;
        this.f53050h = Integer.MIN_VALUE;
        this.f53045c = false;
        this.f53044b = 0;
    }

    public void q() {
        this.f53045c = false;
        this.f53044b = 0;
    }

    public void r(q2.c cVar) {
        q2.i iVar = this.f53051i;
        if (iVar == null) {
            this.f53051i = new q2.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.i();
        }
    }

    public void s(int i10) {
        this.f53044b = i10;
        this.f53045c = true;
    }

    public String toString() {
        return this.f53046d.r() + ":" + this.f53047e.toString();
    }
}
