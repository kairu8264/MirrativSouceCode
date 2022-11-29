package l0;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public final class p1 implements w0.a, Iterable<w0.b>, ko.a {
    public int A;
    public boolean B;
    public int C;

    /* renamed from: x  reason: collision with root package name */
    public int f39232x;

    /* renamed from: z  reason: collision with root package name */
    public int f39234z;

    /* renamed from: w  reason: collision with root package name */
    public int[] f39231w = new int[0];

    /* renamed from: y  reason: collision with root package name */
    public Object[] f39233y = new Object[0];
    public ArrayList<d> D = new ArrayList<>();

    public final void A(int[] iArr, int i10, Object[] objArr, int i11, ArrayList<d> arrayList) {
        jo.p.h(iArr, "groups");
        jo.p.h(objArr, "slots");
        jo.p.h(arrayList, "anchors");
        this.f39231w = iArr;
        this.f39232x = i10;
        this.f39233y = objArr;
        this.f39234z = i11;
        this.D = arrayList;
    }

    public final int d(d dVar) {
        jo.p.h(dVar, "anchor");
        if (!this.B) {
            if (dVar.b()) {
                return dVar.a();
            }
            throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
        }
        k.x("Use active SlotWriter to determine anchor location instead".toString());
        throw new KotlinNothingValueException();
    }

    public final void f(o1 o1Var) {
        jo.p.h(o1Var, "reader");
        if (o1Var.v() == this && this.A > 0) {
            this.A--;
            return;
        }
        throw new IllegalArgumentException("Unexpected reader close()".toString());
    }

    public final void g(r1 r1Var, int[] iArr, int i10, Object[] objArr, int i11, ArrayList<d> arrayList) {
        jo.p.h(r1Var, "writer");
        jo.p.h(iArr, "groups");
        jo.p.h(objArr, "slots");
        jo.p.h(arrayList, "anchors");
        if (r1Var.X() == this && this.B) {
            this.B = false;
            A(iArr, i10, objArr, i11, arrayList);
            return;
        }
        throw new IllegalArgumentException("Unexpected writer close()".toString());
    }

    public boolean isEmpty() {
        return this.f39232x == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<w0.b> iterator() {
        return new e0(this, 0, this.f39232x);
    }

    public final ArrayList<d> j() {
        return this.D;
    }

    public final int[] k() {
        return this.f39231w;
    }

    public final int m() {
        return this.f39232x;
    }

    public final Object[] p() {
        return this.f39233y;
    }

    public final int r() {
        return this.f39234z;
    }

    public final int s() {
        return this.C;
    }

    public final boolean t() {
        return this.B;
    }

    public final boolean u(int i10, d dVar) {
        jo.p.h(dVar, "anchor");
        if (!this.B) {
            if (i10 >= 0 && i10 < this.f39232x) {
                if (y(dVar)) {
                    int g10 = q1.g(this.f39231w, i10) + i10;
                    int a10 = dVar.a();
                    if (i10 <= a10 && a10 < g10) {
                        return true;
                    }
                }
                return false;
            }
            k.x("Invalid group index".toString());
            throw new KotlinNothingValueException();
        }
        k.x("Writer is active".toString());
        throw new KotlinNothingValueException();
    }

    public final o1 w() {
        if (!this.B) {
            this.A++;
            return new o1(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending".toString());
    }

    public final r1 x() {
        if (!this.B) {
            if (this.A <= 0) {
                this.B = true;
                this.C++;
                return new r1(this);
            }
            k.x("Cannot start a writer when a reader is pending".toString());
            throw new KotlinNothingValueException();
        }
        k.x("Cannot start a writer when another writer is pending".toString());
        throw new KotlinNothingValueException();
    }

    public final boolean y(d dVar) {
        jo.p.h(dVar, "anchor");
        if (dVar.b()) {
            int s10 = q1.s(this.D, dVar.a(), this.f39232x);
            if (s10 >= 0 && jo.p.c(this.D.get(s10), dVar)) {
                return true;
            }
        }
        return false;
    }
}
