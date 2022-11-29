package m3;

import java.util.Locale;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final m3.e f40584a = new e(null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final m3.e f40585b = new e(null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final m3.e f40586c;

    /* renamed from: d  reason: collision with root package name */
    public static final m3.e f40587d;

    /* renamed from: e  reason: collision with root package name */
    public static final m3.e f40588e;

    /* renamed from: f  reason: collision with root package name */
    public static final m3.e f40589f;

    /* loaded from: classes.dex */
    public static class a implements c {

        /* renamed from: b  reason: collision with root package name */
        public static final a f40590b = new a(true);

        /* renamed from: a  reason: collision with root package name */
        public final boolean f40591a;

        public a(boolean z10) {
            this.f40591a = z10;
        }

        @Override // m3.f.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int a10 = f.a(Character.getDirectionality(charSequence.charAt(i10)));
                if (a10 != 0) {
                    if (a10 != 1) {
                        continue;
                        i10++;
                        z10 = z10;
                    } else if (!this.f40591a) {
                        return 1;
                    }
                } else if (this.f40591a) {
                    return 0;
                }
                z10 = true;
                i10++;
                z10 = z10;
            }
            if (z10) {
                return this.f40591a ? 1 : 0;
            }
            return 2;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f40592a = new b();

        @Override // m3.f.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int i13 = 2;
            while (i10 < i12 && i13 == 2) {
                i13 = f.b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return i13;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    /* loaded from: classes.dex */
    public static abstract class d implements m3.e {

        /* renamed from: a  reason: collision with root package name */
        public final c f40593a;

        public d(c cVar) {
            this.f40593a = cVar;
        }

        @Override // m3.e
        public boolean a(CharSequence charSequence, int i10, int i11) {
            if (charSequence != null && i10 >= 0 && i11 >= 0 && charSequence.length() - i11 >= i10) {
                if (this.f40593a == null) {
                    return b();
                }
                return c(charSequence, i10, i11);
            }
            throw new IllegalArgumentException();
        }

        public abstract boolean b();

        public final boolean c(CharSequence charSequence, int i10, int i11) {
            int a10 = this.f40593a.a(charSequence, i10, i11);
            if (a10 != 0) {
                if (a10 != 1) {
                    return b();
                }
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends d {

        /* renamed from: b  reason: collision with root package name */
        public final boolean f40594b;

        public e(c cVar, boolean z10) {
            super(cVar);
            this.f40594b = z10;
        }

        @Override // m3.f.d
        public boolean b() {
            return this.f40594b;
        }
    }

    /* renamed from: m3.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0590f extends d {

        /* renamed from: b  reason: collision with root package name */
        public static final C0590f f40595b = new C0590f();

        public C0590f() {
            super(null);
        }

        @Override // m3.f.d
        public boolean b() {
            return g.b(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f40592a;
        f40586c = new e(bVar, false);
        f40587d = new e(bVar, true);
        f40588e = new e(a.f40590b, false);
        f40589f = C0590f.f40595b;
    }

    public static int a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    public static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
