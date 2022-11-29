package uo;

import ao.g;
import java.io.Closeable;

/* loaded from: classes4.dex */
public abstract class s1 extends k0 implements Closeable {

    /* renamed from: x  reason: collision with root package name */
    public static final a f56084x = new a(null);

    /* loaded from: classes4.dex */
    public static final class a extends ao.b<k0, s1> {

        /* renamed from: uo.s1$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0879a extends jo.q implements io.l<g.b, s1> {

            /* renamed from: w  reason: collision with root package name */
            public static final C0879a f56085w = new C0879a();

            public C0879a() {
                super(1);
            }

            @Override // io.l
            /* renamed from: a */
            public final s1 invoke(g.b bVar) {
                if (bVar instanceof s1) {
                    return (s1) bVar;
                }
                return null;
            }
        }

        public a() {
            super(k0.f56038w, C0879a.f56085w);
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public abstract void close();
}
