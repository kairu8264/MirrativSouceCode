package a1;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: b  reason: collision with root package name */
    public static final a f348b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f349c = m0.e.f40467z;

    /* renamed from: d  reason: collision with root package name */
    public static final t f350d = new t();

    /* renamed from: a  reason: collision with root package name */
    public final m0.e<w> f351a = new m0.e<>(new w[16], 0);

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final t a() {
            return t.f350d;
        }
    }

    public final m0.e<w> b() {
        return this.f351a;
    }

    public final void c() {
        if (this.f351a.s()) {
            m0.e<w> eVar = this.f351a;
            int p10 = eVar.p();
            if (p10 > 0) {
                int i10 = 0;
                w[] n10 = eVar.n();
                do {
                    j c10 = n10[i10].c();
                    if (c10 != null) {
                        z.h(c10);
                    }
                    i10++;
                } while (i10 < p10);
                return;
            }
            return;
        }
        throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
    }
}
