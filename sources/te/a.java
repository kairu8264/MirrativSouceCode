package te;

import jo.h;
import jo.p;
import so.n;

/* loaded from: classes2.dex */
public final class a extends e {

    /* renamed from: d  reason: collision with root package name */
    public static final C0833a f53598d = new C0833a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f53599e = 0;

    /* renamed from: te.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0833a {
        public C0833a() {
        }

        public /* synthetic */ C0833a(h hVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str) {
        super(str);
        p.h(str, "status");
    }

    public final synchronized boolean h() {
        return n.q(a(), "pause", true);
    }

    public final synchronized boolean i() {
        return n.q(a(), "playing", true);
    }
}
