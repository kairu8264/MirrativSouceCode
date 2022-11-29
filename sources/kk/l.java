package kk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final kk.c f38852a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f38853b;

    /* renamed from: c  reason: collision with root package name */
    public final c f38854c;

    /* renamed from: d  reason: collision with root package name */
    public final int f38855d;

    /* loaded from: classes3.dex */
    public static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ kk.c f38856a;

        /* renamed from: kk.l$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0549a extends b {
            public C0549a(l lVar, CharSequence charSequence) {
                super(lVar, charSequence);
            }

            @Override // kk.l.b
            public int f(int i10) {
                return i10 + 1;
            }

            @Override // kk.l.b
            public int g(int i10) {
                return a.this.f38856a.c(this.f38857y, i10);
            }
        }

        public a(kk.c cVar) {
            this.f38856a = cVar;
        }

        @Override // kk.l.c
        /* renamed from: b */
        public b a(l lVar, CharSequence charSequence) {
            return new C0549a(lVar, charSequence);
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class b extends kk.a<String> {
        public final boolean A;
        public int B = 0;
        public int C;

        /* renamed from: y  reason: collision with root package name */
        public final CharSequence f38857y;

        /* renamed from: z  reason: collision with root package name */
        public final kk.c f38858z;

        public b(l lVar, CharSequence charSequence) {
            this.f38858z = lVar.f38852a;
            this.A = lVar.f38853b;
            this.C = lVar.f38855d;
            this.f38857y = charSequence;
        }

        @Override // kk.a
        /* renamed from: e */
        public String a() {
            int g10;
            int i10 = this.B;
            while (true) {
                int i11 = this.B;
                if (i11 != -1) {
                    g10 = g(i11);
                    if (g10 == -1) {
                        g10 = this.f38857y.length();
                        this.B = -1;
                    } else {
                        this.B = f(g10);
                    }
                    int i12 = this.B;
                    if (i12 == i10) {
                        int i13 = i12 + 1;
                        this.B = i13;
                        if (i13 > this.f38857y.length()) {
                            this.B = -1;
                        }
                    } else {
                        while (i10 < g10 && this.f38858z.e(this.f38857y.charAt(i10))) {
                            i10++;
                        }
                        while (g10 > i10 && this.f38858z.e(this.f38857y.charAt(g10 - 1))) {
                            g10--;
                        }
                        if (!this.A || i10 != g10) {
                            break;
                        }
                        i10 = this.B;
                    }
                } else {
                    return b();
                }
            }
            int i14 = this.C;
            if (i14 == 1) {
                g10 = this.f38857y.length();
                this.B = -1;
                while (g10 > i10 && this.f38858z.e(this.f38857y.charAt(g10 - 1))) {
                    g10--;
                }
            } else {
                this.C = i14 - 1;
            }
            return this.f38857y.subSequence(i10, g10).toString();
        }

        public abstract int f(int i10);

        public abstract int g(int i10);
    }

    /* loaded from: classes3.dex */
    public interface c {
        Iterator<String> a(l lVar, CharSequence charSequence);
    }

    public l(c cVar) {
        this(cVar, false, kk.c.f(), Integer.MAX_VALUE);
    }

    public static l d(char c10) {
        return e(kk.c.d(c10));
    }

    public static l e(kk.c cVar) {
        j.i(cVar);
        return new l(new a(cVar));
    }

    public List<String> f(CharSequence charSequence) {
        j.i(charSequence);
        Iterator<String> g10 = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g10.hasNext()) {
            arrayList.add(g10.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final Iterator<String> g(CharSequence charSequence) {
        return this.f38854c.a(this, charSequence);
    }

    public l(c cVar, boolean z10, kk.c cVar2, int i10) {
        this.f38854c = cVar;
        this.f38853b = z10;
        this.f38852a = cVar2;
        this.f38855d = i10;
    }
}
