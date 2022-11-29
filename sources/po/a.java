package po;

import xn.q;

/* loaded from: classes4.dex */
public class a implements Iterable<Character>, ko.a {

    /* renamed from: z  reason: collision with root package name */
    public static final C0728a f48457z = new C0728a(null);

    /* renamed from: w  reason: collision with root package name */
    public final char f48458w;

    /* renamed from: x  reason: collision with root package name */
    public final char f48459x;

    /* renamed from: y  reason: collision with root package name */
    public final int f48460y;

    /* renamed from: po.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0728a {
        public C0728a() {
        }

        public /* synthetic */ C0728a(jo.h hVar) {
            this();
        }
    }

    public a(char c10, char c11, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f48458w = c10;
            this.f48459x = (char) p000do.c.c(c10, c11, i10);
            this.f48460y = i10;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
    }

    public final char k() {
        return this.f48458w;
    }

    public final char m() {
        return this.f48459x;
    }

    @Override // java.lang.Iterable
    /* renamed from: p */
    public q iterator() {
        return new b(this.f48458w, this.f48459x, this.f48460y);
    }
}
