package u9;

import jo.h;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f54631a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f54632b;

    /* renamed from: u9.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0859a extends a {

        /* renamed from: c  reason: collision with root package name */
        public static final C0859a f54633c = new C0859a();

        public C0859a() {
            super(-1, false, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends a {

        /* renamed from: c  reason: collision with root package name */
        public final boolean f54634c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(boolean r4) {
            /*
                r3 = this;
                if (r4 == 0) goto L5
                int r0 = q9.f.ic_emomo_quest_dummy_comment_event
                goto L7
            L5:
                int r0 = q9.f.ic_emomo_quest_dummy_comment_not_event
            L7:
                r1 = 1
                r2 = 0
                r3.<init>(r0, r1, r2)
                r3.f54634c = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: u9.a.b.<init>(boolean):void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f54634c == ((b) obj).f54634c;
        }

        public int hashCode() {
            boolean z10 = this.f54634c;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "Success(isOpenEvent=" + this.f54634c + ')';
        }
    }

    public a(int i10, boolean z10) {
        this.f54631a = i10;
        this.f54632b = z10;
    }

    public /* synthetic */ a(int i10, boolean z10, h hVar) {
        this(i10, z10);
    }

    public final int a() {
        return this.f54631a;
    }

    public final boolean b() {
        return this.f54632b;
    }
}
